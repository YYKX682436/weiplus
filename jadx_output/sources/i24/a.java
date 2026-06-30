package i24;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f288081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineRecentShow f288082e;

    public a(android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineRecentShow settingActivityItemTimelineRecentShow) {
        this.f288081d = linearLayout;
        this.f288082e = settingActivityItemTimelineRecentShow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object tag = this.f288081d.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type android.app.Dialog");
        ((android.app.Dialog) tag).dismiss();
        this.f288082e.s7();
    }
}
