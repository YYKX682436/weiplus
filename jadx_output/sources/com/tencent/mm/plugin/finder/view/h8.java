package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f132215a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.i8 f132216b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.d8 f132217c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f132218d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f132219e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f132220f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f132221g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f132222h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f132223i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f132224j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f132225k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f132226l;

    public h8(java.lang.CharSequence title, com.tencent.mm.plugin.finder.view.i8 imageStyle, com.tencent.mm.plugin.finder.view.d8 buttonStyle, java.lang.CharSequence confirmText, java.lang.CharSequence cancelText, yz5.l onConfirm, yz5.a onCancel, yz5.a onDismiss, java.lang.String reportConfirmKey, java.lang.String reportCancelKey, java.lang.String reportPopupKey, java.util.Map reportParams) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(imageStyle, "imageStyle");
        kotlin.jvm.internal.o.g(buttonStyle, "buttonStyle");
        kotlin.jvm.internal.o.g(confirmText, "confirmText");
        kotlin.jvm.internal.o.g(cancelText, "cancelText");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        kotlin.jvm.internal.o.g(reportConfirmKey, "reportConfirmKey");
        kotlin.jvm.internal.o.g(reportCancelKey, "reportCancelKey");
        kotlin.jvm.internal.o.g(reportPopupKey, "reportPopupKey");
        kotlin.jvm.internal.o.g(reportParams, "reportParams");
        this.f132215a = title;
        this.f132216b = imageStyle;
        this.f132217c = buttonStyle;
        this.f132218d = confirmText;
        this.f132219e = cancelText;
        this.f132220f = onConfirm;
        this.f132221g = onCancel;
        this.f132222h = onDismiss;
        this.f132223i = reportConfirmKey;
        this.f132224j = reportCancelKey;
        this.f132225k = reportPopupKey;
        this.f132226l = reportParams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.h8)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.h8 h8Var = (com.tencent.mm.plugin.finder.view.h8) obj;
        return kotlin.jvm.internal.o.b(this.f132215a, h8Var.f132215a) && this.f132216b == h8Var.f132216b && this.f132217c == h8Var.f132217c && kotlin.jvm.internal.o.b(this.f132218d, h8Var.f132218d) && kotlin.jvm.internal.o.b(this.f132219e, h8Var.f132219e) && kotlin.jvm.internal.o.b(this.f132220f, h8Var.f132220f) && kotlin.jvm.internal.o.b(this.f132221g, h8Var.f132221g) && kotlin.jvm.internal.o.b(this.f132222h, h8Var.f132222h) && kotlin.jvm.internal.o.b(this.f132223i, h8Var.f132223i) && kotlin.jvm.internal.o.b(this.f132224j, h8Var.f132224j) && kotlin.jvm.internal.o.b(this.f132225k, h8Var.f132225k) && kotlin.jvm.internal.o.b(this.f132226l, h8Var.f132226l);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f132215a.hashCode() * 31) + this.f132216b.hashCode()) * 31) + this.f132217c.hashCode()) * 31) + this.f132218d.hashCode()) * 31) + this.f132219e.hashCode()) * 31) + this.f132220f.hashCode()) * 31) + this.f132221g.hashCode()) * 31) + this.f132222h.hashCode()) * 31) + this.f132223i.hashCode()) * 31) + this.f132224j.hashCode()) * 31) + this.f132225k.hashCode()) * 31) + this.f132226l.hashCode();
    }

    public java.lang.String toString() {
        return "Config(title=" + ((java.lang.Object) this.f132215a) + ", imageStyle=" + this.f132216b + ", buttonStyle=" + this.f132217c + ", confirmText=" + ((java.lang.Object) this.f132218d) + ", cancelText=" + ((java.lang.Object) this.f132219e) + ", onConfirm=" + this.f132220f + ", onCancel=" + this.f132221g + ", onDismiss=" + this.f132222h + ", reportConfirmKey=" + this.f132223i + ", reportCancelKey=" + this.f132224j + ", reportPopupKey=" + this.f132225k + ", reportParams=" + this.f132226l + ')';
    }

    public /* synthetic */ h8(java.lang.CharSequence charSequence, com.tencent.mm.plugin.finder.view.i8 i8Var, com.tencent.mm.plugin.finder.view.d8 d8Var, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, yz5.l lVar, yz5.a aVar, yz5.a aVar2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this(charSequence, (i17 & 2) != 0 ? com.tencent.mm.plugin.finder.view.i8.f132293d : i8Var, d8Var, charSequence2, charSequence3, (i17 & 32) != 0 ? com.tencent.mm.plugin.finder.view.e8.f131987d : lVar, (i17 & 64) != 0 ? com.tencent.mm.plugin.finder.view.f8.f132078d : aVar, (i17 & 128) != 0 ? com.tencent.mm.plugin.finder.view.g8.f132149d : aVar2, (i17 & 256) != 0 ? "" : str, (i17 & 512) != 0 ? "" : str2, (i17 & 1024) != 0 ? "" : str3, (i17 & 2048) != 0 ? kz5.q0.f314001d : map);
    }
}
