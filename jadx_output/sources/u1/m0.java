package u1;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f423623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.i f423624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u1.w wVar, o0.i iVar) {
        super(2);
        this.f423623d = wVar;
        this.f423624e = iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        u1.i1 i1Var;
        u1.j1 lastProvider = (u1.j1) obj;
        z0.s mod = (z0.s) obj2;
        kotlin.jvm.internal.o.g(lastProvider, "lastProvider");
        kotlin.jvm.internal.o.g(mod, "mod");
        boolean z17 = mod instanceof t1.b;
        u1.w wVar = this.f423623d;
        if (z17) {
            t1.b bVar = (t1.b) mod;
            wVar.getClass();
            o0.i iVar = this.f423624e;
            int i18 = iVar.f341852f;
            if (i18 > 0) {
                java.lang.Object[] objArr = iVar.f341850d;
                i17 = 0;
                do {
                    if (((u1.i1) objArr[i17]).f423603e == bVar) {
                        break;
                    }
                    i17++;
                } while (i17 < i18);
            }
            i17 = -1;
            if (i17 < 0) {
                i1Var = new u1.i1(lastProvider, bVar);
            } else {
                i1Var = (u1.i1) iVar.m(i17);
                i1Var.getClass();
                i1Var.f423602d = lastProvider;
            }
            lastProvider.f423613i.b(i1Var);
        }
        if (!(mod instanceof t1.d)) {
            return lastProvider;
        }
        t1.d dVar = (t1.d) mod;
        wVar.getClass();
        u1.j1 j1Var = lastProvider.f423610f;
        while (j1Var != null && j1Var.f423609e != dVar) {
            j1Var = j1Var.f423610f;
        }
        if (j1Var == null) {
            j1Var = new u1.j1(wVar, dVar);
        } else {
            u1.j1 j1Var2 = j1Var.f423611g;
            if (j1Var2 != null) {
                j1Var2.f423610f = j1Var.f423610f;
            }
            u1.j1 j1Var3 = j1Var.f423610f;
            if (j1Var3 != null) {
                j1Var3.f423611g = j1Var2;
            }
        }
        j1Var.f423610f = lastProvider.f423610f;
        u1.j1 j1Var4 = lastProvider.f423610f;
        if (j1Var4 != null) {
            j1Var4.f423611g = j1Var;
        }
        lastProvider.f423610f = j1Var;
        j1Var.f423611g = lastProvider;
        return j1Var;
    }
}
