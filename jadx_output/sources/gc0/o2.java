package gc0;

/* loaded from: classes3.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(gc0.p2 p2Var) {
        super(0);
        this.f270234d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f270234d.getIntent().getStringExtra("Contact_User");
        return stringExtra == null ? "" : stringExtra;
    }
}
