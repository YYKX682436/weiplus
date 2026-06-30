package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI f129627d;

    public p9(com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI) {
        this.f129627d = finderLiveShareProductUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f129627d.finish();
    }
}
