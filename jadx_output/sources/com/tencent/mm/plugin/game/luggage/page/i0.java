package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.k0 f139907d;

    public i0(com.tencent.mm.plugin.game.luggage.page.k0 k0Var) {
        this.f139907d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139907d.f139909a;
        int i17 = com.tencent.mm.plugin.game.luggage.page.x0.f139948i2;
        x0Var.getClass();
        android.content.Context context = x0Var.f406610d;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        x0Var.S1 = frameLayout;
        frameLayout.setBackgroundColor(0);
        x0Var.S1.setClickable(true);
        x0Var.f182184r.addView(x0Var.S1, new android.widget.FrameLayout.LayoutParams(-1, -1));
        x0Var.S1.addView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bsh, (android.view.ViewGroup) x0Var.f182184r, false), new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
    }
}
