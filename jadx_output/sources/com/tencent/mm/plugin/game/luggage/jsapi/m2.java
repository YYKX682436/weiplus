package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.u0 f139714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f139715e;

    public m2(com.tencent.mm.plugin.game.luggage.jsapi.j2 j2Var, sd.u0 u0Var, android.os.Bundle bundle) {
        this.f139714d = u0Var;
        this.f139715e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.x xVar = this.f139714d.f406612f;
        if (xVar == null || ((sd.u) xVar).f406653a == null) {
            return;
        }
        sd.w wVar = ((sd.u) xVar).f406653a;
        android.os.Bundle bundle = this.f139715e;
        wVar.g(bundle.getString("rawUrl"), bundle);
    }
}
