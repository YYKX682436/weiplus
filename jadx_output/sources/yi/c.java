package yi;

/* loaded from: classes15.dex */
public class c extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.d f462448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yi.d dVar, yi.h hVar) {
        super(hVar);
        this.f462448b = dVar;
    }

    @Override // yi.h
    public void c(zi.b bVar, int i17, zi.b bVar2, zi.b bVar3, int i18, zi.a[] aVarArr, zi.a[] aVarArr2) {
        zi.b bVar4;
        zi.b bVar5;
        yi.d dVar = this.f462448b;
        yi.g gVar = dVar.f462449b;
        if (gVar.f462465n == null && (bVar5 = gVar.f462457f) != null && bVar5.equals(bVar)) {
            dVar.f462449b.f462465n = aVarArr2;
            return;
        }
        yi.g gVar2 = dVar.f462449b;
        if (gVar2.f462466o == null && (bVar4 = gVar2.f462461j) != null && bVar4.equals(bVar)) {
            dVar.f462449b.f462466o = aVarArr2;
        }
    }
}
