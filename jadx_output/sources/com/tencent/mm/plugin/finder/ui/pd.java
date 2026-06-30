package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class pd extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sd f129633d;

    public pd(com.tencent.mm.plugin.finder.ui.sd sdVar) {
        this.f129633d = sdVar;
    }

    @Override // ut3.e, ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle extData, ut3.c finishController) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extData, "extData");
        kotlin.jvm.internal.o.g(finishController, "finishController");
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel model, android.os.Bundle extData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(extData, "extData");
        java.lang.String str = model.f155662f;
        if (str == null) {
            str = "";
        }
        this.f129633d.c(str);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }
}
