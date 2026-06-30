package ut3;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final ut3.f f431176c = new ut3.f();

    /* renamed from: a, reason: collision with root package name */
    public ut3.d f431177a = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f431178b = new android.os.Bundle();

    public void a(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        ut3.d dVar = this.f431177a;
        android.os.Bundle bundle = this.f431178b;
        if (dVar != null && context != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureDataManager", "doSend, generateCallback:%s", java.lang.Integer.valueOf(dVar.hashCode()));
            this.f431177a.k3(context, captureDataManager$CaptureVideoNormalModel, new android.os.Bundle(bundle));
            bundle.clear();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureDataManager", "doSend, generateCallback null, finish");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", bundle);
        intent.putExtra("KSEGMENTMEDIAINFO", captureDataManager$CaptureVideoNormalModel);
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    public void b(android.content.Context context, int i17, com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("media_basic_extra_bundle", this.f431178b);
        intent.putExtra("media_basic_out_model", mediaResultInfo);
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(i17, intent);
        activity.finish();
    }

    public android.os.Bundle c() {
        return this.f431178b;
    }

    public void d(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo) {
        ut3.d dVar = this.f431177a;
        if (dVar == null) {
            return;
        }
        dVar.r3(z17, recordMediaReportInfo, this.f431178b);
    }

    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureDataManager", "updateSoundTrackTypeOnExtData: %d", java.lang.Integer.valueOf(i17));
        f431176c.f431178b.putInt("SOUND_TRACK_TYPE", i17);
    }
}
