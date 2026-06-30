package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lurgen/ur_C563/URS_5EB7;", "", "Ljz5/f0;", "UR_C8FF", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class URS_5EB7 {
    public static final urgen.ur_C563.URS_5EB7 INSTANCE = new urgen.ur_C563.URS_5EB7();

    private URS_5EB7() {
    }

    public static final void UR_C8FF() {
        int i17;
        if (gm0.j1.a()) {
            i17 = gm0.j1.b().h();
            com.tencent.mars.xlog.Log.i("MicroMsg.AffContextUtilsJavaStatic", "accHasReady uin: " + ((java.lang.Object) jz5.u.a(i17)));
        } else {
            i17 = gm0.m.i();
            com.tencent.mars.xlog.Log.i("MicroMsg.AffContextUtilsJavaStatic", "accHasNotReady uin: " + ((java.lang.Object) jz5.u.a(i17)));
        }
        if (i17 == 0) {
            return;
        }
        u71.z.f425116a.a();
        int i18 = w71.c.f443389d;
        com.tencent.unit_rc.BaseObjectDef UR_FC0E = urgen.ur_C563.UR_3275.UR_FC0E();
        kotlin.jvm.internal.o.e(UR_FC0E, "null cannot be cast to non-null type com.tencent.mm.plugin.aff_biz.ur.AffContextManager");
        urgen.ur_C563.UR_3275.UR_52DA(((w71.c) ((w71.a) UR_FC0E)).getCppPointer(), i17);
    }
}
