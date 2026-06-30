package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public abstract class f extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f310245g;

    public f(yz5.p pVar, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f310245g = pVar;
    }

    @Override // v26.g
    public java.lang.String toString() {
        return "block[" + this.f310245g + "] -> " + super.toString();
    }
}
