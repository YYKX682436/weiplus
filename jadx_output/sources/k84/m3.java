package k84;

/* loaded from: classes3.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f305126d;

    /* renamed from: e, reason: collision with root package name */
    public int f305127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f305129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(k84.d4 d4Var, kotlinx.coroutines.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305128f = d4Var;
        this.f305129g = r2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1");
        k84.m3 m3Var = new k84.m3(this.f305128f, this.f305129g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1");
        return m3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1");
        java.lang.Object invokeSuspend = ((k84.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.m3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
