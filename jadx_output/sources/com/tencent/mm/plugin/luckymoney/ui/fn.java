package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class fn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f146917d;

    public fn(com.tencent.mm.plugin.luckymoney.ui.co coVar) {
        this.f146917d = coVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f146917d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) coVar.f146813i.getLayoutParams();
        layoutParams.width = coVar.f146827z.getWidth();
        coVar.f146813i.setLayoutParams(layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) coVar.f146814m.getLayoutParams();
        layoutParams2.width = coVar.f146812h.getWidth();
        layoutParams2.height = coVar.f146812h.getHeight();
        coVar.f146814m.setLayoutParams(layoutParams2);
    }
}
