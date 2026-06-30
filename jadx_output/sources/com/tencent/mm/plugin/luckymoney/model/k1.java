package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.l1 f145386f;

    public k1(com.tencent.mm.plugin.luckymoney.model.l1 l1Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f145386f = l1Var;
        this.f145384d = bitmap;
        this.f145385e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.luckymoney.model.l1 l1Var = this.f145386f;
        int i18 = l1Var.f145405b;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.j1(this, (i18 <= 0 || (i17 = l1Var.f145406c) <= 0) ? this.f145384d : android.graphics.Bitmap.createScaledBitmap(this.f145384d, i18, i17, true)));
    }
}
