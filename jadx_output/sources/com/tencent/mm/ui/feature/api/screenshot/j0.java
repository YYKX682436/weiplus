package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class j0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qj5.n f208492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jd5.a f208497h;

    public j0(java.lang.String str, android.app.Activity activity, qj5.n nVar, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, java.util.HashMap hashMap, qj5.q qVar, java.lang.String str2, jd5.a aVar) {
        this.f208490a = str;
        this.f208491b = activity;
        this.f208492c = nVar;
        this.f208493d = j1Var;
        this.f208494e = hashMap;
        this.f208495f = qVar;
        this.f208496g = str2;
        this.f208497h = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        if (!z17 || (str2 = this.f208490a) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "recentForward, onDialogClick, forwarding imgMsg");
        g45.a aVar = g45.b.f268846a;
        if (str == null) {
            str = "";
        }
        aVar.a(str2, str, 0);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_USERNAME, str2);
        bundle.putString("image_path", this.f208496g);
        bundle.putString("model", this.f208497h.toXml());
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208493d;
        com.tencent.mm.ipcinvoker.d0.d(str3, bundle, com.tencent.mm.ui.feature.api.screenshot.l.class, new com.tencent.mm.ui.feature.api.screenshot.i0(str2, j1Var));
        android.app.Activity activity = this.f208491b;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.j3v), null, activity, null, null);
        this.f208492c.u();
        j1Var.f208500f = null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("quick_forward_btn", "view_clk", kz5.c1.n(kz5.c1.n(this.f208494e, new jz5.l("forward_method", 1)), new jz5.l("is_with_jump", java.lang.Integer.valueOf(qj5.q.g(this.f208495f, false, 1, null) == null ? 2 : 1))), 36458);
    }
}
