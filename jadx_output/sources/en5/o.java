package en5;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.util.ArrayList arrayList, yz5.l lVar) {
        super(1);
        this.f255469d = arrayList;
        this.f255470e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.u0 LazyRow = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyRow, "$this$LazyRow");
        java.util.ArrayList arrayList = this.f255469d;
        e0.r0.b(LazyRow, arrayList.size(), null, null, u0.j.c(-1528827042, true, new en5.n(arrayList, this.f255470e)), 6, null);
        return jz5.f0.f302826a;
    }
}
