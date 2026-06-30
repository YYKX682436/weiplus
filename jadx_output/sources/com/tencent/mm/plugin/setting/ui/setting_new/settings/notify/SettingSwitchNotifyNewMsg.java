package com.tencent.mm.plugin.setting.ui.setting_new.settings.notify;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwitchNotifyNewMsg;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchNotifyNewMsg extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f161956h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f161957i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchNotifyNewMsg(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = true;
        this.f161956h = activity.getIntent().getStringExtra("HighLightCheckBoxPreference") != null;
        if (!fp.h.c(26)) {
            z17 = ip.b.s();
        } else if (!ip.b.s() || !ip.b.u()) {
            z17 = false;
        }
        this.f161957i = z17;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_NewMsg";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class, null);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.ohk;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f161957i = fp.h.c(26) ? ip.b.s() && ip.b.u() : ip.b.s();
    }

    @Override // s24.g
    public al5.c2 x7() {
        return new k24.n(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161957i() {
        return this.f161957i;
    }
}
