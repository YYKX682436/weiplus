package hr3;

/* loaded from: classes5.dex */
public final class yd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiPictureUI f284212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(com.tencent.mm.plugin.profile.ui.SayHiPictureUI sayHiPictureUI) {
        super(0);
        this.f284212d = sayHiPictureUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f284212d.getIntent().getStringExtra("Contact_User");
        return stringExtra == null ? "" : stringExtra;
    }
}
