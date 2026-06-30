package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.d f213846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f213847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e f213848f;

    public a(com.tencent.mm.wallet_core.model.e eVar, com.tencent.mm.wallet_core.model.d dVar, boolean z17) {
        this.f213848f = eVar;
        this.f213846d = dVar;
        this.f213847e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f213848f.e(this.f213846d, this.f213847e);
    }
}
