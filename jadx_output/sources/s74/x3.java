package s74;

/* loaded from: classes4.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404596e;

    /* renamed from: f, reason: collision with root package name */
    public int f404597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f404598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s74.a4 f404600i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.a4 a4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404598g = context;
        this.f404599h = snsInfo;
        this.f404600i = a4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2");
        s74.x3 x3Var = new s74.x3(this.f404598g, this.f404599h, this.f404600i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2");
        return x3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2");
        java.lang.Object invokeSuspend = ((s74.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadDynamicView$2");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.x3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
