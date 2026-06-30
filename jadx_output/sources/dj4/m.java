package dj4;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f233009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f233010g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233011h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f233012i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, boolean z17, android.content.Context context, float f17) {
        super(0);
        this.f233007d = str;
        this.f233008e = str2;
        this.f233009f = imageView;
        this.f233010g = z17;
        this.f233011h = context;
        this.f233012i = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f233007d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f233008e, b17);
        dj4.u.i(dj4.u.f233049a, this.f233009f, b17, this.f233010g, this.f233011h, this.f233012i, null, 32, null);
        return jz5.f0.f302826a;
    }
}
