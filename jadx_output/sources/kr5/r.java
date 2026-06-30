package kr5;

/* loaded from: classes13.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static volatile kr5.r f311573a;

    public static kr5.r b() {
        if (f311573a == null) {
            synchronized (kr5.r.class) {
                if (f311573a == null) {
                    f311573a = new kr5.r();
                }
            }
        }
        return f311573a;
    }

    public tr5.z a(java.lang.String str) {
        java.lang.String str2;
        if (!kr5.p.f311571b.f311560o) {
            or5.b.d("MSDKDnsResolver.getAddrsByName() called.", new java.lang.Object[0]);
            tr5.z zVar = tr5.z.f421508g;
            try {
                return kr5.p.b(str, kr5.p.f311571b.f311554i, true, false);
            } catch (java.lang.Exception e17) {
                or5.b.b("exception: %s", e17);
                return zVar;
            }
        }
        if (!kr5.p.f311572c) {
            throw new java.lang.IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        b().getClass();
        or5.b.d("MSDKDnsResolver.getDnsDetail() called.", new java.lang.Object[0]);
        try {
            str2 = kr5.p.c(str);
        } catch (java.lang.Exception e18) {
            or5.b.d("getDnsDetail exception:" + e18, new java.lang.Object[0]);
            str2 = "";
        }
        tr5.z zVar2 = tr5.z.f421508g;
        if (str2.isEmpty()) {
            ((lr5.d) lr5.e.f320770c).execute(new kr5.l(str));
            return zVar2;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String str3 = (java.lang.String) jSONObject.get("request_name");
            if (!str3.isEmpty()) {
                ((lr5.d) lr5.e.f320770c).execute(new kr5.m(str3));
                if (!kr5.p.f311571b.f311560o) {
                    return zVar2;
                }
            }
            java.lang.String obj = jSONObject.get("v4_ips").toString();
            java.lang.String obj2 = jSONObject.get("v6_ips").toString();
            return new tr5.z(obj.isEmpty() ? new java.lang.String[0] : obj.split(","), obj2.isEmpty() ? new java.lang.String[0] : obj2.split(","));
        } catch (org.json.JSONException unused) {
            return zVar2;
        }
    }

    public void c(android.content.Context context, kr5.g gVar) {
        try {
        } catch (java.lang.Exception e17) {
            or5.b.e("DnsService.init failed: %s", e17);
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context".concat(" can not be null"));
        }
        kr5.g a17 = gVar == null ? new kr5.f().a() : gVar;
        or5.b.f347703a = java.lang.Math.min(a17.f311546a, or5.b.f347703a);
        kr5.p.a(a17.f311558m);
        or5.b.d("DnsService.init(%s, %s) called, ver:%s", context, a17, "4.11.0a");
        android.content.Context applicationContext = context.getApplicationContext();
        kr5.p.f311570a = applicationContext;
        kr5.p.f311571b = a17;
        java.util.concurrent.Executor executor = lr5.e.f320770c;
        lr5.d dVar = (lr5.d) executor;
        dVar.execute(new kr5.h(applicationContext));
        kr5.c c17 = kr5.c.c();
        c17.f311527b = kr5.p.f311571b;
        c17.f311526a = new java.util.concurrent.atomic.AtomicInteger(0);
        c17.e(c17.a());
        ((lr5.d) executor).execute(new kr5.a(c17));
        dVar.execute(new kr5.i());
        if (gs5.h.f275171a == null) {
            synchronized (kr5.c.class) {
                if (gs5.h.f275171a == null) {
                    gs5.h.f275171a = new gs5.h();
                }
            }
        }
        gs5.h.f275171a.getClass();
        if (applicationContext == null) {
            or5.b.e("Install network change manager failed: context can not be null", new java.lang.Object[0]);
        } else if (pr5.d.f358047a == null) {
            synchronized (pr5.d.class) {
                if (pr5.d.f358047a == null) {
                    pr5.d.f358047a = new pr5.f(applicationContext);
                }
            }
        }
        java.util.List list = nr5.c.f339342a;
        if (nr5.d.f339344a == null) {
            android.app.Application a18 = nr5.d.a(applicationContext);
            nr5.d.f339344a = a18;
            if (a18 == null) {
                nr5.d.f339344a = nr5.d.a(qr5.e.f366136a.a());
            }
        }
        android.app.Application application = nr5.d.f339344a;
        if (application != null) {
            nr5.c.f339343b = true;
            application.registerActivityLifecycleCallbacks(new nr5.b());
        }
        dVar.execute(new kr5.j());
        gs5.f.b(a17);
        kr5.p.f311571b.getClass();
        or5.b.d("DnsService.setLookedUpListener(%s) called", null);
        java.util.List list2 = a17.f311559n;
        or5.b.d("DnsService.addReporters(%s) called", sr5.a.e(list2));
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                java.util.List list3 = rr5.a.f399234a;
                synchronized (rr5.a.class) {
                }
            }
        }
        kr5.p.f311572c = true;
        kr5.p.d();
        or5.b.a("MSDKDnsResolver.init() called, ver:%s, channel:%s", "4.11.0a", gVar.f311554i);
    }
}
