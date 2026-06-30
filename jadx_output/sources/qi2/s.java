package qi2;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.v f363620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qi2.v vVar) {
        super(1);
        this.f363620d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        qi2.v vVar = this.f363620d;
        vVar.I(vVar.f363639u, false);
        vVar.f363638t = intValue;
        vVar.J();
        vVar.E();
        return jz5.f0.f302826a;
    }
}
