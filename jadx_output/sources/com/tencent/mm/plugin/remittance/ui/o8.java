package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f157864d;

    public o8(com.tencent.mm.plugin.remittance.ui.p8 p8Var, r45.yt5 yt5Var) {
        this.f157864d = yt5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "onMenuItemClick");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        try {
            create.putBinary("route_info", this.f157864d.toByteArray());
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create, new com.tencent.mm.plugin.remittance.ui.n8(this));
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceUI", "exception: %s", e17);
            return true;
        }
    }
}
