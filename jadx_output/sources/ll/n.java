package ll;

/* loaded from: classes13.dex */
public abstract class n implements java.lang.Runnable, java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f319117d;

    /* renamed from: e, reason: collision with root package name */
    public final int f319118e;

    /* renamed from: f, reason: collision with root package name */
    public long f319119f = java.lang.System.currentTimeMillis();

    public n(java.lang.String str, int i17) {
        this.f319117d = "";
        this.f319117d = str;
        this.f319118e = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ll.n nVar = (ll.n) obj;
        int abs = (int) (java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f319119f) / 1000);
        int i17 = this.f319118e;
        if (abs > 0) {
            i17 += abs;
        }
        return nVar.f319118e - i17;
    }

    public void h() {
    }
}
