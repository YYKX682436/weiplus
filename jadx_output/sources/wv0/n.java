package wv0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv0.q f449925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wv0.q qVar) {
        super(2);
        this.f449925d = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sv0.j sortAdapter;
        sv0.j sortAdapter2;
        int intValue = ((java.lang.Number) obj).intValue();
        vv0.n data = (vv0.n) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        wv0.q qVar = this.f449925d;
        sortAdapter = qVar.getSortAdapter();
        sortAdapter.unselectAll();
        sortAdapter2 = qVar.getSortAdapter();
        sortAdapter2.z(intValue, data);
        yz5.l onSegmentClicked = qVar.getOnSegmentClicked();
        if (onSegmentClicked != null) {
            onSegmentClicked.invoke(data.f440398a);
        }
        return jz5.f0.f302826a;
    }
}
