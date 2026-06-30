package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class y extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent = getActivity().getIntent();
        java.lang.String stringExtra = intent.getStringExtra("page_name_kv");
        if (stringExtra == null) {
            stringExtra = "SettingGroup_Main_HeaderSearch";
        }
        java.lang.String str = stringExtra;
        int intExtra = intent.getIntExtra("ui_version", 2);
        int intExtra2 = intent.getIntExtra("setting_from_source", 2);
        int intExtra3 = intent.getIntExtra("setting_level", 2);
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
        aVar.ik(activity, 12, REPORT_RULE.intValue());
        aVar.Ai(getActivity(), new com.tencent.mm.plugin.setting.ui.setting_new.uic.x(str, intExtra, intExtra2, intExtra3, b17));
    }
}
