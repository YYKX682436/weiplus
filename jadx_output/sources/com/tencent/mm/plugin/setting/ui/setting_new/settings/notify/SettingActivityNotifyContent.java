package com.tencent.mm.plugin.setting.ui.setting_new.settings.notify;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingActivityNotifyContent;", "Ls24/c;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityNotifyContent extends s24.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityNotifyContent(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_Content";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite.class);
    }

    @Override // s24.c, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.ohd;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        return w14.d.f442234d.b();
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.notification.RepairerConfigNotificationAvatarSwitch()) == 1)) {
            if (!fp.h.c(26)) {
                return ip.b.s();
            }
            if (ip.b.s() && ip.b.u()) {
                return true;
            }
        }
        return false;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        android.content.Intent intent = new android.content.Intent(getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.jj.class);
        lk5.s.e(intent, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingActivityNotifyContent", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingActivityNotifyContent", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
