package gk5;

/* loaded from: classes9.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.v0 f272719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(gk5.v0 v0Var) {
        super(0);
        this.f272719d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f272719d.getIntent().getStringExtra("received_card_name");
        return stringExtra == null ? "" : stringExtra;
    }
}
