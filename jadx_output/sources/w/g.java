package w;

/* loaded from: classes16.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ qe2.b C;
    public final /* synthetic */ int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qe2.b bVar, int i17) {
        super(0);
        this.C = bVar;
        this.D = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.C.notifyItemChanged(this.D);
        return jz5.f0.f302826a;
    }
}
