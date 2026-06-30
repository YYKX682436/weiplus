package dj4;

/* loaded from: classes10.dex */
public final class e implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f232952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f232958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f232959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dj4.a f232961j;

    public e(long j17, java.lang.String str, java.lang.String str2, mj4.h hVar, java.lang.String str3, android.widget.ImageView imageView, int i17, java.lang.ref.WeakReference weakReference, java.lang.String str4, dj4.a aVar) {
        this.f232952a = j17;
        this.f232953b = str;
        this.f232954c = str2;
        this.f232955d = hVar;
        this.f232956e = str3;
        this.f232957f = imageView;
        this.f232958g = i17;
        this.f232959h = weakReference;
        this.f232960i = str4;
        this.f232961j = aVar;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.d(this.f232952a, this.f232953b, this.f232954c, this.f232955d, bitmap, this.f232956e, this.f232957f, this.f232958g, this.f232959h, this.f232960i, this.f232961j));
    }
}
