package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class t1 extends l75.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.b2 f195322e;

    public t1(com.tencent.mm.storage.b2 b2Var) {
        this.f195322e = b2Var;
    }

    @Override // l75.v0
    public boolean g() {
        return true;
    }

    @Override // l75.v0
    public void h(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.storage.z1) obj).a(this.f195322e, (com.tencent.mm.storage.x1) obj2);
    }

    @Override // l75.v0
    public void i(java.lang.Object obj) {
        com.tencent.mm.storage.x1 x1Var = (com.tencent.mm.storage.x1) obj;
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.tencent.mm.storage.a2.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            xw.m1 m1Var = (xw.m1) ((com.tencent.mm.storage.a2) ((fs.q) fVar.next()).get());
            m1Var.getClass();
            yq1.n.a("UpdateBizMainCellThread", new xw.l1(m1Var, this.f195322e, x1Var), 0L);
        }
    }
}
