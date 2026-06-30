package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class a8 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.b8 f212795a;

    public a8(com.tencent.mm.vfs.b8 b8Var) {
        this.f212795a = b8Var;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) obj;
        java.util.Set singleton = java.util.Collections.singleton(q2Var);
        if (!(q2Var instanceof com.tencent.mm.vfs.p2)) {
            return singleton;
        }
        com.tencent.mm.vfs.b8 b8Var = this.f212795a;
        return (b8Var == null || b8Var.accept(q2Var)) ? new pm5.i(singleton, new pm5.b(((com.tencent.mm.vfs.p2) q2Var).E(), this)) : singleton;
    }
}
