package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f118569d;

    public hh(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f118569d = xhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.gh modifyBottomPage;
        modifyBottomPage = this.f118569d.getModifyBottomPage();
        modifyBottomPage.h();
    }
}
