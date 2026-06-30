package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ci implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ei f118006d;

    public ci(com.tencent.mm.plugin.finder.live.widget.ei eiVar) {
        this.f118006d = eiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.ai modifyBottomPage;
        modifyBottomPage = this.f118006d.getModifyBottomPage();
        modifyBottomPage.h();
    }
}
