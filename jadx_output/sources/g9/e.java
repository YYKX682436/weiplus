package g9;

/* loaded from: classes15.dex */
public final class e extends q9.e {

    /* renamed from: g, reason: collision with root package name */
    public int f269567g;

    public e(d9.k0 k0Var, int[] iArr) {
        super(k0Var, iArr);
        int i17 = 0;
        com.google.android.exoplayer2.Format format = k0Var.f227371b[0];
        while (true) {
            if (i17 >= this.f360848b) {
                i17 = -1;
                break;
            } else if (this.f360850d[i17] == format) {
                break;
            } else {
                i17++;
            }
        }
        this.f269567g = i17;
    }

    @Override // q9.m
    public void a(long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (f(this.f269567g, elapsedRealtime)) {
            for (int i17 = this.f360848b - 1; i17 >= 0; i17--) {
                if (!f(i17, elapsedRealtime)) {
                    this.f269567g = i17;
                    return;
                }
            }
            throw new java.lang.IllegalStateException();
        }
    }

    @Override // q9.m
    public java.lang.Object b() {
        return null;
    }

    @Override // q9.m
    public int c() {
        return 0;
    }

    @Override // q9.m
    public int getSelectedIndex() {
        return this.f269567g;
    }
}
