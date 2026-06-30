package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c0 f200351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.ui.chatting.component.c0 c0Var) {
        super(0);
        this.f200351d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_enable_app_msg_wxa_expose_period_stat, a17);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f200351d.f198857e, "isExposePeriodStatEnabled: " + booleanValue);
        return valueOf;
    }
}
