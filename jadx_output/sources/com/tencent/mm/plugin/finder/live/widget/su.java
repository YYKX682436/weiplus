package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class su extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vu f119836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f119837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f119838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(com.tencent.mm.plugin.finder.live.widget.vu vuVar, hn2.d dVar, r45.yx1 yx1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119836e = vuVar;
        this.f119837f = dVar;
        this.f119838g = yx1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.su(this.f119836e, this.f119837f, this.f119838g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.su) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f119835d;
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = this.f119836e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var = vuVar.f120090b;
            hn2.d dVar = this.f119837f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f372844d = 2;
            this.f119835d = 1;
            obj = d3Var.r7(dVar, dy1Var, false, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.mx1 mx1Var = (r45.mx1) obj;
        if (mx1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSingingSongWidget", "Request item done");
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveRequestSingingSongWidget", "Request item failed");
        }
        kotlinx.coroutines.y0 y0Var = vuVar.f120091c;
        hn2.d dVar2 = this.f119837f;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.qu(vuVar, dVar2, this.f119838g, null), 3, null);
        }
        if (mx1Var != null) {
            sf2.d3 d3Var2 = vuVar.f120090b;
            com.tencent.mm.plugin.finder.live.widget.ru ruVar = com.tencent.mm.plugin.finder.live.widget.ru.f119689d;
            this.f119835d = 2;
            if (d3Var2.d7(dVar2, mx1Var, ruVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
