package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ac0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f111854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f111855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f111856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f111857g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f111858h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f111859i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(android.graphics.Bitmap bitmap, android.view.View view, com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, cm2.g0 g0Var, boolean z17, android.graphics.Bitmap bitmap2) {
        super(0);
        this.f111854d = bitmap;
        this.f111855e = view;
        this.f111856f = dc0Var;
        this.f111857g = g0Var;
        this.f111858h = z17;
        this.f111859i = bitmap2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cm2.g0 g0Var = this.f111857g;
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f111856f;
        android.graphics.Bitmap bitmap = this.f111854d;
        if (bitmap != null) {
            this.f111855e.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(dc0Var.f112254d.getResources(), bitmap));
            dc0Var.c(g0Var, false, this.f111858h);
        } else {
            com.tencent.mars.xlog.Log.i(dc0Var.f112258h, "resource is null!");
            com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var2 = this.f111856f;
            bw5.mb0 P0 = zl2.r4.f473950a.P0(g0Var.f43346v);
            java.lang.String c17 = P0 != null ? P0.c() : null;
            if (c17 == null) {
                c17 = "";
            }
            dc0Var2.d(c17, this.f111855e, this.f111859i, this.f111857g, this.f111858h);
        }
        return jz5.f0.f302826a;
    }
}
