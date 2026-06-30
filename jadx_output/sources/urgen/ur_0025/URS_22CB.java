package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_0025/URS_22CB;", "", "()V", "UR_019A", "", "item", "", "UR_1E6B", "UR_5190", "UR_7DC2", "UR_ECA7", "", "plugin-ting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class URS_22CB {
    public static final urgen.ur_0025.URS_22CB INSTANCE = new urgen.ur_0025.URS_22CB();

    private URS_22CB() {
    }

    public static final boolean UR_019A(byte[] item) {
        kotlin.jvm.internal.o.g(item, "item");
        return ml4.c.f328409a.b((bw5.lp0) jm4.r5.d(item, new bw5.lp0())) == 3;
    }

    public static final boolean UR_1E6B() {
        return jm4.y4.a();
    }

    public static final boolean UR_5190() {
        return (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.player.RepairerConfigTingPlayerTpTakeOverDownload()) & 3) == 3;
    }

    public static final boolean UR_7DC2(byte[] item) {
        kotlin.jvm.internal.o.g(item, "item");
        bw5.lp0 lp0Var = (bw5.lp0) jm4.r5.d(item, new bw5.lp0());
        if (lp0Var.d().f34189e == 1) {
            if (ml4.c.f328409a.b(lp0Var) == 3) {
                if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.player.RepairerConfigTingPlayerTpTakeOverDownload()) & 3) == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int UR_ECA7(byte[] item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (((bw5.lp0) jm4.r5.d(item, new bw5.lp0())).d().f34189e == 4) {
            return ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.player.RepairerConfigTingFinderAudioPreferPlayMv()) == 1) && !jm4.y4.a()) ? 2 : 1;
        }
        return 1;
    }
}
