package ij5;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f291815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ij5.d0 d0Var) {
        super(1);
        this.f291815d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        ij5.d0 d0Var = this.f291815d;
        if (yVar != null) {
            if (!r26.n0.N(yVar.f446363c)) {
                j75.e eVar = yVar.f298067a;
                if (eVar != null && (eVar instanceof wi5.z)) {
                    wi5.z zVar = (wi5.z) eVar;
                    d0Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f446367b;
                    sb6.append(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = d0Var.f291762e;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                    p13.u uVar = new p13.u();
                    uVar.f351141c = str;
                    uVar.f351150l = r13.a.f368601d;
                    uVar.f351140b = 32;
                    uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) d0Var.f291761d).getValue();
                    uVar.f351151m = new ij5.v(d0Var, zVar, b17, 0, false, 12, null);
                    uVar.f351148j.addAll(state.f446320p);
                    uVar.f351154p = true;
                    p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", "startSearch " + sj6.hashCode());
                    arrayList.add(sj6);
                    com.tencent.mm.sdk.coroutines.LifecycleScope O6 = d0Var.O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new ij5.b0(b17, hashMap, d0Var, zVar, null), 1, null);
                    }
                }
                ij5.d0.T6(d0Var).k().setVisibility(8);
                ij5.d0.T6(d0Var).h().setVisibility(0);
            } else {
                ij5.d0.T6(d0Var).k().setVisibility(0);
                ij5.d0.T6(d0Var).h().setVisibility(8);
                d0Var.U6();
                yVar.f446364d.invoke();
            }
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f446355c)) {
                ij5.d0.T6(d0Var).k().setVisibility(8);
                ij5.d0.T6(d0Var).h().setVisibility(0);
            } else {
                ij5.d0.T6(d0Var).k().setVisibility(0);
                ij5.d0.T6(d0Var).h().setVisibility(8);
                d0Var.U6();
                wVar.f446356d.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
