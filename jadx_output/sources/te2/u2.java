package te2;

/* loaded from: classes14.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x91.h f418467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(te2.a3 a3Var, x91.h hVar) {
        super(0);
        this.f418466d = a3Var;
        this.f418467e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        x91.c cVar;
        com.tencent.mars.xlog.Log.i(this.f418466d.f417860h, "onLinkingDevice mrDevice:" + this.f418467e);
        x91.h hVar = this.f418467e;
        if (hVar != null && hVar.f452647a != null) {
            te2.b2 b2Var = this.f418466d.f417859g;
            int i18 = 0;
            if (b2Var == null || (eVar2 = ((te2.l2) b2Var).f418191d) == null || (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f299236g) == null) {
                i17 = -1;
            } else {
                x91.h hVar2 = this.f418467e;
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
                        x91.h hVar3 = ((te2.p2) next).f418299a;
                        java.lang.String str = (hVar3 == null || (cVar = hVar3.f452647a) == null) ? null : cVar.f452641i;
                        x91.c cVar2 = hVar2.f452647a;
                        if (com.tencent.mm.sdk.platformtools.t8.D0(str, cVar2 != null ? cVar2.f452641i : null)) {
                            i17 = i19;
                        }
                        i19 = i27;
                    }
                }
            }
            if (i17 != -1 && i17 > 0) {
                te2.b2 b2Var2 = this.f418466d.f417859g;
                if (b2Var2 != null && (eVar = ((te2.l2) b2Var2).f418191d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f299236g) != null) {
                    i18 = arrayList.size();
                }
                if (i17 < i18) {
                    this.f418466d.f417873x.notifyItemChanged(i17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
