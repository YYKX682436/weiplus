package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class s0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f139937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139938b;

    public s0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, java.lang.Runnable runnable) {
        this.f139938b = x0Var;
        this.f139937a = runnable;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139938b;
        try {
            x0Var.Z1 = (long) java.lang.Double.parseDouble(str);
        } catch (java.lang.NumberFormatException unused) {
            x0Var.Z1 = 0L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "FCP_Content:%s, FCP_Value:%d", str, java.lang.Long.valueOf(x0Var.Z1));
        java.lang.Runnable runnable = this.f139937a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
