package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kf implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f204330d;

    /* renamed from: e, reason: collision with root package name */
    public final ot0.q f204331e;

    public kf(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f204330d = str;
        java.lang.String U1 = f9Var.U1();
        if (U1 != null) {
            this.f204331e = ot0.q.v(U1);
        } else {
            this.f204331e = null;
        }
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        ot0.a aVar;
        boolean z17;
        java.util.List list;
        com.tencent.mm.ui.chatting.viewitems.kf kfVar = (com.tencent.mm.ui.chatting.viewitems.kf) obj;
        ot0.q qVar = this.f204331e;
        if (qVar == null || kfVar.f204331e == null || (aVar = (ot0.a) qVar.y(ot0.a.class)) == null || aVar.f348349e) {
            return false;
        }
        ot0.q qVar2 = kfVar.f204331e;
        ot0.a aVar2 = (ot0.a) qVar2.y(ot0.a.class);
        if (aVar2 == null || aVar2.f348349e) {
            return false;
        }
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        java.lang.String str = qVar.f348693o2;
        ((oh1.k2) x0Var).getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (list = (java.util.List) ((java.util.HashMap) oh1.k2.f345247e).get(this.f204330d)) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.equals(((oh1.e2) it.next()).f345205b)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 && aVar.Q && aVar2.Q && java.util.Objects.equals(qVar.f348693o2, qVar2.f348693o2);
    }
}
