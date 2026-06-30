package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class al implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f146717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f146718e;

    public al(android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f146717d = imageView;
        this.f146718e = imageView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f146717d.setVisibility(4);
        this.f146718e.setVisibility(4);
    }
}
