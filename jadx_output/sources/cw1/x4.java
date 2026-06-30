package cw1;

/* loaded from: classes12.dex */
public class x4 implements bw1.k, c01.e8 {

    /* renamed from: d, reason: collision with root package name */
    public final long f223488d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f223489e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f223490f;

    /* renamed from: g, reason: collision with root package name */
    public final long f223491g = java.lang.System.currentTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public final cw1.b3 f223492h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f223493i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI f223494m;

    public x4(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI, boolean z17, boolean z18, long j17, cw1.b3 b3Var, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f223494m = cleanChattingNewUI;
        this.f223489e = z17;
        this.f223490f = z18;
        this.f223488d = j17;
        this.f223492h = b3Var;
        this.f223493i = cancellationSignal;
    }

    @Override // bw1.k
    public void K2(int i17, int i18) {
        yv1.h1.f(2, this.f223493i);
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.x4$$a(this, i17, i18));
    }

    @Override // bw1.k
    public void Y4() {
        yv1.h1.f(1, this.f223493i);
    }

    public final void a(long j17, int i17, final boolean z17) {
        int i18;
        int i19;
        yv1.f1 f1Var = yv1.g1.f466040p;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI = this.f223494m;
        int i27 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
        cleanChattingNewUI.j7(null);
        final long d17 = j17 + (i17 > 0 ? i17 * aw1.v.d() : 0L);
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cw1.x4$$b
            @Override // java.lang.Runnable
            public final void run() {
                cw1.x4 x4Var = cw1.x4.this;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI2 = x4Var.f223494m;
                java.lang.Runnable runnable = cleanChattingNewUI2.F;
                if (runnable != null) {
                    runnable.run();
                }
                cleanChattingNewUI2.R += ((cw1.a3) x4Var.f223492h).a(z17, d17);
                cleanChattingNewUI2.setResult(-1, new android.content.Intent().putExtra("tds", cleanChattingNewUI2.R));
            }
        });
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI2 = this.f223494m;
        long j18 = -1;
        if (cleanChattingNewUI2.D) {
            long j19 = cleanChattingNewUI2.f95715w;
            j18 = j19 == -2 ? 0L : j19 == -1 ? -2L : j19 / 86400000;
        }
        if (z17) {
            mt1.b0.s(13, java.lang.System.currentTimeMillis() - this.f223491g, java.lang.Long.valueOf(i17));
        } else {
            int i28 = this.f223489e ? 23 : 24;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f223491g;
            java.lang.Long[] lArr = new java.lang.Long[6];
            lArr[0] = java.lang.Long.valueOf(j17);
            lArr[1] = java.lang.Long.valueOf(this.f223490f ? 1L : 0L);
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI3 = this.f223494m;
            if (cleanChattingNewUI3.C) {
                i19 = cleanChattingNewUI3.f95714v;
                i18 = i28;
            } else {
                i18 = i28;
                i19 = -1;
            }
            lArr[2] = java.lang.Long.valueOf(i19);
            lArr[3] = java.lang.Long.valueOf(j18);
            lArr[4] = java.lang.Long.valueOf(this.f223494m.E ? r4.f95717y : -1);
            lArr[5] = java.lang.Long.valueOf(i17);
            mt1.b0.s(i18, currentTimeMillis, lArr);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
        hashMap.put("storage_manage_sessionid", this.f223494m.f95713u.f466043b);
        hashMap.put("chat_history_remove_scene", java.lang.Integer.valueOf(this.f223494m.a7()));
        hashMap.put("storage_enter_scene", java.lang.Integer.valueOf(this.f223494m.f95700e));
        if (this.f223489e) {
            hashMap.put("chat_history_media_remove_size", java.lang.Long.valueOf(this.f223488d));
            hashMap.put("chat_history_media_removed_size", java.lang.Long.valueOf(d17));
        } else {
            hashMap.put("chat_history_text_remove_size", java.lang.Long.valueOf(this.f223488d));
            hashMap.put("chat_history_text_removed_size", java.lang.Long.valueOf(d17));
        }
        hashMap.put("chat_history_remove_end_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_history_remove_end", hashMap, 32903);
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331201k = true;
    }

    @Override // c01.e8
    public void b(int i17, int i18) {
        yv1.h1.f(2, this.f223493i);
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.x4$$a(this, i17, i18));
    }

    @Override // c01.e8
    public void c(boolean z17, long j17, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = z17 ? "cancelled" : ya.b.SUCCESS;
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "onDeleteDone [%s, %d, %d] ", objArr);
        a(j17, i17, z17);
    }

    @Override // bw1.k
    public void j6(boolean z17, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17 ? "cancelled" : ya.b.SUCCESS;
        objArr[1] = java.lang.Long.valueOf(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "onDeleteEnd [%s, %d] ", objArr);
        a(j17, 0, z17);
    }
}
