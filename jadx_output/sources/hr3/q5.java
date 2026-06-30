package hr3;

/* loaded from: classes8.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f283911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr3.c f283912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, yz5.p pVar, pr3.c cVar) {
        super(0);
        this.f283910d = contactMoreInfoUIWxContact;
        this.f283911e = pVar;
        this.f283912f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.contact.o oVar = this.f283910d.f153697f;
        if (oVar != null) {
            this.f283911e.invoke(this.f283912f, oVar);
        }
        return jz5.f0.f302826a;
    }
}
