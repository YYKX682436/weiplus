package jn3;

/* loaded from: classes8.dex */
public final class j implements l92.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn3.m f300787a;

    public j(jn3.m mVar) {
        this.f300787a = mVar;
    }

    @Override // l92.a
    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.xb1 resp = (r45.xb1) ny3Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(reportExt, "reportExt");
    }

    @Override // l92.a
    public int b() {
        return 3930;
    }

    @Override // l92.a
    public void c(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.xb1 resp = (r45.xb1) ny3Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(reportExt, "reportExt");
        this.f300787a.T6(4, 1006, 3, false, null);
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).wi()) {
            com.tencent.wechat.aff.newlife.AffNewLifeSyncManager affNewLifeSyncManager = com.tencent.wechat.aff.newlife.AffNewLifeSyncManager.getInstance();
            java.util.LinkedList list = resp.getList(3);
            kotlin.jvm.internal.o.f(list, "getCmdList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tencent.wechat.aff.newlife.FinderCmdItem().parseFrom(((r45.hx0) it.next()).toByteArray()));
            }
            affNewLifeSyncManager.dispatchHandleCmdItem(new java.util.ArrayList<>(arrayList), 1006);
        }
    }
}
