package va2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va2.f f434234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(va2.f fVar) {
        super(0);
        this.f434234d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f434234d.getIntent().getBooleanExtra("KEY_IS_HIGH_LIGHT_TOPIC", false));
    }
}
