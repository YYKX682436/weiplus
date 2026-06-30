package df;

/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f229564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(df.w1 w1Var, yz5.a aVar) {
        super(0);
        this.f229564d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f229564d;
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            aVar.invoke();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new df.s1(aVar));
        }
        return jz5.f0.f302826a;
    }
}
