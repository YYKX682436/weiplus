package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class vl implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI f161671d;

    public vl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI) {
        this.f161671d = settingsSelectBgUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI = this.f161671d;
        if (i17 == 0) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.T6(settingsSelectBgUI, -2);
            settingsSelectBgUI.f160655e.q();
            if (!settingsSelectBgUI.f160659i) {
                settingsSelectBgUI.setResult(-1);
                settingsSelectBgUI.finish();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.T6(settingsSelectBgUI, 0);
            settingsSelectBgUI.f160655e.q();
            if (!settingsSelectBgUI.f160659i) {
                settingsSelectBgUI.setResult(-1);
                settingsSelectBgUI.finish();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (!gm0.j1.u().l()) {
            dp.a.makeText(settingsSelectBgUI, com.tencent.mm.R.string.f493085iy3, 1).show();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        f21.i0 i0Var = (f21.i0) adapterView.getItemAtPosition(i17 - 2);
        if (i0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsSelectBgUI", "onItemClick fail, info is null, position = " + i17);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = i0Var.f258918f;
        if (i18 == 1 || i18 == 2) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.T6(settingsSelectBgUI, i0Var.f258913a);
            if (settingsSelectBgUI.f160659i) {
                i0Var.f258918f = 1;
                ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                f21.j0 Bi = f21.r0.Bi();
                Bi.getClass();
                Bi.m0(i0Var.f258919g);
                i0Var.f258918f = 1;
                Bi.P0(i0Var);
            } else {
                settingsSelectBgUI.f160655e.q();
            }
            if (!settingsSelectBgUI.f160659i) {
                settingsSelectBgUI.setResult(-1);
                settingsSelectBgUI.finish();
            }
        } else if (i18 == 3) {
            rz.o oVar = settingsSelectBgUI.f160657g;
            if (oVar != null && ((f21.f0) oVar).f258895f == i0Var.f258913a) {
                gm0.j1.d().d((com.tencent.mm.modelbase.m1) settingsSelectBgUI.f160657g);
                ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                f21.r0.Bi().L0(((f21.f0) settingsSelectBgUI.f160657g).f258895f, 1);
                settingsSelectBgUI.U6(settingsSelectBgUI.f160658h);
            }
            int i19 = i0Var.f258913a;
            java.util.List list = settingsSelectBgUI.f160658h;
            settingsSelectBgUI.getClass();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rz.o oVar2 = (rz.o) it.next();
                f21.f0 f0Var = (f21.f0) oVar2;
                if (f0Var.f258895f == i19) {
                    ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                    f21.r0.Bi().L0(f0Var.f258895f, 1);
                    arrayList2.remove(oVar2);
                    break;
                }
            }
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.j0 Bi2 = f21.r0.Bi();
            i0Var.f258918f = 4;
            Bi2.P0(i0Var);
            new com.tencent.mm.plugin.setting.ui.setting.ul(this, Bi2, i0Var.f258913a).sendEmptyMessageDelayed(0, 1000L);
        } else if (i18 == 4) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().L0(i0Var.f258913a, 1);
        } else if (i18 == 5) {
            if (settingsSelectBgUI.f160657g == null) {
                rz.n nVar = (rz.n) i95.n0.c(rz.n.class);
                int i27 = i0Var.f258913a;
                ((qz.c) nVar).getClass();
                settingsSelectBgUI.f160657g = new f21.f0(i27, 1);
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) settingsSelectBgUI.f160657g);
            } else {
                java.util.List list2 = settingsSelectBgUI.f160658h;
                rz.n nVar2 = (rz.n) i95.n0.c(rz.n.class);
                int i28 = i0Var.f258913a;
                ((qz.c) nVar2).getClass();
                ((java.util.ArrayList) list2).add(new f21.f0(i28, 1));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
