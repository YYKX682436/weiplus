package kw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f312801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f312802b;

    /* renamed from: c, reason: collision with root package name */
    public final kw0.k f312803c;

    public e(java.util.List infoList, int i17, kw0.k updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        this.f312801a = infoList;
        this.f312802b = i17;
        this.f312803c = updateState;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0.e)) {
            return false;
        }
        kw0.e eVar = (kw0.e) obj;
        return kotlin.jvm.internal.o.b(this.f312801a, eVar.f312801a) && this.f312802b == eVar.f312802b && kotlin.jvm.internal.o.b(this.f312803c, eVar.f312803c);
    }

    public int hashCode() {
        return (((this.f312801a.hashCode() * 31) + java.lang.Integer.hashCode(this.f312802b)) * 31) + this.f312803c.hashCode();
    }

    public java.lang.String toString() {
        return "StickerUiState(infoList=" + this.f312801a + ", selectedIndex=" + this.f312802b + ", updateState=" + this.f312803c + ')';
    }

    public /* synthetic */ e(java.util.List list, int i17, kw0.k kVar, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? kz5.p0.f313996d : list, (i18 & 2) != 0 ? -1 : i17, (i18 & 4) != 0 ? kw0.f.f312804a : kVar);
    }
}
