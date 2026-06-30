package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.BaseLifeUI f152319d;

    public f(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI) {
        this.f152319d = baseLifeUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        r45.d64 d64Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            v();
            return;
        }
        int i17 = com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.U;
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152319d;
        baseLifeUI.W6(8);
        int i18 = baseLifeUI.N;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "block by autoQueryInterval: %d", java.lang.Integer.valueOf(i18));
            return;
        }
        if (baseLifeUI.f152241q != null) {
            c01.d9.e().d(baseLifeUI.f152241q);
            baseLifeUI.f152241q = null;
        }
        if (((java.util.ArrayList) baseLifeUI.f152243s).size() > 0) {
            d64Var = (r45.d64) ((java.util.ArrayList) baseLifeUI.f152243s).get(0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "empty lbslist");
            d64Var = new r45.d64();
        }
        baseLifeUI.f152242r = 0;
        com.tencent.mm.plugin.nearlife.ui.a aVar = baseLifeUI.f152235h;
        if (str != null) {
            aVar.f152310r = str;
        } else {
            aVar.getClass();
        }
        baseLifeUI.f152241q = new dn3.k(1, baseLifeUI.L, d64Var.f372174d, d64Var.f372175e, d64Var.f372176f, d64Var.f372179i, d64Var.f372177g, d64Var.f372178h, null, baseLifeUI.I ? baseLifeUI.f152235h.f152310r : "", baseLifeUI.P, false, true, baseLifeUI.M);
        c01.d9.e().g(baseLifeUI.f152241q);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152319d;
        baseLifeUI.D = true;
        baseLifeUI.H.q(baseLifeUI.getString(baseLifeUI.M ? com.tencent.mm.R.string.f492617m22 : com.tencent.mm.R.string.h5s));
        baseLifeUI.I = true;
        baseLifeUI.f152235h.c();
        baseLifeUI.f152231d.setAdapter((android.widget.ListAdapter) baseLifeUI.f152235h);
        baseLifeUI.f152235h.notifyDataSetChanged();
        baseLifeUI.f152231d.b();
        baseLifeUI.f152233f.b(baseLifeUI.f152235h.f152311s);
        android.view.View view = baseLifeUI.f152232e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        baseLifeUI.f152231d.setOnTouchListener(new com.tencent.mm.plugin.nearlife.ui.e(this));
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.U6(baseLifeUI, baseLifeUI.f152235h);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        android.view.View view;
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152319d;
        baseLifeUI.I = false;
        baseLifeUI.f152231d.setAdapter((android.widget.ListAdapter) baseLifeUI.f152234g);
        baseLifeUI.f152234g.notifyDataSetChanged();
        baseLifeUI.f152233f.b(baseLifeUI.f152234g.f152311s);
        if (!baseLifeUI.f152234g.d() && (view = baseLifeUI.f152232e) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        baseLifeUI.f152231d.setOnTouchListener(null);
        baseLifeUI.W6(8);
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.U6(baseLifeUI, baseLifeUI.f152234g);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        dn3.k kVar;
        int i17 = com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.U;
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152319d;
        baseLifeUI.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((kVar = baseLifeUI.f152241q) == null || !str.equals(kVar.f242027g))) {
            baseLifeUI.W6(8);
            if (baseLifeUI.f152241q != null) {
                c01.d9.e().d(baseLifeUI.f152241q);
            }
            if (baseLifeUI.f152244t != null) {
                baseLifeUI.f152235h.c();
                com.tencent.mm.plugin.nearlife.ui.a aVar = baseLifeUI.f152235h;
                if (str != null) {
                    aVar.f152310r = str;
                } else {
                    aVar.getClass();
                }
                baseLifeUI.d7(false);
                baseLifeUI.f152231d.c();
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152319d;
        if (baseLifeUI.f152241q != null) {
            c01.d9.e().d(baseLifeUI.f152241q);
            baseLifeUI.f152241q = null;
        }
        baseLifeUI.f152235h.c();
        baseLifeUI.W6(8);
    }
}
