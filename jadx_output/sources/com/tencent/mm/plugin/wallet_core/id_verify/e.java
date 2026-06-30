package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f179364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f179365e;

    public e(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, android.app.Activity activity, com.tencent.mm.modelbase.f fVar) {
        this.f179364d = activity;
        this.f179365e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.utils.z1.c(this.f179364d, ((r45.oj5) this.f179365e.f70618d).f382305g, null);
    }
}
