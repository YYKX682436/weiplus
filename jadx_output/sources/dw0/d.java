package dw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f244090a;

    /* renamed from: b, reason: collision with root package name */
    public final dw0.e f244091b;

    /* renamed from: c, reason: collision with root package name */
    public final dw0.l f244092c;

    public d(java.util.List infoList, dw0.e selectedIndexPack, dw0.l updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        this.f244090a = infoList;
        this.f244091b = selectedIndexPack;
        this.f244092c = updateState;
    }

    public static /* synthetic */ dw0.d b(dw0.d dVar, java.util.List list, dw0.e eVar, dw0.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = dVar.f244090a;
        }
        if ((i17 & 2) != 0) {
            eVar = dVar.f244091b;
        }
        if ((i17 & 4) != 0) {
            lVar = dVar.f244092c;
        }
        return dVar.a(list, eVar, lVar);
    }

    public final dw0.d a(java.util.List infoList, dw0.e selectedIndexPack, dw0.l updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        return new dw0.d(infoList, selectedIndexPack, updateState);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0.d)) {
            return false;
        }
        dw0.d dVar = (dw0.d) obj;
        return kotlin.jvm.internal.o.b(this.f244090a, dVar.f244090a) && kotlin.jvm.internal.o.b(this.f244091b, dVar.f244091b) && kotlin.jvm.internal.o.b(this.f244092c, dVar.f244092c);
    }

    public int hashCode() {
        return (((this.f244090a.hashCode() * 31) + this.f244091b.hashCode()) * 31) + this.f244092c.hashCode();
    }

    public java.lang.String toString() {
        return "TimbreMaterialInfoUiState(infoList=" + this.f244090a + ", selectedIndexPack=" + this.f244091b + ", updateState=" + this.f244092c + ')';
    }

    public /* synthetic */ d(java.util.List list, dw0.e eVar, dw0.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list, (i17 & 2) != 0 ? new dw0.e(-1, -1) : eVar, (i17 & 4) != 0 ? dw0.g.f244095a : lVar);
    }
}
