package k81;

@j95.b
/* loaded from: classes7.dex */
public final class a extends i95.w implements j81.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f304863d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f304864e = new java.util.HashSet();

    public a() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = lp0.b.D() + "appbrand/appBrandXnetModelCache/";
        }
        com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(new java.io.File(str));
        if (j17 == null) {
            this.f304863d = "";
            return;
        }
        java.lang.String o17 = j17.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        this.f304863d = o17;
        if (r26.i0.o(o17, "/", false, 2, null)) {
            return;
        }
        this.f304863d = o17 + '/';
    }

    public java.lang.String Ai(java.lang.String appid) {
        com.tencent.mm.vfs.x1 m17;
        kotlin.jvm.internal.o.g(appid, "appid");
        int Z3 = ((v81.e) i95.n0.c(v81.e.class)).Z3(appid);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f304863d);
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(new kk.v(Z3) + '#' + appid));
        java.lang.String sb7 = sb6.toString();
        java.util.HashSet hashSet = this.f304864e;
        if (!hashSet.contains(appid)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb7);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, null);
            if ((!m18.a() || (m17 = m18.f213266a.m(m18.f213267b)) == null || m17.f213236f) ? false : true) {
                com.tencent.mm.vfs.w6.h(sb7);
            }
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(sb7);
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m19 = b3Var.m(a18, null);
            if (!(m19.a() ? m19.f213266a.F(m19.f213267b) : false)) {
                com.tencent.mm.vfs.w6.u(sb7);
            }
            hashSet.add(sb7);
        }
        return sb7;
    }

    public long Bi(java.lang.String appid) {
        java.lang.Long l17;
        kotlin.jvm.internal.o.g(appid, "appid");
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(Ai(appid), true);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((com.tencent.mm.vfs.x1) it.next()).f213234d;
            }
            l17 = java.lang.Long.valueOf(j17);
        } else {
            l17 = null;
        }
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    public void wi(java.lang.String appid) {
        kotlin.jvm.internal.o.g(appid, "appid");
        this.f304864e.remove(appid);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXNetModelCache", "[clear] result" + com.tencent.mm.vfs.w6.g(Ai(appid), true) + " appid:" + appid);
    }
}
