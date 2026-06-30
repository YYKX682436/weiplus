package en3;

@j95.b(dependencies = {e70.q.class})
/* loaded from: classes8.dex */
public final class v extends i95.w implements ra0.v {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f255324d = "MicroMsg.NewLife.NewLifeConfigFeatureService";

    static {
        kz5.c0.i(java.lang.Double.valueOf(0.75d), java.lang.Double.valueOf(1.0d), java.lang.Double.valueOf(1.3333333333333333d));
    }

    public boolean Ai() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U1).getValue()).r()).intValue() == 1;
    }

    public int Bi(r45.kv2 kv2Var) {
        if (kv2Var == null) {
            return 0;
        }
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_newlife_comment_egg_detail_and, 1) == 1)) {
            return kv2Var.getInteger(6);
        }
        int integer = kv2Var.getInteger(6);
        r45.mv4 mv4Var = (r45.mv4) kv2Var.getCustom(28);
        return integer + (mv4Var != null ? mv4Var.getInteger(4) : 0);
    }

    public ra0.y Di() {
        if (wi()) {
            return (ra0.y) i95.n0.c(en3.u.class);
        }
        return null;
    }

    public j75.f Ni() {
        ra0.y Di;
        if (!wi() || (Di = Di()) == null) {
            return null;
        }
        return ((en3.l0) Di).Ai();
    }

    public boolean Ri() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.S1).getValue()).r()).intValue() > 0;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        Di();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
    }

    public boolean wi() {
        boolean wi6 = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).wi();
        boolean z17 = ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).wi() && Ri();
        com.tencent.mars.xlog.Log.i(this.f255324d, "canShowNewLifeSyncRedDot: isShowNewLifeEntry:false,isShowLongVide:" + wi6 + " , isShowLookOneLookEntry:" + z17 + ',');
        return z17 || wi6;
    }
}
