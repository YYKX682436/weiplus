package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class AbstractFileSystem implements com.tencent.mm.vfs.FileSystem {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.vfs.x5 f212679d = null;

    public com.tencent.mm.vfs.AbstractFileSystem a(java.lang.String str, com.tencent.mm.vfs.v5 v5Var) {
        this.f212679d = v5Var == null ? null : new com.tencent.mm.vfs.d3(str, v5Var);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
