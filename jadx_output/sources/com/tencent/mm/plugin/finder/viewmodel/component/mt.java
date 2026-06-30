package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135206d;

    public mt(android.view.View view) {
        this.f135206d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f135206d.requestLayout();
    }
}
