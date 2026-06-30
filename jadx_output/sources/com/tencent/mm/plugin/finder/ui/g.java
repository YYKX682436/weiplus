package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129279d;

    public g(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129279d = finderActivityDescUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129279d;
        android.widget.ImageView imageView = finderActivityDescUI.T;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("coverImageView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (finderActivityDescUI.T == null) {
            kotlin.jvm.internal.o.o("coverImageView");
            throw null;
        }
        layoutParams.height = (int) (r4.getWidth() * 1.3333334f);
        android.widget.ImageView imageView2 = finderActivityDescUI.T;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams);
        } else {
            kotlin.jvm.internal.o.o("coverImageView");
            throw null;
        }
    }
}
