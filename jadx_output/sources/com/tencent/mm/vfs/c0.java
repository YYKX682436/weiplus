package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class c0 implements android.os.Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t5 f212846a = new com.tencent.mm.vfs.t5(new com.tencent.mm.vfs.ContentsSchemeResolver(null));

    public c0(com.tencent.mm.vfs.b0 b0Var) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return (com.tencent.mm.vfs.ContentsSchemeResolver) f212846a.f213187a;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.vfs.ContentsSchemeResolver[i17];
    }
}
