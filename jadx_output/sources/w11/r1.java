package w11;

/* loaded from: classes11.dex */
public class r1 {

    /* renamed from: f, reason: collision with root package name */
    public int f442131f;

    /* renamed from: g, reason: collision with root package name */
    public long f442132g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f442133h;

    /* renamed from: i, reason: collision with root package name */
    public int f442134i;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f442136k;

    /* renamed from: l, reason: collision with root package name */
    public w11.p1 f442137l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f442138m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f442139n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f442140o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f442141p;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f442126a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442127b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f442128c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f442129d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f442130e = 1;

    /* renamed from: j, reason: collision with root package name */
    public c01.h7 f442135j = new c01.h7();

    public static /* synthetic */ void d(w11.r1 r1Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeByPPC");
        }
        if ((i17 & 1) != 0) {
            lVar = w11.q1.f442113d;
        }
        r1Var.c(lVar);
    }

    public final w11.n1 a() {
        w11.m1 a17;
        w11.n1 n1Var = new w11.n1();
        w11.o1 o1Var = w11.s1.f442146a;
        if (o1Var != null && (a17 = ((aq1.l) o1Var).a(this)) != null) {
            n1Var.f442095a = a17.f442088a;
            n1Var.f442096b = a17.f442089b;
        }
        return n1Var;
    }

    public final void b() {
        d(this, null, 1, null);
    }

    public final void c(yz5.l msgIdCallback) {
        kotlin.jvm.internal.o.g(msgIdCallback, "msgIdCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgCgiFactory", "executeByPPC() called with: content size = " + this.f442129d.length() + " isByp = " + com.tencent.mm.storage.z3.K3(this.f442127b));
        if (this.f442137l == w11.p1.f442102d) {
            y11.b0 b0Var = (y11.b0) ((qx.j0) i95.n0.c(qx.j0.class));
            b0Var.getClass();
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) b0Var.f458804m).getValue(), null, new y11.y(this, c01.w9.o(this.f442127b), msgIdCallback, null), 1, null);
        }
    }

    public final w11.r1 e(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f442129d = str;
        return this;
    }

    public final w11.r1 f(c01.h7 h7Var) {
        if (h7Var == null) {
            h7Var = new c01.h7();
        }
        this.f442135j = h7Var;
        return this;
    }

    public final w11.r1 g(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f442127b = str;
        return this;
    }

    public w11.r1 h(int i17) {
        this.f442130e = i17;
        return this;
    }
}
