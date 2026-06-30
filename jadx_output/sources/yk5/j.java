package yk5;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f462885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f462886e;

    public j(yk5.u uVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f462886e = uVar;
        this.f462885d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.iw5 H = ((tg3.r1) this.f462885d).H();
        int i17 = H.D;
        yk5.u uVar = this.f462886e;
        if (i17 > 0) {
            for (r45.gw5 gw5Var : H.E) {
                int i18 = gw5Var.f375571q;
                java.util.Set set = c01.e2.f37117a;
                if (com.tencent.mm.storage.z3.D3(i18)) {
                    if (uVar.f462910t == null) {
                        uVar.f462910t = new java.util.LinkedList();
                    }
                    uVar.f462910t.add(gw5Var);
                }
            }
        } else {
            java.lang.String g17 = x51.j1.g(H.f377356d);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ((g17 == null ? "" : g17).length() > 0) {
                r45.gw5 gw5Var2 = new r45.gw5();
                gw5Var2.f375561d = H.f377356d;
                gw5Var2.f375571q = H.f377366q;
                gw5Var2.f375569o = H.f377364o;
                gw5Var2.f375562e = H.f377357e;
                gw5Var2.f375574t = H.f377369t;
                gw5Var2.A = H.A;
                gw5Var2.f375568n = H.f377363n;
                gw5Var2.f375567m = H.f377362m;
                gw5Var2.f375565h = H.f377360h;
                gw5Var2.f375572r = H.f377367r;
                gw5Var2.f375576v = H.f377371v;
                gw5Var2.f375573s = H.f377368s;
                gw5Var2.f375575u = H.f377370u;
                gw5Var2.f375580z = H.f377375z;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ai().v(g17, x51.j1.d(H.f377361i));
                if (uVar.f462910t == null) {
                    uVar.f462910t = new java.util.LinkedList();
                }
                uVar.f462910t.clear();
                int i19 = gw5Var2.f375571q;
                java.util.Set set2 = c01.e2.f37117a;
                if (com.tencent.mm.storage.z3.D3(i19)) {
                    uVar.f462910t.add(gw5Var2);
                }
                uVar.f462910t.size();
            }
        }
        uVar.f462913w = false;
    }
}
