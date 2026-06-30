package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class c1 implements com.tencent.mm.pluginsdk.model.app.h3 {

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f188823f = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f188821d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f188822e = new java.util.ArrayList();

    public c1() {
        com.tencent.mm.pluginsdk.model.app.f Bi = zo3.p.Bi();
        Bi.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.app.g(Bi, 1, this));
    }

    @Override // com.tencent.mm.pluginsdk.model.app.h3
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.pluginsdk.model.app.u3 u3Var) {
        if (u3Var.b() != 1) {
            return;
        }
        this.f188823f = false;
        ((com.tencent.mm.pluginsdk.model.app.x3) u3Var).f189140e.size();
        this.f188821d.removeAll(this.f188822e);
        ((java.util.ArrayList) this.f188822e).clear();
        e();
    }

    public void b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppSettingService", "add appId is null");
            return;
        }
        if (!this.f188821d.contains(str)) {
            this.f188821d.add(str);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.c1$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.pluginsdk.model.app.c1.this.e();
            }
        });
    }

    public void c(java.util.List list) {
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppSettingService", "addAll list is null");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.f188821d.contains(str)) {
                this.f188821d.add(str);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.c1$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.pluginsdk.model.app.c1.this.e();
            }
        });
    }

    public java.lang.String d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppSettingService", "getOpenIdSync, appId is null");
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.m k17 = com.tencent.mm.pluginsdk.model.app.w.k(str, false);
        if (k17 == null) {
            return null;
        }
        java.lang.String str2 = k17.field_openId;
        if (str2 != null && str2.length() != 0) {
            return k17.field_openId;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.tencent.mm.pluginsdk.model.app.x3 x3Var = new com.tencent.mm.pluginsdk.model.app.x3(linkedList);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.p8();
        lVar.f70665b = new r45.q8();
        lVar.f70666c = "/cgi-bin/micromsg-bin/appcenter";
        lVar.f70667d = 452;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.p8 p8Var = (r45.p8) a17.f70710a.f70684a;
        byte[] c17 = x3Var.c();
        if (c17 != null) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(c17);
            p8Var.f382818e = cu5Var;
        }
        p8Var.f382817d = 1;
        com.tencent.mm.modelbase.f b17 = com.tencent.mm.modelbase.l3.b(a17, 20000L);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppSettingService", "call getOpenIdSync cgi result, errType = %d, errCode = %d", java.lang.Integer.valueOf(b17.f70615a), java.lang.Integer.valueOf(b17.f70616b));
        if (b17.f70615a == 0 && b17.f70616b == 0) {
            x3Var.a(x51.j1.d(((r45.q8) b17.f70618d).f383753d));
            x3Var.onGYNetEnd(0, b17.f70615a, b17.f70616b, b17.f70617c, a17, new byte[0]);
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
            if (j17 != null) {
                return j17.field_openId;
            }
        }
        return null;
    }

    public final void e() {
        if (!this.f188823f && this.f188821d.size() > 0) {
            this.f188821d.size();
            int size = this.f188821d.size();
            if (size > 20) {
                size = 20;
            }
            this.f188823f = true;
            ((java.util.ArrayList) this.f188822e).addAll(this.f188821d.subList(0, size));
            gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.model.app.v3(1, new com.tencent.mm.pluginsdk.model.app.x3(this.f188822e)));
        }
    }
}
