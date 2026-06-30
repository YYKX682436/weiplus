package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupOther;", "Ls24/e;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupOther extends s24.e {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f161886p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f161887q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f161888r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f161889s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f161890t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupOther(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161887q = "other_function";
        rn3.i.Di().k(this);
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF161887q() {
        return this.f161887q;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF161888r() {
        return this.f161888r;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF161886p() {
        return this.f161886p;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF161889s() {
        return this.f161889s;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF161890t() {
        return this.f161890t;
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f161888r = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f161886p = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f161889s = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f161890t = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatRecordManageItem.class);
    }

    @Override // s24.e, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p_h;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // s24.e, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        super.r7(context, itemView, i17);
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        if (Di != null) {
            Di.a(58);
        }
    }

    @Override // s24.f, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}
