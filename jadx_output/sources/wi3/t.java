package wi3;

/* loaded from: classes4.dex */
public class t implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi3.r f446269d;

    public t(wi3.r rVar) {
        this.f446269d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        wi3.r rVar = this.f446269d;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigSendMMFGFileSwitch()) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.Float) it.next());
                sb6.append("\n");
            }
            ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).aj(java.lang.String.format("mmfg_rpt_%s.txt", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), sb6.toString().getBytes(), true);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList.size() > 38400) {
            linkedList = new java.util.LinkedList(linkedList.subList(0, 38400));
        }
        wi3.m mVar = new wi3.m();
        mVar.f446233d = linkedList;
        linkedList2.add(mVar);
        wi3.n nVar = new wi3.n();
        nVar.f446234d = linkedList2;
        try {
            byte[] byteArray = nVar.toByteArray();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMultiMediaReport", "[checkImg] byte size = " + byteArray.length);
            rVar.f446261e.B = new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneMultiMediaReport", e17, java.lang.String.format("error %s", rVar.f446262f), new java.lang.Object[0]);
        }
        java.lang.String str = rVar.f446262f;
        wi3.s sVar = new wi3.s(this);
        wi3.l lVar = wi3.l.f446226a;
        kotlinx.coroutines.l.f(null, new wi3.h(str, sVar, null), 1, null);
        return null;
    }
}
