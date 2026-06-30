package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.q f159605e;

    public p(com.tencent.mm.plugin.scanner.ui.q qVar, android.graphics.Bitmap bitmap) {
        this.f159605e = qVar;
        this.f159604d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.q qVar = this.f159605e;
        qVar.M.setImageBitmap(this.f159604d);
        qVar.M.setBackgroundColor(0);
        com.tencent.mm.ui.base.preference.r rVar = qVar.Q;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }
}
