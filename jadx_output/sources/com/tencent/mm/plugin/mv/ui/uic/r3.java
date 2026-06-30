package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes2.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f151402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f151403e;

    public r3(android.widget.ImageView imageView, yz5.l lVar) {
        this.f151402d = imageView;
        this.f151403e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f151402d;
        imageView.setVisibility(4);
        fm3.w a17 = fm3.x.a(imageView);
        yz5.l lVar = this.f151403e;
        if (lVar != null) {
            lVar.invoke(a17);
        }
    }
}
