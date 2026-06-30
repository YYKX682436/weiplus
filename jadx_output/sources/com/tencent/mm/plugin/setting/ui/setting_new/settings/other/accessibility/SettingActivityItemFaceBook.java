package com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/other/accessibility/SettingActivityItemFaceBook;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityItemFaceBook extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemFaceBook(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.f
    public java.lang.String C7() {
        return "facebookapp";
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        super.G7(context, intent);
        intent.putExtra("Contact_User", "facebookapp");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.ContactInfoUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return com.google.android.gms.common.Scopes.PROFILE;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other_Accessibility_FaceBook";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupAccessibilityItem.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemReaderAppNews.class);
    }

    @Override // a24.i
    public java.lang.String c7() {
        java.lang.String f27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("facebookapp", true).f2();
        kotlin.jvm.internal.o.f(f27, "getDisplayNick(...)");
        return f27;
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return -1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupAccessibilityItem.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        return !com.tencent.mm.sdk.platformtools.f9.MeSetSecurityFacebook.h() && (c01.z1.n() & 8192) == 0;
    }
}
