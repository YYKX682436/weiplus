package q01;

/* loaded from: classes12.dex */
public final class o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final q01.g0 f359315f = new q01.g0(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f359316a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f359317b;

    /* renamed from: c, reason: collision with root package name */
    public int f359318c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f359319d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f359320e;

    public o0(com.tencent.mm.modelbase.m1 netScene) {
        kotlin.jvm.internal.o.g(netScene, "netScene");
        this.f359316a = netScene;
        this.f359317b = jz5.h.a(jz5.i.f302829d, q01.n0.f359313d);
        this.f359318c = -1;
        this.f359320e = jz5.h.b(q01.k0.f359297d);
    }

    public final void a(java.util.List list, int i17, int i18, long j17, r45.xw xwVar) {
        if (!c() || xwVar == null || j17 == 0) {
            return;
        }
        long j18 = j17 - xwVar.f390552v;
        java.lang.String name = java.lang.Thread.currentThread().getName();
        int myTid = android.os.Process.myTid();
        long j19 = xwVar.f390553w + j18;
        kotlin.jvm.internal.o.d(name);
        list.add(i17, new q01.h0(i18, j19, name, myTid));
    }

    public final void b(java.util.Map map, java.lang.String str, int i17, int i18) {
        int size = e().size();
        long j17 = 0;
        long j18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            q01.h0 h0Var = (q01.h0) e().get(i19);
            if (j17 <= 0) {
                if (h0Var.f359290a >= i17) {
                    j17 = h0Var.f359291b;
                    j18 = j17;
                }
            } else if (i18 < h0Var.f359290a) {
                break;
            } else {
                j18 = h0Var.f359291b;
            }
        }
        long j19 = j18 - j17;
        if (j19 != 0) {
            map.put(str, java.lang.Long.valueOf(j19));
        }
    }

    public final boolean c() {
        com.tencent.mm.modelbase.m1 m1Var = this.f359316a;
        if (m1Var.isCgiProfilerEnable()) {
            return true;
        }
        if (!m1Var.profileEnabled()) {
            return false;
        }
        if (q01.a1.f359259a.b()) {
            q01.e0.f359270a.e();
        }
        return true;
    }

    public final void d(boolean z17) {
        java.lang.String str;
        if (((java.lang.Boolean) this.f359317b.getValue()).booleanValue()) {
            synchronized (e()) {
                java.lang.String f17 = f(this.f359318c);
                if (e().size() <= 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneState", "#dumpStates " + f17 + ": states=" + e().size());
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("states=");
                    sb6.append(e().size());
                    str = sb6.toString();
                } else {
                    long j17 = ((q01.h0) kz5.n0.i0(e())).f359291b - ((q01.h0) kz5.n0.X(e())).f359291b;
                    java.util.List subList = e().subList(1, e().size());
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
                    int i17 = 0;
                    for (java.lang.Object obj : subList) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        q01.h0 h0Var = (q01.h0) obj;
                        q01.h0 h0Var2 = (q01.h0) e().get(i17);
                        arrayList.add(new jz5.l(new jz5.l(h0Var2, h0Var), java.lang.Long.valueOf(h0Var.f359291b - h0Var2.f359291b)));
                        i17 = i18;
                        j17 = j17;
                    }
                    long j18 = j17;
                    if (z17) {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        int i19 = 0;
                        for (java.lang.Object obj2 : kz5.n0.F0(arrayList, new q01.j0())) {
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            jz5.l lVar = (jz5.l) obj2;
                            if (i19 >= 5) {
                                break;
                            }
                            linkedHashMap.put("top-" + i19, ((q01.h0) ((jz5.l) lVar.f302833d).f302833d).f359290a + ">>" + ((q01.h0) ((jz5.l) lVar.f302833d).f302834e).f359290a);
                            linkedHashMap.put("top-" + i19 + "-thread", ((q01.h0) ((jz5.l) lVar.f302833d).f302834e).f359292c);
                            linkedHashMap.put("top-" + i19 + "-time", lVar.f302834e);
                            i19 = i27;
                        }
                        ap.a.a(10001, "cgiProfile", null, linkedHashMap, q01.a1.f359259a.a(this.f359316a), java.lang.String.valueOf(j18), java.lang.String.valueOf(e().size()));
                    }
                    str = "states=" + e().size() + ", cost=" + j18 + "ms, " + kz5.n0.g0(arrayList, ", ", null, null, 0, null, q01.i0.f359294d, 30, null);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneState", "#dumpStates " + f17 + ": " + str);
            }
        }
    }

    public final java.util.List e() {
        return (java.util.List) ((jz5.n) this.f359320e).getValue();
    }

    public final java.lang.String f(int i17) {
        com.tencent.mm.modelbase.m1 m1Var = this.f359316a;
        if (i17 == -1 || i17 == 0) {
            return "_@" + m1Var.hashCode();
        }
        return q01.a1.f359259a.a(m1Var) + '@' + m1Var.hashCode();
    }

    public final void g(int i17) {
        java.lang.String str;
        if (c()) {
            synchronized (e()) {
                if (e().size() >= 64) {
                    java.util.List<q01.h0> e17 = e();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
                    for (q01.h0 h0Var : e17) {
                        arrayList.add(" - STATE " + h0Var.f359290a + " at " + q01.g0.a(f359315f, h0Var.f359291b, "HH:mm:ss"));
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneState", "Duplicated states " + f(i17) + ": " + i17 + ", states=\n" + kz5.n0.g0(arrayList, "\n", null, null, 0, null, null, 62, null));
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (e().isEmpty()) {
                    str = "states=0";
                } else {
                    q01.h0 h0Var2 = (q01.h0) kz5.n0.X(e());
                    str = "states=" + e().size() + ", cost=" + (currentTimeMillis - ((q01.h0) kz5.n0.i0(e())).f359291b) + '/' + (currentTimeMillis - h0Var2.f359291b) + "ms";
                }
                java.lang.String name = java.lang.Thread.currentThread().getName();
                int myTid = android.os.Process.myTid();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneState", "#mark " + f(i17) + ' ' + this.f359318c + ">>" + i17 + '(' + name + '-' + myTid + "): " + str);
                this.f359318c = i17;
                java.util.List e18 = e();
                kotlin.jvm.internal.o.d(name);
                e18.add(new q01.h0(i17, currentTimeMillis, name, myTid));
            }
        }
    }

    public final void h(int i17) {
        if (c()) {
            boolean z17 = false;
            if (-1 <= i17 && i17 < 1000) {
                z17 = true;
            }
            if (!z17) {
                g(i17);
            } else {
                throw new java.lang.IllegalStateException("Can NOT use preserved state as custom: " + i17);
            }
        }
    }

    public final java.util.Map i() {
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Long l17;
        synchronized (e()) {
            java.util.List e17 = e();
            if (e17.size() > 1) {
                kz5.g0.t(e17, new q01.m0());
            }
            linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = e().iterator();
            if (it.hasNext()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(((q01.h0) it.next()).f359291b);
                while (it.hasNext()) {
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(((q01.h0) it.next()).f359291b);
                    if (valueOf.compareTo(valueOf2) > 0) {
                        valueOf = valueOf2;
                    }
                }
                l17 = valueOf;
            } else {
                l17 = null;
            }
            java.lang.Long l18 = l17;
            long longValue = l18 != null ? l18.longValue() : 0L;
            java.util.List e18 = e();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(longValue);
            sb6.append('|');
            java.lang.String g07 = kz5.n0.g0(e18, "|>", sb6.toString(), null, 0, null, new q01.l0(longValue), 28, null);
            b(linkedHashMap, "cgi_total_cost", 0, 300);
            b(linkedHashMap, "cgi_idle_cost", 0, 210);
            b(linkedHashMap, "cgi_dispatch_cost", 210, 230);
            b(linkedHashMap, "cgi_auth_cost", 230, 240);
            b(linkedHashMap, "cgi_create_task_cost", 240, 242);
            b(linkedHashMap, "cgi_mars_boot_cost", 242, 250);
            b(linkedHashMap, "cgi_connect_cost", 250, 251);
            b(linkedHashMap, "cgi_handshake_cost", 251, 254);
            b(linkedHashMap, "cgi_send_packet_cost", 254, 256);
            b(linkedHashMap, "cgi_read_packet_cost", 256, 258);
            b(linkedHashMap, "cgi_decode_packet_cost", 258, com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE);
            b(linkedHashMap, "cgi_mars_end_cost", com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE, 260);
            b(linkedHashMap, "cgi_mars_to_push_cost", 260, 281);
            b(linkedHashMap, "cgi_end_cost", 281, 300);
            linkedHashMap.put("cgi_link_details", g07);
        }
        return linkedHashMap;
    }
}
