package fy2;

/* loaded from: classes10.dex */
public final class d extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.g84 f267239f;

    /* renamed from: g, reason: collision with root package name */
    public r45.g84 f267240g;

    /* renamed from: h, reason: collision with root package name */
    public long f267241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    public final java.lang.String N6(r45.g84 g84Var) {
        java.lang.String string = g84Var != null ? g84Var.getString(1) : null;
        if (string == null || string.length() == 0) {
            return "";
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(g84Var != null ? g84Var.getString(1) : null);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.d(a17);
        mn2.e1 e1Var = new mn2.e1("", a17, "", false, false, null, 56, null);
        ((c61.p2) ybVar).getClass();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102135d + "decoration/" + e1Var.n() + ".pag";
    }

    public final void O6(r45.g84 g84Var, yz5.l lVar) {
        if (g84Var != null) {
            boolean z17 = true;
            java.lang.String string = g84Var.getString(1);
            if (string != null) {
                fy2.a aVar = new fy2.a(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), g84Var.getString(2));
                aVar.f241785d = "task_FinderCdnDownloader";
                java.lang.String N6 = N6(g84Var);
                com.tencent.mm.vfs.w6.h(N6);
                com.tencent.mm.vfs.w6.u(new com.tencent.mm.vfs.r6(N6).r());
                try {
                    java.lang.String host = new java.net.URL(string).getHost();
                    int f17 = com.tencent.mm.network.n.f(host, false, new java.util.ArrayList());
                    int f18 = com.tencent.mm.network.n.f(host, true, new java.util.ArrayList());
                    char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                    aVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.b(string.getBytes());
                    aVar.D1 = string;
                    aVar.E1 = host;
                    aVar.G1 = N6;
                    aVar.J1 = f17;
                    aVar.K1 = f18;
                    aVar.M1 = "" + com.tencent.mm.sdk.platformtools.v0.f193027a.c();
                    aVar.N1 = "";
                    aVar.P1 = 150;
                    aVar.Q1 = 20201;
                    com.tencent.mars.xlog.Log.i("Finder.LiveDecorationSlice", "attachDecorTaskInfo url:%s", string);
                } catch (java.net.MalformedURLException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Finder.LiveDecorationSlice", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.w("Finder.LiveDecorationSlice", "attachGiftPagTaskInfo fail:" + e17);
                    z17 = false;
                }
                if (z17) {
                    aVar.f241787f = new fy2.b(this, aVar, lVar);
                    if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(aVar)) {
                        com.tencent.mars.xlog.Log.i("Finder.LiveDecorationSlice", "SubCoreCdnTransport addRecvTask suc");
                        return;
                    }
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.FALSE);
                    }
                    com.tencent.mars.xlog.Log.w("Finder.LiveDecorationSlice", "SubCoreCdnTransport addRecvTask failed");
                }
            }
        }
    }

    public final boolean P6(java.lang.String str, int i17) {
        if (i17 == 0) {
            r45.g84 g84Var = this.f267239f;
            if (com.tencent.mm.sdk.platformtools.t8.D0(g84Var != null ? g84Var.getString(1) : null, str)) {
                return false;
            }
        } else {
            if (i17 != 1) {
                return false;
            }
            r45.g84 g84Var2 = this.f267240g;
            if (com.tencent.mm.sdk.platformtools.t8.D0(g84Var2 != null ? g84Var2.getString(1) : null, str)) {
                return false;
            }
        }
        return true;
    }

    public final void Q6(yz5.p pVar) {
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.e(8, new r45.oy2(), new fy2.c(pVar, r45.py2.class), false);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f267239f = null;
        this.f267240g = null;
        this.f267241h = 0L;
    }
}
