package l94;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.p f317382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h94.a f317383e;

    public o(l94.p pVar, h94.a aVar) {
        this.f317382d = pVar;
        this.f317383e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object m521constructorimpl;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent$onBindData$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdTitleComponent$onBindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l94.p pVar = this.f317382d;
        com.tencent.mars.xlog.Log.i(pVar.h(), "onclick adinfoview");
        i94.a aVar = new i94.a(pVar.f(), this.f317383e);
        kotlin.jvm.internal.o.d(view);
        m74.b bVar = aVar.f289757e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            aVar.e();
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (bVar.isShowing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            if (view instanceof android.view.ViewGroup) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            } else {
                java.lang.Object parent = view.getParent();
                if (parent != null) {
                    view = (android.view.View) parent;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                }
            }
            aVar.f289761i = view;
            i94.g gVar = aVar.f289760h;
            android.view.View contentView = bVar.getContentView();
            kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
            gVar.a(contentView);
            android.view.View view2 = aVar.f289761i;
            if (view2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            } else {
                android.view.View contentView2 = bVar.getContentView();
                kotlin.jvm.internal.o.f(contentView2, "getContentView(...)");
                int c17 = aVar.c(view2, contentView2);
                aVar.i(c17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                if (c17 < 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                    i17 = com.tencent.mm.R.style.f494542pp;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                    i17 = com.tencent.mm.R.style.f494543pq;
                }
                bVar.setAnimationStyle(i17);
                android.view.View view3 = aVar.f289761i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustWindowPositionX", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                int b17 = i65.a.b(aVar.f289756d, 6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPositionX", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                bVar.showAsDropDown(view3, b17, c17, 8388613);
                bVar.a(0.5f);
                m521constructorimpl = kotlin.Result.m521constructorimpl(bVar);
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("WsFoldAdFeedback", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdTitleComponent$onBindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent$onBindData$2");
    }
}
