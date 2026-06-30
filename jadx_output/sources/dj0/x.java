package dj0;

/* loaded from: classes14.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final dj0.w f232887a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            int i17 = dj0.v.f232884r;
        } else {
            int i18 = dj0.w.f232885b;
        }
    }

    public x(android.view.WindowInsets windowInsets) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            this.f232887a = new dj0.v(this, windowInsets);
            return;
        }
        if (i17 >= 29) {
            this.f232887a = new dj0.u(this, windowInsets);
        } else if (i17 >= 28) {
            this.f232887a = new dj0.t(this, windowInsets);
        } else {
            this.f232887a = new dj0.s(this, windowInsets);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj0.x)) {
            return false;
        }
        return m3.c.a(this.f232887a, ((dj0.x) obj).f232887a);
    }

    public int hashCode() {
        dj0.w wVar = this.f232887a;
        if (wVar == null) {
            return 0;
        }
        return wVar.hashCode();
    }

    public x(dj0.x xVar) {
        if (xVar != null) {
            dj0.w wVar = xVar.f232887a;
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 30 && (wVar instanceof dj0.v)) {
                this.f232887a = new dj0.v(this, (dj0.v) wVar);
            } else if (i17 >= 29 && (wVar instanceof dj0.u)) {
                this.f232887a = new dj0.u(this, (dj0.u) wVar);
            } else if (i17 >= 28 && (wVar instanceof dj0.t)) {
                this.f232887a = new dj0.t(this, (dj0.t) wVar);
            } else if (wVar instanceof dj0.s) {
                this.f232887a = new dj0.s(this, (dj0.s) wVar);
            } else if (wVar instanceof dj0.r) {
                this.f232887a = new dj0.r(this, (dj0.r) wVar);
            } else {
                this.f232887a = new dj0.w(this);
            }
            wVar.e(this);
            return;
        }
        this.f232887a = new dj0.w(this);
    }
}
