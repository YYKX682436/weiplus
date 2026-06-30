package om2;

/* loaded from: classes10.dex */
public final class x extends om2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final om2.o f346388a;

    public x(om2.o songInfo) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f346388a = songInfo;
    }

    @Override // om2.d0
    public boolean a(om2.d0 newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        if (om2.x.class != newState.getClass()) {
            return true;
        }
        om2.x xVar = (om2.x) newState;
        om2.o oVar = this.f346388a;
        r45.xn1 xn1Var = oVar != null ? oVar.f346361b : null;
        om2.o oVar2 = xVar.f346388a;
        return (kotlin.jvm.internal.o.b(xn1Var, oVar2 != null ? oVar2.f346361b : null) && oVar.f346366g == xVar.f346388a.f346366g) ? false : true;
    }
}
