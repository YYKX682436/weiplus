package t14;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t14.q f414582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t14.q qVar) {
        super(1);
        this.f414582d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        t14.s state = (t14.s) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof t14.z)) {
            t14.z zVar = (t14.z) dVar;
            java.lang.String selectInfo = zVar.f414605c;
            if (!(selectInfo == null || r26.n0.N(selectInfo))) {
                java.lang.String viewId = zVar.f414604b;
                kotlin.jvm.internal.o.g(viewId, "viewId");
                kotlin.jvm.internal.o.g(selectInfo, "selectInfo");
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) state.f414592e;
                java.lang.Object obj2 = linkedHashMap.get(viewId);
                if (obj2 == null) {
                    obj2 = new t14.u(viewId);
                    linkedHashMap.put(viewId, obj2);
                }
                t14.u uVar = (t14.u) obj2;
                uVar.f414595c = selectInfo;
                if (uVar.f414594b == null) {
                    uVar.f414594b = selectInfo;
                }
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof t14.t)) {
        }
        return jz5.f0.f302826a;
    }
}
