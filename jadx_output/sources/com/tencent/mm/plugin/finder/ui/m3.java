package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129504d;

    public m3(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        this.f129504d = finderCreateContactUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129504d;
        android.view.View view = finderCreateContactUI.f128543t;
        if (view != null) {
            finderCreateContactUI.X = view.getMeasuredHeight();
        } else {
            kotlin.jvm.internal.o.o("scrollContainer");
            throw null;
        }
    }
}
