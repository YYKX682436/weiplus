package vd2;

/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.a2 f435996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(vd2.a2 a2Var) {
        super(0);
        this.f435996d = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.n nVar;
        java.util.ArrayList arrayList;
        if (this.f435996d.f435643a == null || (nVar = dk2.ef.H) == null || (arrayList = nVar.f309153e) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.m mVar = ((km2.t) it.next()).f309222d;
            if (mVar != null) {
                arrayList2.add(mVar);
            }
        }
        return arrayList2;
    }
}
