package o24;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemAvatar f342455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemAvatar settingActivityItemAvatar) {
        super(1);
        this.f342455d = settingActivityItemAvatar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.imageview.WeImageView imageView = (com.tencent.mm.ui.widget.imageview.WeImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int h17 = i65.a.h(this.f342455d.getContext(), com.tencent.mm.R.dimen.f479714d7);
        layoutParams.width = h17;
        layoutParams.height = h17;
        imageView.setLayoutParams(layoutParams);
        ng5.a.a(imageView, c01.z1.r());
        return jz5.f0.f302826a;
    }
}
