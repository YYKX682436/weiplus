package d22;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225873f;

    public s(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f225871d = str;
        this.f225872e = str2;
        this.f225873f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadLiteApp: ");
        java.lang.String str = this.f225871d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", sb6.toString());
        q80.e0 e0Var = new q80.e0();
        e0Var.f360675a = str;
        e0Var.f360676b = this.f225872e;
        e0Var.f360678d = false;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Rj(this.f225873f, e0Var);
    }
}
