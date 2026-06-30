package s74;

/* loaded from: classes4.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404323f;

    public h0(s74.o0 o0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.f3 f3Var) {
        this.f404321d = o0Var;
        this.f404322e = snsInfo;
        this.f404323f = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f404321d;
        w64.n nVar = new w64.n(o0Var.E(), o0Var.H(), o0Var.G(), null, null);
        l44.k4 k4Var = l44.k4.f316220a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404322e;
        com.tencent.mm.plugin.sns.ui.listener.i f17 = o0Var.C().f();
        kz5.p0 p0Var = kz5.p0.f313996d;
        nVar.x(l44.k4.c(k4Var, snsInfo, 1, f17, null, p0Var, p0Var, null, null, 128, null));
        s34.c1 c1Var = this.f404323f.e().f289288b.adWeAppGameGiftTagInfo;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = c1Var != null ? c1Var.a() : null;
        if (a17 != null) {
            a17.f162569a = 20;
            nVar.p(new w64.c(a17, this.f404322e, 0, null, false, 0, false, null, 252, null));
            nVar.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$8");
    }
}
