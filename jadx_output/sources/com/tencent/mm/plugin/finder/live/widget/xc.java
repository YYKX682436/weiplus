package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class xc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yc f120312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(android.view.View view, com.tencent.mm.plugin.finder.live.widget.yc ycVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120311e = view;
        this.f120312f = ycVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.xc xcVar = new com.tencent.mm.plugin.finder.live.widget.xc(this.f120311e, this.f120312f, continuation);
        xcVar.f120310d = obj;
        return xcVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.xc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f120310d;
        android.view.View view = this.f120311e;
        boolean isShown = view.isShown();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isShown && kotlinx.coroutines.z0.h(y0Var)) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.live.widget.yc ycVar = this.f120312f;
            ycVar.f120438g = kotlinx.coroutines.l.b(y0Var, g3Var, null, new com.tencent.mm.plugin.finder.live.widget.wc(ycVar, view, null), 2, null);
        }
        return f0Var;
    }
}
