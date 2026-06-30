package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class ConfigFileStorageProxyMMKV$MMKVTypeObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject> CREATOR = new com.tencent.mm.storage.k3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193704d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f193705e;

    public ConfigFileStorageProxyMMKV$MMKVTypeObject(java.lang.String str, java.lang.Object obj) {
        this.f193704d = str;
        if (obj instanceof java.util.LinkedHashMap) {
            this.f193705e = new com.tencent.mm.storage.l3(obj);
        } else {
            this.f193705e = obj;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type = ");
        sb6.append(this.f193704d);
        sb6.append(" object = ");
        java.lang.Object obj = this.f193705e;
        sb6.append(obj != null ? obj.toString() : "");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeString(this.f193704d);
            parcel.writeValue(this.f193705e);
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e17, "", new java.lang.Object[0]);
        }
    }

    public ConfigFileStorageProxyMMKV$MMKVTypeObject(android.os.Parcel parcel) {
        try {
            java.lang.String readString = parcel.readString();
            this.f193704d = readString;
            try {
                if (!android.text.TextUtils.equals(readString, java.util.HashMap.class.getSimpleName()) && !android.text.TextUtils.equals(readString, java.util.HashSet.class.getSimpleName())) {
                    android.text.TextUtils.equals(readString, java.util.LinkedHashMap.class.getSimpleName());
                }
                java.lang.Object readValue = parcel.readValue(null);
                if (readValue instanceof com.tencent.mm.storage.l3) {
                    this.f193705e = ((com.tencent.mm.storage.l3) readValue).f195083d;
                } else {
                    this.f193705e = readValue;
                }
            } catch (java.lang.Exception e17) {
                jx3.f.INSTANCE.idkeyStat(1041L, 44L, 1L, true);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e17, "MMKVTypeObject readValue error", new java.lang.Object[0]);
            }
        } catch (java.lang.RuntimeException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e18, "", new java.lang.Object[0]);
        }
    }
}
