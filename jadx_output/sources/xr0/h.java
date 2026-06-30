package xr0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final xr0.i f456168a;

    /* renamed from: b, reason: collision with root package name */
    public final xr0.c f456169b;

    /* renamed from: c, reason: collision with root package name */
    public final xr0.g f456170c;

    /* renamed from: d, reason: collision with root package name */
    public final xr0.b f456171d;

    public h(xr0.i iVar, xr0.c cVar, xr0.g gVar, xr0.b bVar) {
        this.f456168a = iVar;
        this.f456169b = cVar;
        this.f456170c = gVar;
        this.f456171d = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.h)) {
            return false;
        }
        xr0.h hVar = (xr0.h) obj;
        return kotlin.jvm.internal.o.b(this.f456168a, hVar.f456168a) && kotlin.jvm.internal.o.b(this.f456169b, hVar.f456169b) && kotlin.jvm.internal.o.b(this.f456170c, hVar.f456170c) && kotlin.jvm.internal.o.b(this.f456171d, hVar.f456171d);
    }

    public int hashCode() {
        xr0.i iVar = this.f456168a;
        int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        xr0.c cVar = this.f456169b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        xr0.g gVar = this.f456170c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        xr0.b bVar = this.f456171d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CameraKitSetting(uiSetting=" + this.f456168a + ", commonSetting=" + this.f456169b + ", reportSetting=" + this.f456170c + ", abilitySetting=" + this.f456171d + ')';
    }

    public /* synthetic */ h(xr0.i iVar, xr0.c cVar, xr0.g gVar, xr0.b bVar, int i17, kotlin.jvm.internal.i iVar2) {
        this((i17 & 1) != 0 ? null : iVar, (i17 & 2) != 0 ? null : cVar, (i17 & 4) != 0 ? null : gVar, (i17 & 8) != 0 ? null : bVar);
    }
}
