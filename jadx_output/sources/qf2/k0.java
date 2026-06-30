package qf2;

/* loaded from: classes3.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.c f362439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f362440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f362442h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ km2.q f362443i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362444m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362445n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(xg2.h hVar, kotlin.coroutines.Continuation continuation, km2.c cVar, boolean z17, qf2.v0 v0Var, boolean z18, km2.q qVar, yz5.l lVar, java.lang.String str) {
        super(2, continuation);
        this.f362438d = hVar;
        this.f362439e = cVar;
        this.f362440f = z17;
        this.f362441g = v0Var;
        this.f362442h = z18;
        this.f362443i = qVar;
        this.f362444m = lVar;
        this.f362445n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.k0(this.f362438d, continuation, this.f362439e, this.f362440f, this.f362441g, this.f362442h, this.f362443i, this.f362444m, this.f362445n);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.k0 k0Var = (qf2.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close pk response success sessionId: ");
        km2.c cVar = this.f362439e;
        sb6.append(cVar != null ? cVar.f309076a : null);
        sb6.append(" isAnchorSelfExit: ");
        sb6.append(this.f362440f);
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", sb6.toString());
        if (this.f362440f) {
            java.util.List list = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
            pm0.v.G(list, qf2.a0.f362280d);
            java.util.List list2 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329325t;
            kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserTempList>(...)");
            pm0.v.G(list2, qf2.b0.f362288d);
            java.util.List list3 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329318o;
            kotlin.jvm.internal.o.f(list3, "<get-linkMicUserList>(...)");
            pm0.v.I(list3, qf2.c0.f362306d);
            java.util.List list4 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329335z;
            kotlin.jvm.internal.o.f(list4, "<get-linkMicUserInfoList>(...)");
            pm0.v.G(list4, qf2.d0.f362326d);
            java.util.Set set = ((mm2.o4) this.f362441g.business(mm2.o4.class)).P;
            kotlin.jvm.internal.o.f(set, "<get-anchorTrtcEnterStateMap>(...)");
            pm0.v.I(set, qf2.e0.f362340d);
            ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329326u.clear();
            ((mm2.o4) this.f362441g.business(mm2.o4.class)).X6();
            ((mm2.y2) this.f362441g.business(mm2.y2.class)).c7();
            com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) this.f362441g.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
            if (naVar != null) {
                naVar.B1();
            }
            if (this.f362442h) {
                db5.t7.makeText(this.f362441g.O6(), this.f362441g.O6().getResources().getString(com.tencent.mm.R.string.f491614do0), 0).show();
            }
            this.f362441g.f7();
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f362441g.f291099e;
            com.tencent.mm.plugin.finder.live.view.v1 v1Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) ubVar : null;
            if (v1Var != null) {
                dk2.ef efVar = dk2.ef.f233372a;
                tn0.w0 w0Var = dk2.ef.f233378d;
                if (w0Var != null) {
                    w0Var.M0(false);
                }
                sm2.o4 startUIC = v1Var.getStartUIC();
                if (startUIC != null) {
                    in0.q qVar = startUIC.f19597e;
                    cl0.g gVar = qVar != null ? qVar.T1 : null;
                    org.json.JSONObject J2 = qVar != null ? qVar.J() : null;
                    in0.q qVar2 = startUIC.f19597e;
                    com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(v1Var, gVar, J2, qVar2 != null ? qVar2.W0() : null, true, null, 16, null);
                }
            }
        } else {
            km2.q qVar3 = this.f362443i;
            if (qVar3 != null) {
                if (qVar3 != null) {
                    qVar3.f309181l = 0;
                }
                mk2.h.f327133a.d(qVar3.f309172c);
                java.util.Map map = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329326u;
                kotlin.jvm.internal.o.f(map, "<get-anchorPkCarryMicUserMap>(...)");
                java.lang.String str = qVar3.f309170a;
                synchronized (map) {
                    map.remove(str);
                }
                java.util.List list5 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329318o;
                kotlin.jvm.internal.o.f(list5, "<get-linkMicUserList>(...)");
                pm0.v.I(list5, new qf2.f0(this.f362445n));
                java.util.List list6 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329319p;
                kotlin.jvm.internal.o.f(list6, "<get-recomApplylinkMicUserList>(...)");
                pm0.v.I(list6, new qf2.g0(qVar3));
                java.util.List list7 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329324s;
                kotlin.jvm.internal.o.f(list7, "<get-anchorPkMicUserList>(...)");
                pm0.v.I(list7, new qf2.h0(this.f362445n));
                java.util.List list8 = ((mm2.o4) this.f362441g.business(mm2.o4.class)).f329325t;
                kotlin.jvm.internal.o.f(list8, "<get-anchorPkMicUserTempList>(...)");
                pm0.v.G(list8, new qf2.i0(this.f362445n));
                if (this.f362442h) {
                    db5.t7.h(this.f362441g.O6(), this.f362441g.O6().getResources().getString(com.tencent.mm.R.string.dma));
                }
            }
        }
        yz5.l lVar = this.f362444m;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
