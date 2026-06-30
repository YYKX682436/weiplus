package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f182719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.a1 f182720h;

    public z0(com.tencent.mm.plugin.webview.luggage.a1 a1Var, int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        this.f182720h = a1Var;
        this.f182716d = i17;
        this.f182717e = str;
        this.f182718f = i18;
        this.f182719g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182720h.f182142a;
        e0Var.getClass();
        int i17 = this.f182716d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onError, reason = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f182718f), java.lang.Integer.valueOf(this.f182719g));
        if ((i17 == 0 || i17 == 2 || i17 == 8 || i17 == 9) && !e0Var.y(this.f182717e)) {
            e0Var.f182190x.setVisibility(0);
            e0Var.w();
        }
    }
}
