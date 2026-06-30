package x91;

/* loaded from: classes16.dex */
public class d implements z91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f452643a;

    public d(x91.h hVar) {
        this.f452643a = hVar;
    }

    @Override // z91.c
    public void a(aa1.e eVar) {
        x91.c cVar;
        if (eVar == null || (cVar = this.f452643a.f452647a) == null) {
            return;
        }
        java.lang.String str = cVar.f452639g;
    }

    @Override // z91.c
    public void b(aa1.c cVar) {
        x91.h hVar = this.f452643a;
        hVar.f452655i = true;
        hVar.f452652f = cVar;
        x91.c cVar2 = hVar.f452647a;
        if (cVar2 != null) {
            java.lang.String str = cVar2.f452639g;
        }
    }
}
