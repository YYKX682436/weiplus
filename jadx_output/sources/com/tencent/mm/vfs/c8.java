package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class c8 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212883a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f212884b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.vfs.b8 f212885c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.x1[] f212886d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f212887e;

    public c8(com.tencent.mm.vfs.q2 q2Var, boolean z17, com.tencent.mm.vfs.b8 b8Var) {
        this.f212883a = q2Var;
        this.f212884b = z17;
        this.f212885c = b8Var;
        com.tencent.mm.vfs.x1[] x1VarArr = new com.tencent.mm.vfs.x1[1];
        this.f212886d = x1VarArr;
        this.f212887e = java.util.Arrays.asList(x1VarArr);
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        java.lang.Iterable list;
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        this.f212886d[0] = x1Var;
        boolean z17 = x1Var.f213236f;
        java.util.List list2 = this.f212887e;
        if (!z17) {
            return list2;
        }
        com.tencent.mm.vfs.b8 b8Var = this.f212885c;
        if (!(b8Var == null || b8Var.accept(x1Var)) || (list = this.f212883a.list(x1Var.f213231a)) == null) {
            return list2;
        }
        pm5.b bVar = new pm5.b(list, this);
        java.util.Set singleton = java.util.Collections.singleton(x1Var);
        return this.f212884b ? new pm5.i(bVar, singleton) : new pm5.i(singleton, bVar);
    }
}
