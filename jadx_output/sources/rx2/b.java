package rx2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.d f400963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rx2.d dVar) {
        super(1);
        this.f400963d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.l selectName = (jz5.l) obj;
        kotlin.jvm.internal.o.g(selectName, "selectName");
        java.util.Iterator it = this.f400963d.f400966b.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(selectName.f302833d, ((r45.gb4) it.next()).getString(2))) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 == -1);
    }
}
