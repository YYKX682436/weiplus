package k84;

/* loaded from: classes4.dex */
public final class e0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.p f305013e;

    public e0(k84.q1 q1Var, mb4.p pVar) {
        this.f305012d = q1Var;
        this.f305013e = pVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        i64.p pVar = (i64.p) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        k84.q1 q1Var = this.f305012d;
        java.lang.String j17 = q1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe CountTitle = ");
        java.lang.String str = null;
        sb6.append(pVar != null ? pVar.a() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (pVar == null || (a17 = pVar.a()) == null) {
            mb4.h0 c17 = this.f305013e.c();
            if (c17 != null) {
                str = c17.a();
            }
        } else {
            str = a17;
        }
        androidx.appcompat.widget.AppCompatTextView S = q1Var.S();
        if (S != null) {
            if (str == null) {
                str = "";
            }
            S.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        return f0Var;
    }
}
