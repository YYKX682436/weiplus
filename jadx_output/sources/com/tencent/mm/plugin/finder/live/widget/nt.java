package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class nt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119202e;

    public nt(android.view.View view, int i17) {
        this.f119201d = view;
        this.f119202e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f119201d;
        view.getLayoutParams().height = this.f119202e;
        view.setLayoutParams(view.getLayoutParams());
    }
}
