package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184713f;

    public w3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, int i17, java.lang.String str) {
        this.f184713f = fTSWeAppBaseWebViewUI;
        this.f184711d = i17;
        this.f184712e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184713f.f183844p0;
        if (nVar != null) {
            nVar.c0(this.f184711d, this.f184712e);
        }
    }
}
