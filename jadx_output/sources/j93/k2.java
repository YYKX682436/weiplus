package j93;

/* loaded from: classes.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f298427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(j93.p2 p2Var) {
        super(0);
        this.f298427d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f298427d.getIntent().getStringExtra("label_id");
    }
}
