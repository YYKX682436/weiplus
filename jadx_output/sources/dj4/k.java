package dj4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f232995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f232997i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232998m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232999n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.widget.ImageView imageView, java.lang.String str, mj4.h hVar, android.graphics.Bitmap bitmap, java.lang.String str2, int i17, android.content.Context context, java.lang.String str3) {
        super(0);
        this.f232992d = imageView;
        this.f232993e = str;
        this.f232994f = hVar;
        this.f232995g = bitmap;
        this.f232996h = str2;
        this.f232997i = i17;
        this.f232998m = context;
        this.f232999n = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f232992d;
        imageView.post(new dj4.j(imageView, this.f232997i, this.f232995g, this.f232994f, this.f232998m, this.f232999n));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleImgOnlyByUrl update ");
        java.lang.String str = this.f232993e;
        sb6.append(str);
        sb6.append(' ');
        sb6.append(((mj4.k) this.f232994f).l());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        dj4.w.c(this.f232995g, str);
        android.graphics.Bitmap b17 = dj4.w.b(str);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f232996h, b17);
        return jz5.f0.f302826a;
    }
}
