package j93;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j93.j1 j1Var) {
        super(0);
        this.f298361d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f298361d.getIntent().getIntExtra("openMenuStyle", 21));
    }
}
