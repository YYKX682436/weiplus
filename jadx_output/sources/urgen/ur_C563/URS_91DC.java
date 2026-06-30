package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_C563/URS_91DC;", "", "", "UR_8D02", "", "open", "value", "functionId", "Ljz5/f0;", "UR_CCBA", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class URS_91DC {
    public static final urgen.ur_C563.URS_91DC INSTANCE = new urgen.ur_C563.URS_91DC();

    private URS_91DC() {
    }

    public static final long UR_8D02() {
        return c01.z1.i();
    }

    public static final void UR_CCBA(boolean z17, long j17, long j18) {
        long i17 = c01.z1.i();
        long j19 = z17 ? i17 & (~j17) : i17 | j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtStatus2JavaStatic", "switchStateChange open: " + z17 + ", value: " + j17 + ", functionId: " + j18 + ", extStatus2: " + j19);
        int i18 = z17 ? 1 : 2;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j19));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = (int) j18;
        p53Var.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }
}
