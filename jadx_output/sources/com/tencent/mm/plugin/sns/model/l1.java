package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f164376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m1 f164377e;

    public l1(com.tencent.mm.plugin.sns.model.m1 m1Var, android.graphics.Bitmap bitmap) {
        this.f164377e = m1Var;
        this.f164376d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12$1");
        android.graphics.Bitmap bitmap = this.f164376d;
        boolean f17 = ca4.z0.f(bitmap);
        com.tencent.mm.plugin.sns.model.m1 m1Var = this.f164377e;
        if (f17) {
            com.tencent.mm.plugin.sns.model.i1.b(m1Var.f164467q, m1Var.f164458e, m1Var.f164459f, false, -1, m1Var.f164460g, bitmap.getWidth(), bitmap.getHeight());
        } else {
            com.tencent.mm.plugin.sns.model.i1.b(m1Var.f164467q, m1Var.f164458e, m1Var.f164459f, false, -1, m1Var.f164460g, -1, -1);
        }
        if (ca4.z0.f(bitmap)) {
            com.tencent.mm.plugin.sns.model.i1.a(m1Var.f164467q).b(m1Var.f164459f, new java.lang.ref.WeakReference(bitmap));
        } else if (m1Var.f164461h) {
            com.tencent.mm.plugin.sns.model.l4.Cj().e(m1Var.f164462i, m1Var.f164463m ? 8 : 2, null, m1Var.f164464n, m1Var.f164465o);
        }
        com.tencent.mm.plugin.sns.model.c2 c2Var = m1Var.f164466p;
        if (c2Var != null) {
            c2Var.a(bitmap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12$1");
    }
}
