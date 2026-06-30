package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130165d;

    public a0(com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        this.f130165d = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130165d;
        fp0.t tVar = o0Var.A;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.w(o0Var), null, 2, null));
        }
    }
}
