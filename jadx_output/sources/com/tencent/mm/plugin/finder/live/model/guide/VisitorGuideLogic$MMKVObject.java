package com.tencent.mm.plugin.finder.live.model.guide;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/live/model/guide/VisitorGuideLogic$MMKVObject", "Landroid/os/Parcelable;", "CREATOR", "jk2/h", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VisitorGuideLogic$MMKVObject implements android.os.Parcelable {
    public static final jk2.h CREATOR = new jk2.h(null);

    /* renamed from: d, reason: collision with root package name */
    public long f111741d;

    /* renamed from: e, reason: collision with root package name */
    public int f111742e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        try {
            parcel.writeLong(this.f111741d);
            parcel.writeInt(this.f111742e);
        } catch (java.lang.RuntimeException unused) {
        }
    }
}
