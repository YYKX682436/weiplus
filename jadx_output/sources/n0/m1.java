package n0;

/* loaded from: classes14.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.i3[] f333615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f333616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f333617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n0.i3[] i3VarArr, yz5.p pVar, int i17) {
        super(2);
        this.f333615d = i3VarArr;
        this.f333616e = pVar;
        this.f333617f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        n0.i3[] i3VarArr = this.f333615d;
        n0.i3[] i3VarArr2 = (n0.i3[]) java.util.Arrays.copyOf(i3VarArr, i3VarArr.length);
        int i17 = this.f333617f | 1;
        n0.n1.a(i3VarArr2, this.f333616e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
