package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class i implements com.tencent.mm.splash.v {
    @Override // com.tencent.mm.splash.v
    public void a() {
        com.tencent.mm.splash.j.d("WxSplash.Splash", "told me done.", new java.lang.Object[0]);
        com.tencent.mm.splash.j.a();
    }

    @Override // com.tencent.mm.splash.v
    public void b() {
        com.tencent.mm.splash.j.f193651j = true;
        if (com.tencent.mm.splash.j.f193651j) {
            com.tencent.mm.splash.j.d("WxSplash.Splash", "pending early replay %s", java.lang.Boolean.valueOf(com.tencent.mm.splash.j.f193651j));
            com.tencent.mm.splash.j.g();
        }
    }
}
