package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupNoPwdItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupNoPwdItem extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupNoPwdItem(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return "";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_NoPwd";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupPasswordItem.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p_1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        return ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri() ? getString(com.tencent.mm.R.string.p9n) : getString(com.tencent.mm.R.string.p9m);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        if (com.tencent.mm.ui.bk.A() || c01.z1.x()) {
            return false;
        }
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        return ((is.f) r0Var).bj(r17);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, q14.d.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupNoPwdItem", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupNoPwdItem", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
