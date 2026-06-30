package cw1;

/* loaded from: classes12.dex */
public class v4 implements bw1.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f223372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.b3 f223373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f223374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f223375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI f223376h;

    public v4(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI, com.tencent.wcdb.support.CancellationSignal cancellationSignal, cw1.b3 b3Var, long j17, long j18) {
        this.f223376h = cleanChattingDetailUI;
        this.f223372d = cancellationSignal;
        this.f223373e = b3Var;
        this.f223374f = j17;
        this.f223375g = j18;
    }

    @Override // bw1.k
    public void K2(final int i17, final int i18) {
        yv1.h1.f(2, this.f223372d);
        ku5.u0 u0Var = ku5.t0.f312615d;
        final cw1.b3 b3Var = this.f223373e;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: cw1.v4$$a
            @Override // java.lang.Runnable
            public final void run() {
                ((cw1.a3) cw1.b3.this).b(i17, i18);
            }
        });
    }

    @Override // bw1.k
    public void Y4() {
        yv1.h1.f(1, this.f223372d);
    }

    @Override // bw1.k
    public void j6(final boolean z17, final long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingDetailUI", "onDeleteEnd [%d] ", java.lang.Long.valueOf(j17));
        ku5.u0 u0Var = ku5.t0.f312615d;
        final cw1.b3 b3Var = this.f223373e;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: cw1.v4$$b
            @Override // java.lang.Runnable
            public final void run() {
                cw1.v4 v4Var = cw1.v4.this;
                v4Var.getClass();
                cw1.a3 a3Var = (cw1.a3) b3Var;
                boolean z18 = z17;
                long a17 = a3Var.a(z18, j17);
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI = v4Var.f223376h;
                cleanChattingDetailUI.V += a17;
                cleanChattingDetailUI.W.getClass();
                java.util.Iterator it = cw1.q4.f223264t.values().iterator();
                while (it.hasNext()) {
                    ((cw1.e4) it.next()).a(true);
                }
                if (z18) {
                    cleanChattingDetailUI.X6();
                    cleanChattingDetailUI.W.I(cleanChattingDetailUI.N, cleanChattingDetailUI.Q, cleanChattingDetailUI.R, cleanChattingDetailUI.S, cleanChattingDetailUI.f95717y, cleanChattingDetailUI.f95718z, cleanChattingDetailUI.A, cleanChattingDetailUI.P, false, cleanChattingDetailUI.B, cleanChattingDetailUI.X, null);
                } else {
                    cw1.q4 q4Var = cleanChattingDetailUI.W;
                    q4Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList(q4Var.f223266e.size());
                    int size = q4Var.f223266e.size();
                    int i17 = -1;
                    while (true) {
                        i17 = q4Var.f223269h.nextClearBit(i17 + 1);
                        if (i17 >= size) {
                            break;
                        } else {
                            arrayList.add((bw1.l) q4Var.f223266e.get(i17));
                        }
                    }
                    java.util.List a18 = q4Var.f223267f.isEmpty() ? q4Var.f223267f : cw1.r4.a(arrayList);
                    q4Var.f223266e = arrayList;
                    q4Var.f223267f = a18;
                    q4Var.f223269h = new java.util.BitSet();
                    q4Var.notifyDataSetChanged();
                    q4Var.f223270i = 0L;
                    q4Var.f223271m = 0;
                    q4Var.f223265d.h7(0L, q4Var.f223266e.size(), q4Var.f223271m);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("u", cleanChattingDetailUI.N);
                intent.putExtra("ds", cleanChattingDetailUI.T);
                intent.putExtra("dc", cleanChattingDetailUI.U);
                intent.putExtra("tds", cleanChattingDetailUI.V);
                cleanChattingDetailUI.setResult(-1, intent);
                java.lang.Runnable runnable = cleanChattingDetailUI.F;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331201k = true;
        if (!z17) {
            mt1.b0.s(this.f223376h.N == null ? 26 : 9, java.lang.System.currentTimeMillis() - this.f223374f, java.lang.Long.valueOf(j17));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
        hashMap.put("storage_manage_sessionid", this.f223376h.f95713u.f466043b);
        hashMap.put("chat_history_remove_scene", java.lang.Integer.valueOf(this.f223376h.N == null ? 1 : 3));
        hashMap.put("storage_enter_scene", java.lang.Integer.valueOf(this.f223376h.f95700e));
        hashMap.put("chat_history_media_remove_size", java.lang.Long.valueOf(this.f223375g));
        hashMap.put("chat_history_media_removed_size", java.lang.Long.valueOf(j17));
        hashMap.put("chat_history_remove_end_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_history_remove_end", hashMap, 32903);
    }
}
