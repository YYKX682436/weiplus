package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f193041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f193042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f193043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.u7 f193044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f193045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(long j17, java.util.Set set, android.net.ConnectivityManager connectivityManager, com.tencent.mm.sdk.platformtools.u7 u7Var, kotlinx.coroutines.q qVar) {
        super(0);
        this.f193041d = j17;
        this.f193042e = set;
        this.f193043f = connectivityManager;
        this.f193044g = u7Var;
        this.f193045h = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f193041d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Set set = this.f193042e;
        java.lang.String str2 = (java.lang.String) kz5.n0.Y(set);
        java.lang.String str3 = "";
        if (str2 == null || (str = "firstIp:".concat(str2)) == null) {
            str = "";
        }
        sb6.append(str);
        if (set.size() > 1) {
            str3 = " lastIp:" + ((java.lang.String) kz5.n0.h0(set));
        }
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.SimCardUtil", "getSimCardIPAddresses end cost:" + currentTimeMillis + " ipList:[size:" + set.size() + ' ' + sb6.toString() + ']');
        this.f193043f.unregisterNetworkCallback(this.f193044g);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f193045h).resumeWith(kotlin.Result.m521constructorimpl(kz5.n0.S0(set)));
        return jz5.f0.f302826a;
    }
}
