package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class f0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.vfs.DBFileMultiplexFileSystem(source, (kotlin.jvm.internal.i) null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.vfs.DBFileMultiplexFileSystem[i17];
    }
}
