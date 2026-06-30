package xc2;

/* loaded from: classes2.dex */
public final class e extends xc2.r {
    @Override // xc2.r
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, xc2.p cache, java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(cache, "cache");
        super.A(holder, jumpView, infoEx, cache, str);
        if (cache instanceof xc2.w0) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            xc2.w0 w0Var = (xc2.w0) cache;
            y("reportAdExpose", (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject.getId(), w0Var);
            B(jumpView, w0Var);
            xc2.d dVar = new xc2.d(this, jumpView, w0Var, holder, str);
            if (w0Var.f453321m == 0) {
                jumpView.post(dVar);
            } else {
                dVar.run();
            }
            java.lang.Runnable runnable = this.f453281k;
            jumpView.removeCallbacks(runnable);
            jumpView.postDelayed(runnable, 1000L);
        }
    }

    public final void B(android.view.View view, xc2.w0 w0Var) {
        if (w0Var.f453321m <= 0 || w0Var.f453322n <= 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(view.getHeight());
            w0Var.f453321m = valueOf.intValue();
            w0Var.f453322n = valueOf2.intValue();
        }
    }

    @Override // xc2.r
    public void w() {
        android.content.Context context;
        java.lang.String str;
        xc2.p pVar = this.f453278h;
        xc2.w0 w0Var = pVar instanceof xc2.w0 ? (xc2.w0) pVar : null;
        if (w0Var == null || (context = this.f453277g) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 == null || (str = nyVar2.f135382p) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        long j17 = ((sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class)).f405766y;
        java.lang.String str3 = this.f453279i;
        int i17 = kotlin.jvm.internal.o.b(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str3) ? 2 : kotlin.jvm.internal.o.b("TWO_FLOW", str3) ? 4 : kotlin.jvm.internal.o.b("single_comment", str3) ? 5 : 1;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Ok(str2, true, false, w0Var.f453227f, w0Var.f453321m, w0Var.f453322n, (r39 & 64) != 0 ? 0 : 0, (r39 & 128) != 0 ? 0 : 0, (r39 & 256) != 0 ? 0 : 0, (r39 & 512) != 0 ? "" : w0Var.f453231j, (r39 & 1024) != 0 ? 0L : w0Var.f453230i, j17, (r39 & 4096) != 0 ? 0 : i17, (r39 & 8192) != 0 ? 0.0f : 0.0f, (r39 & 16384) != 0 ? null : nyVar != null ? nyVar.V6() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    @Override // xc2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(in5.s0 r31, android.view.View r32, xc2.p0 r33, xc2.p r34, int r35, int r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.e.z(in5.s0, android.view.View, xc2.p0, xc2.p, int, int, java.lang.String):void");
    }
}
