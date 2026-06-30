package j0;

/* loaded from: classes14.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final j0.c5 f296272a;

    /* renamed from: b, reason: collision with root package name */
    public final k0.y0 f296273b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.e0 f296274c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f296275d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f296276e;

    /* renamed from: f, reason: collision with root package name */
    public final k0.i1 f296277f;

    /* renamed from: g, reason: collision with root package name */
    public final g2.v f296278g;

    /* renamed from: h, reason: collision with root package name */
    public final j0.h5 f296279h;

    /* renamed from: i, reason: collision with root package name */
    public final j0.a2 f296280i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f296281j;

    public e4(j0.c5 state, k0.y0 selectionManager, g2.e0 e0Var, boolean z17, boolean z18, k0.i1 preparedSelectionState, g2.v vVar, j0.h5 h5Var, j0.a2 a2Var, yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        g2.v offsetMapping;
        g2.e0 value = (i17 & 4) != 0 ? new g2.e0((java.lang.String) null, 0L, (a2.m1) null, 7, (kotlin.jvm.internal.i) null) : e0Var;
        boolean z19 = (i17 & 8) != 0 ? true : z17;
        boolean z27 = (i17 & 16) != 0 ? false : z18;
        if ((i17 & 64) != 0) {
            int i18 = g2.v.f267749a;
            offsetMapping = g2.u.f267748a;
        } else {
            offsetMapping = vVar;
        }
        j0.h5 h5Var2 = (i17 & 128) != 0 ? null : h5Var;
        j0.a2 keyMapping = (i17 & 256) != 0 ? j0.f2.f296286a : a2Var;
        yz5.l onValueChange = (i17 & 512) != 0 ? j0.w3.f296627d : lVar;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(selectionManager, "selectionManager");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(preparedSelectionState, "preparedSelectionState");
        kotlin.jvm.internal.o.g(offsetMapping, "offsetMapping");
        kotlin.jvm.internal.o.g(keyMapping, "keyMapping");
        kotlin.jvm.internal.o.g(onValueChange, "onValueChange");
        this.f296272a = state;
        this.f296273b = selectionManager;
        this.f296274c = value;
        this.f296275d = z19;
        this.f296276e = z27;
        this.f296277f = preparedSelectionState;
        this.f296278g = offsetMapping;
        this.f296279h = h5Var2;
        this.f296280i = keyMapping;
        this.f296281j = onValueChange;
    }

    public final void a(java.util.List list) {
        g2.e eVar = this.f296272a.f296235c;
        java.util.List V0 = kz5.n0.V0(list);
        ((java.util.ArrayList) V0).add(0, new g2.h());
        this.f296281j.invoke(eVar.a(V0));
    }
}
