package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class li implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ri f118938d;

    public li(com.tencent.mm.plugin.finder.live.widget.ri riVar) {
        this.f118938d = riVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.ki modifyBottomPage;
        modifyBottomPage = this.f118938d.getModifyBottomPage();
        modifyBottomPage.h();
    }
}
