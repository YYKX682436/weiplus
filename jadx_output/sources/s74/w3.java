package s74;

/* loaded from: classes4.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f404580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404580d = context;
        this.f404581e = snsInfo;
        this.f404582f = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        s74.w3 w3Var = new s74.w3(this.f404580d, this.f404581e, this.f404582f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        return w3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        s74.w3 w3Var = (s74.w3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w3Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("DynamicView.Preloader", "add tagListView~");
        android.content.Context context = this.f404580d;
        com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView snsCardAdTagListView = new com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView(context);
        snsCardAdTagListView.setTagSpace(i65.a.b(context, 8));
        snsCardAdTagListView.setContext(context);
        snsCardAdTagListView.a(this.f404581e.getAdXml().adCardTagInfo.f166023a);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        android.widget.FrameLayout s17 = this.f404582f.s();
        if (s17 != null) {
            s17.addView(snsCardAdTagListView, layoutParams);
        }
        com.tencent.mars.xlog.Log.i("DynamicView.Preloader", "add tagListView~ end");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2$1");
        return f0Var;
    }
}
