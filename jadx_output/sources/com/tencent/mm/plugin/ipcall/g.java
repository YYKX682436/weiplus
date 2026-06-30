package com.tencent.mm.plugin.ipcall;

/* loaded from: classes14.dex */
public class g implements com.tencent.mm.plugin.voip.ui.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.j f142440a;

    public g(com.tencent.mm.plugin.ipcall.j jVar) {
        this.f142440a = jVar;
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public boolean a() {
        return com.tencent.mm.plugin.ipcall.model.r.bj().d();
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void b() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void c(android.content.Intent intent, com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView) {
        if (!com.tencent.mm.plugin.ipcall.model.r.bj().c()) {
            baseSmallView.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h3d));
            return;
        }
        int H1 = (int) com.tencent.mm.sdk.platformtools.t8.H1(this.f142440a.f142456s);
        if (H1 <= 0) {
            H1 = 0;
        }
        baseSmallView.l(java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(H1 / 60), java.lang.Integer.valueOf(H1 % 60)));
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void d() {
    }
}
