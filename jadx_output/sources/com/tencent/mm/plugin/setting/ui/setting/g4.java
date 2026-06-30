package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public final class g4 implements v24.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI f161066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f161067b;

    public g4(com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, boolean z17) {
        this.f161066a = settingManageFindMoreDetailUI;
        this.f161067b = z17;
    }

    @Override // v24.n0
    public boolean a() {
        return this.f161067b;
    }

    @Override // v24.n0
    public void b(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI activity = this.f161066a;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(w24.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        w24.l T6 = ((w24.k) a17).T6("ITEM_KEY_IS_SHOW");
        w24.w wVar = T6 instanceof w24.w ? (w24.w) T6 : null;
        if (wVar != null) {
            wVar.b(z17);
        }
    }
}
