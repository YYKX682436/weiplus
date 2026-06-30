package w35;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.q f442754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f442755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f442758h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f442759i;

    public p(w35.q qVar, android.content.Intent intent, java.lang.String str, android.content.Context context, com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        this.f442754d = qVar;
        this.f442755e = intent;
        this.f442756f = str;
        this.f442757g = context;
        this.f442758h = f4Var;
        this.f442759i = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        w35.q qVar = this.f442754d;
        long d17 = com.tencent.mm.vfs.w6.d(qVar.f442726d, qVar.f442762g, false);
        android.content.Intent intent = this.f442755e;
        java.lang.String str2 = this.f442756f;
        intent.setPackage(str2);
        if (d17 > 0) {
            str = qVar.f442762g;
        } else {
            str = qVar.f442726d;
            if (str == null) {
                str = "";
            }
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
        com.tencent.mm.sdk.platformtools.i1.e(this.f442757g, this.f442755e, r6Var, qVar.f442723a.f189310c, qVar.f442725c, false);
        com.tencent.mars.xlog.Log.i(qVar.f442760e, "try open file: " + qVar.f442726d + ", " + qVar.f442725c + ", by: " + str2 + ", copyRet:" + d17);
        com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a(str2, qVar.f442725c);
        d75.b.g(new w35.o(this.f442758h, this.f442754d, this.f442757g, this.f442755e, this.f442759i, r6Var, this.f442756f));
    }
}
