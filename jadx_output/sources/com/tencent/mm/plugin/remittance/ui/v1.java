package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes4.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f157987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f157988e;

    public v1(com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.f157987d = imageView;
        this.f157988e = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f157987d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.ViewGroup viewGroup = this.f157988e;
        if (viewGroup != null) {
            layoutParams.width = viewGroup.getWidth();
            layoutParams.height = viewGroup.getHeight();
            imageView.setLayoutParams(layoutParams);
        }
    }
}
