package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class i implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129665d;

    public i(com.tencent.mm.plugin.finder.ui.promotion.t tVar) {
        this.f129665d = tVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.Object obj2;
        r45.bi2 req = (r45.bi2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.plugin.finder.ui.promotion.t tVar = this.f129665d;
        tVar.f129691n.b();
        if (ret.getInteger(1) != 0) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = tVar.f129690m;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, false));
            android.app.Activity context = tVar.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = tVar.getContext().getString(com.tencent.mm.R.string.eo9);
            e4Var.b(com.tencent.mm.R.raw.toast_ok);
            e4Var.c();
            return;
        }
        boolean z17 = req.getInteger(0) == 2;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        if (tVar.f129701x) {
            tVar.S6();
            tVar.f129701x = false;
        } else {
            java.util.ArrayList arrayList = tVar.f129693p;
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else if (((com.tencent.mm.plugin.finder.ui.promotion.e) it.next()).f129658d.getBoolean(3)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 != -1) {
                ((com.tencent.mm.plugin.finder.ui.promotion.e) arrayList.get(i18)).f129658d.set(2, java.lang.Boolean.valueOf(z17));
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tVar.f129692o;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                wxRecyclerAdapter.notifyItemChanged(i18);
            }
        }
        if (req.getInteger(0) == 1) {
            android.app.Activity context2 = tVar.getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = tVar.getContext().getString(com.tencent.mm.R.string.njw);
            e4Var2.b(com.tencent.mm.R.raw.toast_ok);
            e4Var2.c();
        } else {
            android.app.Activity context3 = tVar.getContext();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context3);
            e4Var3.f211776c = tVar.getContext().getString(com.tencent.mm.R.string.njx);
            e4Var3.b(com.tencent.mm.R.raw.toast_ok);
            e4Var3.c();
        }
        java.util.Iterator it6 = ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).f453184q.entrySet().iterator();
        while (it6.hasNext()) {
            androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) ((java.util.Map.Entry) it6.next()).getValue();
            r45.fm2 fm2Var = (r45.fm2) j0Var.getValue();
            if (fm2Var != null) {
                java.util.LinkedList list = fm2Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getHelp_promotion_infos(...)");
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it7.next();
                        if (((r45.eb1) obj2).getBoolean(3)) {
                            break;
                        }
                    }
                }
                r45.eb1 eb1Var = (r45.eb1) obj2;
                if (eb1Var != null) {
                    eb1Var.set(2, java.lang.Boolean.valueOf(z17));
                    j0Var.postValue(fm2Var);
                }
            }
        }
    }
}
