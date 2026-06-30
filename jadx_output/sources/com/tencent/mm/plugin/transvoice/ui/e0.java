package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class e0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175428d;

    public e0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175428d = v0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175428d;
        if (v0Var.W) {
            v0Var.W = false;
            if (com.tencent.mm.sdk.platformtools.t8.K0(v0Var.X)) {
                return;
            }
            com.tencent.mm.plugin.transvoice.ui.y yVar = v0Var.f175498y0;
            if (yVar != null) {
                com.tencent.mm.pluginsdk.ui.chat.m2 m2Var = (com.tencent.mm.pluginsdk.ui.chat.m2) yVar;
                m2Var.f190482a.postDelayed(new com.tencent.mm.pluginsdk.ui.chat.l2(m2Var, v0Var.X), 200L);
            }
            java.lang.String str = v0Var.X;
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.util.List list = v0Var.Z;
            objArr[0] = list != null ? java.lang.Integer.valueOf(list.size()) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.TransVoiceDialog", "cgiReport size = %s", objArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.TransVoiceDialog", "cgiReport: abTestFlag = [%s]", 0);
            java.util.List list2 = v0Var.Z;
            java.lang.String valueOf = java.lang.String.valueOf(0);
            b31.d dVar = v0Var.Y;
            dVar.getClass();
            gm0.j1.e().j(new b31.c(dVar, new java.util.ArrayList(list2), str, valueOf, 10));
            java.util.List list3 = v0Var.Z;
            if (list3 != null) {
                list3.clear();
            }
        }
    }
}
