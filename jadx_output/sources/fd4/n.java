package fd4;

/* loaded from: classes4.dex */
public class n implements com.tencent.mm.plugin.sns.ui.widget.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.o f261318a;

    public n(fd4.o oVar) {
        this.f261318a = oVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onCancel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        try {
            com.tencent.mars.xlog.Log.i("LongPressAdBusiness", "SnsAdTouchProgressView onClick");
            this.f261318a.f261289f.f425154o.f168414d.performClick();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LongPressAdBusiness", "SnsAdTouchProgressView onClick exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onFinish() {
        s34.x xVar;
        com.tencent.mm.plugin.sns.storage.x xVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        fd4.o oVar = this.f261318a;
        oVar.f261289f.T.f425132b = true;
        com.tencent.mm.plugin.sns.storage.n nVar = oVar.f261293m;
        if (nVar == null || nVar.gestureClickActionInfo == null) {
            com.tencent.mars.xlog.Log.i("LongPressAdBusiness", "no gestureClickActionInfo");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("ad_no_click_anim", true);
            oVar.r(bundle);
            oVar.l();
            oVar.k(28);
        } else {
            com.tencent.mars.xlog.Log.i("LongPressAdBusiness", "has gestureClickActionInfo");
            if (oVar.f261292i.getAdXml().adEggAnimationInfo != null) {
                com.tencent.mars.xlog.Log.i("LongPressAdBusiness", "has adEggAnimationInfo");
                xVar = oVar.f261292i.getAdXml().adEggAnimationInfo;
            } else {
                com.tencent.mm.plugin.sns.storage.n nVar2 = oVar.f261293m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasOldLongPressAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                boolean z17 = (nVar2 == null || (xVar2 = nVar2.f166076k) == null || android.text.TextUtils.isEmpty(xVar2.f166161d)) ? false : true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasOldLongPressAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                if (z17) {
                    com.tencent.mars.xlog.Log.i("LongPressAdBusiness", "has oldLongPressAnim");
                    xVar = new s34.x();
                    xVar.f402822a = 5;
                    s34.u uVar = new s34.u();
                    xVar.randomSpriteAnimInfo = uVar;
                    com.tencent.mm.plugin.sns.storage.x xVar3 = oVar.f261293m.f166076k;
                    uVar.f402782a = xVar3.f166162e;
                    uVar.f402784c = xVar3.f166164g;
                    uVar.spriteImageUrl = xVar3.f166161d;
                    uVar.f402783b = xVar3.f166163f;
                } else {
                    com.tencent.mars.xlog.Log.i("LongPressAdBusiness", "no adEggAnimationInfo, and no oldLongPressAnim");
                    xVar = null;
                }
            }
            oVar.f261293m.gestureClickActionInfo.f162569a = 17;
            t34.g gVar = new t34.g();
            gVar.f(oVar.f261294n);
            gVar.e(oVar.f261292i);
            gVar.c(oVar.f261293m.gestureClickActionInfo);
            gVar.d(oVar.f261288e);
            gVar.a(xVar);
            gVar.b(oVar.f261296p);
            u74.d dVar = oVar.f261289f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            t34.f fVar = gVar.f415431a;
            fVar.f415430i = dVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            com.tencent.mm.plugin.sns.ui.listener.i iVar = oVar.f261291h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            fVar.f415429h = iVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            gVar.g(oVar.f261287d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }
}
