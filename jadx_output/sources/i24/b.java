package i24;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f288083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineRecentShow f288084e;

    public b(android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineRecentShow settingActivityItemTimelineRecentShow) {
        this.f288083d = linearLayout;
        this.f288084e = settingActivityItemTimelineRecentShow;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        android.widget.LinearLayout linearLayout = this.f288083d;
        int childCount = linearLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = linearLayout.getChildAt(i17);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.widget.TextView");
            android.widget.TextView textView = (android.widget.TextView) childAt;
            if (com.tencent.mm.R.id.f487334ob5 != textView.getId()) {
                textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.tencent.mm.R.string.f489843db));
                textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_off, 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) v17;
        textView2.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        v17.setContentDescription(((java.lang.Object) textView2.getText()) + v17.getContext().getString(com.tencent.mm.R.string.d_));
        r45.cb6 cb6Var = new r45.cb6();
        p94.j0 c17 = p94.w0.c();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineRecentShow settingActivityItemTimelineRecentShow = this.f288084e;
        if (c17 != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(settingActivityItemTimelineRecentShow.f161943u);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingActivityItemTimelineRecentShow", "on recent item click, userinof is null, selfName:" + settingActivityItemTimelineRecentShow.f161943u);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        if (intValue == 0) {
            if (settingActivityItemTimelineRecentShow.f161942t == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 4);
            }
            settingActivityItemTimelineRecentShow.f161938p = false;
            settingActivityItemTimelineRecentShow.f161939q = true;
            settingActivityItemTimelineRecentShow.f161941s = false;
            settingActivityItemTimelineRecentShow.f161940r = true;
        } else if (intValue == 1) {
            if (settingActivityItemTimelineRecentShow.f161942t == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 5);
            }
            settingActivityItemTimelineRecentShow.f161938p = true;
            settingActivityItemTimelineRecentShow.f161939q = false;
            settingActivityItemTimelineRecentShow.f161941s = false;
            settingActivityItemTimelineRecentShow.f161940r = true;
        } else if (intValue != 3) {
            if (settingActivityItemTimelineRecentShow.f161942t == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14090, 6);
            }
            settingActivityItemTimelineRecentShow.f161938p = false;
            settingActivityItemTimelineRecentShow.f161939q = false;
            settingActivityItemTimelineRecentShow.f161941s = false;
            settingActivityItemTimelineRecentShow.f161940r = true;
        } else {
            settingActivityItemTimelineRecentShow.f161938p = false;
            settingActivityItemTimelineRecentShow.f161939q = false;
            settingActivityItemTimelineRecentShow.f161941s = true;
            settingActivityItemTimelineRecentShow.f161940r = true;
        }
        if (p94.w0.c() != null) {
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).K1(settingActivityItemTimelineRecentShow.f161943u, settingActivityItemTimelineRecentShow.f161938p, settingActivityItemTimelineRecentShow.f161939q, settingActivityItemTimelineRecentShow.f161940r, settingActivityItemTimelineRecentShow.f161941s);
        }
        if (p94.w0.c() != null) {
            r45.cb6 W0 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).W0(settingActivityItemTimelineRecentShow.f161943u, settingActivityItemTimelineRecentShow.f161938p, settingActivityItemTimelineRecentShow.f161939q, settingActivityItemTimelineRecentShow.f161940r, settingActivityItemTimelineRecentShow.f161941s);
            if (W0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingActivityItemTimelineRecentShow", "before oplog, userinof is null, selfName:" + settingActivityItemTimelineRecentShow.f161943u);
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingActivityItemTimelineRecentShow", "before oplog, userinof is not null, selfName:" + settingActivityItemTimelineRecentShow.f161943u);
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, W0));
        }
        v17.post(new i24.a(linearLayout, settingActivityItemTimelineRecentShow));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
