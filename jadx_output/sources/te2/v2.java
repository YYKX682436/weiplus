package te2;

/* loaded from: classes14.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f418489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x91.h hVar, te2.a3 a3Var) {
        super(0);
        this.f418489d = hVar;
        this.f418490e = a3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        gk2.e eVar3;
        java.util.ArrayList arrayList3;
        gk2.e eVar4;
        java.util.ArrayList arrayList4;
        x91.c cVar;
        x91.h hVar = this.f418489d;
        if (hVar != null && hVar.f452647a != null) {
            te2.a3 a3Var = this.f418490e;
            if (a3Var.f417874y != a3Var.f417864o) {
                te2.b2 b2Var = a3Var.f417859g;
                boolean z17 = false;
                if (b2Var == null || (eVar4 = ((te2.l2) b2Var).f418191d) == null || (arrayList4 = ((je2.i) eVar4.a(je2.i.class)).f299236g) == null) {
                    i17 = -1;
                } else {
                    x91.h hVar2 = this.f418489d;
                    synchronized (arrayList4) {
                        java.util.Iterator it = arrayList4.iterator();
                        i17 = -1;
                        int i18 = 0;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i19 = i18 + 1;
                            java.lang.String str = null;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            te2.p2 p2Var = (te2.p2) next;
                            x91.c cVar2 = hVar2.f452647a;
                            java.lang.String str2 = cVar2 != null ? cVar2.f452641i : null;
                            x91.h hVar3 = p2Var.f418299a;
                            if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
                                str = cVar.f452641i;
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.D0(str2, str)) {
                                i17 = i18;
                            }
                            i18 = i19;
                        }
                    }
                }
                if (i17 != -1 && i17 > 0) {
                    te2.b2 b2Var2 = this.f418490e.f417859g;
                    if (i17 < ((b2Var2 == null || (eVar3 = ((te2.l2) b2Var2).f418191d) == null || (arrayList3 = ((je2.i) eVar3.a(je2.i.class)).f299236g) == null) ? 0 : arrayList3.size())) {
                        te2.b2 b2Var3 = this.f418490e.f417859g;
                        if (b2Var3 != null && (eVar2 = ((te2.l2) b2Var3).f418191d) != null && (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f299236g) != null) {
                        }
                        this.f418490e.f417873x.notifyItemRemoved(i17);
                    }
                }
                te2.b2 b2Var4 = this.f418490e.f417859g;
                if (b2Var4 != null && (eVar = ((te2.l2) b2Var4).f418191d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f299236g) != null && arrayList.isEmpty()) {
                    z17 = true;
                }
                if (z17) {
                    te2.a3 a3Var2 = this.f418490e;
                    a3Var2.g(a3Var2.f417862m);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
