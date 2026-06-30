package vu0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.s f440125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vu0.s sVar) {
        super(0);
        this.f440125d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vu0.s sVar = this.f440125d;
        pp0.s0 s0Var = sVar.f440149a;
        if (s0Var == null) {
            return null;
        }
        return new su0.j(s0Var, sVar.f440151c);
    }
}
