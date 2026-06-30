package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public class k6 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.p6 f192810d;

    public k6(com.tencent.mm.sdk.platformtools.p6 p6Var) {
        this.f192810d = p6Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f192810d.a(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RWCache", "summer timer onTimerExpired e appendAll takes: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
        return false;
    }
}
