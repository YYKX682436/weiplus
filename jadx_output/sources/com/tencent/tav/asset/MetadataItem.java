package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class MetadataItem {
    protected java.lang.String dataType;
    private byte[] dataValue;
    private java.util.Date dateValue;
    protected com.tencent.tav.coremedia.CMTime duration;
    protected java.lang.String extendedLanguageTag;
    protected java.lang.String identifier;
    protected java.util.Locale locale;
    private java.lang.Integer numberValue;
    private java.util.Date startDate;
    private java.lang.String stringValue;
    protected com.tencent.tav.coremedia.CMTime time;
    protected java.lang.Object value;

    /* loaded from: classes16.dex */
    public static class MutableMetadataItem extends com.tencent.tav.asset.MetadataItem {
        public void setDataType(java.lang.String str) {
            this.dataType = str;
        }

        public void setDuration(com.tencent.tav.coremedia.CMTime cMTime) {
            this.duration = cMTime;
        }

        public void setExtendedLanguageTag(java.lang.String str) {
            this.extendedLanguageTag = str;
        }

        public void setIdentifier(java.lang.String str) {
            this.identifier = str;
        }

        public void setLocale(java.util.Locale locale) {
            this.locale = locale;
        }

        public void setTime(com.tencent.tav.coremedia.CMTime cMTime) {
            this.time = cMTime;
        }

        public void setValue(java.lang.Object obj) {
            this.value = obj;
        }
    }

    public java.lang.String getDataType() {
        return this.dataType;
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.duration;
    }

    public java.lang.String getExtendedLanguageTag() {
        return this.extendedLanguageTag;
    }

    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    public java.util.Locale getLocale() {
        return this.locale;
    }

    public com.tencent.tav.coremedia.CMTime getTime() {
        return this.time;
    }

    public java.lang.Object getValue() {
        return this.value;
    }
}
