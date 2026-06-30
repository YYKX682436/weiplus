package dj4;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f233013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f233015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f233016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f233018i;

    public n(android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap, boolean z17, android.content.Context context, float f17) {
        this.f233013d = imageView;
        this.f233014e = str;
        this.f233015f = bitmap;
        this.f233016g = z17;
        this.f233017h = context;
        this.f233018i = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object tag = this.f233013d.getTag(com.tencent.mm.R.id.f484121d41);
        java.lang.String str = this.f233014e;
        if (kotlin.jvm.internal.o.b(tag, str)) {
            dj4.u.i(dj4.u.f233049a, this.f233013d, this.f233015f, this.f233016g, this.f233017h, this.f233018i, null, 32, null);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.StatusImgHandler", "loadByUrl: curTag:" + tag + " tag:" + str);
    }
}
