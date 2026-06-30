package kz3;

/* loaded from: classes15.dex */
public final class k implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f313881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ry3.p f313882b;

    public k(kz3.l lVar, ry3.p pVar) {
        this.f313881a = lVar;
        this.f313882b = pVar;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "dealWithImageOcr onCallback session: %s, success: %b, errType: %s, errCode: %s, errMsg: %s, result: %s, reqKey: %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(result.f401544b), java.lang.Integer.valueOf(result.f401545c), java.lang.Integer.valueOf(result.f401546d), result.f401547e, result.f401552j, result.f401549g);
        kz3.l lVar = this.f313881a;
        lVar.f313890h = true;
        kz3.m mVar = lVar.f313892j;
        if (mVar != null) {
            ((kz3.n) mVar).f313904c = result.f401554l;
        }
        if (!result.f401544b) {
            lVar.f(result.f401545c, result.f401546d);
            return;
        }
        java.lang.String str = result.f401552j;
        if ((str == null || str.length() == 0) || result.f401553k) {
            lVar.f(4, 202);
            return;
        }
        android.content.Context context = lVar.f313883a;
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        float f17 = !z17 ? 0.7f : 1.0f;
        int i17 = !z17 ? 1 : 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "showImageOCRResult ocrResultType: %d, isLandscape: %s, dialogHeightRate: %f, animationType: %s", java.lang.Integer.valueOf(result.f401554l), java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("session_id", result.f401543a);
        bundle.putString("req_key", result.f401549g);
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f313882b.f401540n);
        bundle.putInt("template_type", 2);
        bundle.putFloat("fixed_dialog_height_rate", f17);
        bundle.putBoolean("enable_dialog_scroll", false);
        bundle.putBoolean("enable_cancel_outside", false);
        bundle.putBoolean("show_after_webview_ready", true);
        ry3.m mVar2 = lVar.f313885c;
        bundle.putBoolean("enable_full_screen", mVar2 != null ? mVar2.f401524a : true);
        ry3.m mVar3 = lVar.f313885c;
        bundle.putBoolean("enable_scroll_right_close", mVar3 != null ? mVar3.f401525b : false);
        kz3.p pVar = lVar.f313893k;
        if (pVar != null) {
            android.view.View view = lVar.f313887e;
            pVar.f313910h = view;
            if (view != null) {
                pVar.f313912m = view.getMeasuredWidth();
                pVar.f313911i = view.getMeasuredHeight();
            }
            pVar.f313909g = lVar.f313886d;
            pVar.f313919t = i17;
            pVar.f313918s = i17 != 1 ? i17 != 2 ? null : new lz3.a(i17) : new lz3.f(pVar.f313906d, i17);
            pVar.f313908f = lVar.f313885c;
        }
        uy3.j0 b17 = uy3.n0.b(context, bundle, lVar.f313896n);
        kotlin.jvm.internal.o.d(pVar);
        kz3.e eVar = new kz3.e(lVar, pVar);
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = b17.f431956q;
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setBackgroundListener(eVar);
        }
        kz3.i listener = lVar.f313901s;
        kotlin.jvm.internal.o.g(listener, "listener");
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setBackgroundTouchListener(listener);
        }
        if (i17 == 1) {
            android.content.Context context2 = b17.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView scanOCRDialogBackgroundOpView = new com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView(context2, null);
            lVar.f313897o = scanOCRDialogBackgroundOpView;
            scanOCRDialogBackgroundOpView.setOpListener(lVar.f313898p);
            uy3.q qVar = lVar.f313897o;
            kotlin.jvm.internal.o.d(qVar);
            if (baseBoxDialogView != null) {
                baseBoxDialogView.setBackgroundOpView(qVar);
            }
        }
        lVar.f313895m = b17;
    }
}
