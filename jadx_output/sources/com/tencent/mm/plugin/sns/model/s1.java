package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f164658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f164659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f164660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f164662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f164663i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164664m;

    public s1(com.tencent.mm.plugin.sns.model.i1 i1Var, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, android.util.SparseArray sparseArray3, java.lang.String str, com.tencent.mm.storage.s7 s7Var, int i17) {
        this.f164664m = i1Var;
        this.f164658d = sparseArray;
        this.f164659e = sparseArray2;
        this.f164660f = sparseArray3;
        this.f164661g = str;
        this.f164662h = s7Var;
        this.f164663i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseArray sparseArray;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$4");
        android.util.SparseArray sparseArray2 = this.f164658d;
        int size = sparseArray2.size();
        int i17 = 0;
        while (true) {
            sparseArray = this.f164660f;
            if (i17 >= size) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i17);
            r45.jj4 jj4Var = (r45.jj4) sparseArray2.get(keyAt);
            if (!com.tencent.mm.plugin.sns.model.i1.c(this.f164664m, 0, jj4Var, true)) {
                ca4.s0 s0Var = new ca4.s0(jj4Var);
                s0Var.d(0);
                s0Var.e(jj4Var.f377855d);
                this.f164659e.put(keyAt, s0Var);
                sparseArray.put(keyAt, jj4Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg put %s to downloadList", jj4Var.f377855d);
            }
            i17++;
        }
        if (sparseArray.size() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Cj().b(this.f164661g, this.f164660f, this.f164659e, this.f164662h, this.f164663i, 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$4");
    }
}
