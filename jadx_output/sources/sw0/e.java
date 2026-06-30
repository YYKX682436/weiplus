package sw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f413426a;

    /* renamed from: b, reason: collision with root package name */
    public final sw0.g f413427b;

    /* renamed from: c, reason: collision with root package name */
    public final sw0.m f413428c;

    public e(java.util.List infoList, sw0.g selectedIndexPack, sw0.m updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        this.f413426a = infoList;
        this.f413427b = selectedIndexPack;
        this.f413428c = updateState;
    }

    public static /* synthetic */ sw0.e b(sw0.e eVar, java.util.List list, sw0.g gVar, sw0.m mVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = eVar.f413426a;
        }
        if ((i17 & 2) != 0) {
            gVar = eVar.f413427b;
        }
        if ((i17 & 4) != 0) {
            mVar = eVar.f413428c;
        }
        return eVar.a(list, gVar, mVar);
    }

    public final sw0.e a(java.util.List infoList, sw0.g selectedIndexPack, sw0.m updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        return new sw0.e(infoList, selectedIndexPack, updateState);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.e)) {
            return false;
        }
        sw0.e eVar = (sw0.e) obj;
        return kotlin.jvm.internal.o.b(this.f413426a, eVar.f413426a) && kotlin.jvm.internal.o.b(this.f413427b, eVar.f413427b) && kotlin.jvm.internal.o.b(this.f413428c, eVar.f413428c);
    }

    public int hashCode() {
        return (((this.f413426a.hashCode() * 31) + this.f413427b.hashCode()) * 31) + this.f413428c.hashCode();
    }

    public java.lang.String toString() {
        return "TextMaterialInfoUiState(infoList=" + this.f413426a + ", selectedIndexPack=" + this.f413427b + ", updateState=" + this.f413428c + ')';
    }

    public /* synthetic */ e(java.util.List list, sw0.g gVar, sw0.m mVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list, (i17 & 2) != 0 ? new sw0.g(-1, -1) : gVar, (i17 & 4) != 0 ? sw0.h.f413436a : mVar);
    }
}
