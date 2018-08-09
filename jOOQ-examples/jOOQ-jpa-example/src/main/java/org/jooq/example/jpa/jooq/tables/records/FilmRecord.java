/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables.records;


import java.time.Year;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.example.jpa.jooq.tables.Film;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record6<Integer, Integer, Year, String, Integer, Integer> {

    private static final long serialVersionUID = 1732134693;

    /**
     * Setter for <code>PUBLIC.FILM.FILMID</code>.
     */
    public void setFilmid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM.FILMID</code>.
     */
    public Integer getFilmid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.FILM.LENGTH</code>.
     */
    public void setLength(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM.LENGTH</code>.
     */
    public Integer getLength() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>PUBLIC.FILM.RELEASE_YEAR</code>.
     */
    public void setReleaseYear(Year value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM.RELEASE_YEAR</code>.
     */
    public Year getReleaseYear() {
        return (Year) get(2);
    }

    /**
     * Setter for <code>PUBLIC.FILM.TITLE</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM.TITLE</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.FILM.LANGUAGE_LANGUAGEID</code>.
     */
    public void setLanguageLanguageid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM.LANGUAGE_LANGUAGEID</code>.
     */
    public Integer getLanguageLanguageid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>PUBLIC.FILM.ORIGINALLANGUAGE_LANGUAGEID</code>.
     */
    public void setOriginallanguageLanguageid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.FILM.ORIGINALLANGUAGE_LANGUAGEID</code>.
     */
    public Integer getOriginallanguageLanguageid() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Year, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Year, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Film.FILM.FILMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Film.FILM.LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Year> field3() {
        return Film.FILM.RELEASE_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Film.FILM.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Film.FILM.LANGUAGE_LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Film.FILM.ORIGINALLANGUAGE_LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFilmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Year component3() {
        return getReleaseYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getLanguageLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getOriginallanguageLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFilmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Year value3() {
        return getReleaseYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getLanguageLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getOriginallanguageLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value1(Integer value) {
        setFilmid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value2(Integer value) {
        setLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value3(Year value) {
        setReleaseYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value5(Integer value) {
        setLanguageLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value6(Integer value) {
        setOriginallanguageLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord values(Integer value1, Integer value2, Year value3, String value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Integer filmid, Integer length, Year releaseYear, String title, Integer languageLanguageid, Integer originallanguageLanguageid) {
        super(Film.FILM);

        set(0, filmid);
        set(1, length);
        set(2, releaseYear);
        set(3, title);
        set(4, languageLanguageid);
        set(5, originallanguageLanguageid);
    }
}
