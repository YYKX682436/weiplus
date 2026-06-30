package j93;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j93.j1 j1Var) {
        super(0);
        this.f298537d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f298537d.getIntent().getBooleanExtra("key_forceLightMode", false));
    }
}
