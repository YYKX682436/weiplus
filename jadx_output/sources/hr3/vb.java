package hr3;

/* loaded from: classes4.dex */
public final class vb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI f284110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI) {
        super(0);
        this.f284110d = openIMKefuProfileSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f284110d.getIntent().getStringExtra("kefu_username");
    }
}
