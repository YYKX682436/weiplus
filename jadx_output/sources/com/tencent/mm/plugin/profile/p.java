package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class p extends com.tencent.mm.sdk.event.n {
    public p() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        android.content.Context context;
        java.lang.Object obj;
        android.app.Activity activity;
        com.tencent.mm.autogen.events.DeleteProfileMsgEvent event = (com.tencent.mm.autogen.events.DeleteProfileMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.a4 a4Var = event.f54088g;
        int p07 = com.tencent.mm.sdk.platformtools.t8.p0(a4Var.f6121a, 0);
        int i17 = a4Var.f6122b;
        wr3.m0 m0Var = wr3.n0.f448841e;
        int i18 = a4Var.f6123c;
        m0Var.getClass();
        java.util.Iterator it = ((kz5.h) wr3.n0.f448848o).iterator();
        while (true) {
            context = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wr3.n0) obj).f448849d == i18) {
                break;
            }
        }
        wr3.n0 n0Var = (wr3.n0) obj;
        if (n0Var == null) {
            n0Var = wr3.n0.f448842f;
        }
        int i19 = a4Var.f6124d;
        boolean z17 = a4Var.f6125e;
        boolean z18 = a4Var.f6126f;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            if (j17 != null) {
                context = (android.app.Activity) j17.get();
            }
        } else {
            context = activity;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeleteProfileMsgEventListener", "delete profile msg, appMsgId: " + p07 + ", idx: " + i17 + ", itemStatus: " + n0Var + ", infoSize: " + i19 + ", showSuccessToast: " + z17 + ", success: " + z18);
        if (z18) {
            yr3.w.f465059a.f(n0Var, p07, i17, java.lang.Integer.valueOf(i19));
            if (z17) {
                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nkg);
                e4Var.b(com.tencent.mm.R.raw.check_mark_filled);
                e4Var.c();
            }
        } else {
            int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490949na5);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
        }
        return false;
    }
}
