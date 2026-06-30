package com.tencent.mm.wallet_core.ui;

/* loaded from: classes5.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214201f;

    public k1(android.view.View view, int i17, android.view.View view2) {
        this.f214199d = view;
        this.f214200e = i17;
        this.f214201f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f214199d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f214200e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f214201f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
