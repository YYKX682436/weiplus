package lh3;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f318669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f318671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lh3.k f318672g;

    public i(lh3.k kVar, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f318672g = kVar;
        this.f318669d = m1Var;
        this.f318670e = i17;
        this.f318671f = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String uri;
        com.tencent.mm.modelbase.m1 m1Var = this.f318669d;
        int type = m1Var.getType();
        com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
        int i17 = (type == 1616 || type == 1518 || type == 385 || !(reqResp == null || (uri = reqResp.getUri()) == null || !uri.startsWith("/cgi-bin/mmpay-bin/"))) ? 1 : 0;
        if (i17 == 1) {
            this.f318672g.getClass();
            try {
                if (com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a) && b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    int i18 = this.f318670e;
                    int i19 = this.f318671f;
                    boolean z17 = (i18 == 0 && i19 == 0) ? 1 : 0;
                    java.util.LinkedList linkedList = (java.util.LinkedList) lh3.k.wi(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    if (linkedList.size() == 0) {
                        return;
                    }
                    lh3.j jVar = (lh3.j) linkedList.get(0);
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        lh3.j jVar2 = (lh3.j) it.next();
                        if (jVar2.f318679g) {
                            jVar = jVar2;
                            break;
                        }
                    }
                    java.lang.String str = jVar.f318673a;
                    java.lang.String str2 = jVar.f318674b;
                    java.lang.String str3 = jVar.f318676d;
                    java.lang.String str4 = jVar.f318675c;
                    java.lang.String str5 = jVar.f318677e;
                    int i27 = jVar.f318678f;
                    int i28 = i17 == 1 ? 3 : z17 == 0 ? 2 : 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetworkOptReport", "reportCellInfo mcc[%s] mnc[%s] lac[%s] cellid[%s] netType[%s] dbm[%d] type[%d] success[%s] errType[%d] errCode[%d] cmdid[%d] reportType[%d]", str, str2, str3, str4, str5, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(i28));
                    jx3.f fVar = jx3.f.INSTANCE;
                    fVar.n(15608, i28, fVar.s(str, str2, str3, str4, str5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(1 ^ z17), 0, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(i28)), false, false);
                }
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetworkOptReport", "getNetType : %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
    }
}
