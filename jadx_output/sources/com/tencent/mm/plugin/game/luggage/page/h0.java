package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f139899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f139900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f139901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f139902h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139903i;

    public h0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f139903i = x0Var;
        this.f139898d = str;
        this.f139899e = i17;
        this.f139900f = i18;
        this.f139901g = i19;
        this.f139902h = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139903i;
        com.tencent.mm.plugin.game.luggage.page.b bVar = (com.tencent.mm.plugin.game.luggage.page.b) ((java.util.HashMap) x0Var.R1).get(this.f139898d);
        if (bVar == null) {
            return;
        }
        android.view.View view = bVar.f406654h;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.f139899e;
        layoutParams.height = this.f139900f;
        view.setLayoutParams(layoutParams);
        view.setX(this.f139901g + x0Var.A.getX());
        view.setY(this.f139902h + x0Var.A.getY());
    }
}
