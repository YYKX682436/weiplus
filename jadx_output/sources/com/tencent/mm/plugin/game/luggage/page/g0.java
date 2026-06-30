package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f139892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f139893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f139894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139895i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139896m;

    public g0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27) {
        this.f139896m = x0Var;
        this.f139890d = str;
        this.f139891e = str2;
        this.f139892f = i17;
        this.f139893g = i18;
        this.f139894h = i19;
        this.f139895i = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139896m;
        x0Var.M.post(new com.tencent.mm.plugin.webview.luggage.w0(x0Var));
        x0Var.w();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(x0Var.f406657n);
        java.lang.String str = this.f139890d;
        bundle.putString("rawUrl", str);
        com.tencent.mm.plugin.game.luggage.page.b bVar = new com.tencent.mm.plugin.game.luggage.page.b(x0Var.f406612f, null, bundle);
        ((java.util.HashMap) x0Var.R1).put(this.f139891e, bVar);
        android.widget.FrameLayout frameLayout = x0Var.A;
        android.view.View view = bVar.f406654h;
        frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(this.f139892f, this.f139893g));
        view.setX(this.f139894h + x0Var.A.getX());
        view.setY(this.f139895i + x0Var.A.getY());
        bVar.f182186t.setVisibility(8);
        bVar.M.post(new com.tencent.mm.plugin.webview.luggage.w0(bVar));
        bVar.b(str, bundle);
    }
}
