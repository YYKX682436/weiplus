package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d30 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f134074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f134076f;

    public d30(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, android.widget.TextView textView) {
        this.f134074d = bitmap;
        this.f134075e = f50Var;
        this.f134076f = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f134074d;
        if (bitmap != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134075e;
            int dimension = (int) f50Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            android.widget.TextView textView = this.f134076f;
            if (textView == null) {
                return;
            }
            java.lang.String string = f50Var.getContext().getString(com.tencent.mm.R.string.cuo);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            textView.setText(hc2.x0.l(string, f50Var.getContext(), '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.tencent.mm.R.color.a0c, dimension, 0, 0, 0, 224, null));
        }
    }
}
