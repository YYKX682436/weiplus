package jn3;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final jn3.f f300781d = new jn3.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ra0.b0 state = (ra0.b0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof sa0.c)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.Entrance");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.MentionEntrance");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.OfficialMsgEntrance");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.SquareTab");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.OfficialMsgSquareTab");
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof sa0.d)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.Entrance");
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof sa0.g)) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = ((sa0.g) dVar3).f405250b;
            int i17 = jbVar.field_ctrType;
            if (i17 >= 100001 && i17 < 199999) {
                nn3.f fVar = (nn3.f) ((ra0.x) i95.n0.c(ra0.x.class));
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotExpired", true);
                fVar.Ri("red_dot_expired", jbVar, null, 1);
            } else if (i17 >= 300000 && i17 < 399999) {
                nn3.f fVar2 = (nn3.f) ((ra0.x) i95.n0.c(ra0.x.class));
                fVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotExpired", true);
                fVar2.Ri("red_dot_expired", jbVar, null, 2);
            }
        }
        return jz5.f0.f302826a;
    }
}
