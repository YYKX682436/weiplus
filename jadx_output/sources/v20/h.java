package v20;

/* loaded from: classes9.dex */
public final class h implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g9 f432765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f432768g;

    public h(bw5.g9 g9Var, java.lang.String str, java.lang.String str2, kotlinx.coroutines.q qVar) {
        this.f432765d = g9Var;
        this.f432766e = str;
        this.f432767f = str2;
        this.f432768g = qVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        kotlinx.coroutines.q qVar = this.f432768g;
        bw5.g9 g9Var = this.f432765d;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("EcsShareShopWindow", "share showWindow " + g9Var.getFinderUsername() + " cancel");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, "")));
            return;
        }
        com.tencent.mars.xlog.Log.i("EcsShareShopWindow", "share showWindow " + g9Var.getFinderUsername() + " to " + stringArrayListExtra);
        java.lang.String str = this.f432766e;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = this.f432767f;
            if (!(str2 == null || str2.length() == 0)) {
                ((dk5.s5) tg3.t1.a()).Ui(str, str2);
            }
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str3 = (java.lang.String) kz5.n0.Z(stringArrayListExtra);
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bool, str3 != null ? str3 : "")));
    }
}
