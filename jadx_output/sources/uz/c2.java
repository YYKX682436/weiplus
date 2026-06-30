package uz;

@j95.b
/* loaded from: classes8.dex */
public class c2 extends i95.w implements vz.a2 {
    public void wi(android.content.Context context, long j17, boolean z17, boolean z18, vz.z1 z1Var) {
        boolean o17 = com.tencent.mm.plugin.downloader.model.r0.i().o(j17);
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || com.tencent.mm.sdk.platformtools.t8.K0(c17.field_appId)) {
            z1Var.a(null, null);
            return;
        }
        if (!z18) {
            if (!o17) {
                z1Var.a("fail", null);
                return;
            } else {
                k02.s.b(context, c17.field_appId, 0);
                z1Var.a(null, null);
                return;
            }
        }
        if (context instanceof android.app.Activity) {
            com.tencent.mm.plugin.downloader.model.j1.i(context, c17, z1Var);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
            if (wVar.j() != null && wVar.j().get() != null) {
                com.tencent.mm.plugin.downloader.model.j1.i((android.content.Context) wVar.j().get(), c17, z1Var);
                return;
            }
        }
        if (!o17) {
            z1Var.a("fail", null);
        } else {
            k02.s.b(context, c17.field_appId, 0);
            z1Var.a(null, null);
        }
    }
}
