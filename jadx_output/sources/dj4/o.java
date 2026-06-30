package dj4;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f233021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f233022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233023h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f233024i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233025m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f233026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, java.lang.String str3, boolean z17, android.content.Context context, float f17) {
        super(0);
        this.f233019d = str;
        this.f233020e = str2;
        this.f233021f = bitmap;
        this.f233022g = imageView;
        this.f233023h = str3;
        this.f233024i = z17;
        this.f233025m = context;
        this.f233026n = f17;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadByUrl update ");
        java.lang.String str = this.f233019d;
        sb6.append(str);
        sb6.append(" url:");
        java.lang.String str2 = this.f233020e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        dj4.w.c(this.f233021f, str);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(str2, dj4.w.b(str));
        android.widget.ImageView imageView = this.f233022g;
        return java.lang.Boolean.valueOf(imageView.post(new dj4.n(imageView, this.f233023h, this.f233021f, this.f233024i, this.f233025m, this.f233026n)));
    }
}
