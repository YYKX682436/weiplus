package yv1;

/* loaded from: classes12.dex */
public final class n0 implements bw1.k, c01.fa {

    /* renamed from: d, reason: collision with root package name */
    public final int f466113d;

    /* renamed from: e, reason: collision with root package name */
    public final c01.e8 f466114e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f466115f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer[] f466116g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f466117h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f466118i;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f466119m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f466120n;

    public n0(int i17, c01.e8 e8Var, boolean z17) {
        this.f466113d = i17;
        this.f466114e = e8Var;
        this.f466115f = z17;
        java.lang.Integer[] numArr = {3, 5, 1, 1};
        this.f466116g = numArr;
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i18 = 0; i18 < length; i18++) {
            iArr[i18] = this.f466113d;
        }
        this.f466117h = iArr;
        this.f466118i = new int[this.f466116g.length];
    }

    @Override // bw1.k
    public void K2(int i17, int i18) {
        this.f466118i[0] = i17;
        this.f466117h[0] = i18;
        a();
    }

    @Override // bw1.k
    public void Y4() {
    }

    public final void a() {
        c01.e8 e8Var = this.f466114e;
        if (e8Var == null) {
            return;
        }
        java.lang.Integer[] numArr = this.f466116g;
        kotlin.jvm.internal.o.g(numArr, "<this>");
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Integer num : numArr) {
            i18 += num.intValue();
        }
        long j17 = 1000;
        long j18 = i18 * 1000;
        int length = this.f466118i.length;
        long j19 = 0;
        while (i17 < length) {
            int i19 = this.f466117h[i17];
            j19 += i19 <= 0 ? numArr[i17].intValue() * j17 : ((r2[i17] * j17) / i19) * numArr[i17].intValue();
            i17++;
            j17 = 1000;
        }
        e8Var.b((int) j19, (int) j18);
    }

    @Override // c01.fa
    public void b(int i17, int i18) {
        this.f466118i[1] = i17;
        this.f466117h[1] = i18;
        a();
    }

    @Override // c01.fa
    public void d(boolean z17, int i17) {
        this.f466120n = i17;
        if (z17 || !this.f466115f) {
            return;
        }
        aw1.l1.f14588d.a();
    }

    @Override // bw1.k
    public void j6(boolean z17, long j17) {
        this.f466119m = j17;
        if (!z17 && this.f466115f) {
            com.tencent.mm.vfs.w6.f("wcf://image2/");
            com.tencent.mm.vfs.w6.f("wcf://video/");
            com.tencent.mm.vfs.w6.f("wcf://voice2/");
            com.tencent.mm.vfs.w6.f("wcf://attachment/");
            com.tencent.mm.vfs.w6.f("wcf://record/");
            com.tencent.mm.vfs.w6.f("wcf://c2c/");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Done delete files");
    }
}
