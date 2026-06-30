package dj4;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, mj4.h hVar, android.content.Context context, java.lang.String str3) {
        super(0);
        this.f232980d = str;
        this.f232981e = str2;
        this.f232982f = imageView;
        this.f232983g = hVar;
        this.f232984h = context;
        this.f232985i = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f232980d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f232981e, b17);
        dj4.u.i(dj4.u.f233049a, this.f232982f, b17, ((mj4.k) this.f232983g).v(), this.f232984h, 0.0f, this.f232985i, 16, null);
        return jz5.f0.f302826a;
    }
}
