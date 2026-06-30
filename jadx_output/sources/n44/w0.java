package n44;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n44.w0 f335068d = new n44.w0();

    public w0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper$createHalfScreen$1");
        com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper$createHalfScreen$1");
        if (vASActivity != null) {
            vASActivity.setVasFinishInterceptor(n44.v0.f335066d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper$createHalfScreen$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper$createHalfScreen$1");
        return f0Var;
    }
}
