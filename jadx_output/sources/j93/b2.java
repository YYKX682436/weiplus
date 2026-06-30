package j93;

/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.e2 f298362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(j93.e2 e2Var) {
        super(0);
        this.f298362d = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f298362d.getIntent().getStringExtra("label_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
