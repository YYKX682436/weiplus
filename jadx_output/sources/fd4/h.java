package fd4;

/* loaded from: classes4.dex */
public class h implements com.tencent.mm.plugin.sns.ui.widget.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.i f261309a;

    public h(fd4.i iVar) {
        this.f261309a = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.w2
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        ca4.z0.q(true);
        fd4.i iVar = this.f261309a;
        fd4.k.s(iVar.f261313g).setBackgroundColor(0);
        iVar.f261312f.f425154o.f168414d.performClick();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.w2
    public void b(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        boolean z17 = true;
        ca4.z0.q(true);
        fd4.i iVar = this.f261309a;
        fd4.k kVar = iVar.f261313g;
        fd4.k kVar2 = iVar.f261313g;
        fd4.k.s(kVar).setBackgroundColor(0);
        if (list.size() > 0) {
            try {
                try {
                    int i17 = kVar2.f261294n == 0 ? 1 : 2;
                    boolean a17 = l44.n5.a(iVar.f261310d, list, iVar.f261311e, i17, fd4.k.s(kVar2).getWidth(), fd4.k.s(kVar2).getHeight());
                    com.tencent.mars.xlog.Log.i("GestureAdBusiness", "confirmOpenGestureLandingPage=" + a17 + ", scene=" + i17);
                    if (a17) {
                        com.tencent.mm.plugin.sns.storage.n nVar = kVar2.f261293m;
                        if (nVar == null || nVar.gestureClickActionInfo == null) {
                            com.tencent.mars.xlog.Log.i("GestureAdBusiness", "no gestureClickActionInfo");
                            kVar2.r(null);
                            kVar2.l();
                            kVar2.k(25);
                        } else {
                            s34.x xVar = kVar2.f261292i.getAdXml().adEggAnimationInfo;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("has gestureClickActionInfo, has animInfo=");
                            if (xVar == null) {
                                z17 = false;
                            }
                            sb6.append(z17);
                            com.tencent.mars.xlog.Log.i("GestureAdBusiness", sb6.toString());
                            kVar2.f261293m.gestureClickActionInfo.f162569a = 16;
                            t34.g gVar = new t34.g();
                            t34.f fVar = gVar.f415431a;
                            gVar.f(kVar2.f261294n);
                            gVar.e(kVar2.f261292i);
                            gVar.c(kVar2.f261293m.gestureClickActionInfo);
                            gVar.d(kVar2.f261288e);
                            gVar.a(xVar);
                            gVar.b(kVar2.f261296p);
                            u74.d dVar = iVar.f261312f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            fVar.f415430i = dVar;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            com.tencent.mm.plugin.sns.ui.listener.i iVar2 = kVar2.f261291h;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            fVar.f415429h = iVar2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            gVar.g(kVar2.f261287d);
                        }
                        ca4.z0.I0(new long[]{20, 100});
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("GestureAdBusiness", e17, "recog gesture error!", new java.lang.Object[0]);
                }
                fd4.k.s(kVar2).a();
            } catch (java.lang.Throwable th6) {
                fd4.k.s(kVar2).a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.w2
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        ca4.z0.q(false);
        fd4.i iVar = this.f261309a;
        fd4.k.s(iVar.f261313g).setBackgroundColor(iVar.f261313g.f261287d.getResources().getColor(com.tencent.mm.R.color.f479508a52));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
    }
}
