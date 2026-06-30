package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class x implements tj5.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f184715d;

    /* renamed from: e, reason: collision with root package name */
    public int f184716e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f184717f;

    public x(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI) {
    }

    @Override // tj5.x
    public java.lang.String R0() {
        return this.f184715d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.plugin.webview.ui.tools.fts.f1)) {
            return -1;
        }
        return this.f184715d.compareTo(((com.tencent.mm.plugin.webview.ui.tools.fts.f1) obj).f184407d);
    }
}
