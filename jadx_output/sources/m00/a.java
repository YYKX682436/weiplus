package m00;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar) {
        super(1);
        this.f322526d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List allAddress = (java.util.List) obj;
        kotlin.jvm.internal.o.g(allAddress, "allAddress");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allAddress, 10));
        java.util.Iterator it = allAddress.iterator();
        while (it.hasNext()) {
            arrayList.add(m00.g.a((s71.b) it.next()));
        }
        this.f322526d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
        return jz5.f0.f302826a;
    }
}
