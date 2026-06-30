package com.tencent.mm.plugin.recordvideo.jumper;

/* loaded from: classes8.dex */
public class RecordMediaReportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo> CREATOR = new ut3.i();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f155689d;

    public RecordMediaReportInfo() {
        this.f155689d = new java.util.HashMap();
    }

    public void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                this.f155689d.put(next, jSONObject.get(next));
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public java.lang.Object b(java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = this.f155689d;
        return hashMap.get(str) != null ? hashMap.get(str) : obj;
    }

    public void c(java.lang.String str, java.lang.Object obj) {
        this.f155689d.put(str, obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeSerializable(this.f155689d);
    }

    public RecordMediaReportInfo(android.os.Parcel parcel) {
        this.f155689d = new java.util.HashMap();
        this.f155689d = (java.util.HashMap) parcel.readSerializable();
    }
}
