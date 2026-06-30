package d9;

/* loaded from: classes15.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f227370a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.Format[] f227371b;

    /* renamed from: c, reason: collision with root package name */
    public int f227372c;

    public k0(com.google.android.exoplayer2.Format... formatArr) {
        t9.a.d(formatArr.length > 0);
        this.f227371b = formatArr;
        this.f227370a = formatArr.length;
    }

    public int a(com.google.android.exoplayer2.Format format) {
        int i17 = 0;
        while (true) {
            com.google.android.exoplayer2.Format[] formatArr = this.f227371b;
            if (i17 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i17]) {
                return i17;
            }
            i17++;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.k0.class != obj.getClass()) {
            return false;
        }
        d9.k0 k0Var = (d9.k0) obj;
        return this.f227370a == k0Var.f227370a && java.util.Arrays.equals(this.f227371b, k0Var.f227371b);
    }

    public int hashCode() {
        if (this.f227372c == 0) {
            this.f227372c = com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + java.util.Arrays.hashCode(this.f227371b);
        }
        return this.f227372c;
    }
}
