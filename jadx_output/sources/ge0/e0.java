package ge0;

/* loaded from: classes4.dex */
public class e0 implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270894a;

    public e0(ge0.f0 f0Var, int i17) {
        this.f270894a = i17;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        wa4.u uVar = (wa4.u) fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        if (uVar == null || android.text.TextUtils.isEmpty(uVar.f444285d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        } else {
            java.lang.String str = uVar.f444285d;
            ((ku5.t0) ku5.t0.f312615d).h(new ge0.d0(this, c01.id.e(), str), "WebSearchReportLogic.TagSearchReport");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1");
    }
}
