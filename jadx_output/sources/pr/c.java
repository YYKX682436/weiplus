package pr;

/* loaded from: classes4.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.d f357695a;

    public c(pr.d dVar) {
        this.f357695a = dVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        pr.d dVar = this.f357695a;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDesignerTask", "getNext: " + i17 + ", " + i18);
        r45.cl3 cl3Var = (r45.cl3) fVar.f70618d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.util.LinkedList linkedList3 = dVar.f357700d;
        if (i17 == 0 && i18 == 0) {
            if (cl3Var != null && (linkedList2 = cl3Var.f371641i) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    linkedList3.add(((r45.zj0) it.next()).f392128d);
                }
            }
            pr.d.a(dVar);
            return f0Var;
        }
        if (i17 != 4 || i18 != 2) {
            yz5.l lVar = dVar.f357698b;
            if (lVar == null) {
                return null;
            }
            lVar.invoke(java.lang.Boolean.FALSE);
            return f0Var;
        }
        if (cl3Var != null && (linkedList = cl3Var.f371641i) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                linkedList3.add(((r45.zj0) it6.next()).f392128d);
            }
        }
        byte[] d17 = x51.j1.d(cl3Var != null ? cl3Var.f371642m : null);
        dVar.f357699c = d17;
        if (d17 == null) {
            pr.d.a(dVar);
            return f0Var;
        }
        dVar.b();
        return f0Var;
    }
}
