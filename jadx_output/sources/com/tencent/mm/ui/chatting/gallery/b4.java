package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class b4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq.c f200812e;

    public b4(android.view.View view, fq.c cVar) {
        this.f200811d = view;
        this.f200812e = cVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f200811d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        android.widget.FrameLayout frameLayout = this.f200812e.f265399b;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = view.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        return true;
    }
}
