package s14;

/* loaded from: classes3.dex */
public final class b extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI f402142d;

    public b(com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI baseSettingPermissionUI) {
        this.f402142d = baseSettingPermissionUI;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initDesc$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f61522d = 101L;
        userPrivacySettingClientReportStruct.k();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.g(this.f402142d);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initDesc$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f402142d.getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5));
    }
}
