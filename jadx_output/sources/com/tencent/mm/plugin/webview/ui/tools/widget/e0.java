package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f187175a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187176b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f187177c;

    /* renamed from: d, reason: collision with root package name */
    public final int f187178d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f187179e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f187180f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Dialog f187181g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.h7 f187182h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.p1 f187183i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f187184j;

    public e0(float f17, java.lang.String str, boolean z17, int i17, android.content.Intent intent, boolean z18, android.app.Dialog dialog, com.tencent.mm.plugin.webview.ui.tools.widget.h7 h7Var, com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var, boolean z19, int i18, kotlin.jvm.internal.i iVar) {
        f17 = (i18 & 1) != 0 ? 0.75f : f17;
        str = (i18 & 2) != 0 ? null : str;
        z17 = (i18 & 4) != 0 ? true : z17;
        i17 = (i18 & 8) != 0 ? 80 : i17;
        intent = (i18 & 16) != 0 ? null : intent;
        z18 = (i18 & 32) != 0 ? false : z18;
        dialog = (i18 & 64) != 0 ? null : dialog;
        h7Var = (i18 & 128) != 0 ? null : h7Var;
        p1Var = (i18 & 256) != 0 ? null : p1Var;
        z19 = (i18 & 512) != 0 ? true : z19;
        this.f187175a = f17;
        this.f187176b = str;
        this.f187177c = z17;
        this.f187178d = i17;
        this.f187179e = intent;
        this.f187180f = z18;
        this.f187181g = dialog;
        this.f187182h = h7Var;
        this.f187183i = p1Var;
        this.f187184j = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.widget.e0)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.e0 e0Var = (com.tencent.mm.plugin.webview.ui.tools.widget.e0) obj;
        return java.lang.Float.compare(this.f187175a, e0Var.f187175a) == 0 && kotlin.jvm.internal.o.b(this.f187176b, e0Var.f187176b) && this.f187177c == e0Var.f187177c && this.f187178d == e0Var.f187178d && kotlin.jvm.internal.o.b(this.f187179e, e0Var.f187179e) && this.f187180f == e0Var.f187180f && kotlin.jvm.internal.o.b(this.f187181g, e0Var.f187181g) && kotlin.jvm.internal.o.b(this.f187182h, e0Var.f187182h) && kotlin.jvm.internal.o.b(this.f187183i, e0Var.f187183i) && this.f187184j == e0Var.f187184j;
    }

    public int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.f187175a) * 31;
        java.lang.String str = this.f187176b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f187177c)) * 31) + java.lang.Integer.hashCode(this.f187178d)) * 31;
        android.content.Intent intent = this.f187179e;
        int hashCode3 = (((hashCode2 + (intent == null ? 0 : intent.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f187180f)) * 31;
        android.app.Dialog dialog = this.f187181g;
        int hashCode4 = (hashCode3 + (dialog == null ? 0 : dialog.hashCode())) * 31;
        com.tencent.mm.plugin.webview.ui.tools.widget.h7 h7Var = this.f187182h;
        int hashCode5 = (hashCode4 + (h7Var == null ? 0 : h7Var.hashCode())) * 31;
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187183i;
        return ((hashCode5 + (p1Var != null ? p1Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f187184j);
    }

    public java.lang.String toString() {
        return "CommWebViewOption(heightPercent=" + this.f187175a + ", extData=" + this.f187176b + ", reuseWebView=" + this.f187177c + ", getA8KeyScene=" + this.f187178d + ", extraIntent=" + this.f187179e + ", readMode=" + this.f187180f + ", uiDialog=" + this.f187181g + ", customWebChromeClientCreator=" + this.f187182h + ", commWebViewDelegate=" + this.f187183i + ", showProgressBar=" + this.f187184j + ')';
    }
}
