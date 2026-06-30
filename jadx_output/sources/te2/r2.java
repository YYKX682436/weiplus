package te2;

/* loaded from: classes14.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f418369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(x91.h hVar, te2.a3 a3Var) {
        super(0);
        this.f418369d = hVar;
        this.f418370e = a3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        te2.a3 a3Var;
        int i17;
        te2.b2 b2Var;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        x91.c cVar;
        x91.h hVar = this.f418369d;
        if (hVar != null && hVar.f452647a != null && (i17 = (a3Var = this.f418370e).f417874y) != a3Var.f417864o) {
            if (i17 != a3Var.f417863n) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327725g, this.f418370e.a());
            }
            te2.b2 b2Var2 = this.f418370e.f417859g;
            java.lang.Object obj = null;
            if (b2Var2 != null && (eVar2 = ((te2.l2) b2Var2).f418191d) != null && (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f299236g) != null) {
                x91.h hVar2 = this.f418369d;
                synchronized (arrayList2) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        x91.h hVar3 = ((te2.p2) next).f418299a;
                        java.lang.String str = (hVar3 == null || (cVar = hVar3.f452647a) == null) ? null : cVar.f452641i;
                        x91.c cVar2 = hVar2.f452647a;
                        if (com.tencent.mm.sdk.platformtools.t8.D0(str, cVar2 != null ? cVar2.f452641i : null)) {
                            obj = next;
                            break;
                        }
                    }
                }
                obj = (te2.p2) obj;
            }
            te2.a3 a3Var2 = this.f418370e;
            a3Var2.g(a3Var2.f417863n);
            if (obj == null && (b2Var = this.f418370e.f417859g) != null && (eVar = ((te2.l2) b2Var).f418191d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f299236g) != null) {
                x91.h hVar4 = this.f418369d;
                te2.a3 a3Var3 = this.f418370e;
                arrayList.add(new te2.p2(hVar4));
                if (arrayList.size() > 0) {
                    a3Var3.f417873x.notifyItemInserted(arrayList.size() - 1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
