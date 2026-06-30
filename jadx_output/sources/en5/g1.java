package en5;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.util.ArrayList arrayList, yz5.l lVar) {
        super(1);
        this.f255417d = arrayList;
        this.f255418e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyColumn, "$this$LazyColumn");
        java.util.ArrayList arrayList = this.f255417d;
        e0.r0.b(LazyColumn, arrayList.size(), null, null, u0.j.c(1666582332, true, new en5.f1(arrayList, this.f255418e)), 6, null);
        return jz5.f0.f302826a;
    }
}
