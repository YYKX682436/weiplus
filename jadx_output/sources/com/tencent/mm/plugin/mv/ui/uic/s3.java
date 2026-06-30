package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes2.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f151436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f151437e;

    public s3(android.widget.ImageView imageView, yz5.l lVar) {
        this.f151436d = imageView;
        this.f151437e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f151436d;
        imageView.animate().alpha(1.0f).setDuration(200L).withEndAction(new com.tencent.mm.plugin.mv.ui.uic.r3(imageView, this.f151437e)).start();
    }
}
