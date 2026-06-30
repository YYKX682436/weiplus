package s74;

/* loaded from: classes4.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f404191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f404193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f404195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404196i;

    public a0(android.app.Activity activity, s74.o0 o0Var, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, android.view.View view) {
        this.f404191d = activity;
        this.f404192e = o0Var;
        this.f404193f = adClickActionInfo;
        this.f404194g = snsInfo;
        this.f404195h = z17;
        this.f404196i = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        java.lang.Object tag = view != null ? view.getTag(com.tencent.mm.R.id.ptl) : null;
        w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        android.app.Activity activity = this.f404191d;
        s74.o0 o0Var = this.f404192e;
        int H = o0Var.H();
        i64.b1 G = o0Var.G();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404194g;
        w64.n nVar = new w64.n(activity, H, G, null, new s74.z(xVar, o0Var, snsInfo));
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f404193f;
        adClickActionInfo.f162569a = 15;
        nVar.p(new w64.c(adClickActionInfo, this.f404194g, 0, null, true, this.f404195h ? 1 : 2, false, null, 204, null));
        l44.k4 k4Var = l44.k4.f316220a;
        android.view.View view2 = this.f404196i;
        java.lang.String localid = snsInfo.getLocalid();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        k4Var.a(view2, localid, timeLine, o0Var.f404451r, o0Var.H(), o0Var.G(), nVar, this.f404195h);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11");
    }
}
