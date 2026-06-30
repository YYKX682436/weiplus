package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f143917e;

    public c2(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, android.os.Bundle bundle) {
        this.f143916d = str;
        this.f143917e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.LiteAppCenter.releaseKeepAlive(this.f143916d);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f143917e, false, false, new com.tencent.mm.plugin.lite.logic.b2(this));
    }
}
