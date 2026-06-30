package q9;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f360867a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.m[] f360868b;

    /* renamed from: c, reason: collision with root package name */
    public int f360869c;

    public n(q9.m... mVarArr) {
        this.f360868b = mVarArr;
        this.f360867a = mVarArr.length;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q9.n.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f360868b, ((q9.n) obj).f360868b);
    }

    public int hashCode() {
        if (this.f360869c == 0) {
            this.f360869c = com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + java.util.Arrays.hashCode(this.f360868b);
        }
        return this.f360869c;
    }
}
