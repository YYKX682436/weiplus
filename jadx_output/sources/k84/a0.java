package k84;

/* loaded from: classes4.dex */
public final class a0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f304928d;

    public a0(k84.q1 q1Var) {
        this.f304928d = q1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        k84.m mVar = (k84.m) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        k84.q1 q1Var = this.f304928d;
        java.lang.String j17 = q1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("continuousLikeStateFlow collect = ");
        if (mVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
            bool = java.lang.Boolean.valueOf(mVar.f305110a);
        } else {
            bool = null;
        }
        sb6.append(bool);
        sb6.append(' ');
        sb6.append(mVar != null ? java.lang.Boolean.valueOf(mVar.b()) : null);
        sb6.append(' ');
        sb6.append(mVar != null ? java.lang.Boolean.valueOf(mVar.a()) : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (mVar == null) {
            android.view.ViewGroup P = q1Var.P();
            if (P != null) {
                P.setVisibility(0);
            }
            android.view.ViewGroup R = q1Var.R();
            if (R != null) {
                R.setVisibility(4);
            }
            android.view.ViewGroup N = q1Var.N();
            if (N != null) {
                N.setVisibility(4);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        } else {
            if (mVar.b()) {
                android.view.ViewGroup P2 = q1Var.P();
                if (P2 != null) {
                    P2.setVisibility(0);
                }
                android.view.ViewGroup R2 = q1Var.R();
                if (R2 != null) {
                    R2.setVisibility(4);
                }
                android.view.ViewGroup N2 = q1Var.N();
                if (N2 != null) {
                    N2.setVisibility(4);
                }
            } else if (mVar.a()) {
                android.view.ViewGroup P3 = q1Var.P();
                if (P3 != null) {
                    P3.setVisibility(4);
                }
                android.view.ViewGroup R3 = q1Var.R();
                if (R3 != null) {
                    R3.setVisibility(0);
                }
                android.view.ViewGroup N3 = q1Var.N();
                if (N3 != null) {
                    N3.setVisibility(4);
                }
            } else {
                k84.q1.Y(q1Var, null, 1, null);
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L = q1Var.L();
                if (L != null) {
                    L.setPendingFillItem(false);
                }
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L2 = q1Var.L();
                if (L2 != null) {
                    L2.p();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3$1");
        return f0Var;
    }
}
