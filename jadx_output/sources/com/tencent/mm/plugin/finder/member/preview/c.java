package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes.dex */
public final class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f121175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121176e;

    public c(android.view.View view, com.tencent.mm.plugin.finder.member.preview.k kVar) {
        this.f121175d = view;
        this.f121176e = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f121175d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.setPadding(0, com.tencent.mm.ui.bl.h(this.f121176e.getContext()), 0, 0);
        return true;
    }
}
