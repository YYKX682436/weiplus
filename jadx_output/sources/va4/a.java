package va4;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f434400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xc4.p pVar) {
        super(1);
        this.f434400d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.router.SnsRouter$jumpToFoldPage$list$1$1");
        java.lang.Long l17 = (java.lang.Long) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.router.SnsRouter$jumpToFoldPage$list$1$1");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(l17 != null && l17.longValue() == this.f434400d.y0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.router.SnsRouter$jumpToFoldPage$list$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.router.SnsRouter$jumpToFoldPage$list$1$1");
        return valueOf;
    }
}
