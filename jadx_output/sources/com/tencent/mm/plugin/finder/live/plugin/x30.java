package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f115025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f115026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(android.content.Context context, cm2.b0 b0Var) {
        super(0);
        this.f115025d = context;
        this.f115026e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.content.Context context = this.f115025d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490604zq);
        com.tencent.mm.plugin.finder.live.plugin.w30 w30Var = com.tencent.mm.plugin.finder.live.plugin.w30.f114868d;
        az2.f fVar = new az2.f();
        fVar.f16128c = 1000L;
        new java.lang.ref.WeakReference(context);
        az2.q qVar = new az2.q();
        if (string != null) {
            qVar.f16149c = string;
        }
        qVar.f16150d = w30Var;
        qVar.f16152a = new java.lang.ref.WeakReference(context);
        fVar.f16127b = qVar;
        h0Var.f310123d = fVar;
        fVar.a();
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        cm2.b0 b0Var = this.f115026e;
        com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = b0Var.f43331v.getMini_app_info();
        if (mini_app_info == null || (str = mini_app_info.getApp_id()) == null) {
            str = "";
        }
        ((k91.g4) f6Var).Ni(str, new com.tencent.mm.plugin.finder.live.plugin.v30(h0Var, context, b0Var));
        return jz5.f0.f302826a;
    }
}
