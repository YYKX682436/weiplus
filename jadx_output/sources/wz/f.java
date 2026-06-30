package wz;

/* loaded from: classes8.dex */
public class f implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            ((a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class))).Ai(false);
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            ((a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class))).Ai(true);
        }
    }
}
