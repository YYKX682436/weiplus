package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139594e;

    public a5(com.tencent.mm.plugin.game.luggage.jsapi.b5 b5Var, boolean z17, com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139593d = z17;
        this.f139594e = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f139593d;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139594e;
        if (z17) {
            x0Var.f182186t.setVisibility(8);
        } else {
            x0Var.f182186t.setVisibility(0);
        }
    }
}
