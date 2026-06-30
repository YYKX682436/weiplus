package m50;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f323496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m50.x xVar) {
        super(0);
        this.f323496d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m50.x xVar = this.f323496d;
        java.lang.String stringExtra = xVar.getIntent().getStringExtra("Retr_Msg_view_model");
        if (stringExtra == null) {
            stringExtra = "";
        }
        co.a V6 = xVar.V6();
        V6.fromXml(stringExtra);
        return V6;
    }
}
