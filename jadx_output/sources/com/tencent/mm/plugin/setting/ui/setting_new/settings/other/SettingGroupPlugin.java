package com.tencent.mm.plugin.setting.ui.setting_new.settings.other;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/other/SettingGroupPlugin;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupPlugin extends s24.f {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f161965p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f161966q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f161967r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f161968s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f161969t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Integer f161970u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupPlugin(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161965p = "";
        this.f161966q = java.lang.Integer.valueOf(com.tencent.mm.R.raw.welab_icon_grey);
        this.f161967r = "plugin";
        rn3.i.Di().k(this);
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF161967r() {
        return this.f161967r;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF161968s() {
        return this.f161968s;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF161966q() {
        return this.f161966q;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF161969t() {
        return this.f161969t;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF161970u() {
        return this.f161970u;
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f161968s = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f161966q = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f161969t = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f161970u = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other_Plugin";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupOther.class);
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p8_;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 1;
    }

    @Override // a24.i
    /* renamed from: n7, reason: from getter */
    public java.lang.String getF161965p() {
        return this.f161965p;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f161965p = v24.s0.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    @Override // a24.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r7(android.content.Context r9, android.view.View r10, int r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupPlugin.r7(android.content.Context, android.view.View, int):void");
    }

    @Override // s24.f, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        super.y(z17);
        if (!z17) {
            this.f161966q = java.lang.Integer.valueOf(com.tencent.mm.R.raw.welab_icon_grey);
        }
        w7();
        return true;
    }
}
