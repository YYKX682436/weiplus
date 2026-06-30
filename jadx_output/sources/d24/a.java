package d24;

/* loaded from: classes.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom f225899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225901c;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom settingAdditionBottom, android.content.Context context, java.lang.String str) {
        this.f225899a = settingAdditionBottom;
        this.f225900b = context;
        this.f225901c = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MircoMsg.SettingAdditionBottom", "OpenLiteApp fail");
        this.f225899a.y7(this.f225900b, this.f225901c);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MircoMsg.SettingAdditionBottom", "OpenLiteApp success");
    }
}
