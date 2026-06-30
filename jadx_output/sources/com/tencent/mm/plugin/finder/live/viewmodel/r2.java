package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f117353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z2 f117355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var) {
        super(2, continuation);
        this.f117353d = hVar;
        this.f117354e = c0Var;
        this.f117355f = z2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.r2(this.f117353d, continuation, this.f117354e, this.f117355f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.viewmodel.r2 r2Var = (com.tencent.mm.plugin.finder.live.viewmodel.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.m02 m02Var = (r45.m02) ((xg2.i) this.f117353d).f454393b;
        this.f117354e.f310112d = true;
        com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = this.f117355f;
        com.tencent.mars.xlog.Log.i(z2Var.f117557d, "modify visible info success");
        java.util.LinkedList list = m02Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getRet_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            boolean z17 = false;
            if (((r45.ix0) obj2).getInteger(0) == 20) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        if (ix0Var != null) {
            com.tencent.mars.xlog.Log.i(z2Var.f117557d, "modify visible info result: " + ix0Var.getInteger(1) + " msg: " + ix0Var.getString(2));
        }
        return jz5.f0.f302826a;
    }
}
