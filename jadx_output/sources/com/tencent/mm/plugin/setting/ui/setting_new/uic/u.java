package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class u extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f162021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long c17 = c01.id.c();
        this.f162021d = c17;
        u24.n.a(c17);
        android.content.Intent intent = getActivity().getIntent();
        java.lang.String stringExtra = intent.getStringExtra("page_name_kv");
        if (stringExtra == null) {
            stringExtra = "SettingGroup_Main";
        }
        java.lang.String str = stringExtra;
        int intExtra = intent.getIntExtra("ui_version", 2);
        int intExtra2 = intent.getIntExtra("setting_from_source", 2);
        int intExtra3 = intent.getIntExtra("setting_level", 1);
        java.lang.String b17 = u24.n.b();
        intent.putExtra("page_name_kv", str);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        if (aVar.Zi(getActivity()) <= 0) {
            aVar.Zj(getActivity(), com.tencent.mm.plugin.appbrand.jsapi.wccoin.u.CTRL_INDEX);
        }
        if (aVar.aj(getActivity()) == null) {
            aVar.dk(getActivity(), str);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.Integer REPORT_RULE = b24.a.f17394a;
        kotlin.jvm.internal.o.f(REPORT_RULE, "REPORT_RULE");
        aVar.ik(activity, 44, REPORT_RULE.intValue());
        aVar.Ai(getActivity(), new com.tencent.mm.plugin.setting.ui.setting_new.uic.t(str, intExtra, intExtra2, intExtra3, b17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        long j17 = this.f162021d;
        java.lang.Long l17 = u24.n.f424131b;
        if (l17 != null && j17 == l17.longValue()) {
            u24.n.f424130a = null;
        }
    }
}
