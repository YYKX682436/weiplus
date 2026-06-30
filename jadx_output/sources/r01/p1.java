package r01;

/* loaded from: classes8.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j16 f368178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f368180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f368182h;

    public p1(r01.r1 r1Var, r45.j16 j16Var, java.lang.String str, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f368182h = r1Var;
        this.f368178d = j16Var;
        this.f368179e = str;
        this.f368180f = f9Var;
        this.f368181g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f368182h.e(this.f368178d, this.f368179e);
        com.tencent.mm.storage.f9 f9Var = this.f368180f;
        if (f9Var == null || !f9Var.t2()) {
            this.f368182h.b(this.f368179e, 10, 0, 0.0f, 0.0f, 0, null, this.f368181g, this.f368178d, null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j()).f348581i;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
            this.f368182h.b(this.f368179e, 10, 0, 0.0f, 0.0f, 0, null, this.f368181g, this.f368178d, null);
            return;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            ot0.s0 s0Var = (ot0.s0) it.next();
            java.lang.String str = s0Var.f348762e;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                android.net.Uri parse = android.net.Uri.parse(str);
                try {
                    java.lang.String queryParameter = parse.getQueryParameter("mid");
                    java.lang.String queryParameter2 = parse.getQueryParameter("idx");
                    r45.y30 y30Var = new r45.y30();
                    y30Var.f390735d = com.tencent.mm.sdk.platformtools.t8.V(queryParameter, 0L);
                    y30Var.f390736e = com.tencent.mm.sdk.platformtools.t8.P(queryParameter2, 0);
                    y30Var.f390737f = s0Var.f348779v;
                    y30Var.f390738g = s0Var.f348776s;
                    linkedList.add(y30Var);
                } catch (java.lang.UnsupportedOperationException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ReportLocation", "UnsupportedOperationException %s", e17.getMessage());
                }
            }
        }
        this.f368182h.b(this.f368179e, 10, 0, 0.0f, 0.0f, 0, linkedList, this.f368181g, this.f368178d, null);
    }
}
