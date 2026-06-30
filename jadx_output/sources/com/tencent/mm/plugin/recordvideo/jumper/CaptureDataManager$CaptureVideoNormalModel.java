package com.tencent.mm.plugin.recordvideo.jumper;

/* loaded from: classes8.dex */
public class CaptureDataManager$CaptureVideoNormalModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel> CREATOR = new ut3.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f155660d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155661e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155662f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f155663g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f155664h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo f155665i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f155666m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f155667n;

    public CaptureDataManager$CaptureVideoNormalModel(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.Boolean bool2, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo) {
        this.f155666m = new java.util.ArrayList();
        this.f155660d = bool;
        this.f155661e = str;
        this.f155662f = str2;
        this.f155663g = l17;
        this.f155664h = bool2;
        this.f155665i = recordMediaReportInfo;
    }

    public com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo a() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo = this.f155665i;
        return recordMediaReportInfo == null ? new com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo() : recordMediaReportInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeValue(this.f155660d);
        parcel.writeString(this.f155661e);
        parcel.writeString(this.f155662f);
        parcel.writeValue(this.f155663g);
        parcel.writeValue(this.f155664h);
        parcel.writeParcelable(this.f155665i, i17);
        parcel.writeList(this.f155666m);
        parcel.writeValue(this.f155667n);
    }

    public CaptureDataManager$CaptureVideoNormalModel(android.os.Parcel parcel) {
        this.f155666m = new java.util.ArrayList();
        this.f155660d = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155661e = parcel.readString();
        this.f155662f = parcel.readString();
        this.f155663g = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
        this.f155664h = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155665i = (com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo) parcel.readParcelable(com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo.class.getClassLoader());
        this.f155666m = parcel.readArrayList(java.util.ArrayList.class.getClassLoader());
        this.f155667n = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
    }
}
