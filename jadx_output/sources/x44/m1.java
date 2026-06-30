package x44;

/* loaded from: classes4.dex */
public final class m1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.o1 f451858d;

    public m1(x44.o1 o1Var) {
        this.f451858d = o1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1$2");
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("SnsAdJs.OperateDownloadTask", "the user cancel the resume");
        x44.o1 o1Var = this.f451858d;
        o1Var.b(w44.d.k(o1Var, -1, "cancel", null, 4, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1$2");
    }
}
