package te2;

/* loaded from: classes14.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f418525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(x91.h hVar, te2.a3 a3Var) {
        super(0);
        this.f418525d = hVar;
        this.f418526e = a3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        x91.c cVar;
        x91.h hVar = this.f418525d;
        if (hVar != null && hVar.f452647a != null) {
            te2.a3 a3Var = this.f418526e;
            if (a3Var.f417874y != a3Var.f417864o) {
                te2.b2 b2Var = a3Var.f417859g;
                int i18 = 0;
                if (b2Var == null || (eVar2 = ((te2.l2) b2Var).f418191d) == null || (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f299236g) == null) {
                    i17 = -1;
                } else {
                    x91.h hVar2 = this.f418525d;
                    synchronized (arrayList2) {
                        java.util.Iterator it = arrayList2.iterator();
                        int i19 = 0;
                        i17 = -1;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            te2.p2 p2Var = (te2.p2) next;
                            x91.h hVar3 = p2Var.f418299a;
                            java.lang.String str = (hVar3 == null || (cVar = hVar3.f452647a) == null) ? null : cVar.f452641i;
                            x91.c cVar2 = hVar2.f452647a;
                            if (com.tencent.mm.sdk.platformtools.t8.D0(str, cVar2 != null ? cVar2.f452641i : null)) {
                                p2Var.f418299a = hVar2;
                                i17 = i19;
                            }
                            i19 = i27;
                        }
                    }
                }
                te2.a3 a3Var2 = this.f418526e;
                a3Var2.g(a3Var2.f417863n);
                if (i17 != -1 && i17 > 0) {
                    te2.b2 b2Var2 = this.f418526e.f417859g;
                    if (b2Var2 != null && (eVar = ((te2.l2) b2Var2).f418191d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f299236g) != null) {
                        i18 = arrayList.size();
                    }
                    if (i17 < i18) {
                        this.f418526e.f417873x.notifyItemChanged(i17);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
