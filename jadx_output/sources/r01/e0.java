package r01;

/* loaded from: classes9.dex */
public class e0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f368050d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final r01.c0 f368051e = new r01.c0(null);

    /* renamed from: f, reason: collision with root package name */
    public boolean f368052f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f368053g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f368054h = new java.util.LinkedList();

    public void a(r01.d0 d0Var) {
        synchronized (this.f368050d) {
            if (!this.f368054h.contains(d0Var)) {
                java.util.Iterator it = this.f368054h.iterator();
                while (it.hasNext()) {
                    r01.d0 d0Var2 = (r01.d0) it.next();
                    if (d0Var != null && d0Var2 != null) {
                        java.lang.String b17 = d0Var.b();
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (b17 == null) {
                            b17 = "";
                        }
                        java.lang.String b18 = d0Var2.b();
                        if (b18 == null) {
                            b18 = "";
                        }
                        if (b17.equals(b18)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizKFService", "the same callbacker %s, return", d0Var.b());
                            return;
                        }
                    }
                }
                this.f368054h.add(d0Var);
            }
        }
    }

    public final void b(java.util.LinkedList linkedList) {
        synchronized (this.f368050d) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f368054h);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                r01.d0 d0Var = (r01.d0) arrayList.get(i17);
                if (d0Var != null) {
                    d0Var.a(linkedList);
                }
            }
        }
    }

    public void c(java.lang.String str, java.lang.String str2, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizKFService", "doKFGetDefaultList error args, %s, %s", str, str2);
            return;
        }
        java.util.Set set = this.f368053g;
        if (((java.util.HashSet) set).contains(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizKFService", "doKFGetInfoList: same is running, %s", str2);
            return;
        }
        ((java.util.HashSet) set).add(str2);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(i17));
        r01.m3 m3Var = new r01.m3(str, linkedList, linkedList2);
        m3Var.f368161g = str2;
        gm0.j1.n().f273288b.g(m3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizKFService", "doKFGetInfoList %s, %s, %d, kfType: %d", str, str2, java.lang.Integer.valueOf(this.f368054h.size()), java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0217  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r20, int r21, java.lang.String r22, com.tencent.mm.modelbase.m1 r23) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.e0.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
