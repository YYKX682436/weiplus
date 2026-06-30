package dz3;

/* loaded from: classes15.dex */
public class c implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz3.i f245107d;

    public c(dz3.i iVar) {
        this.f245107d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "release on task");
        if (this.f245107d.f245133a) {
            com.tencent.mm.plugin.scanner.model.d1.l();
            this.f245107d.f245133a = false;
        }
        dz3.i.H = null;
        dz3.i.I = null;
    }
}
