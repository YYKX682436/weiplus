package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class kp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f134977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f134978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(android.widget.ProgressBar progressBar, android.graphics.Bitmap bitmap, java.lang.String str) {
        super(0);
        this.f134977d = progressBar;
        this.f134978e = bitmap;
        this.f134979f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ProgressBar progressBar = this.f134977d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (this.f134978e == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderMultiImageDescCommentUIC", "load image failed, bitmap is null, url=" + this.f134979f);
        }
        return jz5.f0.f302826a;
    }
}
