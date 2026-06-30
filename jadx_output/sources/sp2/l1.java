package sp2;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f411071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f411074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f411075h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f411076i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f411077m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f411078n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f411079o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.modelbase.f fVar, int i17, sp2.o2 o2Var, boolean z17, int i18, yz5.a aVar, long j17, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411071d = fVar;
        this.f411072e = i17;
        this.f411073f = o2Var;
        this.f411074g = z17;
        this.f411075h = i18;
        this.f411076i = aVar;
        this.f411077m = j17;
        this.f411078n = lVar;
        this.f411079o = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.l1(this.f411071d, this.f411072e, this.f411073f, this.f411074g, this.f411075h, this.f411076i, this.f411077m, this.f411078n, this.f411079o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sp2.l1 l1Var = (sp2.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        int integer;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.tencent.mm.modelbase.f fVar = this.f411071d;
        sb6.append(fVar.f70615a);
        sb6.append(" errCode=");
        sb6.append(fVar.f70616b);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        rq2.d dVar = rq2.d.f398816a;
        int i17 = this.f411072e;
        dVar.f(i17, 10000);
        cq2.q qVar = cq2.q.f221428a;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        qVar.i("normalCgiBack", (r45.dk2) resp);
        int i18 = fVar.f70615a;
        yz5.l lVar = this.f411078n;
        sp2.o2 o2Var = this.f411073f;
        if (i18 == 0 && fVar.f70616b == 0) {
            o2Var.A = (r45.dk2) fVar.f70618d;
            java.lang.Integer num = new java.lang.Integer(this.f411075h);
            num.intValue();
            boolean z18 = this.f411074g;
            if (!(!z18)) {
                num = null;
            }
            o2Var.I(z18, num, (r45.dk2) fVar.f70618d);
            r45.dk2 dk2Var = o2Var.A;
            sp2.j.f411055b = dk2Var != null && dk2Var.getBoolean(10);
            r45.dk2 dk2Var2 = o2Var.A;
            tp2.f.f421137g = dk2Var2 != null && dk2Var2.getBoolean(10);
            rq2.o oVar = rq2.o.f398847a;
            r45.dk2 dk2Var3 = o2Var.A;
            rq2.o.f398848b = dk2Var3 != null && dk2Var3.getBoolean(10);
            sp2.b bVar = sp2.b.f410972a;
            sp2.b.f410975d = (o2Var.A != null ? r6.getInteger(3) : 0) * 1000;
            if (z18 && i17 != 1 && i17 != 2) {
                o2Var.Y = ((r45.dk2) fVar.f70618d).getByteString(6);
                com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi firstCgiLastBuffer=" + o2Var.Y);
            }
            yz5.a aVar2 = this.f411076i;
            if (aVar2 != null && ((java.lang.Boolean) aVar2.invoke()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadData complete, discardProcess");
            } else {
                sp2.o2 o2Var2 = this.f411073f;
                r45.dk2 dk2Var4 = o2Var2.A;
                boolean z19 = this.f411074g;
                o2Var2.G(dk2Var4, z19, this.f411077m, lVar == null && z19);
            }
            o2Var.D((r45.ha2) ((r45.dk2) fVar.f70618d).getCustom(13));
            z17 = true;
        } else {
            z17 = false;
        }
        dVar.e(i17, 10000);
        if (lVar != null) {
            lVar.invoke(fVar);
        } else {
            if (z17) {
                gp2.l0 l0Var = o2Var.f411162x;
                if (l0Var != null) {
                    r45.dk2 dk2Var5 = o2Var.A;
                    l0Var.H(dk2Var5 != null ? dk2Var5.getInteger(15) : 0);
                }
                kotlinx.coroutines.l.d(o2Var.f411129e, null, null, new sp2.j1(o2Var, null), 3, null);
                r45.dk2 dk2Var6 = o2Var.A;
                if (dk2Var6 != null && (integer = dk2Var6.getInteger(5)) > 0) {
                    zl2.r4.f473950a.I0().putInt("finder_live_watch_count_down_refresh_interval", integer);
                }
                if (!o2Var.f411133g) {
                    o2Var.f411133g = true;
                    o2Var.E();
                    r45.dk2 dk2Var7 = o2Var.A;
                    boolean z27 = dk2Var7 != null ? dk2Var7.getBoolean(7) : false;
                    com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi cgi end skipGetAllLiveTabs=" + z27);
                    com.tencent.mm.ui.MMActivity activity = o2Var.f411121a;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    ((sp2.b0) pf5.z.f353948a.a(activity).a(sp2.b0.class)).P6(o2Var.A, z27);
                }
            }
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = o2Var.f411155r;
            if (wxRefreshLayout == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout.i(z17);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = o2Var.f411155r;
            if (wxRefreshLayout2 == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout2.e(z17);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout3 = o2Var.f411155r;
            if (wxRefreshLayout3 == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout3.setEnabled(true);
        }
        yz5.l lVar2 = this.f411079o;
        if (lVar2 != null) {
            lVar2.invoke(fVar);
        }
        o2Var.C(false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
        if (finderParentRecyclerView != null) {
            finderParentRecyclerView.getViewTreeObserver().addOnPreDrawListener(new sp2.k1(currentTimeMillis, i17, o2Var));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }
}
