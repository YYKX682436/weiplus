package com.tencent.mm.vfs;

/* loaded from: classes3.dex */
public class h5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f212978a;

    /* renamed from: b, reason: collision with root package name */
    public final long f212979b;

    public h5(long j17, long j18) {
        this.f212978a = j17;
        this.f212979b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.h5)) {
            return false;
        }
        com.tencent.mm.vfs.h5 h5Var = (com.tencent.mm.vfs.h5) obj;
        return h5Var.f212978a == this.f212978a && h5Var.f212979b == this.f212979b;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f212978a) ^ java.lang.Long.hashCode(this.f212979b);
    }
}
