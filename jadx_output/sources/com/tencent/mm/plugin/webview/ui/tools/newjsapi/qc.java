package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f186461a;

    /* renamed from: b, reason: collision with root package name */
    public final int f186462b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f186463c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f186464d;

    public qc(java.lang.String title, int i17, java.lang.String iconData, android.graphics.Bitmap bitmap, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        bitmap = (i18 & 8) != 0 ? null : bitmap;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(iconData, "iconData");
        this.f186461a = title;
        this.f186462b = i17;
        this.f186463c = iconData;
        this.f186464d = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc qcVar = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.qc) obj;
        return kotlin.jvm.internal.o.b(this.f186461a, qcVar.f186461a) && this.f186462b == qcVar.f186462b && kotlin.jvm.internal.o.b(this.f186463c, qcVar.f186463c) && kotlin.jvm.internal.o.b(this.f186464d, qcVar.f186464d);
    }

    public int hashCode() {
        int hashCode = ((((this.f186461a.hashCode() * 31) + java.lang.Integer.hashCode(this.f186462b)) * 31) + this.f186463c.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f186464d;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public java.lang.String toString() {
        return "ChildItem(title=" + this.f186461a + ", id=" + this.f186462b + ", iconData=" + this.f186463c + ", iconBm=" + this.f186464d + ')';
    }
}
