package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class z3 implements tj5.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f184740d;

    /* renamed from: e, reason: collision with root package name */
    public int f184741e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f184742f;

    public z3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI) {
    }

    @Override // tj5.x
    public java.lang.String R0() {
        return this.f184740d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.plugin.webview.ui.tools.fts.z3)) {
            return -1;
        }
        return this.f184740d.compareTo(((com.tencent.mm.plugin.webview.ui.tools.fts.z3) obj).f184740d);
    }
}
