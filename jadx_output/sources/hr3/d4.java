package hr3;

/* loaded from: classes8.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.o f283470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, com.tencent.mm.contact.o oVar) {
        super(2);
        this.f283469d = contactMoreInfoUIWxContact;
        this.f283470e = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g((java.util.List) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.V6(this.f283469d, this.f283470e, 42);
        return jz5.f0.f302826a;
    }
}
