package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f163749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f163750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f163751f;

    /* renamed from: g, reason: collision with root package name */
    public int f163752g;

    /* renamed from: h, reason: collision with root package name */
    public int f163753h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f163754i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f163756n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f163757o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f163758p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer, r45.jj4 jj4Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f163755m = adLivingStreamContainer;
        this.f163756n = jj4Var;
        this.f163757o = i17;
        this.f163758p = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1");
        com.tencent.mm.plugin.sns.ad.widget.living.q qVar = new com.tencent.mm.plugin.sns.ad.widget.living.q(this.f163755m, this.f163756n, this.f163757o, this.f163758p, continuation);
        qVar.f163754i = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1");
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.widget.living.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.living.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
