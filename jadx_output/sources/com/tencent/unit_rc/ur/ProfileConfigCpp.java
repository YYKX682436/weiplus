package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/unit_rc/ur/ProfileConfigCpp;", "", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public class ProfileConfigCpp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.ur.ProfileConfigCpp.Companion INSTANCE = new com.tencent.unit_rc.ur.ProfileConfigCpp.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007J$\u0010\u000e\u001a\u00020\b2\u001a\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007¨\u0006\u0012"}, d2 = {"Lcom/tencent/unit_rc/ur/ProfileConfigCpp$Companion;", "", "", "reportCount", "maxReportCount", "reportInterval", "minReportProfileInterval", "maxReportLength", "Ljz5/f0;", "setReportConfig", "Lkotlin/Function1;", "", "", "reportFunc", "setReportFunc", "report", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public static /* synthetic */ void setReportConfig$default(com.tencent.unit_rc.ur.ProfileConfigCpp.Companion companion, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj) {
            if ((i29 & 1) != 0) {
                i17 = 10000;
            }
            if ((i29 & 2) != 0) {
                i18 = 10000000;
            }
            int i37 = i18;
            if ((i29 & 4) != 0) {
                i19 = 7200;
            }
            int i38 = i19;
            if ((i29 & 8) != 0) {
                i27 = 1800;
            }
            int i39 = i27;
            if ((i29 & 16) != 0) {
                i28 = 6656;
            }
            companion.setReportConfig(i17, i37, i38, i39, i28);
        }

        public final void report() {
            urgen.ur_96F1.UR_6F4F.UR_70DC();
        }

        public final void setReportConfig(int i17, int i18, int i19, int i27, int i28) {
            urgen.ur_96F1.UR_6F4F.UR_6697(i17, i18, i19, i27, i28);
        }

        public final void setReportFunc(yz5.l lVar) {
            urgen.ur_96F1.UR_6F4F.UR_C875(com.tencent.unit_rc.ur.FuncDeclareKt.INSTANCE.Void_ListString_ToObj(lVar));
        }
    }

    public static final void report() {
        INSTANCE.report();
    }

    public static final void setReportConfig(int i17, int i18, int i19, int i27, int i28) {
        INSTANCE.setReportConfig(i17, i18, i19, i27, i28);
    }

    public static final void setReportFunc(yz5.l lVar) {
        INSTANCE.setReportFunc(lVar);
    }
}
