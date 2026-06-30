package vv0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialPack f440373a;

    /* renamed from: b, reason: collision with root package name */
    public final vv0.a f440374b;

    /* renamed from: c, reason: collision with root package name */
    public final vv0.i f440375c;

    public c(com.tencent.maas.material.MJMaterialPack mJMaterialPack, vv0.a aVar, vv0.i updateState) {
        kotlin.jvm.internal.o.g(updateState, "updateState");
        this.f440373a = mJMaterialPack;
        this.f440374b = aVar;
        this.f440375c = updateState;
    }

    public static vv0.c a(vv0.c cVar, com.tencent.maas.material.MJMaterialPack mJMaterialPack, vv0.a aVar, vv0.i updateState, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            mJMaterialPack = cVar.f440373a;
        }
        if ((i17 & 2) != 0) {
            aVar = cVar.f440374b;
        }
        if ((i17 & 4) != 0) {
            updateState = cVar.f440375c;
        }
        cVar.getClass();
        kotlin.jvm.internal.o.g(updateState, "updateState");
        return new vv0.c(mJMaterialPack, aVar, updateState);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.c)) {
            return false;
        }
        vv0.c cVar = (vv0.c) obj;
        return kotlin.jvm.internal.o.b(this.f440373a, cVar.f440373a) && kotlin.jvm.internal.o.b(this.f440374b, cVar.f440374b) && kotlin.jvm.internal.o.b(this.f440375c, cVar.f440375c);
    }

    public int hashCode() {
        com.tencent.maas.material.MJMaterialPack mJMaterialPack = this.f440373a;
        int hashCode = (mJMaterialPack == null ? 0 : mJMaterialPack.hashCode()) * 31;
        vv0.a aVar = this.f440374b;
        return ((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f440375c.hashCode();
    }

    public java.lang.String toString() {
        return "ClipUIState(materialPack=" + this.f440373a + ", selectedData=" + this.f440374b + ", updateState=" + this.f440375c + ')';
    }

    public /* synthetic */ c(com.tencent.maas.material.MJMaterialPack mJMaterialPack, vv0.a aVar, vv0.i iVar, int i17, kotlin.jvm.internal.i iVar2) {
        this((i17 & 1) != 0 ? null : mJMaterialPack, (i17 & 2) != 0 ? null : aVar, (i17 & 4) != 0 ? vv0.d.f440376a : iVar);
    }
}
