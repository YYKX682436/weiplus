package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f179351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f179352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f179353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a f179354g;

    public d(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, android.app.Activity activity, com.tencent.mm.modelbase.f fVar, android.os.Bundle bundle) {
        this.f179354g = aVar;
        this.f179351d = activity;
        this.f179352e = fVar;
        this.f179353f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.utils.z1.d(this.f179351d, ((r45.oj5) this.f179352e.f70618d).f382305g, null, null, null, new com.tencent.mm.plugin.wallet_core.id_verify.b(this));
    }
}
