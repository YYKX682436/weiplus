package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class s9 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.chat.s9 f190648j = new com.tencent.mm.pluginsdk.ui.chat.s9("", null, null, -1, -1, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f190649a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Character f190650b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f190651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f190652d;

    /* renamed from: e, reason: collision with root package name */
    public final int f190653e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f190654f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Character f190655g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f190656h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f190657i;

    public s9(java.lang.String numStr, java.lang.Character ch6, java.lang.String str, int i17, int i18, boolean z17, java.lang.Character ch7) {
        kotlin.jvm.internal.o.g(numStr, "numStr");
        this.f190649a = numStr;
        this.f190650b = ch6;
        this.f190651c = str;
        this.f190652d = i17;
        this.f190653e = i18;
        this.f190654f = z17;
        this.f190655g = ch7;
        this.f190656h = "";
        this.f190657i = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.r9(this));
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Character ch6 = this.f190650b;
        if (ch6 != null) {
            sb6.append(ch6.charValue());
        }
        java.lang.String str = this.f190656h;
        if (str == null || r26.n0.N(str)) {
            sb6.append("1");
        } else {
            sb6.append(this.f190656h);
        }
        java.lang.String str2 = this.f190651c;
        if (str2 != null) {
            sb6.append(str2);
        }
        if (this.f190654f) {
            sb6.append("b");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.chat.s9)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.chat.s9 s9Var = (com.tencent.mm.pluginsdk.ui.chat.s9) obj;
        return kotlin.jvm.internal.o.b(this.f190649a, s9Var.f190649a) && kotlin.jvm.internal.o.b(this.f190650b, s9Var.f190650b) && kotlin.jvm.internal.o.b(this.f190651c, s9Var.f190651c) && this.f190652d == s9Var.f190652d && this.f190653e == s9Var.f190653e && this.f190654f == s9Var.f190654f && kotlin.jvm.internal.o.b(this.f190655g, s9Var.f190655g);
    }

    public int hashCode() {
        int hashCode = this.f190649a.hashCode() * 31;
        java.lang.Character ch6 = this.f190650b;
        int hashCode2 = (hashCode + (ch6 == null ? 0 : ch6.hashCode())) * 31;
        java.lang.String str = this.f190651c;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f190652d)) * 31) + java.lang.Integer.hashCode(this.f190653e)) * 31) + java.lang.Boolean.hashCode(this.f190654f)) * 31;
        java.lang.Character ch7 = this.f190655g;
        return hashCode3 + (ch7 != null ? ch7.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SeqInfo(numStr=" + this.f190649a + ", leftPattern=" + this.f190650b + ", rightPattern=" + this.f190651c + ", beginIndex=" + this.f190652d + ", endIndex=" + this.f190653e + ", isHasBlank=" + this.f190654f + ", nextChar=" + this.f190655g + ')';
    }
}
