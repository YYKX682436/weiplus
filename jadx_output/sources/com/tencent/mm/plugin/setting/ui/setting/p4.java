package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class p4 implements wd0.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI f161422c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd0.o1 f161423d;

    public p4(boolean z17, int i17, com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, wd0.o1 o1Var) {
        this.f161420a = z17;
        this.f161421b = i17;
        this.f161422c = settingManageFindMoreDetailUI;
        this.f161423d = o1Var;
    }

    @Override // wd0.o1
    public void a() {
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI activity = this.f161422c;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(w24.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        w24.l T6 = ((w24.k) a17).T6("ITEM_KEY_IS_SHOW");
        w24.w wVar = T6 instanceof w24.w ? (w24.w) T6 : null;
        boolean z17 = this.f161420a;
        if (wVar != null) {
            wVar.b(!z17);
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.U6(activity, !z17);
        wd0.o1 o1Var = this.f161423d;
        if (o1Var != null) {
            o1Var.a();
        }
    }

    @Override // wd0.o1
    public void onSuccess() {
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f161422c;
        boolean z17 = this.f161420a;
        int i17 = this.f161421b;
        if (i17 == 3) {
            if (z17) {
                settingManageFindMoreDetailUI.a7(z17, 2097152L, 50);
            } else {
                settingManageFindMoreDetailUI.getClass();
                ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).wi();
                settingManageFindMoreDetailUI.a7(z17, 2097152L, 50);
            }
        } else if (i17 == 10) {
            com.tencent.mm.plugin.setting.ui.setting.x3 x3Var = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
            settingManageFindMoreDetailUI.Y6(z17);
        } else if (i17 == 11) {
            settingManageFindMoreDetailUI.a7(z17, 34359738368L, 57);
        } else if (i17 == 8) {
            com.tencent.mm.plugin.setting.ui.setting.x3 x3Var2 = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
            settingManageFindMoreDetailUI.a7(z17, 16777216L, 53);
        } else if (i17 == 7) {
            com.tencent.mm.plugin.setting.ui.setting.x3 x3Var3 = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
            settingManageFindMoreDetailUI.a7(z17, 8388608L, 52);
        } else if (i17 == 13) {
            com.tencent.mm.plugin.setting.ui.setting.x3 x3Var4 = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
            settingManageFindMoreDetailUI.a7(z17, 9007199254740992L, 65);
        }
        com.tencent.mm.plugin.setting.ui.setting.x3 x3Var5 = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
        if (i17 >= 0) {
            settingManageFindMoreDetailUI.f160230p.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 0));
        } else {
            settingManageFindMoreDetailUI.getClass();
        }
        wd0.o1 o1Var = this.f161423d;
        if (o1Var != null) {
            o1Var.onSuccess();
        }
    }
}
