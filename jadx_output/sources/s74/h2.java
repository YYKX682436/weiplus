package s74;

/* loaded from: classes4.dex */
public final class h2 implements com.tencent.mm.pluginsdk.ui.span.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f404325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f404327c;

    public h2(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f404325a = weakReference;
        this.f404326b = snsInfo;
        this.f404327c = i17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.a
    public final void a(int i17, int i18) {
        int i19 = this.f404327c;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404326b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$setNormalStyleText$1$1");
        try {
            i64.b1 b1Var = (i64.b1) this.f404325a.get();
            com.tencent.mars.xlog.Log.i("AdTagClickableHelperInDynamicComponent", "In dynamicView, snsId = " + snsInfo.field_snsId + ", source = " + i19 + ", clickPos = " + i18);
            n74.o0.b(i19, snsInfo, i18, b1Var);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdTagClickableHelperInDynamicComponent", th6);
            com.tencent.mars.xlog.Log.e("AdTagClickableHelperInDynamicComponent", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$setNormalStyleText$1$1");
    }
}
