package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tq {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xn1 f114469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f114470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f114471c;

    public tq(r45.xn1 contact, int i17, int i18) {
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f114469a = contact;
        this.f114470b = i17;
        this.f114471c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.tq)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.tq tqVar = (com.tencent.mm.plugin.finder.live.plugin.tq) obj;
        return kotlin.jvm.internal.o.b(this.f114469a, tqVar.f114469a) && this.f114470b == tqVar.f114470b && this.f114471c == tqVar.f114471c;
    }

    public int hashCode() {
        return (((this.f114469a.hashCode() * 31) + java.lang.Integer.hashCode(this.f114470b)) * 31) + java.lang.Integer.hashCode(this.f114471c);
    }

    public java.lang.String toString() {
        return "AtWxContact(contact=" + this.f114469a + ", preIndex=" + this.f114470b + ", suffixIndex=" + this.f114471c + ')';
    }
}
