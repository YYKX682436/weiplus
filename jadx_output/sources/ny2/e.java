package ny2;

/* loaded from: classes.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ny2.h f341428a;

    public e(ny2.h hVar) {
        this.f341428a = hVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.HashSet hashSet;
        r45.me2 me2Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ny2.h hVar = this.f341428a;
        hVar.f341438n.b();
        boolean z17 = true;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ko1 ko1Var = (r45.ko1) fVar.f70618d;
            java.lang.String string = (ko1Var == null || (me2Var = (r45.me2) ko1Var.getCustom(1)) == null) ? null : me2Var.getString(5);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                gk2.e eVar = dk2.ef.I;
                if (eVar != null && (hashSet = ((mm2.c1) eVar.a(mm2.c1.class)).f328799e6) != null) {
                    hashSet.add(string);
                }
                com.tencent.mars.xlog.Log.i(hVar.f341431d, "createVote success, cache myCreatedVotingId=" + string);
            }
            db5.t7.h(hVar.getContext(), hVar.getResources().getString(com.tencent.mm.R.string.ejc));
            pm0.v.V(lk5.s.b(hVar.getActivity()) ? 2000 : 0, new ny2.d(hVar));
        } else {
            java.lang.String str = fVar.f70617c;
            if (((str == null || str.length() == 0) ? 1 : 0) != 0) {
                db5.t7.g(hVar.getContext(), hVar.getResources().getString(com.tencent.mm.R.string.ejb));
            } else {
                db5.t7.g(hVar.getContext(), fVar.f70617c);
            }
        }
        return jz5.f0.f302826a;
    }
}
