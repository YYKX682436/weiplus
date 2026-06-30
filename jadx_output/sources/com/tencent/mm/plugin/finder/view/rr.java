package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class rr {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f132982a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f132983b;

    /* renamed from: c, reason: collision with root package name */
    public final long f132984c;

    /* renamed from: d, reason: collision with root package name */
    public final long f132985d;

    /* renamed from: e, reason: collision with root package name */
    public final int f132986e;

    public rr(java.lang.String username, java.lang.String nickname, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f132982a = username;
        this.f132983b = nickname;
        this.f132984c = j17;
        this.f132985d = j18;
        this.f132986e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.rr)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.rr rrVar = (com.tencent.mm.plugin.finder.view.rr) obj;
        return kotlin.jvm.internal.o.b(this.f132982a, rrVar.f132982a) && kotlin.jvm.internal.o.b(this.f132983b, rrVar.f132983b) && this.f132984c == rrVar.f132984c && this.f132985d == rrVar.f132985d && this.f132986e == rrVar.f132986e;
    }

    public int hashCode() {
        return (((((((this.f132982a.hashCode() * 31) + this.f132983b.hashCode()) * 31) + java.lang.Long.hashCode(this.f132984c)) * 31) + java.lang.Long.hashCode(this.f132985d)) * 31) + java.lang.Integer.hashCode(this.f132986e);
    }

    public java.lang.String toString() {
        return "MentionContact(username='" + this.f132982a + "', nickname='" + this.f132983b + "', start=" + this.f132984c + ", length=" + this.f132985d + ')';
    }
}
