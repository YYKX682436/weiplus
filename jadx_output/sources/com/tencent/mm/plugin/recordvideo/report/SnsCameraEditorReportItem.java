package com.tencent.mm.plugin.recordvideo.report;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/report/SnsCameraEditorReportItem;", "Landroid/os/Parcelable;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsCameraEditorReportItem implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f155867d;

    /* renamed from: e, reason: collision with root package name */
    public int f155868e;

    /* renamed from: f, reason: collision with root package name */
    public int f155869f;

    /* renamed from: g, reason: collision with root package name */
    public int f155870g;

    /* renamed from: h, reason: collision with root package name */
    public int f155871h;

    /* renamed from: i, reason: collision with root package name */
    public int f155872i;

    /* renamed from: m, reason: collision with root package name */
    public int f155873m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f155874n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155875o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155876p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155877q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f155878r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155879s;

    /* renamed from: t, reason: collision with root package name */
    public int f155880t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem f155866u = new com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem(0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "", 0);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem> CREATOR = new nu3.j();

    public SnsCameraEditorReportItem(int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i38) {
        this.f155867d = i17;
        this.f155868e = i18;
        this.f155869f = i19;
        this.f155870g = i27;
        this.f155871h = i28;
        this.f155872i = i29;
        this.f155873m = i37;
        this.f155874n = str;
        this.f155875o = str2;
        this.f155876p = str3;
        this.f155877q = str4;
        this.f155878r = str5;
        this.f155879s = str6;
        this.f155880t = i38;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SnsCameraEditorReportItem(initCount=" + this.f155867d + ", picUse=" + this.f155868e + ", isFromCamera=" + this.f155869f + ", isFromEditor=" + this.f155870g + ", picSource=" + this.f155871h + ", contentType=" + this.f155872i + ", isOriginalPic=" + this.f155873m + ", cameraEnterSessionID='" + this.f155874n + "', cameraSessionID='" + this.f155875o + "', editSessionID='" + this.f155876p + "', originMediaInfo='" + this.f155877q + "', editMediaInfo='" + this.f155878r + "', sendMediaInfo='" + this.f155879s + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f155867d);
        parcel.writeInt(this.f155868e);
        parcel.writeInt(this.f155869f);
        parcel.writeInt(this.f155870g);
        parcel.writeInt(this.f155871h);
        parcel.writeInt(this.f155872i);
        parcel.writeInt(this.f155873m);
        parcel.writeString(this.f155874n);
        parcel.writeString(this.f155875o);
        parcel.writeString(this.f155876p);
        parcel.writeString(this.f155877q);
        parcel.writeString(this.f155878r);
        parcel.writeString(this.f155879s);
        parcel.writeInt(this.f155880t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsCameraEditorReportItem(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem src) {
        this(src.f155867d, src.f155868e, src.f155869f, src.f155870g, src.f155871h, src.f155872i, src.f155873m, src.f155874n, src.f155875o, src.f155876p, src.f155877q, src.f155878r, src.f155879s, src.f155880t);
        kotlin.jvm.internal.o.g(src, "src");
    }
}
