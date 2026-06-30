package te2;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(te2.p1 p1Var) {
        super(0);
        this.f418217d = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.m mVar = this.f418217d.f418291i;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
