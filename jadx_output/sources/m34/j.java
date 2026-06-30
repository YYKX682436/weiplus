package m34;

/* loaded from: classes4.dex */
public class j implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m34.n f323355d;

    public j(m34.n nVar) {
        this.f323355d = nVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        m34.n nVar = this.f323355d;
        nVar.f323360e.post(new m34.i(this));
        nVar.f323359d.setLoop(true);
        if (nVar.f323359d.start()) {
            nVar.f323366n.c(nVar);
        } else {
            nVar.c();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoPopupHelper", "on play video error, what %d extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        m34.n nVar = this.f323355d;
        nVar.f323359d.stop();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        sb6.append(com.tencent.mm.plugin.sight.base.e.b());
        sb6.append("[SightPopupHelper] on play video error, what ");
        sb6.append(i17);
        sb6.append(" extra ");
        sb6.append(i18);
        sb6.append(", path=");
        java.lang.String str = nVar.f323362g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.tencent.mm.sdk.platformtools.u3.h(new m34.h(this, null, nVar.f323362g));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        fp.k.b();
        m34.n nVar = this.f323355d;
        if (nVar.f323359d.start()) {
            nVar.f323366n.c(nVar);
        } else {
            nVar.c();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
