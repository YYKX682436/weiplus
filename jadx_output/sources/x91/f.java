package x91;

/* loaded from: classes16.dex */
public class f implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f452645a;

    public f(x91.h hVar) {
        this.f452645a = hVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        x91.c cVar;
        if (eVar == null || (cVar = this.f452645a.f452647a) == null) {
            return;
        }
        java.lang.String str = cVar.f452639g;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        x91.h hVar = this.f452645a;
        hVar.f452655i = false;
        hVar.f452652f = null;
        x91.c cVar = hVar.f452647a;
        if (cVar != null) {
            java.lang.String str = cVar.f452639g;
        }
    }
}
