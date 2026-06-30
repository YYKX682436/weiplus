package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class p6 implements com.tencent.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f213126a = new java.util.LinkedHashMap();

    public final void b(java.lang.String name, com.tencent.mm.vfs.c6 storage) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(storage, "storage");
        if (this.f213126a.put(name, storage) != null) {
            throw new java.lang.AssertionError("Duplicated filesystem: ".concat(name));
        }
    }

    public final void c(int i17, yz5.l setup) {
        kotlin.jvm.internal.o.g(setup, "setup");
        setup.invoke(new com.tencent.mm.vfs.q(i17, com.tencent.mm.vfs.o6.f213116d, this));
    }

    public final void d(int i17, yz5.l storageSetup, yz5.l setup) {
        kotlin.jvm.internal.o.g(storageSetup, "storageSetup");
        kotlin.jvm.internal.o.g(setup, "setup");
        setup.invoke(new com.tencent.mm.vfs.q(i17, storageSetup, this));
    }

    public final void e(java.lang.String name, int[] flagList, yz5.l setup) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(flagList, "flagList");
        kotlin.jvm.internal.o.g(setup, "setup");
        com.tencent.mm.vfs.f6 f6Var = new com.tencent.mm.vfs.f6(name);
        f6Var.d(java.util.Arrays.copyOf(flagList, flagList.length));
        setup.invoke(f6Var);
        b(name, f6Var.b());
    }
}
