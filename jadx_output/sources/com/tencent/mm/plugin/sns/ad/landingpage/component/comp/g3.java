package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes7.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f162828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f162829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, kotlin.jvm.internal.e0 e0Var, yz5.a aVar) {
        super(1);
        this.f162827d = j3Var;
        this.f162828e = e0Var;
        this.f162829f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        am.g0 data = (am.g0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f6716a == 6) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek end! ");
            n01.d d17 = n01.c.d(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(this.f162827d));
            sb6.append(d17 != null ? d17.f333866e : 0);
            sb6.append(' ');
            sb6.append(this.f162828e.f310115d);
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingMusicComponent", sb6.toString());
            this.f162829f.invoke();
            bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        } else {
            bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        return bool;
    }
}
