package v14;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f432556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v14.p f432557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f432559h;

    public l(java.lang.String str, android.graphics.Bitmap bitmap, v14.p pVar, java.lang.String str2, yz5.l lVar) {
        this.f432555d = str;
        this.f432556e = bitmap;
        this.f432557f = pVar;
        this.f432558g = str2;
        this.f432559h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gm0.j1.a();
        if (gm0.j1.a()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.T6(this.f432556e, com.tencent.mm.modelavatar.d1.Ai().i(this.f432555d + ".last", true, false));
            kotlinx.coroutines.l.d(this.f432557f.getLifecycleScope(), null, null, new v14.k(this.f432557f, this.f432555d, this.f432558g, this.f432559h, null), 3, null);
        }
    }
}
