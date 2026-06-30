package of;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.m f344841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(of.m mVar) {
        super(0);
        this.f344841d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = this.f344841d.f344842a;
        kotlin.jvm.internal.o.d(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = ((of.i) it.next()).f344836e;
            kotlin.jvm.internal.o.d(num);
            arrayList.add(java.lang.Integer.valueOf(num.intValue()));
        }
        return java.lang.Integer.valueOf(kz5.n0.I0(arrayList));
    }
}
