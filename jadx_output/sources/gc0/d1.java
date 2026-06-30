package gc0;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.e1 f270123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gc0.e1 e1Var) {
        super(0);
        this.f270123d = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f270123d.f270142a.getIntent().getStringExtra("Contact_User");
        return stringExtra == null ? "" : stringExtra;
    }
}
