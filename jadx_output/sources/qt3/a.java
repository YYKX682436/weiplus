package qt3;

/* loaded from: classes3.dex */
public final class a implements ut3.d {
    @Override // ut3.d
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", extData);
        intent.putExtra("KSEGMENTMEDIAINFO", model);
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo reportInfo, android.os.Bundle extData) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        kotlin.jvm.internal.o.g(extData, "extData");
    }
}
