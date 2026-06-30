package om2;

/* loaded from: classes10.dex */
public final class c0 extends om2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final om2.o f346280a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.o f346281b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.ia4 f346282c;

    public c0(om2.o songInfo, om2.o oVar, r45.ia4 state) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(state, "state");
        this.f346280a = songInfo;
        this.f346281b = oVar;
        this.f346282c = state;
    }

    @Override // om2.d0
    public boolean a(om2.d0 newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        if (om2.c0.class != newState.getClass()) {
            return true;
        }
        om2.o oVar = this.f346280a;
        boolean z17 = oVar.f346366g;
        om2.o oVar2 = ((om2.c0) newState).f346280a;
        return (z17 == oVar2.f346366g && kotlin.jvm.internal.o.b(oVar.f346361b, oVar2.f346361b)) ? false : true;
    }
}
