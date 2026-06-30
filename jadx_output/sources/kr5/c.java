package kr5;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    public static kr5.c f311525f;

    /* renamed from: b, reason: collision with root package name */
    public kr5.g f311527b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f311528c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f311526a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public int f311529d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final sr5.c f311530e = new sr5.c(new kr5.b(this), 15L);

    public static kr5.c c() {
        if (f311525f == null) {
            synchronized (kr5.c.class) {
                if (f311525f == null) {
                    f311525f = new kr5.c();
                }
            }
        }
        return f311525f;
    }

    public final java.util.List a() {
        return "Https".equals(this.f311527b.f311554i) ? new java.util.ArrayList(java.util.Arrays.asList(kr5.d.f311532b)) : new java.util.ArrayList(java.util.Arrays.asList(kr5.d.f311534d));
    }

    public java.lang.String b() {
        if (this.f311526a.get() >= 3) {
            if (this.f311529d >= this.f311528c.size() - 1) {
                this.f311529d = 0;
                tr5.b.d(0);
            } else {
                this.f311529d++;
            }
            this.f311526a.set(0);
            or5.b.a("IP Changed：" + ((java.lang.String) this.f311528c.get(this.f311529d)), new java.lang.Object[0]);
        }
        return (java.lang.String) this.f311528c.get(this.f311529d);
    }

    public void d() {
        if ("Https".equals(this.f311527b.f311554i) || !kr5.p.f311571b.f311562q) {
            return;
        }
        sr5.c cVar = this.f311530e;
        java.util.Timer timer = cVar.f411868a;
        if (timer != null) {
            timer.cancel();
        }
        java.util.Timer timer2 = new java.util.Timer();
        cVar.f411868a = timer2;
        timer2.schedule(new sr5.b(cVar), cVar.f411869b.longValue());
    }

    public void e(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f311528c = list;
        or5.b.a("dns servers Ips: " + this.f311528c, new java.lang.Object[0]);
        this.f311529d = 0;
        this.f311526a.set(0);
    }
}
