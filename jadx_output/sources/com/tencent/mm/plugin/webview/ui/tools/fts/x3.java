package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184725g;

    public x3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, int i17, java.lang.String str, int i18) {
        this.f184725g = fTSWeAppBaseWebViewUI;
        this.f184722d = i17;
        this.f184723e = str;
        this.f184724f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184725g.f183844p0;
        if (nVar != null) {
            nVar.m0(this.f184722d, this.f184723e, this.f184724f);
        }
    }
}
