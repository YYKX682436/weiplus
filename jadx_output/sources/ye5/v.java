package ye5;

/* loaded from: classes9.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rd5.d dVar) {
        super(0);
        this.f461286d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        we5.s0 s0Var = ((qd5.i) this.f461286d).f361911o;
        if (s0Var == null || (list = s0Var.f445387a) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rd5.d) it.next()).f394254d.f445300b);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) next;
            if (f9Var.isVideo() || f9Var.J2()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
