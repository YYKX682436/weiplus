package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class go implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jo f146969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.mo f146970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f146971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f146972g;

    public go(com.tencent.mm.plugin.luckymoney.ui.jo joVar, com.tencent.mm.plugin.luckymoney.ui.mo moVar, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.f146969d = joVar;
        this.f146970e = moVar;
        this.f146971f = textView;
        this.f146972g = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.jo joVar = this.f146969d;
        if (joVar.getContext().isFinishing() || joVar.getContext().isDestroyed()) {
            return;
        }
        int[] iArr = new int[2];
        this.f146970e.getContentView().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        android.widget.TextView textView = this.f146971f;
        textView.getLocationOnScreen(iArr2);
        android.widget.ImageView imageView = this.f146972g;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = (iArr2[0] - iArr[0]) + ((textView.getWidth() / 2) - (imageView.getMeasuredWidth() / 2));
        imageView.setLayoutParams(layoutParams2);
    }
}
