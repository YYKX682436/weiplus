package j93;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f298489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(j93.w1 w1Var) {
        super(1);
        this.f298489d = w1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        j93.w1 w1Var = this.f298489d;
        if (yVar != null) {
            if (!r26.n0.N(yVar.f446363c)) {
                j75.e eVar = yVar.f298067a;
                if (eVar != null && (eVar instanceof wi5.z)) {
                    wi5.z zVar = (wi5.z) eVar;
                    w1Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f446367b;
                    sb6.append(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = w1Var.f298528e;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                    p13.u uVar = new p13.u();
                    uVar.f351140b = 16;
                    uVar.f351150l = r13.b.f368602d;
                    uVar.f351145g = new int[]{131072};
                    uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) w1Var.f298527d).getValue();
                    uVar.f351151m = new j93.p1(w1Var, zVar, b17, 0, false, 12, null);
                    uVar.f351154p = true;
                    uVar.f351141c = str;
                    p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + sj6.hashCode());
                    arrayList.add(sj6);
                    com.tencent.mm.sdk.coroutines.LifecycleScope O6 = w1Var.O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new j93.t1(b17, hashMap, w1Var, zVar, null), 1, null);
                    }
                }
                j93.w1.T6(w1Var).k().setVisibility(8);
                j93.w1.T6(w1Var).h().setVisibility(0);
            } else {
                j93.w1.T6(w1Var).k().setVisibility(0);
                j93.w1.T6(w1Var).h().setVisibility(8);
                w1Var.U6();
                yVar.f446364d.invoke();
            }
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f446355c)) {
                j93.w1.T6(w1Var).k().setVisibility(8);
                j93.w1.T6(w1Var).h().setVisibility(0);
            } else {
                j93.w1.T6(w1Var).k().setVisibility(0);
                j93.w1.T6(w1Var).h().setVisibility(8);
                w1Var.U6();
                wVar.f446356d.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
