package dz3;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz3.i f245109d;

    public e(dz3.i iVar) {
        this.f245109d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f245109d.f245133a && com.tencent.mm.plugin.scanner.model.d1.f158853k == com.tencent.mm.plugin.scanner.model.y0.f159103e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanFastFocusEngineManager", "resetNoBoxCount");
            com.tencent.mm.plugin.scanner.model.d1.f158852j.resetNoBoxCount();
        }
    }
}
