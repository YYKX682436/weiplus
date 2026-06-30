package dj4;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232972i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, mj4.h hVar, android.content.Context context, java.lang.String str3) {
        super(0);
        this.f232967d = str;
        this.f232968e = str2;
        this.f232969f = imageView;
        this.f232970g = hVar;
        this.f232971h = context;
        this.f232972i = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f232967d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f232968e, b17);
        dj4.u.i(dj4.u.f233049a, this.f232969f, b17, ((mj4.k) this.f232970g).v(), this.f232971h, 0.0f, this.f232972i, 16, null);
        return jz5.f0.f302826a;
    }
}
