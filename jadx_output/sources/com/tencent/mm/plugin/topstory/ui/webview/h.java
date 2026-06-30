package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.j f175196d;

    public h(com.tencent.mm.plugin.topstory.ui.webview.j jVar, com.tencent.mm.plugin.topstory.ui.webview.d dVar) {
        this.f175196d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f175196d.f175207h = com.tencent.mm.vfs.w6.N(java.lang.String.format("%s/%s", com.tencent.mm.plugin.websearch.l2.g(1).l(), "app.html"), 0, -1);
    }
}
