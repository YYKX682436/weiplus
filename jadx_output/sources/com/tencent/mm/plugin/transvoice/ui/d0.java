package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class d0 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175418d;

    public d0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175418d = v0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 5000) {
            com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175418d;
            com.tencent.mm.plugin.transvoice.model.e eVar = v0Var.f175479f;
            eVar.f175393q = 1;
            eVar.f175394r = java.lang.System.currentTimeMillis();
            v0Var.f175479f.f175398v = 0;
            com.tencent.mm.sdk.platformtools.b4 b4Var = v0Var.H;
            if (b4Var != null) {
                b4Var.d();
            }
            com.tencent.mm.plugin.transvoice.model.c cVar = v0Var.f175494w;
            if (cVar != null) {
                cVar.a(false, false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f175496x0)) {
                com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
                if (mMEditText != null) {
                    mMEditText.setFocusable(true);
                }
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = v0Var.f175484n;
                if (mMEditText2 != null) {
                    mMEditText2.setFocusableInTouchMode(true);
                }
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = v0Var.f175484n;
            if (mMEditText3 != null) {
                mMEditText3.setText(v0Var.f175496x0);
            }
            android.view.View view = v0Var.f175486p;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$14", "handleMessage", "(Landroid/os/Message;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$14", "handleMessage", "(Landroid/os/Message;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return true;
    }
}
