package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class n2 implements android.os.Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t5 f213080a = new com.tencent.mm.vfs.t5(new com.tencent.mm.vfs.FileSchemeResolver(null));

    public n2(com.tencent.mm.vfs.m2 m2Var) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return (com.tencent.mm.vfs.FileSchemeResolver) f213080a.f213187a;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.vfs.FileSchemeResolver[i17];
    }
}
