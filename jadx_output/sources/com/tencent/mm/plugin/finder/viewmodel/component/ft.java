package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ft implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f134427d;

    public ft(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        this.f134427d = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f134427d.f135610h;
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
    }
}
