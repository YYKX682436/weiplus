package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public final class h4 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI f161095b;

    public h4(boolean z17, com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        this.f161094a = z17;
        this.f161095b = settingManageFindMoreDetailUI;
    }

    @Override // wd0.p1
    public void a() {
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI activity = this.f161095b;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(w24.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        w24.l T6 = ((w24.k) a17).T6("ITEM_KEY_IS_SHOW");
        w24.w wVar = T6 instanceof w24.w ? (w24.w) T6 : null;
        boolean z17 = this.f161094a;
        if (wVar != null) {
            wVar.b(!z17);
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.U6(activity, !z17);
    }

    @Override // wd0.p1
    public void onSuccess() {
        c01.z1.j();
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f161095b;
        boolean z17 = this.f161094a;
        settingManageFindMoreDetailUI.a7(z17, 2097152L, 50);
        settingManageFindMoreDetailUI.f160230p.put(3, java.lang.Integer.valueOf(z17 ? 1 : 0));
    }
}
