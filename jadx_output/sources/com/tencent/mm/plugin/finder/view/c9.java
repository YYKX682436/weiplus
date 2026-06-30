package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView f131760e;

    public c9(android.view.View view, com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView) {
        this.f131759d = view;
        this.f131760e = finderExtendReadingEditView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f131759d;
        view.setPadding(0, view.getTop(), 0, view.getBottom() + com.tencent.mm.ui.dl.e(this.f131760e.getContext()));
    }
}
