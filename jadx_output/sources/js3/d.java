package js3;

/* loaded from: classes.dex */
public class d implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(((com.tencent.mm.ipcinvoker.type.IPCLong) obj).f68405d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("download_status", p17.f96963f);
        bundle.putFloat("download_progress", (((float) p17.f96967m) * 1.0f) / ((float) p17.f96968n));
        bundle.putString("download_apk_path", p17.f96964g);
        rVar.a(bundle);
    }
}
