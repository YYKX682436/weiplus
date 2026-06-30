package com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupMoreSafe;", "Ls24/e;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupMoreSafe extends s24.e {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f161892p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f161893q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f161894r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f161895s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f161896t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupMoreSafe(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161892p = "more_sec_setting";
        rn3.i.Di().k(this);
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF161892p() {
        return this.f161892p;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF161893q() {
        return this.f161893q;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF161896t() {
        return this.f161896t;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF161894r() {
        return this.f161894r;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF161895s() {
        return this.f161895s;
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f161893q = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f161896t = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f161894r = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f161895s = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_MoreSafe";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupLoggedDeviceItem.class);
    }

    @Override // s24.e, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.iti;
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

    @Override // s24.e, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f161896t = null;
        this.f161895s = null;
        this.f161894r = null;
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().j(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC);
        rn3.i.Di().a(52);
        super.r7(context, itemView, i17);
    }

    @Override // s24.f, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}
