package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class SingletonSchemeResolver implements com.tencent.mm.vfs.SchemeResolver, com.tencent.mm.vfs.s5 {
    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return this;
    }

    public com.tencent.mm.vfs.z7 c(com.tencent.mm.vfs.m5 m5Var, com.tencent.mm.vfs.z7 z7Var) {
        if (a(m5Var, z7Var) == null) {
            return null;
        }
        return z7Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }
}
