package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f150296a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f150297b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f150298c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f150299d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f150300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f150301f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f150302g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150303h;

    public t(int i17, java.lang.String userName, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f150296a = i17;
        this.f150297b = userName;
        this.f150298c = z17;
        this.f150299d = z18;
        this.f150300e = z19;
        this.f150301f = z27;
        this.f150302g = z28;
        this.f150303h = i18;
    }

    public final boolean a() {
        int i17 = this.f150303h;
        return i17 == 101 || i17 == 102;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.multitalk.ui.t)) {
            return false;
        }
        com.tencent.mm.plugin.multitalk.ui.t tVar = (com.tencent.mm.plugin.multitalk.ui.t) obj;
        return this.f150296a == tVar.f150296a && kotlin.jvm.internal.o.b(this.f150297b, tVar.f150297b) && this.f150298c == tVar.f150298c && this.f150299d == tVar.f150299d && this.f150300e == tVar.f150300e && this.f150301f == tVar.f150301f && this.f150302g == tVar.f150302g && this.f150303h == tVar.f150303h;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.f150296a) * 31) + this.f150297b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f150298c)) * 31) + java.lang.Boolean.hashCode(this.f150299d)) * 31) + java.lang.Boolean.hashCode(this.f150300e)) * 31) + java.lang.Boolean.hashCode(this.f150301f)) * 31) + java.lang.Boolean.hashCode(this.f150302g)) * 31) + java.lang.Integer.hashCode(this.f150303h);
    }

    public java.lang.String toString() {
        return "MultiTalkMemberInfo(memberId=" + this.f150296a + ", userName=" + this.f150297b + ", waiting=" + this.f150298c + ", isVideoOn=" + this.f150299d + ", isTalking=" + this.f150300e + ", isNetworkWeak=" + this.f150301f + ", isMicOff=" + this.f150302g + ", screenCastingState=" + this.f150303h + ')';
    }
}
