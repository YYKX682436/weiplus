package o50;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f343060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o50.j jVar) {
        super(0);
        this.f343060d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o50.j jVar = this.f343060d;
        java.lang.String stringExtra = jVar.getIntent().getStringExtra("Retr_ForwardXmlContent");
        if (stringExtra == null) {
            stringExtra = "";
        }
        co.a T6 = jVar.T6();
        T6.fromXml(stringExtra);
        T6.set(T6.f43702d + 6, java.lang.Boolean.valueOf(!((java.lang.Boolean) ((jz5.n) jVar.f343071h).getValue()).booleanValue()));
        return T6;
    }
}
