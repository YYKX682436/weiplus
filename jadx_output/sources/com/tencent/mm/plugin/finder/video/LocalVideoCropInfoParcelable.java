package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/LocalVideoCropInfoParcelable;", "Landroid/os/Parcelable;", "CREATOR", "cw2/va", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LocalVideoCropInfoParcelable implements android.os.Parcelable {
    public static final cw2.va CREATOR = new cw2.va(null);

    /* renamed from: d, reason: collision with root package name */
    public r45.dd4 f130759d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        r45.dd4 dd4Var = this.f130759d;
        if (dd4Var != null) {
            kotlin.jvm.internal.o.d(dd4Var);
            byte[] byteArray = dd4Var.toByteArray();
            dest.writeInt(byteArray.length);
            dest.writeByteArray(byteArray);
        }
    }
}
