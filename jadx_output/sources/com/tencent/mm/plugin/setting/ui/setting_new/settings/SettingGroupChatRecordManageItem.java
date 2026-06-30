package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupChatRecordManageItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupChatRecordManageItem extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f161878p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f161879q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f161880r;

    /* renamed from: s, reason: collision with root package name */
    public int f161881s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.b f161882t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupChatRecordManageItem(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161881s = 8;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".backupui.BackupChooseBackupModeUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "backup";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_ChatRecordManage";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupVideo.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p7v;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    /* renamed from: i7, reason: from getter */
    public android.graphics.drawable.Drawable getF161880r() {
        return this.f161880r;
    }

    @Override // a24.i
    /* renamed from: k7, reason: from getter */
    public int getF161881s() {
        return this.f161881s;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // a24.i
    /* renamed from: n7, reason: from getter */
    public java.lang.String getF161878p() {
        return this.f161878p;
    }

    @Override // a24.i
    /* renamed from: o7, reason: from getter */
    public java.lang.Integer getF161879q() {
        return this.f161879q;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
        if (this.f161882t == null) {
            this.f161882t = new d24.t0(this);
        }
        com.tencent.mm.plugin.setting.ui.setting.b bVar = this.f161882t;
        if (bVar != null) {
            gVar.c(bVar);
        } else {
            kotlin.jvm.internal.o.o("backupStatusProvider");
            throw null;
        }
    }
}
