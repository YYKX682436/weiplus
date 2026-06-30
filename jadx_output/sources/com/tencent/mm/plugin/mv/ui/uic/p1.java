package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes8.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.s1 f151352d;

    public p1(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var) {
        this.f151352d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable drawable;
        android.view.View view = this.f151352d.f151414e;
        kotlin.jvm.internal.o.d(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cl7);
        android.graphics.Bitmap bitmap = (imageView == null || (drawable = imageView.getDrawable()) == null) ? null : ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        um5.p pVar = dVar.f429144e;
        uq5.b bVar = (uq5.b) pVar.f429193b.g(uq5.k.BlurEffect);
        if (bVar != null) {
            bVar.d(20.0f);
        }
        pVar.f429193b.c(bVar);
        dVar.a(new com.tencent.mm.plugin.mv.ui.uic.o1(imageView));
    }
}
