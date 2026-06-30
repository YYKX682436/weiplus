package com.tencent.tmassistantsdk.channel;

/* loaded from: classes13.dex */
public class TMAssistantSDKChannelDataItem {
    public static final int DATEITEM_VERSION = 1;
    private static final java.lang.String ENCRYPT_KEY = "&-*)Wb5_U,[^!9'+";
    public static final int IPCDATA_MIN_VERSION = 1;
    private static final java.lang.String TAG = "MicroMsg.TMAssistantSDKChannelDataItem";
    public int mDBIdentity = -1;
    public java.lang.String mDataItemAction;
    public long mDataItemEndTime;
    public long mDataItemStartTime;
    public int mDataItemType;
    public int mDataItemVersion;
    public java.lang.String mHostPackageName;
    public java.lang.String mHostUserIdentity;
    public int mHostVersion;
    public byte[] mIPCData;

    public TMAssistantSDKChannelDataItem(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, long j17, long j18, int i19, byte[] bArr) {
        this.mHostVersion = 0;
        this.mHostUserIdentity = "";
        this.mDataItemType = 0;
        this.mDataItemAction = "";
        this.mDataItemStartTime = 0L;
        this.mDataItemEndTime = 0L;
        this.mDataItemVersion = 0;
        this.mIPCData = null;
        this.mHostPackageName = str;
        if (str == null) {
            this.mHostPackageName = "";
        }
        this.mHostVersion = i17;
        this.mHostUserIdentity = str2;
        if (str2 == null) {
            this.mHostUserIdentity = "";
        }
        this.mDataItemType = i18;
        this.mDataItemAction = str3;
        if (str3 == null) {
            this.mDataItemAction = "";
        }
        this.mDataItemStartTime = j17;
        this.mDataItemEndTime = j18;
        this.mDataItemVersion = i19;
        this.mIPCData = bArr;
    }

    public static com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem getDataItemFromByte(byte[] bArr) {
        byte[] decrypt;
        java.lang.String string;
        if (bArr != null && bArr.length > 0 && (decrypt = new com.tencent.tmassistantsdk.util.Cryptor().decrypt(bArr, ENCRYPT_KEY.getBytes())) != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decrypt, com.tencent.mapsdk.internal.rv.f51270c));
                java.lang.String string2 = jSONObject.getString("mHostPackageName");
                int i17 = jSONObject.getInt("mHostVersion");
                java.lang.String string3 = jSONObject.getString("mHostUserIdentity");
                int i18 = jSONObject.getInt("mDataItemType");
                java.lang.String string4 = jSONObject.getString("mDataItemAction");
                long j17 = jSONObject.getLong("mDataItemStartTime");
                long j18 = jSONObject.getLong("mDataItemEndTime");
                int i19 = jSONObject.getInt("mDataItemVersion");
                return new com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem(string2, i17, string3, i18, string4, j17, j18, i19, (i19 < 1 || (string = jSONObject.getString("mIPCData")) == null) ? null : com.tencent.tmassistantsdk.util.Base64.decode(string, 0));
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public byte[] getBuffer() {
        byte[] bytes;
        byte[] bArr;
        java.lang.String encodeToString;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mHostPackageName", this.mHostPackageName);
            jSONObject.put("mHostVersion", this.mHostVersion);
            jSONObject.put("mHostUserIdentity", this.mHostUserIdentity);
            jSONObject.put("mDataItemType", this.mDataItemType);
            jSONObject.put("mDataItemAction", this.mDataItemAction);
            jSONObject.put("mDataItemStartTime", this.mDataItemStartTime);
            jSONObject.put("mDataItemEndTime", this.mDataItemEndTime);
            jSONObject.put("mDataItemVersion", this.mDataItemVersion);
            if (this.mDataItemVersion >= 1 && (bArr = this.mIPCData) != null && (encodeToString = com.tencent.tmassistantsdk.util.Base64.encodeToString(bArr, 0)) != null) {
                jSONObject.put("mIPCData", encodeToString);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null || (bytes = jSONObject2.getBytes(com.tencent.mapsdk.internal.rv.f51270c)) == null) {
                return null;
            }
            return new com.tencent.tmassistantsdk.util.Cryptor().encrypt(bytes, ENCRYPT_KEY.getBytes());
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return null;
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            return null;
        }
    }
}
