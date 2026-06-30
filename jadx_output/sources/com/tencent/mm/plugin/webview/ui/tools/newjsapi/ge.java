package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ge extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ge f186208d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ge();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186209e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186210f;

    /* JADX WARN: Removed duplicated region for block: B:82:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021f  */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r25, nw4.y2 r26) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.ge.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 64;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "timelineCheckIn";
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.k kVar;
        nw4.y2 y2Var;
        if (i17 != 225 || (kVar = f186209e) == null || (y2Var = f186210f) == null) {
            return;
        }
        nw4.g gVar = kVar.f340863d;
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiTimelineCheckIn", "timeline_check_in ok");
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        } else if (i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiTimelineCheckIn", "timeline_check_in fail");
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiTimelineCheckIn", "timeline_check_in cancel, resultCode=%d", java.lang.Integer.valueOf(i18));
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
        }
        f186209e = null;
        f186210f = null;
    }
}
