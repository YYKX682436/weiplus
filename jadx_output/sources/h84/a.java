package h84;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h84.h f279557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.c1 f279558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f279559f;

    public a(h84.h hVar, s34.c1 c1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f279557d = hVar;
        this.f279558e = c1Var;
        this.f279559f = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$bindComponentModel$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adgamegift/AdWxaGameGiftTagComponent$bindComponentModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h84.h hVar = this.f279557d;
        com.tencent.mars.xlog.Log.i(hVar.j(), "click mWxaGameGiftTagViewContent");
        s34.c1 c1Var = this.f279558e;
        if (c1Var.a() != null) {
            c1Var.a().f162569a = 20;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            w64.n nVar = hVar.f279567p;
            if (nVar != null) {
                nVar.p(new w64.c(c1Var.a(), this.f279559f, 0, null, false, 0, false, null, 252, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            if (nVar != null) {
                nVar.k(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adgamegift/AdWxaGameGiftTagComponent$bindComponentModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$bindComponentModel$3");
    }
}
