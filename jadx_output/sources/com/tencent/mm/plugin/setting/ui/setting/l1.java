package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI f161264d;

    public l1(com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI editSignatureUI) {
        this.f161264d = editSignatureUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI editSignatureUI = this.f161264d;
        java.lang.String sig = editSignatureUI.f160139d.getText().toString().trim();
        java.lang.String f17 = ip.c.f();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            if (sig.matches(".*[" + f17 + "].*")) {
                db5.e1.s(editSignatureUI.getContext(), editSignatureUI.getString(com.tencent.mm.R.string.g1m, f17), editSignatureUI.getString(com.tencent.mm.R.string.f490573yv));
                return false;
            }
        }
        com.tencent.mm.plugin.report.service.b1.f(4, 6);
        editSignatureUI.hideVKB();
        com.tencent.mm.ui.widget.dialog.u3 f18 = com.tencent.mm.ui.widget.dialog.u3.f(editSignatureUI.getContext(), editSignatureUI.getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
        v14.g gVar = (v14.g) pf5.z.f353948a.a(editSignatureUI).a(v14.g.class);
        gVar.getClass();
        kotlin.jvm.internal.o.g(sig, "sig");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = gVar.f432543d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gVar.f432543d = f18;
        gVar.f432544e = sig;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new e21.s(sig, 2));
        return true;
    }
}
