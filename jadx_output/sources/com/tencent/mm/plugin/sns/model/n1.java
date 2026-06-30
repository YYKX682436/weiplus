package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f164480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o1 f164481e;

    public n1(com.tencent.mm.plugin.sns.model.o1 o1Var, android.graphics.Bitmap bitmap) {
        this.f164481e = o1Var;
        this.f164480d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13$1");
        android.graphics.Bitmap bitmap = this.f164480d;
        boolean f17 = ca4.z0.f(bitmap);
        com.tencent.mm.plugin.sns.model.o1 o1Var = this.f164481e;
        if (f17) {
            com.tencent.mm.plugin.sns.model.i1.b(o1Var.f164536r, o1Var.f164526e, o1Var.f164527f, false, -1, o1Var.f164528g, bitmap.getWidth(), bitmap.getHeight());
        } else {
            com.tencent.mm.plugin.sns.model.i1.b(o1Var.f164536r, o1Var.f164526e, o1Var.f164527f, false, -1, o1Var.f164528g, -1, -1);
        }
        if (ca4.z0.f(bitmap)) {
            com.tencent.mm.plugin.sns.model.i1.a(o1Var.f164536r).b(o1Var.f164527f, new java.lang.ref.WeakReference(bitmap));
        } else if (o1Var.f164529h) {
            int i17 = o1Var.f164530i;
            if (i17 == 2) {
                com.tencent.mm.plugin.sns.model.l4.Cj().e(o1Var.f164531m, 10, null, o1Var.f164532n, o1Var.f164533o);
            } else if (i17 == 1) {
                com.tencent.mm.plugin.sns.model.l4.Cj().e(o1Var.f164531m, 11, null, o1Var.f164532n, o1Var.f164533o);
            } else {
                com.tencent.mm.plugin.sns.model.l4.Cj().e(o1Var.f164531m, o1Var.f164534p ? 8 : 2, null, o1Var.f164532n, o1Var.f164533o);
            }
        }
        com.tencent.mm.plugin.sns.model.c2 c2Var = o1Var.f164535q;
        if (c2Var != null) {
            c2Var.a(bitmap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13$1");
    }
}
