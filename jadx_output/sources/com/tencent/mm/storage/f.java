package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public static vg3.z3 f193894b;

    /* renamed from: a, reason: collision with root package name */
    public final xg3.m0 f193895a;

    public f(xg3.m0 m0Var) {
        this.f193895a = m0Var;
    }

    public void a(xg3.k0 k0Var) {
        com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) this.f193895a;
        synchronized (g9Var.f193981g) {
            ((java.util.LinkedList) g9Var.f193981g).add(k0Var);
        }
        g9Var.Jb(k0Var);
    }

    public boolean b(com.tencent.mm.storage.f9 f9Var, c01.ea eaVar) {
        return true;
    }

    public void c(com.tencent.mm.storage.f9 f9Var) {
    }

    public l75.k0 d() {
        return ((com.tencent.mm.storage.g9) this.f193895a).f193989r;
    }

    public java.lang.String e(java.lang.String str) {
        return ((com.tencent.mm.storage.g9) this.f193895a).X8(str);
    }

    public abstract java.lang.String f(java.lang.String str);

    public void g(l75.k0 k0Var, java.lang.String str) {
        ((com.tencent.mm.storage.g9) this.f193895a).Na(k0Var, str);
    }
}
