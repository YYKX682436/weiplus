package hr3;

/* loaded from: classes8.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f284000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(0);
        this.f284000d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f284000d.getIntent().getStringExtra("Contact_Search_Mobile");
    }
}
