package x44;

/* loaded from: classes4.dex */
public final class l1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.o1 f451846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f451847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.s1 f451848f;

    public l1(x44.o1 o1Var, long j17, vz.s1 s1Var) {
        this.f451846d = o1Var;
        this.f451847e = j17;
        this.f451848f = s1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1$1");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resume", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        this.f451846d.p(this.f451847e, this.f451848f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resume", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1$1");
    }
}
