/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.derby.sys.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.derby.sys.Sys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Syskeys extends TableImpl<Record> {

    private static final long serialVersionUID = 1636373174;

    /**
     * The reference instance of <code>SYS.SYSKEYS</code>
     */
    public static final Syskeys SYSKEYS = new Syskeys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>SYS.SYSKEYS.CONSTRAINTID</code>.
     */
    public static final TableField<Record, String> CONSTRAINTID = createField(DSL.name("CONSTRAINTID"), org.jooq.impl.SQLDataType.CHAR(36).nullable(false), SYSKEYS, "");

    /**
     * The column <code>SYS.SYSKEYS.CONGLOMERATEID</code>.
     */
    public static final TableField<Record, String> CONGLOMERATEID = createField(DSL.name("CONGLOMERATEID"), org.jooq.impl.SQLDataType.CHAR(36).nullable(false), SYSKEYS, "");

    /**
     * No further instances allowed
     */
    private Syskeys() {
        this(DSL.name("SYSKEYS"), null);
    }

    private Syskeys(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Syskeys(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syskeys(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SYSKEYS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }
}
