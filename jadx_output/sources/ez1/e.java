package ez1;

/* loaded from: classes13.dex */
public final class e extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (ez1.g.f257841m != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onAppBackground]");
        ez1.g.f257840i.R(java.lang.System.currentTimeMillis(), null);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (ez1.g.f257841m != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onAppForeground]");
        ez1.g.f257840i.Q(java.lang.System.currentTimeMillis(), null);
    }
}
