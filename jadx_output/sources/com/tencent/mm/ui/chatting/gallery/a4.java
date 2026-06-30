package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class a4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq.b f200782e;

    public a4(android.view.View view, fq.b bVar) {
        this.f200781d = view;
        this.f200782e = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f200781d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = view.getWidth();
        fq.b bVar = this.f200782e;
        android.widget.RelativeLayout relativeLayout = bVar.f265392c;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = width;
        relativeLayout.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = bVar.f265393d;
        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.width = width;
        linearLayout.setLayoutParams(layoutParams2);
        return true;
    }
}
