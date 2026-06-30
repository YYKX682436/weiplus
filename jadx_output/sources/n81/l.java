package n81;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f335624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17) {
        super(1);
        this.f335624d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n81.e it = (n81.e) obj;
        kotlin.jvm.internal.o.g(it, "it");
        n81.p pVar = n81.p.f335628a;
        int i17 = it.f335616c;
        return java.lang.Boolean.valueOf((this.f335624d & (i17 != 4 ? i17 != 7 ? 2 : 8 : 4)) != 0);
    }
}
