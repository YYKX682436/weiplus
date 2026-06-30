package dj4;

/* loaded from: classes10.dex */
public final class p implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f233029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f233031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f233033g;

    public p(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, java.lang.String str3, boolean z17, android.content.Context context, float f17) {
        this.f233027a = str;
        this.f233028b = str2;
        this.f233029c = imageView;
        this.f233030d = str3;
        this.f233031e = z17;
        this.f233032f = context;
        this.f233033g = f17;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.o(this.f233027a, this.f233028b, bitmap, this.f233029c, this.f233030d, this.f233031e, this.f233032f, this.f233033g));
    }
}
