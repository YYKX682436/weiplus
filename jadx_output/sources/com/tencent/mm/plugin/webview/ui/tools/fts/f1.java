package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class f1 implements tj5.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f184407d;

    /* renamed from: e, reason: collision with root package name */
    public int f184408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f184409f;

    public f1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI) {
    }

    @Override // tj5.x
    public java.lang.String R0() {
        return this.f184407d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.plugin.webview.ui.tools.fts.f1)) {
            return -1;
        }
        return this.f184407d.compareTo(((com.tencent.mm.plugin.webview.ui.tools.fts.f1) obj).f184407d);
    }
}
