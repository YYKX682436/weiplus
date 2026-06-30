package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class il implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.MMFinderUI f129372d;

    public il(com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI) {
        this.f129372d = mMFinderUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.MMFinderUI.f128804s;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = this.f129372d;
        if (mMFinderUI.f128809h) {
            return;
        }
        mMFinderUI.f128809h = true;
    }
}
