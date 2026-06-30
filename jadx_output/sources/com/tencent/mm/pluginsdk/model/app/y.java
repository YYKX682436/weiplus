package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class y implements com.tencent.mm.pluginsdk.model.app.h3, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f189151d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f189152e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f189153f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f189154g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f189155h;

    public y() {
        this.f189151d = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.pluginsdk.model.app.x(this), false);
        this.f189155h = b4Var;
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f189151d = new java.util.HashMap();
        this.f189152e = new java.util.Vector();
        this.f189153f = new java.util.ArrayList();
        b4Var.c(600000L, 600000L);
        com.tencent.mm.pluginsdk.model.app.f Bi = zo3.p.Bi();
        Bi.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.app.g(Bi, 7, this));
    }

    @Override // com.tencent.mm.pluginsdk.model.app.h3
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.pluginsdk.model.app.u3 u3Var) {
        if (u3Var.b() != 7) {
            return;
        }
        synchronized (this) {
            java.util.List list = this.f189153f;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                ((java.util.Vector) this.f189152e).removeAll(this.f189153f);
                ((java.util.ArrayList) this.f189153f).clear();
            }
        }
        this.f189154g = false;
        g();
    }

    public final synchronized void b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || ((java.util.Vector) this.f189152e).contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoService", "should not add this appid:[%s], it is already runing", str);
        } else if (!e(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "this app has reach the max retry count, appid is %s", str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoService", "add appid:[%s]", str);
            ((java.util.Vector) this.f189152e).add(str);
        }
    }

    public void c(java.util.LinkedList linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "batch push appinfo err: null or nil applist");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b((java.lang.String) it.next());
        }
        g();
    }

    public com.tencent.mm.pluginsdk.model.app.m d(java.lang.String str, long j17) {
        if (str != null && str.length() != 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str);
            com.tencent.mm.pluginsdk.model.app.w3 w3Var = new com.tencent.mm.pluginsdk.model.app.w3(linkedList);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.p8();
            lVar.f70665b = new r45.q8();
            lVar.f70666c = "/cgi-bin/micromsg-bin/appcenter";
            lVar.f70667d = 452;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.p8 p8Var = (r45.p8) a17.f70710a.f70684a;
            byte[] c17 = w3Var.c();
            if (c17 != null) {
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(c17);
                p8Var.f382818e = cu5Var;
            }
            p8Var.f382817d = 7;
            com.tencent.mm.modelbase.f b17 = com.tencent.mm.modelbase.l3.b(a17, j17);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "getSync resp == null");
                return null;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "call getAppInfoList cgi result, errType = %d, errCode = %d", java.lang.Integer.valueOf(b17.f70615a), java.lang.Integer.valueOf(b17.f70616b));
            if (b17.f70615a == 0 && b17.f70616b == 0) {
                w3Var.a(x51.j1.d(((r45.q8) b17.f70618d).f383753d));
                w3Var.onGYNetEnd(0, b17.f70615a, b17.f70616b, b17.f70617c, a17, new byte[0]);
                ap3.f a18 = ap3.e.a();
                if (a18 != null) {
                    return ((kt.a) a18).wi(str);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "getISubCorePluginBase() == null");
                return null;
            }
        }
        return null;
    }

    public final boolean e(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "increaseCounter fail, appId is null");
            return false;
        }
        java.util.Map map = this.f189151d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) ((java.util.HashMap) map).get(str), 0));
        if (valueOf.intValue() >= 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "increaseCounter fail, has reached the max try count");
            return false;
        }
        ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(valueOf.intValue() + 1));
        return true;
    }

    public void f(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "push fail, appId is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoService", "push appid : ".concat(str));
        b(str);
        g();
    }

    public final void g() {
        java.util.List list;
        if (this.f189154g || (list = this.f189152e) == null || ((java.util.Vector) list).isEmpty()) {
            return;
        }
        int size = ((java.util.Vector) this.f189152e).size();
        if (size > 20) {
            size = 20;
        }
        synchronized (this) {
            ((java.util.ArrayList) this.f189153f).addAll(((java.util.Vector) this.f189152e).subList(0, size));
        }
        java.util.List list2 = this.f189153f;
        if (list2 == null || ((java.util.ArrayList) list2).isEmpty()) {
            return;
        }
        this.f189154g = true;
        gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.model.app.v3(7, new com.tencent.mm.pluginsdk.model.app.w3(this.f189153f)));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int type = m1Var.getType();
        if (type != 451) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoService", "error type: " + type);
            return;
        }
        synchronized (this) {
            java.util.List list = this.f189153f;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                ((java.util.Vector) this.f189152e).removeAll(this.f189153f);
                ((java.util.ArrayList) this.f189153f).clear();
            }
        }
        this.f189154g = false;
        g();
    }
}
