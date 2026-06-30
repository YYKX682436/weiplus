package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class ReportUtil$ReportArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs> CREATOR = new com.tencent.mm.pluginsdk.model.app.l5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f188785d;

    /* renamed from: e, reason: collision with root package name */
    public int f188786e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f188787f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188788g;

    /* renamed from: h, reason: collision with root package name */
    public int f188789h;

    public ReportUtil$ReportArgs(android.os.Parcel parcel, com.tencent.mm.pluginsdk.model.app.k5 k5Var) {
        this.f188785d = parcel.readString();
        this.f188786e = parcel.readInt();
        this.f188787f = parcel.readString();
        this.f188788g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188785d);
        parcel.writeInt(this.f188786e);
        parcel.writeString(this.f188787f);
        parcel.writeString(this.f188788g);
    }
}
