package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes9.dex */
public final class b6 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f151056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f151057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e8 f151058c;

    public b6(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var, android.widget.ImageView imageView, com.tencent.mm.plugin.mv.ui.uic.e8 e8Var) {
        this.f151056a = h6Var;
        this.f151057b = imageView;
        this.f151058c = e8Var;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b imageData) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageData, "imageData");
        java.lang.String str = this.f151056a.f151179d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = url;
        objArr[1] = java.lang.Boolean.valueOf(imageData.f359534d != null);
        com.tencent.mars.xlog.Log.i(str, "onImageLoadFinish %s %b", objArr);
        android.graphics.Bitmap bitmap = imageData.f359534d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.a6(imageData.f359534d, this.f151057b, this.f151058c));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String url, android.view.View view, q11.b imageData) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageData, "imageData");
        return null;
    }
}
