package cw1;

/* loaded from: classes12.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile int f223316d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f223317e = new boolean[3];

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView[] f223318f = new android.widget.TextView[3];

    /* renamed from: g, reason: collision with root package name */
    public final int[] f223319g = new int[3];

    /* renamed from: h, reason: collision with root package name */
    public final int[] f223320h = {100, 100, 100};

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI f223321i;

    public s6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI cleanNewUI, cw1.n6 n6Var) {
        this.f223321i = cleanNewUI;
    }

    public void a(int i17) {
        this.f223317e[i17] = true;
        int i18 = 0;
        while (true) {
            boolean[] zArr = this.f223317e;
            if (i18 >= zArr.length || !zArr[i18]) {
                break;
            } else {
                i18++;
            }
        }
        this.f223316d = i18;
        run();
    }

    public void b(int i17, int i18, int i19) {
        if (i18 < 0) {
            i18 = 0;
        } else if (i18 > i19) {
            i18 = i19;
        }
        int[] iArr = this.f223319g;
        iArr[i17] = java.lang.Math.max(i18, iArr[i17]);
        this.f223320h[i17] = i19;
        if (i17 == this.f223316d) {
            ((ku5.t0) ku5.t0.f312615d).B(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f223316d == 0) {
            this.f223318f[this.f223316d].setText(this.f223321i.getString(com.tencent.mm.R.string.b7w, java.lang.Integer.valueOf((this.f223319g[this.f223316d] * 100) / this.f223320h[this.f223316d])));
        }
    }
}
