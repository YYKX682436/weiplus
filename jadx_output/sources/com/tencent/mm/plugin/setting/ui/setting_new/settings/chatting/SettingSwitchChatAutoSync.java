package com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/chatting/SettingSwitchChatAutoSync;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchChatAutoSync extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public boolean f161902h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchChatAutoSync(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        this.f161902h = ((java.lang.Boolean) m17).booleanValue();
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Chatting_ChatAutoSync";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatting.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchGallerySearch.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p7p;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatting.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: p7 */
    public java.lang.Integer getF161949q() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.string.p7q);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        return getActivity().getIntent().getIntExtra("activity_caller_params", 0) != 1;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new e24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161902h() {
        return this.f161902h;
    }
}
