package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class r extends a24.l {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f162013e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162014f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f162015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f162015g = new java.util.ArrayList();
    }

    @Override // a24.l
    public in5.s T6() {
        return new in5.s() { // from class: com.tencent.mm.plugin.setting.ui.setting_new.uic.SearchListUIC$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.setting.ui.setting_new.uic.r rVar = com.tencent.mm.plugin.setting.ui.setting_new.uic.r.this;
                return new t24.u(new com.tencent.mm.plugin.setting.ui.setting_new.uic.o(rVar), new com.tencent.mm.plugin.setting.ui.setting_new.uic.p(rVar));
            }
        };
    }

    @Override // a24.l, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.plugin.setting.ui.setting_new.uic.q(this));
        }
    }
}
