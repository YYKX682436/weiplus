package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class m8 implements android.os.Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t5 f213079a = new com.tencent.mm.vfs.t5(new com.tencent.mm.vfs.WcfSchemeResolver(null));

    public m8(com.tencent.mm.vfs.l8 l8Var) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return (com.tencent.mm.vfs.WcfSchemeResolver) f213079a.f213187a;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.vfs.WcfSchemeResolver[i17];
    }
}
