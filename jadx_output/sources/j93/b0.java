package j93;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.g0 f298360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j93.g0 g0Var) {
        super(0);
        this.f298360d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f298360d.getIntent().getStringExtra("label_id");
    }
}
