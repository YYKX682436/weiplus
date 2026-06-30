package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class fr {

    /* renamed from: a, reason: collision with root package name */
    public final int f203993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f203994b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f203995c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f203996d;

    /* renamed from: e, reason: collision with root package name */
    public final int f203997e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f203998f;

    public fr(int i17, int i18, boolean z17, java.lang.Class clazz, int i19, yz5.l isSupport) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        kotlin.jvm.internal.o.g(isSupport, "isSupport");
        this.f203993a = i17;
        this.f203994b = i18;
        this.f203995c = z17;
        this.f203996d = clazz;
        this.f203997e = i19;
        this.f203998f = isSupport;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.fr)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.fr frVar = (com.tencent.mm.ui.chatting.viewitems.fr) obj;
        return this.f203993a == frVar.f203993a && this.f203994b == frVar.f203994b && this.f203995c == frVar.f203995c && kotlin.jvm.internal.o.b(this.f203996d, frVar.f203996d) && this.f203997e == frVar.f203997e && kotlin.jvm.internal.o.b(this.f203998f, frVar.f203998f);
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f203993a) * 31) + java.lang.Integer.hashCode(this.f203994b)) * 31) + java.lang.Boolean.hashCode(this.f203995c)) * 31) + this.f203996d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f203997e)) * 31) + this.f203998f.hashCode();
    }

    public java.lang.String toString() {
        return "ChattingItemTypeWrapper(msgType=" + this.f203993a + ", subType=" + this.f203994b + ", isFrom=" + this.f203995c + ", clazz=" + this.f203996d + ", conditionIndex=" + this.f203997e + ", isSupport=" + this.f203998f + ')';
    }
}
