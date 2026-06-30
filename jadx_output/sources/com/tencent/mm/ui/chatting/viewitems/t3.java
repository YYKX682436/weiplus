package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a4 f205551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f205552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f205553f;

    public t3(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, boolean z17, boolean z18) {
        this.f205551d = a4Var;
        this.f205552e = z17;
        this.f205553f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.a4 a4Var = this.f205551d;
        int height = a4Var.clickArea.getHeight();
        a4Var.clickArea.getWidth();
        if (!this.f205552e) {
            android.view.ViewGroup.LayoutParams layoutParams = a4Var.f203263g.getLayoutParams();
            layoutParams.height = height;
            a4Var.f203263g.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = a4Var.f203281y.getLayoutParams();
            layoutParams2.height = height;
            a4Var.f203281y.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = a4Var.f203280x.getLayoutParams();
            layoutParams3.height = height;
            a4Var.f203280x.setLayoutParams(layoutParams3);
            android.view.ViewGroup.LayoutParams layoutParams4 = a4Var.G.getLayoutParams();
            layoutParams4.height = height;
            a4Var.G.setLayoutParams(layoutParams4);
            android.view.ViewGroup.LayoutParams layoutParams5 = a4Var.H.getLayoutParams();
            layoutParams5.height = (int) (height * 1.45454f);
            a4Var.H.setLayoutParams(layoutParams5);
        }
        int height2 = (int) (a4Var.clickArea.getHeight() * 1.45454f);
        int i17 = (int) (height2 * 1.25f);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) a4Var.f203267k.getLayoutParams();
        layoutParams6.height = height2;
        layoutParams6.width = i17;
        a4Var.f203267k.setLayoutParams(layoutParams6);
        a4Var.f203277u = (int) ((a4Var.clickArea.getHeight() * 0.45d) / 2.0d);
        a4Var.f203278v = a4Var.clickArea.getWidth() - (i17 + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4));
        com.tencent.mm.ui.chatting.viewitems.g4.j(a4Var, a4Var.f203277u, this.f205553f);
    }
}
