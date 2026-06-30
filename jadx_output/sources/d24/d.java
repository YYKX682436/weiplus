package d24;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f225909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionHeaderSearch f225910e;

    public d(in5.s0 s0Var, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionHeaderSearch settingAdditionHeaderSearch) {
        this.f225909d = s0Var;
        this.f225910e = settingAdditionHeaderSearch;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionHeaderSearch$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map k17 = kz5.c1.k(new jz5.l("setting_sessionid", u24.n.b()), new jz5.l("ui_version", 2), new jz5.l("view_id", "setting_search_bar"));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.Integer REPORT_RULE = b24.a.f17394a;
        kotlin.jvm.internal.o.f(REPORT_RULE, "REPORT_RULE");
        ((cy1.a) rVar).Ej("view_clk", k17, REPORT_RULE.intValue());
        j45.l.j(this.f225909d.f293121e, "setting", ".ui.setting_new.SearchSettingsUI", new android.content.Intent().putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c())).putExtra("setting_from_source", this.f225910e.getActivity().getIntent().getIntExtra("setting_from_source", 2)), null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionHeaderSearch$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
