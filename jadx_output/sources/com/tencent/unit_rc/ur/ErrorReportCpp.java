package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/unit_rc/ur/ErrorReportCpp;", "", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public class ErrorReportCpp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.ur.ErrorReportCpp.Companion INSTANCE = new com.tencent.unit_rc.ur.ErrorReportCpp.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0007\u001a\u00020\u00052 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/tencent/unit_rc/ur/ErrorReportCpp$Companion;", "", "Lkotlin/Function3;", "", "", "Ljz5/f0;", "callback", "registerErrorReport", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final void registerErrorReport(yz5.q qVar) {
            urgen.ur_96F1.UR_3202.UR_E761(com.tencent.unit_rc.ur.FuncDeclareKt.INSTANCE.Void_Uint32Uint32String_ToObj(qVar));
        }
    }

    public static final void registerErrorReport(yz5.q qVar) {
        INSTANCE.registerErrorReport(qVar);
    }
}
