package so5;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.y f410917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(so5.y yVar, int i17) {
        super(0);
        this.f410917d = yVar;
        this.f410918e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so5.t tVar = this.f410917d.f410930q[this.f410918e];
        so5.r rVar = tVar instanceof so5.r ? (so5.r) tVar : null;
        if (rVar != null) {
            return rVar.f410907b;
        }
        return null;
    }
}
