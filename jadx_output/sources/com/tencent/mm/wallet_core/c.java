package com.tencent.mm.wallet_core;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.e f213796f;

    public c(com.tencent.mm.wallet_core.e eVar, android.view.View view, int i17) {
        this.f213796f = eVar;
        this.f213794d = view;
        this.f213795e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f213796f.a(this.f213794d, this.f213795e);
    }
}
