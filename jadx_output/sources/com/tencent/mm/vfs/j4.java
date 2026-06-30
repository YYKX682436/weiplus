package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class j4 implements android.os.Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t5 f213013a = new com.tencent.mm.vfs.t5(new com.tencent.mm.vfs.NullFileSystem(null));

    public j4(com.tencent.mm.vfs.i4 i4Var) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return (com.tencent.mm.vfs.NullFileSystem) f213013a.f213187a;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.vfs.NullFileSystem[i17];
    }
}
