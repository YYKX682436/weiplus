package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes13.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f145335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f145337g;

    public i3(int i17, com.tencent.mm.view.MMPAGView mMPAGView, java.lang.String str, boolean z17) {
        this.f145334d = i17;
        this.f145335e = mMPAGView;
        this.f145336f = str;
        this.f145337g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f145334d;
        if (i17 != 0) {
            boolean z17 = true;
            if (i17 == 1) {
                android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.c9o);
                kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
                android.graphics.Bitmap K0 = com.tencent.mm.sdk.platformtools.x.K0(drawable);
                kotlin.jvm.internal.o.f(K0, "transformDrawableToBitmap(...)");
                if (this.f145335e.getUseRfx()) {
                    com.tencent.mm.rfx.RfxPagImage FromBitmap = com.tencent.mm.rfx.RfxPagImage.FromBitmap(K0);
                    java.lang.String str = this.f145336f;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(this.f145336f);
                    if (Load == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，cover targetFilePath is %s", this.f145336f);
                        if (com.tencent.mm.vfs.w6.j(this.f145336f)) {
                            com.tencent.mm.vfs.w6.h(this.f145336f);
                            return;
                        }
                        return;
                    }
                    Load.replaceImage(0, FromBitmap);
                    this.f145335e.setComposition(Load);
                } else {
                    org.libpag.PAGImage FromBitmap2 = org.libpag.PAGImage.FromBitmap(K0);
                    java.lang.String str2 = this.f145336f;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        return;
                    }
                    org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(this.f145336f);
                    if (Load2 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，cover targetFilePath is %s", this.f145336f);
                        if (com.tencent.mm.vfs.w6.j(this.f145336f)) {
                            com.tencent.mm.vfs.w6.h(this.f145336f);
                            return;
                        }
                        return;
                    }
                    Load2.replaceImage(0, FromBitmap2);
                    this.f145335e.setComposition(Load2);
                }
            } else if (i17 != 9) {
                if (i17 == 13) {
                    com.tencent.mm.plugin.luckymoney.model.n3 n3Var = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
                    java.lang.String str3 = this.f145336f;
                    com.tencent.mm.view.MMPAGView mMPAGView = this.f145335e;
                    if (mMPAGView != null) {
                        if (str3 != null && str3.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            return;
                        }
                        boolean m17 = mMPAGView.m(str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[doPlayFullAtmos] success: " + m17 + "、targetFilePath：" + str3);
                        if (!m17) {
                            if (com.tencent.mm.vfs.w6.j(str3)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[doPlayFullAtmos] delete file");
                                com.tencent.mm.vfs.w6.h(str3);
                                return;
                            }
                            return;
                        }
                        mMPAGView.setProgress(0.0d);
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        com.tencent.mm.plugin.luckymoney.model.c3 c3Var = new com.tencent.mm.plugin.luckymoney.model.c3(mMPAGView);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(c3Var, 120L, false);
                        return;
                    }
                    return;
                }
                if (!this.f145335e.m(this.f145336f)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，type：%s，targetFilePath is %s", java.lang.Integer.valueOf(this.f145334d), this.f145336f);
                    if (com.tencent.mm.vfs.w6.j(this.f145336f)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "delete file，type：%s，targetFilePath is %s", java.lang.Integer.valueOf(this.f145334d), this.f145336f);
                        com.tencent.mm.vfs.w6.h(this.f145336f);
                        return;
                    }
                    return;
                }
            }
            this.f145335e.setProgress(0.0d);
            this.f145335e.d();
            if (this.f145337g) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.h3(this.f145335e));
                return;
            }
            return;
        }
        this.f145335e.setPath(this.f145336f);
        this.f145335e.setProgress(0.0d);
        this.f145335e.d();
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        com.tencent.mm.plugin.luckymoney.model.g3 g3Var = new com.tencent.mm.plugin.luckymoney.model.g3(this.f145335e);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.z(g3Var, 150L, false);
    }
}
