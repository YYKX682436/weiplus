package dj4;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f232941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232944g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f232945h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232946i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232947m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f232948n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f232949o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232950p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ dj4.a f232951q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, java.lang.String str, java.lang.String str2, mj4.h hVar, android.graphics.Bitmap bitmap, java.lang.String str3, android.widget.ImageView imageView, int i17, java.lang.ref.WeakReference weakReference, java.lang.String str4, dj4.a aVar) {
        super(0);
        this.f232941d = j17;
        this.f232942e = str;
        this.f232943f = str2;
        this.f232944g = hVar;
        this.f232945h = bitmap;
        this.f232946i = str3;
        this.f232947m = imageView;
        this.f232948n = i17;
        this.f232949o = weakReference;
        this.f232950p = str4;
        this.f232951q = aVar;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleImgUrl update ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f232941d);
        sb6.append(' ');
        sb6.append(this.f232942e);
        sb6.append(' ');
        java.lang.String str = this.f232943f;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        mj4.h hVar = this.f232944g;
        android.widget.ImageView imageView = this.f232947m;
        int i17 = this.f232948n;
        java.lang.ref.WeakReference weakReference = this.f232949o;
        java.lang.String str2 = this.f232950p;
        dj4.a aVar = this.f232951q;
        dj4.w.c(this.f232945h, str);
        android.graphics.Bitmap b17 = dj4.w.b(str);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f232946i, b17);
        return java.lang.Boolean.valueOf(imageView.post(new dj4.c(imageView, i17, b17, hVar, weakReference, str2, aVar)));
    }
}
