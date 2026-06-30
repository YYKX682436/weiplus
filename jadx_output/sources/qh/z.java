package qh;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final qh.a0 f363391a = new qh.a0(null);

    public qh.z a(java.lang.String str) {
        qh.a0 a0Var = this.f363391a;
        if (a0Var.f363305x == java.util.Collections.EMPTY_LIST) {
            a0Var.f363305x = new java.util.ArrayList();
        }
        a0Var.f363305x.add(str);
        return this;
    }

    public qh.z b(long j17) {
        if (j17 > 0) {
            this.f363391a.f363288g = j17;
        }
        return this;
    }

    public qh.a0 c() {
        qh.a0 a0Var = this.f363391a;
        java.util.Collections.sort(a0Var.f363306y, new qh.y(this));
        if (a0Var.f363307z == null) {
            a0Var.f363307z = new com.tencent.matrix.batterycanary.stats.i();
        }
        if (a0Var.A == null) {
            a0Var.A = new wh.s();
        }
        return a0Var;
    }

    public qh.z d(java.lang.Class cls) {
        try {
            ((java.util.ArrayList) this.f363391a.f363306y).add((rh.e3) cls.newInstance());
        } catch (java.lang.Exception unused) {
        }
        return this;
    }

    public qh.z e(boolean z17) {
        this.f363391a.f363300s = z17;
        return this;
    }

    public qh.z f(boolean z17) {
        this.f363391a.f363298q = z17;
        return this;
    }

    public qh.z g(boolean z17) {
        this.f363391a.f363296o = z17;
        return this;
    }

    public qh.z h(boolean z17) {
        this.f363391a.f363297p = z17;
        return this;
    }

    public qh.z i(boolean z17) {
        this.f363391a.D = z17;
        return this;
    }

    public qh.z j(int i17) {
        this.f363391a.f363290i = i17;
        return this;
    }

    public qh.z k(int i17) {
        if (i17 >= 0) {
            this.f363391a.f363299r = i17;
        }
        return this;
    }

    public qh.z l(int i17) {
        if (i17 > 1000) {
            this.f363391a.f363292k = i17;
        }
        return this;
    }

    public qh.z m(wh.s sVar) {
        this.f363391a.A = sVar;
        return this;
    }

    public qh.z n(int i17) {
        if (i17 > 1000) {
            this.f363391a.f363291j = i17;
        }
        return this;
    }

    public qh.z o(int i17) {
        if (i17 >= 10) {
            this.f363391a.f363289h = i17;
        }
        return this;
    }

    public qh.z p(java.util.concurrent.Callable callable) {
        this.f363391a.f363284c = callable;
        return this;
    }

    public qh.z q(boolean z17) {
        this.f363391a.f363301t = z17;
        return this;
    }
}
