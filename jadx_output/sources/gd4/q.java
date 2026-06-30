package gd4;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f270807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.b0 f270808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f270809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f270810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gd4.r f270811h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f270812i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f270813m;

    public q(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.sns.storage.b0 b0Var, int i17, android.graphics.Rect rect, gd4.r rVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18) {
        this.f270807d = h0Var;
        this.f270808e = b0Var;
        this.f270809f = i17;
        this.f270810g = rect;
        this.f270811h = rVar;
        this.f270812i = snsInfo;
        this.f270813m = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        w64.n nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.h0 h0Var = this.f270807d;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) h0Var.f310123d;
        android.graphics.Rect rect = this.f270810g;
        int i17 = this.f270809f;
        com.tencent.mm.plugin.sns.storage.b0 b0Var = this.f270808e;
        if (adClickActionInfo == null) {
            com.tencent.mars.xlog.Log.e("BreakFrameCardAdController.adClickArea", "clickView-onClick, clickActionInfo==null, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
            return;
        }
        b0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForbidClick", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForbidClick", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        if (b0Var.f165937g) {
            com.tencent.mars.xlog.Log.e("BreakFrameCardAdController.adClickArea", "clickView-onClick, forbidClick, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
            return;
        }
        gd4.r rVar = this.f270811h;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        yz5.a aVar = rVar.f270822g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (aVar == null || (nVar = (w64.n) aVar.invoke()) == null) {
            com.tencent.mars.xlog.Log.e("BreakFrameCardAdController.adClickArea", "clickView-onClick, handler==null, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
            return;
        }
        com.tencent.mars.xlog.Log.i("BreakFrameCardAdController.adClickArea", "clickView-onClick, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
        java.lang.Object obj = h0Var.f310123d;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) obj;
        if (adClickActionInfo2 != null) {
            adClickActionInfo2.f162569a = 9;
        }
        nVar.o((com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) obj, this.f270812i, this.f270813m);
        nVar.k(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
    }
}
