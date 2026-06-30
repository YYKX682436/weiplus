package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130223d;

    public d3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var) {
        this.f130223d = q3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130223d;
        fp0.t tVar = q3Var.f130384x;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.uniComments.z2(q3Var), null, 2, null));
        }
    }
}
