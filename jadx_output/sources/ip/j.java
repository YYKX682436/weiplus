package ip;

/* loaded from: classes11.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f293569a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f293570b = false;

    public final void a(java.util.Map map, boolean z17) {
        java.lang.String sb6;
        if (map == null) {
            return;
        }
        java.util.HashMap hashMap = this.f293569a;
        if (!z17) {
            hashMap.clear();
        }
        int i17 = 0;
        while (i17 < 10000) {
            java.lang.String str = "";
            if (z17) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".sysmsg.dynacfg_split.Item");
                sb7.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".sysmsg.dynacfg.Item");
                sb8.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                sb6 = sb8.toString();
            }
            java.lang.Object obj = sb6 + ".$key";
            java.lang.String str2 = (java.lang.String) map.get(sb6);
            java.lang.String str3 = (java.lang.String) map.get(obj);
            if (str3 == null || com.tencent.mm.sdk.platformtools.t8.K0(str3.trim())) {
                break;
            }
            java.lang.String trim = str3.trim();
            if (str2 != null) {
                str = str2;
            }
            hashMap.put(trim, str);
            i17++;
        }
        hashMap.toString();
    }

    public int b(java.lang.String str, int i17) {
        try {
            return java.lang.Integer.parseInt(d(str));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DynamicConfig", "parseInt failed, val:%s, defVal:%d", str, java.lang.Integer.valueOf(i17));
            return i17;
        }
    }

    public synchronized int c(q55.e eVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        bm5.o1 o1Var = bm5.o1.f22719a;
        if (o1Var.m(eVar) == 0) {
            return b(eVar.j(), ((java.lang.Integer) eVar.i()).intValue());
        }
        return o1Var.h(eVar);
    }

    public synchronized java.lang.String d(java.lang.String str) {
        if (!this.f293570b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
            f();
        }
        str.trim();
        this.f293569a.get(str);
        return (java.lang.String) this.f293569a.get(str);
    }

    public synchronized java.lang.String e(q55.e eVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        bm5.o1 o1Var = bm5.o1.f22719a;
        if (o1Var.m(eVar) != 0) {
            return o1Var.l(eVar);
        }
        java.lang.String d17 = d(eVar.j());
        if (d17 == null) {
            d17 = (java.lang.String) eVar.i();
        }
        return d17;
    }

    public final synchronized void f() {
        if (this.f293570b) {
            return;
        }
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null) {
                gm0.j1.i();
                a(com.tencent.mm.sdk.platformtools.aa.d((java.lang.String) gm0.j1.u().c().l(278529, null), "sysmsg", null), false);
                gm0.j1.i();
                a(com.tencent.mm.sdk.platformtools.aa.d((java.lang.String) gm0.j1.u().c().l(278530, null), "sysmsg", null), true);
                this.f293570b = true;
            }
        }
    }

    public synchronized void g(java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            this.f293569a.put(str, str2);
        }
    }

    public synchronized void h(java.lang.String str, java.util.Map map, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s", java.lang.Boolean.valueOf(z17), com.tencent.mm.vfs.w6.p(str));
        if (z17) {
            gm0.j1.i();
            gm0.j1.u().c().w(278530, str);
        } else {
            gm0.j1.i();
            gm0.j1.u().c().w(278529, str);
            gm0.j1.i();
            gm0.j1.u().c().w(278530, "");
        }
        if (map != null) {
            a(map, z17);
        } else {
            a(com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null), z17);
        }
        new com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent().e();
    }
}
