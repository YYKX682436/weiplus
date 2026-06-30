package te2;

/* loaded from: classes3.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(te2.p1 p1Var, int i17) {
        super(0);
        this.f418487d = p1Var;
        this.f418488e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        te2.p1 p1Var = this.f418487d;
        bm2.m mVar = p1Var.f418291i;
        if (mVar != null) {
            mVar.b(false);
        }
        bm2.m mVar2 = p1Var.f418291i;
        if (mVar2 != null) {
            mVar2.notifyItemRangeInserted(this.f418488e, 1);
        }
        return jz5.f0.f302826a;
    }
}
