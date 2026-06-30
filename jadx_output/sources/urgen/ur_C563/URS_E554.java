package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lurgen/ur_C563/URS_E554;", "", "()V", "UR_0ACA", "", "UR_31C1", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "UR_BE04", "UR_D7DD", "UR_DB03", "UR_E305", "", "UR_F656", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URS_E554 {
    public static final urgen.ur_C563.URS_E554 INSTANCE = new urgen.ur_C563.URS_E554();

    private URS_E554() {
    }

    public static final java.lang.String UR_0ACA() {
        return wo.w0.k();
    }

    public static final java.lang.String UR_31C1(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c(name), false);
        return i17 == null ? "" : i17;
    }

    public static final java.lang.String UR_BE04() {
        java.lang.String REV = com.tencent.mm.sdk.platformtools.z.f193109e;
        kotlin.jvm.internal.o.f(REV, "REV");
        return REV;
    }

    public static final java.lang.String UR_D7DD() {
        java.lang.String DEVICE_TYPE = wo.q.f447780a;
        kotlin.jvm.internal.o.f(DEVICE_TYPE, "DEVICE_TYPE");
        return DEVICE_TYPE;
    }

    public static final java.lang.String UR_DB03() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("aff_biz"), false);
        return i17 == null ? "" : i17;
    }

    public static final long UR_E305() {
        return c01.id.c();
    }

    public static final long UR_F656() {
        return o45.wf.f343029g;
    }
}
