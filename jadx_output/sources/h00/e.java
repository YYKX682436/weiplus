package h00;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277816a;

    public e(int i17) {
        this.f277816a = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processCgi errType:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" scene:");
        int i19 = this.f277816a;
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCgiHandler", sb6.toString());
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f70711b.f70700a) == null || !(fVar instanceof bw5.f7)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsInitCgiHandler", "processCgi error");
            return;
        }
        try {
            java.util.LinkedList<bw5.s20> linkedList = ((bw5.f7) fVar).f27177d;
            if (linkedList != null) {
                for (bw5.s20 s20Var : linkedList) {
                    h00.a.f277808a.b(s20Var.f32769d, s20Var.f32771f);
                    h00.h hVar = h00.h.f277820a;
                    h00.w wVar = (h00.w) ((java.util.Map) ((jz5.n) h00.h.f277823d).getValue()).get(java.lang.Integer.valueOf(s20Var.f32769d));
                    if (wVar != null) {
                        wVar.b(s20Var);
                    }
                    java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) h00.h.f277824e.get(java.lang.Integer.valueOf(s20Var.f32769d));
                    if (copyOnWriteArraySet != null) {
                        java.util.Iterator it = copyOnWriteArraySet.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.ui.MoreTabUI$$a moreTabUI$$a = (com.tencent.mm.ui.MoreTabUI$$a) ((c00.s3) it.next());
                            moreTabUI$$a.getClass();
                            int i27 = com.tencent.mm.ui.MoreTabUI.B1;
                            moreTabUI$$a.f196961a.L0();
                        }
                    }
                }
            }
            java.lang.String source = "EcsInit-" + i19;
            oh3.q qVar = (oh3.q) ((p90.j) i95.n0.c(p90.j.class));
            qVar.getClass();
            kotlin.jvm.internal.o.g(source, "source");
            qVar.wi().n(source);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsInitCgiHandler", "processCgi exp:" + e17);
        }
    }
}
