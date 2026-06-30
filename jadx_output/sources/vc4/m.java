package vc4;

/* loaded from: classes4.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f435294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc4.p f435296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f435297g;

    public m(boolean z17, com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, xc4.p pVar, int i17) {
        this.f435294d = z17;
        this.f435295e = improveItemFooter;
        this.f435296f = pVar;
        this.f435297g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc4.p pVar = this.f435296f;
        boolean z17 = this.f435294d;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter = this.f435295e;
        if (z17) {
            vc4.l lVar = new vc4.l(pVar, improveItemFooter, new java.lang.ref.WeakReference(improveItemFooter));
            n34.h3 h3Var = n34.h3.f334610d;
            java.lang.String W0 = pVar.W0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPostCallback", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            n34.h3.f334615i.put(W0, lVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPostCallback", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        }
        int i17 = 0;
        int i18 = this.f435297g;
        if (i18 == 37 || i18 == 36) {
            wa4.d0 d0Var = wa4.d0.f444215d;
        } else {
            wa4.d0 d0Var2 = wa4.d0.f444215d;
            i17 = 1;
        }
        com.tencent.mm.autogen.events.SnsFinderPostEvent snsFinderPostEvent = new com.tencent.mm.autogen.events.SnsFinderPostEvent();
        android.content.Context context = improveItemFooter.getContext();
        am.qv qvVar = snsFinderPostEvent.f54808g;
        qvVar.f7747b = context;
        qvVar.f7746a = i17;
        qvVar.f7748c = pVar.c1();
        snsFinderPostEvent.e();
        if (!z17) {
            pm0.v.V(700L, new vc4.j(improveItemFooter));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1");
    }
}
