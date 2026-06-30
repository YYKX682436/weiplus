package dl;

/* loaded from: classes10.dex */
public class s implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f235120a;

    public s(dl.t tVar) {
        this.f235120a = tVar;
    }

    @Override // bn5.e
    public void b() {
        dl.t tVar = this.f235120a;
        if (tVar.h() == null || tVar.d() == null) {
            return;
        }
        tVar.h().set(((um.d) tVar.d()).f428674f);
        if (tVar.I == null) {
            dl.t.G(tVar, 300L, false, false);
        }
        dl.t.H(tVar);
        tVar.s();
    }

    @Override // bn5.e
    public void onStart() {
        this.f235120a.E = false;
    }
}
