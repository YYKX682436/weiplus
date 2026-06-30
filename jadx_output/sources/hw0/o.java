package hw0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.p f285476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hw0.p pVar) {
        super(0);
        this.f285476d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ov0.e eVar = ov0.e.f349125e;
        hw0.p pVar = this.f285476d;
        return java.lang.Float.valueOf(pVar.I(eVar) - pVar.I(ov0.e.f349126f));
    }
}
