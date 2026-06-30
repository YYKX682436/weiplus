package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class z0 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.n1 f149453a;

    public z0(com.tencent.mm.plugin.mmsight.ui.n1 n1Var) {
        this.f149453a = n1Var;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor onSuccess: %s isNever：%s", bitmap, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (bitmap != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.y0(this, bitmap));
                return;
            }
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149453a.f149372d;
        if (a2Var.f149280p == null || a2Var.f149284t) {
            if (a2Var.f149284t) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.x0(this));
                return;
            }
            return;
        }
        int i18 = a2Var.f149269e;
        if (i18 > 0 && (i17 = a2Var.f149267c) > 0 && i18 <= i17) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.v0(this));
        } else {
            a2Var.A = com.tencent.mm.vfs.w6.p(a2Var.f149270f);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.w0(this));
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightVideoEditor", "photoEditor onError: %s", exc);
    }
}
