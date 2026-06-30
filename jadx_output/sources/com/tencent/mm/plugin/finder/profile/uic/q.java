package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f124135d;

    public q(com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f124135d = o0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.bb bbVar;
        r45.bb bbVar2;
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f124135d;
        if (integer != 0) {
            java.lang.String string = req.getInteger(0) == 1 ? o0Var.getContext().getString(com.tencent.mm.R.string.oij) : o0Var.getContext().getString(com.tencent.mm.R.string.f1t);
            kotlin.jvm.internal.o.d(string);
            android.app.Activity context = o0Var.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_check_mark);
            e4Var.f211776c = string;
            e4Var.c();
            return;
        }
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(o0Var.getUsername());
        if (b17 != null) {
            if (req.getInteger(0) == 1) {
                r45.mz0 mz0Var = b17.field_privacyInfo;
                if (mz0Var != null && (bbVar2 = (r45.bb) mz0Var.getCustom(1)) != null) {
                    bbVar2.set(1, 1);
                }
            } else {
                r45.mz0 mz0Var2 = b17.field_privacyInfo;
                if (mz0Var2 != null && (bbVar = (r45.bb) mz0Var2.getCustom(1)) != null) {
                    bbVar.set(1, 2);
                }
            }
            gVar.o(b17);
        }
        java.lang.String string2 = req.getInteger(0) == 1 ? o0Var.getContext().getString(com.tencent.mm.R.string.ogs) : o0Var.getContext().getString(com.tencent.mm.R.string.f1s);
        kotlin.jvm.internal.o.d(string2);
        android.app.Activity context2 = o0Var.getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var2.b(com.tencent.mm.R.raw.icons_filled_check_mark);
        e4Var2.f211776c = string2;
        e4Var2.c();
    }
}
