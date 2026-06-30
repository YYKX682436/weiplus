package hx1;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: q, reason: collision with root package name */
    public static hx1.g f285622q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f285623a;

    /* renamed from: b, reason: collision with root package name */
    public long f285624b;

    /* renamed from: c, reason: collision with root package name */
    public long f285625c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f285626d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Toast f285628f;

    /* renamed from: h, reason: collision with root package name */
    public cv.b1 f285630h;

    /* renamed from: i, reason: collision with root package name */
    public cv.d1 f285631i;

    /* renamed from: l, reason: collision with root package name */
    public jx1.a f285634l;

    /* renamed from: e, reason: collision with root package name */
    public long f285627e = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f285632j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f285633k = "";

    /* renamed from: m, reason: collision with root package name */
    public ix1.n f285635m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f285636n = new hx1.d(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f285637o = new hx1.e(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f285638p = new com.tencent.mm.sdk.platformtools.b4(new hx1.f(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final fp.e f285629g = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);

    public static hx1.g a() {
        if (f285622q == null) {
            f285622q = new hx1.g();
        }
        return f285622q;
    }

    public final void b() {
        if (this.f285623a) {
            this.f285637o.removeMessages(4096);
            if (this.f285632j.equals("speex")) {
                ((w21.k0) this.f285631i).stopRecord();
            } else {
                ((tl.y0) this.f285630h).b();
            }
            fp.e eVar = this.f285629g;
            if (eVar != null) {
                eVar.a();
            }
            long j17 = this.f285624b;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            this.f285625c = j18;
            boolean z18 = j18 < 800;
            this.f285638p.d();
            if (z18) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f285633k);
                if (r6Var.m()) {
                    r6Var.l();
                }
                this.f285636n.sendEmptyMessageDelayed(0, 500L);
            } else {
                long j19 = this.f285625c / 1000;
            }
            this.f285623a = false;
        }
    }
}
