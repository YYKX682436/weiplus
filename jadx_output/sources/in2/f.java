package in2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f292821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(in2.s sVar, in2.a1 a1Var) {
        super(2);
        this.f292820d = sVar;
        this.f292821e = a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        dk2.yg musicItem = (dk2.yg) obj2;
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        sf2.x xVar = this.f292820d.I;
        xVar.getClass();
        xVar.t7(musicItem);
        this.f292821e.notifyItemChanged(intValue);
        return jz5.f0.f302826a;
    }
}
