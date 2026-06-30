package fp0;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f265261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.p f265262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fp0.o oVar, fp0.p pVar) {
        super(0);
        this.f265261d = oVar;
        this.f265262e = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        fp0.o oVar = this.f265261d;
        java.util.LinkedList linkedList = oVar.f265272d;
        boolean z18 = linkedList instanceof java.util.Collection;
        fp0.p pVar = this.f265262e;
        if (!z18 || !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b((fp0.p) it.next(), pVar)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            oVar.f265272d.add(pVar);
        }
        return jz5.f0.f302826a;
    }
}
