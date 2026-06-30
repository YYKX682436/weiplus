package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPProperties implements com.tencent.thumbplayer.common.report.ITPReportProperties {
    private static final java.lang.String TAG = "TPProperties";
    protected final java.util.Properties properties;

    public TPProperties() {
        this((java.util.Properties) null);
    }

    public java.util.Properties getProperties() {
        return this.properties;
    }

    public boolean has(java.lang.String str) {
        return (str == null || this.properties.get(str) == null) ? false : true;
    }

    @Override // com.tencent.thumbplayer.common.report.ITPReportProperties
    public void propertiesToMap(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            throw new java.lang.IllegalArgumentException("map must not be null!");
        }
        for (java.util.Map.Entry entry : this.properties.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                map.put(key.toString(), "");
            } else {
                map.put(key.toString(), value.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.common.report.ITPReportProperties
    public void put(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                this.properties.put(str, str2);
            } else {
                this.properties.put(str, "");
            }
        }
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(this.properties);
        if (jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            try {
                java.lang.String string = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                jSONObject.remove(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(string));
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
        return jSONObject.toString();
    }

    public TPProperties(java.util.Properties properties) {
        this.properties = new java.util.Properties();
        if (properties != null) {
            for (java.util.Map.Entry entry : properties.entrySet()) {
                put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
    }

    @Override // com.tencent.thumbplayer.common.report.ITPReportProperties
    public void put(java.lang.String str, int i17) {
        if (str != null) {
            this.properties.put(str, java.lang.String.valueOf(i17));
        }
    }

    @Override // com.tencent.thumbplayer.common.report.ITPReportProperties
    public void put(java.lang.String str, long j17) {
        if (str != null) {
            this.properties.put(str, java.lang.String.valueOf(j17));
        }
    }

    public TPProperties(java.util.Map<java.lang.String, java.lang.String> map) {
        this.properties = new java.util.Properties();
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.tencent.thumbplayer.common.report.ITPReportProperties
    public void put(java.lang.String str, float f17) {
        if (str != null) {
            this.properties.put(str, java.lang.String.valueOf(f17));
        }
    }

    public void put(java.lang.String str, java.util.Properties properties) {
        if (str != null) {
            this.properties.put(str, properties);
        }
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str != null) {
            this.properties.put(str, jSONObject);
        }
    }

    public TPProperties(java.lang.String str, java.lang.String str2) {
        this(new java.util.Properties(str, str2) { // from class: com.tencent.thumbplayer.utils.TPProperties.1
            final /* synthetic */ java.lang.String val$key;
            final /* synthetic */ java.lang.String val$value;

            {
                this.val$key = str;
                this.val$value = str2;
                put(str, str2);
            }
        });
    }

    public TPProperties(java.lang.Object... objArr) {
        this.properties = new java.util.Properties();
        int length = objArr.length;
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i17 = 0; i17 < length; i17 += 2) {
            put(java.lang.String.valueOf(objArr[i17]), java.lang.String.valueOf(objArr[i17 + 1]));
        }
    }
}
