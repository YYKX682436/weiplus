package hr3;

/* loaded from: classes8.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f284132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(0);
        this.f284132d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f284132d.getIntent().getIntExtra("Contact_Scene", 9));
    }
}
