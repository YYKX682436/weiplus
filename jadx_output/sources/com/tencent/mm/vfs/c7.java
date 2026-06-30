package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class c7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.c6 f212882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(com.tencent.mm.vfs.c6 c6Var) {
        super(1);
        this.f212882d = c6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return r26.i0.t(it, "${dir}", this.f212882d.f212874b, false);
    }
}
