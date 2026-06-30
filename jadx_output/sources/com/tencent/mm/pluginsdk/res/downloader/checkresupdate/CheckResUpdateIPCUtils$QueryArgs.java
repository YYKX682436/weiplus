package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/pluginsdk/res/downloader/checkresupdate/CheckResUpdateIPCUtils$QueryArgs", "Landroid/os/Parcelable;", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class CheckResUpdateIPCUtils$QueryArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs> CREATOR = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.q();

    /* renamed from: d, reason: collision with root package name */
    public final int f189530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f189531e;

    public CheckResUpdateIPCUtils$QueryArgs(int i17, int i18) {
        this.f189530d = i17;
        this.f189531e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs)) {
            return false;
        }
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs checkResUpdateIPCUtils$QueryArgs = (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs) obj;
        return this.f189530d == checkResUpdateIPCUtils$QueryArgs.f189530d && this.f189531e == checkResUpdateIPCUtils$QueryArgs.f189531e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f189530d) * 31) + java.lang.Integer.hashCode(this.f189531e);
    }

    public java.lang.String toString() {
        return "QueryArgs(resType=" + this.f189530d + ", subType=" + this.f189531e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f189530d);
        out.writeInt(this.f189531e);
    }
}
