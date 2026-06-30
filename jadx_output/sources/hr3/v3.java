package hr3;

/* loaded from: classes8.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f284097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(0);
        this.f284097d = contactMoreInfoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f284097d.getIntent().getStringExtra("Contact_Search_Mobile");
    }
}
