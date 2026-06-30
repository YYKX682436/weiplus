package wh;

/* loaded from: classes12.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public long f445802a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f445803b = java.util.Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f445804c = true;

    public int a(java.lang.String str) {
        for (wh.h2 h2Var : this.f445803b) {
            java.lang.String str2 = h2Var.f445796a;
            if (str2 != null && str2.equals(str)) {
                return h2Var.f445797b;
            }
        }
        return 0;
    }

    public wh.h2 b() {
        if (this.f445803b.size() >= 1) {
            return (wh.h2) this.f445803b.get(0);
        }
        return null;
    }

    public wh.h2 c() {
        if (this.f445803b.size() >= 2) {
            return (wh.h2) this.f445803b.get(1);
        }
        return null;
    }
}
