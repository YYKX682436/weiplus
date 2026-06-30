package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129617d;

    public p3(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        this.f129617d = finderCreateContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "doClick create contact btn");
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129617d;
        int intExtra = finderCreateContactUI.getIntent().getIntExtra("KEY_ENTRANCE_TYPE", 0);
        long longExtra = finderCreateContactUI.getIntent().getLongExtra("KEY_ENTRANCE_ID", 0L);
        if (intExtra > 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.qd((zy2.zb) c17, 20, intExtra, longExtra, null, 8, null);
        }
        if (finderCreateContactUI.f128541p0 != null) {
            com.tencent.mm.plugin.finder.assist.w5 w5Var = com.tencent.mm.plugin.finder.assist.w5.f102652d;
            androidx.appcompat.app.AppCompatActivity context = finderCreateContactUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (!w5Var.c(context, 1, new com.tencent.mm.plugin.finder.ui.o3(finderCreateContactUI))) {
                com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "doClick create contact btn,bind phone return");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "doClick create contact btn,prepareResp = null");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderCreateButtonClickStruct finderCreateButtonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCreateButtonClickStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderCreateButtonClickStruct.f56693d = finderCreateButtonClickStruct.b("SessionId", Ri, true);
        finderCreateButtonClickStruct.f56701l = finderCreateContactUI.V;
        java.lang.String string = finderCreateContactUI.getResources().getString(com.tencent.mm.R.string.a6x);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = finderCreateContactUI.getResources().getString(com.tencent.mm.R.string.er6);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = finderCreateContactUI.getResources().getString(com.tencent.mm.R.string.f493086iy4);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = finderCreateContactUI.getResources().getString(com.tencent.mm.R.string.iqg);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        com.tencent.mm.plugin.finder.ui.a3 a3Var = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
        java.lang.String str4 = finderCreateContactUI.F;
        if (str4 == null) {
            str4 = "";
        }
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1 = str4;
        android.widget.EditText editText = finderCreateContactUI.f128546w;
        if (editText == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        android.text.Editable text = editText.getText();
        if (text == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.J1 = str;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.S1 = ((com.tencent.mm.ui.widget.MMSwitchBtn) ((jz5.n) finderCreateContactUI.A1).getValue()).f211363x;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (com.tencent.mm.ui.tools.v4.f(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.J1) > finderCreateContactUI.f128548x0) {
            arrayList2.add(string2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1.length() == 0) {
            arrayList3.add(string);
        } else {
            finderCreateButtonClickStruct.f56697h = 1L;
        }
        if (com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.J1.length() == 0) {
            arrayList3.add(string2);
        } else {
            finderCreateButtonClickStruct.f56698i = 1L;
        }
        if (!finderCreateContactUI.D1) {
            if (com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.K1.length() == 0) {
                arrayList3.add(string3);
            } else {
                finderCreateButtonClickStruct.f56699j = 1L;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.P1)) {
                arrayList3.add(string4);
            } else {
                finderCreateButtonClickStruct.f56700k = 1L;
            }
        }
        if (!arrayList2.isEmpty()) {
            str2 = "android/view/View$OnClickListener";
            str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
            java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, finderCreateContactUI.getString(com.tencent.mm.R.string.f491349cu1));
            java.lang.String string5 = finderCreateContactUI.getString(com.tencent.mm.R.string.d0z, c18);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string5, null, null, 6, null);
            finderCreateButtonClickStruct.f56694e = 2L;
            finderCreateButtonClickStruct.f56695f = 1L;
            finderCreateButtonClickStruct.f56696g = finderCreateButtonClickStruct.b("FailReasonWording", finderCreateContactUI.getString(com.tencent.mm.R.string.d0z, c18), true);
        } else if (arrayList3.isEmpty()) {
            android.widget.CheckBox checkBox = finderCreateContactUI.S;
            if (checkBox == null) {
                kotlin.jvm.internal.o.o("tipsCheckCB");
                throw null;
            }
            if (checkBox.isChecked()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 31L, 1L);
                com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "createContact avatarPath " + finderCreateContactUI.F + " length=" + (com.tencent.mm.vfs.w6.k(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1) / 1024), com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1);
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1);
                int k17 = (int) com.tencent.mm.vfs.w6.k(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1);
                java.lang.String a17 = a3Var.a(p17, k17);
                java.lang.String str5 = (java.lang.String) com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.U1.get(a17);
                if ((a17.length() == 0) || str5 == null) {
                    i95.m c19 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    cq.j1.j((cq.k) c19, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.I1, 1, (r18 & 4) != 0 ? null : p17, (r18 & 8) != 0 ? 0 : k17, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : new com.tencent.mm.plugin.finder.ui.d3(finderCreateContactUI), (r18 & 64) != 0 ? null : new com.tencent.mm.plugin.finder.ui.f3(finderCreateContactUI));
                } else {
                    finderCreateContactUI.g7(str5);
                }
                str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
                str2 = "android/view/View$OnClickListener";
                finderCreateContactUI.U = db5.e1.Q(finderCreateContactUI, "", finderCreateContactUI.getString(com.tencent.mm.R.string.f490552yb), false, true, null);
                finderCreateButtonClickStruct.f56694e = 1L;
            } else {
                str2 = "android/view/View$OnClickListener";
                str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
                com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "not check agreement");
                java.lang.String string6 = finderCreateContactUI.getString(com.tencent.mm.R.string.ckk);
                kotlin.jvm.internal.o.f(string6, "getString(...)");
                com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string6, null, null, 6, null);
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(finderCreateContactUI, com.tencent.mm.R.anim.f477737y);
                android.view.View view2 = finderCreateContactUI.Q;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("tipsContainer");
                    throw null;
                }
                view2.startAnimation(loadAnimation);
                finderCreateButtonClickStruct.f56694e = 2L;
                finderCreateButtonClickStruct.f56695f = 3L;
                finderCreateButtonClickStruct.f56696g = finderCreateButtonClickStruct.b("FailReasonWording", finderCreateContactUI.getString(com.tencent.mm.R.string.ckk), true);
            }
        } else {
            str2 = "android/view/View$OnClickListener";
            str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "empty attr " + arrayList3);
            java.lang.String c110 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList3, finderCreateContactUI.getString(com.tencent.mm.R.string.f491349cu1));
            java.lang.String string7 = finderCreateContactUI.getString(com.tencent.mm.R.string.d0y, c110);
            kotlin.jvm.internal.o.f(string7, "getString(...)");
            com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string7, null, null, 6, null);
            finderCreateButtonClickStruct.f56694e = 2L;
            finderCreateButtonClickStruct.f56695f = 2L;
            finderCreateButtonClickStruct.f56696g = finderCreateButtonClickStruct.b("FailReasonWording", finderCreateContactUI.getString(com.tencent.mm.R.string.d0y, c110), true);
        }
        finderCreateButtonClickStruct.k();
        java.lang.String n17 = finderCreateButtonClickStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "report19815 ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.c7(finderCreateContactUI, 1);
        yj0.a.h(this, str3, str2, "onClick", "(Landroid/view/View;)V");
    }
}
