package nv3;

/* loaded from: classes5.dex */
public final class m implements ev3.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nv3.t f340691d;

    public m(nv3.t tVar) {
        this.f340691d = tVar;
    }

    @Override // ev3.c
    public void J(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        nv3.t tVar = this.f340691d;
        tVar.e(musicKey);
        dv3.c cVar = tVar.f340706d;
        if (cVar == null) {
            return;
        }
        cVar.S0("");
    }

    @Override // ev3.c
    public void K(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        nv3.t tVar = this.f340691d;
        tVar.e(musicKey);
        dv3.c cVar = tVar.f340706d;
        if (cVar == null) {
            return;
        }
        cVar.S0("");
    }

    @Override // ev3.c
    public void y(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f340691d.f340706d;
        if (cVar == null) {
            return;
        }
        cVar.S0(musicKey);
    }
}
