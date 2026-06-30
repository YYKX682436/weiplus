package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class k0 implements pm5.a, pm5.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f213022a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f213023b = new java.util.HashSet();

    public k0(java.lang.String str) {
        this.f213022a = str;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        return ((com.tencent.mm.vfs.q2) obj).list(this.f213022a);
    }

    @Override // pm5.d
    public boolean b(java.lang.Object obj) {
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        return x1Var == null || !this.f213023b.add(x1Var.f213231a);
    }
}
