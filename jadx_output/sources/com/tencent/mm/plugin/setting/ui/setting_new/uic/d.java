package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class d extends a24.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.l
    public in5.s T6() {
        return new in5.s() { // from class: com.tencent.mm.plugin.setting.ui.setting_new.uic.PrefSettingListUIC$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                boolean z17 = true;
                if (type == 1) {
                    return new t24.r();
                }
                if (type == 2) {
                    return new t24.y();
                }
                if (type == 5) {
                    return new t24.d();
                }
                if (type == 6) {
                    return new t24.a();
                }
                if (type == 7) {
                    return new t24.c();
                }
                int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
                if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
                    z17 = false;
                }
                if (z17) {
                    throw new java.lang.IllegalArgumentException("MicroMsg.SettingListUIC buildItemCoverts is error. msg:other type");
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingListUIC", "buildItemCoverts is error. msg:other type");
                return new in5.r();
            }
        };
    }

    @Override // a24.l, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        super.onCreate(bundle);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new com.tencent.mm.plugin.setting.ui.setting_new.uic.c(this));
    }
}
