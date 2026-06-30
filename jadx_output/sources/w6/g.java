package w6;

/* loaded from: classes13.dex */
public class g implements w6.k, u6.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f443105d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.l f443106e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.j f443107f;

    /* renamed from: g, reason: collision with root package name */
    public int f443108g = -1;

    /* renamed from: h, reason: collision with root package name */
    public t6.h f443109h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f443110i;

    /* renamed from: m, reason: collision with root package name */
    public int f443111m;

    /* renamed from: n, reason: collision with root package name */
    public volatile a7.o0 f443112n;

    /* renamed from: o, reason: collision with root package name */
    public java.io.File f443113o;

    public g(java.util.List list, w6.l lVar, w6.j jVar) {
        this.f443105d = list;
        this.f443106e = lVar;
        this.f443107f = jVar;
    }

    @Override // w6.k
    public boolean a() {
        while (true) {
            java.util.List list = this.f443110i;
            if (list != null) {
                if (this.f443111m < list.size()) {
                    this.f443112n = null;
                    boolean z17 = false;
                    while (!z17) {
                        if (!(this.f443111m < this.f443110i.size())) {
                            break;
                        }
                        java.util.List list2 = this.f443110i;
                        int i17 = this.f443111m;
                        this.f443111m = i17 + 1;
                        a7.p0 p0Var = (a7.p0) list2.get(i17);
                        java.io.File file = this.f443113o;
                        w6.l lVar = this.f443106e;
                        this.f443112n = p0Var.b(file, lVar.f443137e, lVar.f443138f, lVar.f443141i);
                        if (this.f443112n != null) {
                            if (this.f443106e.c(this.f443112n.f1848c.a()) != null) {
                                this.f443112n.f1848c.e(this.f443106e.f443147o, this);
                                z17 = true;
                            }
                        }
                    }
                    return z17;
                }
            }
            int i18 = this.f443108g + 1;
            this.f443108g = i18;
            if (i18 >= this.f443105d.size()) {
                return false;
            }
            t6.h hVar = (t6.h) this.f443105d.get(this.f443108g);
            w6.l lVar2 = this.f443106e;
            java.io.File a17 = ((w6.e0) lVar2.f443140h).a().a(new w6.h(hVar, lVar2.f443146n));
            this.f443113o = a17;
            if (a17 != null) {
                this.f443109h = hVar;
                this.f443110i = this.f443106e.f443135c.f43946b.e(a17);
                this.f443111m = 0;
            }
        }
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        this.f443107f.b(this.f443109h, obj, this.f443112n.f1848c, t6.a.DATA_DISK_CACHE, this.f443109h);
    }

    @Override // w6.k
    public void cancel() {
        a7.o0 o0Var = this.f443112n;
        if (o0Var != null) {
            o0Var.f1848c.cancel();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        this.f443107f.j(this.f443109h, exc, this.f443112n.f1848c, t6.a.DATA_DISK_CACHE);
    }
}
