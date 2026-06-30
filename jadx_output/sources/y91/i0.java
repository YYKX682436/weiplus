package y91;

/* loaded from: classes16.dex */
public class i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f460281h = 0;

    /* renamed from: e, reason: collision with root package name */
    public y91.x f460286e;

    /* renamed from: a, reason: collision with root package name */
    public final a66.c f460282a = new a66.c();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.Lock f460283b = new java.util.concurrent.locks.ReentrantReadWriteLock(true).writeLock();

    /* renamed from: c, reason: collision with root package name */
    public boolean f460284c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f460285d = -1;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f460288g = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.regex.Pattern f460287f = java.util.regex.Pattern.compile("uuid:([a-fA-F\\d]{8}(-[a-fA-F\\d]{4}){3}-[a-fA-F\\d]{12})");

    public i0(y91.a0 a0Var) {
    }

    public boolean a() {
        v91.b.b("i0", "mRouter is shutting down...");
        if (!this.f460284c) {
            return false;
        }
        ((java.util.HashSet) this.f460288g).clear();
        y91.x xVar = this.f460286e;
        synchronized (xVar) {
            xVar.f460326g = false;
            java.net.MulticastSocket multicastSocket = xVar.f460324e;
            if (multicastSocket != null && !multicastSocket.isClosed()) {
                xVar.f460324e.close();
            }
            java.net.MulticastSocket multicastSocket2 = xVar.f460325f;
            if (multicastSocket2 != null && !multicastSocket2.isClosed()) {
                try {
                    v91.b.b("x", "Leaving multicast group");
                    java.util.Iterator it = xVar.f460322c.iterator();
                    while (it.hasNext()) {
                        xVar.f460325f.leaveGroup(xVar.f460323d, (java.net.NetworkInterface) it.next());
                    }
                } catch (java.lang.Exception e17) {
                    v91.b.b("x", "Could not leave multicast group: " + e17);
                }
                xVar.f460325f.close();
            }
        }
        this.f460282a.d();
        this.f460284c = false;
        return true;
    }

    public boolean b() {
        v91.b.b("i0", "mRouter is starting ...");
        if (y91.k0.f460296d == null) {
            synchronized (y91.d.class) {
                if (y91.k0.f460296d == null) {
                    y91.k0.f460296d = new y91.k0(true);
                }
            }
        }
        this.f460285d = y91.k0.f460296d.f460299c;
        try {
            if (this.f460284c) {
                return false;
            }
            y91.x xVar = new y91.x(new y91.y("239.255.255.250", 1900), y91.z.c(), this, this.f460285d);
            this.f460286e = xVar;
            xVar.c();
            this.f460284c = true;
            return true;
        } catch (java.lang.Exception e17) {
            v91.b.c("i0", e17, "");
            return false;
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = this.f460287f.matcher(str);
        java.lang.String group = matcher.find() ? matcher.group(1) : null;
        if (group != null) {
            return group;
        }
        v91.b.a("i0", "fallbackGetUuid: " + str);
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return str;
    }

    public final void d(java.util.concurrent.locks.Lock lock) {
        try {
            if (lock.tryLock(6000, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            } else {
                throw new ba1.a("Router wasn't available exclusively after waiting 6000ms, lock failed: ".concat(lock.getClass().getSimpleName()));
            }
        } catch (java.lang.InterruptedException e17) {
            throw new ba1.a("Interruption while waiting for exclusive access: ".concat(lock.getClass().getSimpleName()), e17);
        }
    }

    public void e(aa1.b bVar) {
        java.util.concurrent.locks.Lock lock = this.f460283b;
        try {
            try {
                d(lock);
            } catch (java.lang.Exception e17) {
                v91.b.c("i0", e17, "");
            }
            if (this.f460284c) {
                if (h(bVar)) {
                    this.f460282a.a(new y91.e(bVar).a().g(new y91.f0(this, bVar), new y91.g0(this)));
                } else {
                    v91.b.b("i0", "parser fail");
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void f(boolean z17) {
        w91.i iVar = new w91.i(z17);
        if (!this.f460284c) {
            v91.b.a("i0", "DLNA Router is not enable");
            return;
        }
        y91.g gVar = new y91.g(iVar);
        y91.d dVar = gVar.f460272c;
        dVar.getClass();
        this.f460282a.a(((p56.l) ((ca1.b) gVar.f39771a).call(p56.l.b(new y91.b(dVar, gVar.f460271b)))).g(new y91.d0(this), new y91.e0(this)));
    }

    public void g(w91.f fVar, z91.a aVar) {
        if (!this.f460284c) {
            v91.b.a("i0", "DLNA Router is not enable");
            return;
        }
        y91.f fVar2 = new y91.f(fVar);
        y91.d dVar = fVar2.f460268c;
        dVar.getClass();
        this.f460282a.a(((p56.l) ((ca1.b) fVar2.f39771a).call(p56.l.b(new y91.c(dVar, fVar2.f460267b)))).g(new y91.b0(this, fVar, aVar), new y91.c0(this, aVar)));
    }

    public final boolean h(aa1.b bVar) {
        java.lang.String a17 = bVar.a("NT");
        java.lang.String a18 = bVar.a("ST");
        java.lang.String a19 = bVar.a("NTS");
        java.lang.String a27 = bVar.a("USN");
        java.lang.String a28 = bVar.a(com.google.android.gms.stats.CodePackage.LOCATION);
        if (!"upnp:rootdevice".equals(a17) && !"upnp:rootdevice".equals(a18)) {
            return false;
        }
        java.util.HashSet hashSet = (java.util.HashSet) this.f460288g;
        if (hashSet.size() > 0 && hashSet.contains(a28)) {
            return false;
        }
        java.lang.String c17 = c(a27);
        if (android.text.TextUtils.isEmpty(c17)) {
            return false;
        }
        x91.b b17 = x91.b.b();
        if (!"ssdp:alive".equals(a19)) {
            if ("ssdp:byebye".equals(a19)) {
                if (((java.util.HashMap) b17.f452631b).containsKey(c17)) {
                    b17.d(c17);
                }
                return false;
            }
            if (!android.text.TextUtils.isEmpty(a28)) {
                return !((java.util.HashMap) b17.f452631b).containsKey(c17);
            }
            v91.b.a("i0", "mDevice location is empty");
            return false;
        }
        x91.h hVar = (x91.h) ((java.util.HashMap) b17.f452631b).get(c17);
        if (hVar == null) {
            if (android.text.TextUtils.isEmpty(a28)) {
                return false;
            }
            hashSet.add(a28);
            return true;
        }
        if (hVar.f452647a.f452633a.equals(a28)) {
            return false;
        }
        b17.d(c17);
        hashSet.add(a28);
        return true;
    }
}
