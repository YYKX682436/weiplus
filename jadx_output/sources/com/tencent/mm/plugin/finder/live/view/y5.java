package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f116820a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f116821b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f116822c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116823d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f116824e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f116825f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f116826g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f116827h;

    public y5(yz5.a aVar, yz5.a aVar2, yz5.l lVar, java.lang.String str, qo0.c cVar, boolean z17, boolean z18, java.lang.String str2) {
        this.f116820a = aVar;
        this.f116821b = aVar2;
        this.f116822c = lVar;
        this.f116823d = str;
        this.f116824e = cVar;
        this.f116825f = z17;
        this.f116826g = z18;
        this.f116827h = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.view.y5)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.view.y5 y5Var = (com.tencent.mm.plugin.finder.live.view.y5) obj;
        return kotlin.jvm.internal.o.b(this.f116820a, y5Var.f116820a) && kotlin.jvm.internal.o.b(this.f116821b, y5Var.f116821b) && kotlin.jvm.internal.o.b(this.f116822c, y5Var.f116822c) && kotlin.jvm.internal.o.b(this.f116823d, y5Var.f116823d) && kotlin.jvm.internal.o.b(this.f116824e, y5Var.f116824e) && this.f116825f == y5Var.f116825f && this.f116826g == y5Var.f116826g && kotlin.jvm.internal.o.b(this.f116827h, y5Var.f116827h);
    }

    public int hashCode() {
        yz5.a aVar = this.f116820a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        yz5.a aVar2 = this.f116821b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        yz5.l lVar = this.f116822c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.lang.String str = this.f116823d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        qo0.c cVar = this.f116824e;
        int hashCode5 = (((((hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f116825f)) * 31) + java.lang.Boolean.hashCode(this.f116826g)) * 31;
        java.lang.String str2 = this.f116827h;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveLikeContainerData(postLikeCallback=" + this.f116820a + ", postHighLightLikeCallback=" + this.f116821b + ", layoutCallback=" + this.f116822c + ", sessionId=" + this.f116823d + ", statusMonitor=" + this.f116824e + ", shouldHandleTouch=" + this.f116825f + ", isDisableLikeHeadIcon=" + this.f116826g + ", headUrl=" + this.f116827h + ')';
    }
}
