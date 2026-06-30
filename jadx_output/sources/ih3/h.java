package ih3;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f291585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f291586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ih3.e f291587g;

    public h(ih3.e eVar, java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        this.f291587g = eVar;
        this.f291584d = str;
        this.f291585e = map;
        this.f291586f = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        final java.lang.String str = this.f291584d;
        final java.util.Map map = this.f291585e;
        final com.tencent.mm.modelbase.p0 p0Var = this.f291586f;
        ih3.e eVar = this.f291587g;
        eVar.getClass();
        int i17 = 0;
        while (true) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String str2 = (java.lang.String) map.get((".sysmsg.sysmsgtemplate.content_template" + sb6.toString()) + ".$type");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    return;
                }
                java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) eVar.f291568f).get(str2);
                if (hashSet != null) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.ui.chatting.component.b7 b7Var = (com.tencent.mm.ui.chatting.component.b7) ((tg3.j1) it.next());
                        b7Var.getClass();
                        com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
                        com.tencent.mm.ui.chatting.component.f7 f7Var = b7Var.f198719a;
                        openIMSucceedContactLogStruct.p(f7Var.f198580d.f460722q);
                        openIMSucceedContactLogStruct.q(f7Var.f198580d.x());
                        openIMSucceedContactLogStruct.f59797f = 1L;
                        openIMSucceedContactLogStruct.f59798g = 1L;
                        openIMSucceedContactLogStruct.f59802k = 1L;
                        openIMSucceedContactLogStruct.k();
                    }
                }
                fs.g.c(tg3.i1.class, str2, new fs.o() { // from class: ih3.e$$a
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        ((tg3.i1) nVar).Ra(str, map, p0Var);
                        return false;
                    }
                });
                i17++;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysMsgTemplateImp", e17, "", new java.lang.Object[0]);
                return;
            }
        }
    }
}
