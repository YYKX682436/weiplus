package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.o1 f145458g;

    public n1(com.tencent.mm.plugin.luckymoney.model.o1 o1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f145458g = o1Var;
        this.f145455d = bitmap;
        this.f145456e = i17;
        this.f145457f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.luckymoney.model.o1 o1Var = this.f145458g;
        int i18 = o1Var.f145488b;
        android.graphics.Bitmap createScaledBitmap = (i18 <= 0 || (i17 = o1Var.f145489c) <= 0) ? this.f145455d : android.graphics.Bitmap.createScaledBitmap(this.f145455d, i18, i17, true);
        int i19 = this.f145458g.f145490d;
        android.graphics.Bitmap s07 = i19 > 0 ? com.tencent.mm.sdk.platformtools.x.s0(createScaledBitmap, false, i19) : com.tencent.mm.sdk.platformtools.x.s0(createScaledBitmap, false, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
        int i27 = this.f145458g.f145488b;
        int i28 = this.f145458g.f145489c;
        this.f145455d.getWidth();
        this.f145455d.getHeight();
        s07.getWidth();
        s07.getHeight();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.m1(this, s07));
    }
}
