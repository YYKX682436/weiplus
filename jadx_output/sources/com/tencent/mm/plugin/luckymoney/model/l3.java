package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes13.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f145413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f145415g;

    public l3(int i17, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, java.lang.String str, boolean z17) {
        this.f145412d = i17;
        this.f145413e = listScrollPAGView;
        this.f145414f = str;
        this.f145415g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f145412d;
        if (i17 != 0) {
            boolean z17 = true;
            if (i17 == 1) {
                android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.c9o);
                kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
                android.graphics.Bitmap K0 = com.tencent.mm.sdk.platformtools.x.K0(drawable);
                kotlin.jvm.internal.o.f(K0, "transformDrawableToBitmap(...)");
                if (this.f145413e.getUseRfx()) {
                    com.tencent.mm.rfx.RfxPagImage FromBitmap = com.tencent.mm.rfx.RfxPagImage.FromBitmap(K0);
                    java.lang.String str = this.f145414f;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(this.f145414f);
                    if (Load == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，targetFilePath is %s", this.f145414f);
                        if (com.tencent.mm.vfs.w6.j(this.f145414f)) {
                            com.tencent.mm.vfs.w6.h(this.f145414f);
                            return;
                        }
                        return;
                    }
                    Load.replaceImage(0, FromBitmap);
                    this.f145413e.setComposition(Load);
                } else {
                    org.libpag.PAGImage FromBitmap2 = org.libpag.PAGImage.FromBitmap(K0);
                    java.lang.String str2 = this.f145414f;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(this.f145414f);
                    if (Load2 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，targetFilePath is %s", this.f145414f);
                        if (com.tencent.mm.vfs.w6.j(this.f145414f)) {
                            com.tencent.mm.vfs.w6.h(this.f145414f);
                            return;
                        }
                        return;
                    }
                    Load2.replaceImage(0, FromBitmap2);
                    this.f145413e.setComposition(Load2);
                }
            } else if (i17 != 9) {
                this.f145413e.setPath(this.f145414f);
            }
            this.f145413e.setProgress(0.0d);
            this.f145413e.d();
            if (this.f145415g) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.k3(this.f145413e));
                return;
            }
            return;
        }
        if (!this.f145413e.m(this.f145414f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null：bubble，targetFilePath is %s", this.f145414f);
            if (com.tencent.mm.vfs.w6.j(this.f145414f)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "delete：bubble targetFilePath is %s", this.f145414f);
                com.tencent.mm.vfs.w6.h(this.f145414f);
                return;
            }
            return;
        }
        this.f145413e.setProgress(0.0d);
        this.f145413e.d();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.luckymoney.model.j3 j3Var = new com.tencent.mm.plugin.luckymoney.model.j3(this.f145413e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(j3Var, 150L, false);
    }
}
