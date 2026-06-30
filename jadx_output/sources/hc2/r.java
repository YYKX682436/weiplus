package hc2;

/* loaded from: classes2.dex */
public abstract class r {
    public static final int a(r45.ay0 ay0Var) {
        java.lang.Object m521constructorimpl;
        java.lang.String string = ay0Var != null ? com.tencent.mm.ui.bk.C() ? ay0Var.getString(1) : ay0Var.getString(0) : null;
        if (string != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(android.graphics.Color.parseColor(string)));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Integer num = (java.lang.Integer) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }
}
