package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class k0 implements com.tencent.mm.wallet_core.model.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p f213925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f213926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f213927c;

    public k0(com.tencent.mm.wallet_core.model.p0 p0Var, com.tencent.mm.wallet_core.model.p pVar, android.app.Activity activity) {
        this.f213927c = p0Var;
        this.f213925a = pVar;
        this.f213926b = activity;
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onCancel() {
        if (this.f213927c.b()) {
            this.f213925a.a();
        } else {
            this.f213926b.finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onEnter() {
        this.f213927c.getClass();
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlCancel() {
        if (this.f213927c.b()) {
            this.f213925a.a();
        } else {
            this.f213926b.finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlOk() {
        if (this.f213927c.b()) {
            this.f213925a.a();
        }
    }
}
