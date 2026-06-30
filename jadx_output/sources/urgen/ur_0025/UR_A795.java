package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lurgen/ur_0025/UR_A795;", "", "<init>", "()V", "URB_2274", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "playingInfo", "", "URB_8758", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_A795 {
    public static final urgen.ur_0025.UR_A795 INSTANCE = new urgen.ur_0025.UR_A795();

    private UR_A795() {
    }

    public static final void URB_2274(com.tencent.unit_rc.BaseObjectDef obj, byte[] playingInfo) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(playingInfo, "playingInfo");
        bw5.jq0 jq0Var = (bw5.jq0) jm4.r5.d(playingInfo, new bw5.jq0());
        tl4.l lVar = (tl4.l) ((jm4.m2) obj);
        lVar.f420323g = jq0Var;
        int i17 = jq0Var.f29110e;
        if ((i17 == 1 || i17 == 2) && lVar.f420320d != bw5.eq0.StandAlone) {
            d75.b.g(tl4.n.f420324d);
        }
        ((ku5.t0) ku5.t0.f312615d).h(new tl4.j(lVar, jq0Var), "MicroMsg.TingPlayAppNotificationModule");
        ((ku5.t0) ku5.t0.f312615d).B(new tl4.k(jq0Var, lVar));
    }

    public static final void URB_8758(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
    }
}
