package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class fx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f134438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f134439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f134440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlinx.coroutines.y0 y0Var, long j17, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(2, continuation);
        this.f134438d = hVar;
        this.f134439e = y0Var;
        this.f134440f = j17;
        this.f134441g = sxVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.fx(this.f134438d, continuation, this.f134439e, this.f134440f, this.f134441g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.fx fxVar = (com.tencent.mm.plugin.finder.viewmodel.component.fx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fxVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.LinkedList list = ((r45.ca1) ((xg2.i) this.f134438d).f454393b).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject_screen_cast(...)");
        r45.yx4 yx4Var = (r45.yx4) kz5.n0.Z(list);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (yx4Var != null) {
            com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "requestFeedUrl: requestId=" + pm0.v.u(this.f134440f) + ", resultId=" + pm0.v.u(yx4Var.getLong(0)) + ", videoUrl=" + yx4Var.getString(1) + ", expired_time=" + yx4Var.getLong(2));
            ((java.util.HashMap) ((jz5.n) this.f134441g.f135944z).getValue()).put(new java.lang.Long(yx4Var.getLong(0)), yx4Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", "requestFeedUrl: fail, resp is empty");
        }
        return f0Var2;
    }
}
