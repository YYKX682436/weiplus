package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class q implements com.tencent.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f213129a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f213130b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.vfs.p6 f213131c;

    public q(int i17, yz5.l stgSetup, com.tencent.mm.vfs.p6 vb6) {
        kotlin.jvm.internal.o.g(stgSetup, "stgSetup");
        kotlin.jvm.internal.o.g(vb6, "vb");
        this.f213129a = i17;
        this.f213130b = stgSetup;
        this.f213131c = vb6;
    }

    public final void b(java.lang.String name, int[] flagList, yz5.l setup) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(flagList, "flagList");
        kotlin.jvm.internal.o.g(setup, "setup");
        com.tencent.mm.vfs.f6 f6Var = new com.tencent.mm.vfs.f6(name);
        this.f213130b.invoke(f6Var);
        f6Var.f212937m = this.f213129a;
        f6Var.d(java.util.Arrays.copyOf(flagList, flagList.length));
        setup.invoke(f6Var);
        this.f213131c.b(name, f6Var.b());
    }
}
