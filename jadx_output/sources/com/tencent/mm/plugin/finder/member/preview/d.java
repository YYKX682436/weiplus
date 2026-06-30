package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class d implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f121206b;

    public d(com.tencent.mm.plugin.finder.member.preview.k kVar, android.widget.TextView textView) {
        this.f121205a = kVar;
        this.f121206b = textView;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        float abs = java.lang.Math.abs(i17) / (com.tencent.mm.ui.bl.h(r3.getContext()) + this.f121205a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        android.widget.TextView textView = this.f121206b;
        if (abs > 1.0f) {
            textView.setAlpha(1.0f);
        } else {
            textView.setAlpha(abs);
        }
    }
}
