package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public int f183141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f183142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f183143c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183144d;

    /* renamed from: e, reason: collision with root package name */
    public final int f183145e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f183146f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f183147g;

    /* renamed from: h, reason: collision with root package name */
    public r45.n54 f183148h;

    /* renamed from: i, reason: collision with root package name */
    public final long f183149i;

    /* renamed from: j, reason: collision with root package name */
    public int f183150j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f183151k;

    public v3(int i17, int i18, int i19, java.lang.String str, int i27, java.lang.String str2, java.lang.String str3, r45.n54 n54Var, long j17, int i28, java.lang.String str4, int i29, kotlin.jvm.internal.i iVar) {
        i17 = (i29 & 1) != 0 ? -1 : i17;
        str = (i29 & 8) != 0 ? null : str;
        n54Var = (i29 & 128) != 0 ? null : n54Var;
        str4 = (i29 & 1024) != 0 ? null : str4;
        this.f183141a = i17;
        this.f183142b = i18;
        this.f183143c = i19;
        this.f183144d = str;
        this.f183145e = i27;
        this.f183146f = str2;
        this.f183147g = str3;
        this.f183148h = n54Var;
        this.f183149i = j17;
        this.f183150j = i28;
        this.f183151k = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.model.v3)) {
            return false;
        }
        com.tencent.mm.plugin.webview.model.v3 v3Var = (com.tencent.mm.plugin.webview.model.v3) obj;
        return this.f183141a == v3Var.f183141a && this.f183142b == v3Var.f183142b && this.f183143c == v3Var.f183143c && kotlin.jvm.internal.o.b(this.f183144d, v3Var.f183144d) && this.f183145e == v3Var.f183145e && kotlin.jvm.internal.o.b(this.f183146f, v3Var.f183146f) && kotlin.jvm.internal.o.b(this.f183147g, v3Var.f183147g) && kotlin.jvm.internal.o.b(this.f183148h, v3Var.f183148h) && this.f183149i == v3Var.f183149i && this.f183150j == v3Var.f183150j && kotlin.jvm.internal.o.b(this.f183151k, v3Var.f183151k);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f183141a) * 31) + java.lang.Integer.hashCode(this.f183142b)) * 31) + java.lang.Integer.hashCode(this.f183143c)) * 31;
        java.lang.String str = this.f183144d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f183145e)) * 31;
        java.lang.String str2 = this.f183146f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f183147g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r45.n54 n54Var = this.f183148h;
        int hashCode5 = (((((hashCode4 + (n54Var == null ? 0 : n54Var.hashCode())) * 31) + java.lang.Long.hashCode(this.f183149i)) * 31) + java.lang.Integer.hashCode(this.f183150j)) * 31;
        java.lang.String str4 = this.f183151k;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebViewEventReportInfo{eventType: ");
        sb6.append(this.f183141a);
        sb6.append(", init_request_id: ");
        sb6.append(this.f183142b);
        sb6.append(", request_id: ");
        sb6.append(this.f183143c);
        sb6.append("}, msgId: ");
        sb6.append(this.f183144d);
        sb6.append(", scene: ");
        sb6.append(this.f183145e);
        sb6.append(", fromUsername: ");
        sb6.append(this.f183146f);
        sb6.append(", msgUsername: ");
        sb6.append(this.f183147g);
        sb6.append(", appId: ");
        r45.n54 n54Var = this.f183148h;
        sb6.append(n54Var != null ? n54Var.f381090d : null);
        sb6.append(", interval_since_webview_open_ms:");
        sb6.append(this.f183150j);
        sb6.append(", url: %s");
        java.lang.String format = java.lang.String.format(sb6.toString(), java.util.Arrays.copyOf(new java.lang.Object[]{this.f183151k}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
