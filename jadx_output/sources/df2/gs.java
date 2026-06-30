package df2;

/* loaded from: classes10.dex */
public final class gs implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f230246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f230248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bm1 f230250h;

    public gs(kotlin.jvm.internal.f0 f0Var, java.lang.String str, dk2.h hVar, df2.lt ltVar, r45.bm1 bm1Var) {
        this.f230246d = f0Var;
        this.f230247e = str;
        this.f230248f = hVar;
        this.f230249g = ltVar;
        this.f230250h = bm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f230246d.f310116d == 1) {
            java.lang.String str = this.f230247e;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            df2.lt ltVar = this.f230249g;
            if (kotlin.jvm.internal.o.b(this.f230248f, ltVar.f230710r)) {
                java.lang.String str2 = df2.lt.W;
                com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "need preload  webview");
                df2.lt.a7(ltVar, str, this.f230250h);
            }
        }
    }
}
