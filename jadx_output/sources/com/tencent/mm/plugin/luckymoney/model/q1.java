package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r1 f145559g;

    public q1(com.tencent.mm.plugin.luckymoney.model.r1 r1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f145559g = r1Var;
        this.f145556d = bitmap;
        this.f145557e = i17;
        this.f145558f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.luckymoney.model.r1 r1Var = this.f145559g;
        int i18 = r1Var.f145570b;
        android.graphics.Bitmap createScaledBitmap = (i18 <= 0 || (i17 = r1Var.f145571c) <= 0) ? this.f145556d : android.graphics.Bitmap.createScaledBitmap(this.f145556d, i18, i17, true);
        int i19 = this.f145559g.f145570b;
        int i27 = this.f145559g.f145571c;
        this.f145556d.getWidth();
        this.f145556d.getHeight();
        createScaledBitmap.getWidth();
        createScaledBitmap.getHeight();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.p1(this, createScaledBitmap));
    }
}
