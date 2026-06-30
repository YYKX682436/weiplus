package com.tencent.mm.plugin.wepkg.event;

/* loaded from: classes8.dex */
public class ForceUpdateNotify implements android.os.Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f188328e = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f188329d;

    public ForceUpdateNotify(java.lang.String[] strArr) {
        this.f188329d = strArr;
    }

    public static void a() {
        java.util.Set set = f188328e;
        if (((java.util.HashSet) set).size() != 0) {
            com.tencent.mm.plugin.wepkg.event.h.a(new com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify((java.lang.String[]) ((java.util.HashSet) set).toArray(new java.lang.String[((java.util.HashSet) set).size()])), new com.tencent.mm.plugin.wepkg.event.b());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringArray(this.f188329d);
    }
}
