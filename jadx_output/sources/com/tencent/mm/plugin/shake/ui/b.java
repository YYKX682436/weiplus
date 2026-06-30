package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f162239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f162240b;

    public b(boolean z17, com.tencent.mm.ui.z9 z9Var) {
        this.f162239a = z17;
        this.f162240b = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f162239a;
        int i17 = z17 ? n17 & (-257) : n17 | 256;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetShake", "setInstall pluginFlag install:%b  pluginFlag : %d -> %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(n17), java.lang.Integer.valueOf(i17));
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            c34.s Ni = c34.h0.Ni();
            Ni.f38240d.A("shakeitem1", "delete from shakeitem1");
            Ni.doNotify();
            com.tencent.mm.storage.qa Di = r21.w.Di();
            Di.f195251d.delete(Di.getTableName(), null, null);
        }
        com.tencent.mm.ui.z9 z9Var = this.f162240b;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
