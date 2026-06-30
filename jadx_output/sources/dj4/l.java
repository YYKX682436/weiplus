package dj4;

/* loaded from: classes10.dex */
public final class l implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f233000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mj4.h f233002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233005f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233006g;

    public l(android.widget.ImageView imageView, java.lang.String str, mj4.h hVar, java.lang.String str2, int i17, android.content.Context context, java.lang.String str3) {
        this.f233000a = imageView;
        this.f233001b = str;
        this.f233002c = hVar;
        this.f233003d = str2;
        this.f233004e = i17;
        this.f233005f = context;
        this.f233006g = str3;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.k(this.f233000a, this.f233001b, this.f233002c, bitmap, this.f233003d, this.f233004e, this.f233005f, this.f233006g));
    }
}
