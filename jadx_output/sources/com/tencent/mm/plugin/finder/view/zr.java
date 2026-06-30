package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class zr extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.PageIndicatorView f133491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f133492b;

    public zr(com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView, androidx.recyclerview.widget.f2 f2Var) {
        this.f133491a = pageIndicatorView;
        this.f133492b = f2Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        this.f133491a.setPageCount(this.f133492b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        this.f133491a.setPageCount(this.f133492b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        this.f133491a.setPageCount(this.f133492b.getItemCount());
    }
}
