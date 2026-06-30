package rh;

/* loaded from: classes12.dex */
public class o implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.w f395478d;

    public o(rh.w wVar) {
        this.f395478d = wVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "fgSrv >> off", new java.lang.Object[0]);
        rh.w wVar = this.f395478d;
        qh.f0 f0Var = wVar.f395294a;
        boolean z17 = f0Var.f363343o;
        int e17 = wh.m.e(f0Var.d(), z17);
        if (e17 != 1 && e17 != 3 && e17 != 4) {
            oj.j.c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 2", new java.lang.Object[0]);
            wVar.m(2);
            return;
        }
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z17 + ", currAppStat = " + e17, new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "fgSrv >> on", new java.lang.Object[0]);
        rh.w wVar = this.f395478d;
        qh.f0 f0Var = wVar.f395294a;
        boolean z17 = f0Var.f363343o;
        int e17 = wh.m.e(f0Var.d(), z17);
        if (e17 != 1) {
            oj.j.c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 3", new java.lang.Object[0]);
            wVar.m(3);
            return;
        }
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z17 + ", currAppStat = " + e17, new java.lang.Object[0]);
    }
}
