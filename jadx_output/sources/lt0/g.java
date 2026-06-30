package lt0;

/* loaded from: classes15.dex */
public class g implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lt0.i f321171a;

    public g(lt0.i iVar) {
        this.f321171a = iVar;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        lt0.b bVar = (lt0.b) obj2;
        lt0.b bVar2 = (lt0.b) obj3;
        if (bVar != null) {
            kt0.a aVar = (kt0.a) bVar;
            java.lang.String str = aVar.f311903a;
            lt0.i iVar = this.f321171a;
            java.lang.Object b17 = iVar.b(aVar.f311904b, str);
            kk.h hVar = iVar.f321175c;
            if (hVar != null) {
                hVar.a(b17, bVar, bVar2);
            }
        }
    }
}
