package cw1;

/* loaded from: classes12.dex */
public class e5 implements bw1.k, c01.fa, c01.da {

    /* renamed from: f, reason: collision with root package name */
    public final long f222908f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f222909g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f222910h;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f222912m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f222913n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f222914o;

    /* renamed from: p, reason: collision with root package name */
    public final int f222915p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f222916q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI f222917r;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f222906d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f222907e = -1;

    /* renamed from: i, reason: collision with root package name */
    public final long f222911i = java.lang.System.currentTimeMillis();

    public e5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI, long j17, boolean z17, boolean z18, int i17, boolean z19) {
        this.f222917r = cleanChattingOldUI;
        this.f222908f = j17;
        this.f222909g = z17;
        this.f222910h = z18;
        this.f222915p = i17;
        this.f222912m = z19;
    }

    @Override // bw1.k
    public void K2(int i17, int i18) {
        this.f222913n = i17;
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.e5$$b(this));
    }

    @Override // bw1.k
    public void Y4() {
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.fa
    public void b(int i17, int i18) {
        this.f222914o = i17;
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.e5$$b(this));
    }

    @Override // c01.da
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "Triggered async delete messages");
        this.f222906d = -1;
        if (this.f222907e >= 0) {
            e();
        }
    }

    @Override // c01.fa
    public void d(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "Done delete messages, cancelled: " + z17 + ", count: " + i17);
        if (!z17) {
            aw1.l1.f14588d.a();
        }
        this.f222916q = z17 | this.f222916q;
        this.f222906d = i17;
        if (this.f222907e >= 0) {
            e();
        }
    }

    public final void e() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = this.f222917r;
        cleanChattingOldUI.f95758z += this.f222908f;
        yv1.f1 f1Var = yv1.g1.f466040p;
        ((cw1.a5$$r) cleanChattingOldUI.A).run();
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cw1.e5$$a
            @Override // java.lang.Runnable
            public final void run() {
                cw1.e5 e5Var = cw1.e5.this;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI2 = e5Var.f222917r;
                android.app.ProgressDialog progressDialog = cleanChattingOldUI2.f95748p;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                db5.t7.h(cleanChattingOldUI2, e5Var.f222916q ? cleanChattingOldUI2.getString(com.tencent.mm.R.string.a_3) : cleanChattingOldUI2.getString(com.tencent.mm.R.string.b8q, fp.n0.a(e5Var.f222908f)));
                cleanChattingOldUI2.setResult(-1, new android.content.Intent().putExtra("tds", cleanChattingOldUI2.f95758z));
            }
        });
        long j17 = this.f222917r.f95756x ? this.f222917r.f95752t == -2 ? 0L : this.f222917r.f95752t == -1 ? -2L : this.f222917r.f95752t / 86400000 : -1L;
        if (this.f222916q) {
            mt1.b0.s(13, java.lang.System.currentTimeMillis() - this.f222911i, java.lang.Long.valueOf(this.f222906d));
        } else {
            int i17 = this.f222909g ? 6 : 7;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f222911i;
            java.lang.Long[] lArr = new java.lang.Long[6];
            lArr[0] = java.lang.Long.valueOf(this.f222908f);
            lArr[1] = java.lang.Long.valueOf(this.f222910h ? 1L : 0L);
            lArr[2] = java.lang.Long.valueOf(this.f222917r.f95755w ? this.f222917r.f95751s : -1);
            lArr[3] = java.lang.Long.valueOf(j17);
            lArr[4] = java.lang.Long.valueOf(this.f222917r.f95757y ? this.f222917r.f95754v : -1);
            lArr[5] = java.lang.Long.valueOf(this.f222906d);
            mt1.b0.s(i17, currentTimeMillis, lArr);
        }
        mt1.b0.f331201k = true;
    }

    @Override // bw1.k
    public void j6(boolean z17, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17 ? "cancelled" : ya.b.SUCCESS;
        objArr[1] = java.lang.Long.valueOf(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "onDeleteEnd [%s, %d] ", objArr);
        if (!z17 && this.f222912m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "Delete all messages, clear C2C directories.");
            com.tencent.mm.vfs.w6.f("wcf://image2/");
            com.tencent.mm.vfs.w6.f("wcf://video/");
            com.tencent.mm.vfs.w6.f("wcf://voice2/");
            com.tencent.mm.vfs.w6.f("wcf://attachment/");
            com.tencent.mm.vfs.w6.f("wcf://record/");
        }
        this.f222916q = z17 | this.f222916q;
        this.f222907e = j17;
        if (this.f222906d >= -1) {
            e();
        }
    }
}
