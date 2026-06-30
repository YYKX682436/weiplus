package ge0;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f270891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge0.e0 f270893f;

    public d0(ge0.e0 e0Var, long j17, java.lang.String str) {
        this.f270893f = e0Var;
        this.f270891d = j17;
        this.f270892e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo i17 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(this.f270893f.f270894a);
        if (i17 == null || i17.field_snsId == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = i17.getTimeLine();
        if (timeLine == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        java.lang.String str = timeLine.ContentDesc;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(i17.field_snsId);
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(str);
        while (matcher.find()) {
            com.tencent.mm.plugin.sns.ui.SnsUploadUI.i7(3, matcher.group(), t07, this.f270891d, this.f270892e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
    }
}
