package dj4;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f232931h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232932i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dj4.a f232933m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, mj4.h hVar, java.lang.ref.WeakReference weakReference, java.lang.String str3, dj4.a aVar) {
        super(0);
        this.f232927d = str;
        this.f232928e = str2;
        this.f232929f = imageView;
        this.f232930g = hVar;
        this.f232931h = weakReference;
        this.f232932i = str3;
        this.f232933m = aVar;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f232927d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f232928e, b17);
        dj4.u.i(dj4.u.f233049a, this.f232929f, b17, ((mj4.k) this.f232930g).v(), (android.content.Context) this.f232931h.get(), 0.0f, this.f232932i, 16, null);
        dj4.a aVar = this.f232933m;
        if (aVar == null) {
            return null;
        }
        ((dj4.h) aVar).a();
        return jz5.f0.f302826a;
    }
}
