package r9;

/* loaded from: classes15.dex */
public final class o implements r9.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f393390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f393391b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.a[] f393392c;

    /* renamed from: d, reason: collision with root package name */
    public int f393393d;

    /* renamed from: e, reason: collision with root package name */
    public int f393394e;

    /* renamed from: f, reason: collision with root package name */
    public int f393395f;

    /* renamed from: g, reason: collision with root package name */
    public r9.a[] f393396g;

    public o(boolean z17, int i17) {
        t9.a.a(i17 > 0);
        this.f393390a = z17;
        this.f393391b = i17;
        this.f393395f = 0;
        this.f393396g = new r9.a[100];
        this.f393392c = new r9.a[1];
    }

    public synchronized void a(r9.a[] aVarArr) {
        boolean z17;
        int i17 = this.f393395f;
        int length = aVarArr.length + i17;
        r9.a[] aVarArr2 = this.f393396g;
        if (length >= aVarArr2.length) {
            this.f393396g = (r9.a[]) java.util.Arrays.copyOf(aVarArr2, java.lang.Math.max(aVarArr2.length * 2, i17 + aVarArr.length));
        }
        for (r9.a aVar : aVarArr) {
            byte[] bArr = aVar.f393340a;
            if (bArr != null && bArr.length != this.f393391b) {
                z17 = false;
                t9.a.a(z17);
                r9.a[] aVarArr3 = this.f393396g;
                int i18 = this.f393395f;
                this.f393395f = i18 + 1;
                aVarArr3[i18] = aVar;
            }
            z17 = true;
            t9.a.a(z17);
            r9.a[] aVarArr32 = this.f393396g;
            int i182 = this.f393395f;
            this.f393395f = i182 + 1;
            aVarArr32[i182] = aVar;
        }
        this.f393394e -= aVarArr.length;
        notifyAll();
    }

    public synchronized void b() {
        int i17 = this.f393393d;
        int i18 = this.f393391b;
        int i19 = t9.d0.f416498a;
        int max = java.lang.Math.max(0, (((i17 + i18) - 1) / i18) - this.f393394e);
        int i27 = this.f393395f;
        if (max >= i27) {
            return;
        }
        java.util.Arrays.fill(this.f393396g, max, i27, (java.lang.Object) null);
        this.f393395f = max;
    }
}
