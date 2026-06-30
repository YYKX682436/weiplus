package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class b6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.g6 f191529d;

    public b6(com.tencent.mm.pluginsdk.ui.tools.g6 g6Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f191529d = g6Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.pluginsdk.ui.tools.g6 g6Var = this.f191529d;
        com.tencent.mm.pluginsdk.ui.tools.x3 x3Var = g6Var.f191645b;
        boolean z17 = x3Var.f191998u;
        android.app.Activity activity = g6Var.f191644a;
        if (!z17) {
            com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
            g4Var.h(0, activity.getString(com.tencent.mm.R.string.hof), com.tencent.mm.R.raw.icons_filled_share, activity.getResources().getColor(com.tencent.mm.R.color.f478502m));
        }
        boolean Di = ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di();
        boolean z18 = x3Var.f191989l;
        if (Di && z18 && x3Var.f191992o) {
            com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr2 = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
            com.tencent.mm.plugin.multitask.s0 s0Var = com.tencent.mm.plugin.multitask.s0.f150501a;
            jk3.v vVar = x3Var.f191978a;
            g4Var.h(8, s0Var.f(activity, vVar.f300077a), s0Var.e(vVar.f300077a), activity.getResources().getColor(com.tencent.mm.R.color.agw));
        }
        if (g6Var.f191647d != null) {
            com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr3 = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
            g4Var.h(1, activity.getString(com.tencent.mm.R.string.ho_), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
        }
        jz5.g gVar = g6Var.f191654k;
        if (!((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() && x3Var.f191996s) {
            com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr4 = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
            g4Var.h(2, activity.getString(com.tencent.mm.R.string.ocl), com.tencent.mm.R.drawable.icon_qqbrowser, 0);
        }
        if (z18 && !x3Var.f191997t && !((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr5 = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
            g4Var.h(6, activity.getString(com.tencent.mm.R.string.hoc), com.tencent.mm.R.raw.icons_filled_otherapp, activity.getResources().getColor(com.tencent.mm.R.color.f478496g));
        }
        if (((d73.i) i95.n0.c(d73.i.class)).Qg() && x3Var.f191980c != null) {
            com.tencent.mm.plugin.handoff.model.HandOffFile.Companion.getClass();
            if (com.tencent.mm.plugin.handoff.model.AbsHandOffFile.Companion.a(x3Var.f191981d)) {
                com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr6 = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
                g4Var.h(3, activity.getString(com.tencent.mm.R.string.cff), com.tencent.mm.R.raw.icons_outlined_colorful_handoff, 0);
            }
        }
        if (!x3Var.f191986i || ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr7 = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
        g4Var.h(4, activity.getString(com.tencent.mm.R.string.cfg), com.tencent.mm.R.raw.icons_filled_colorful_other_device, 0);
    }
}
