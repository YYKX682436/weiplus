package hg2;

/* loaded from: classes3.dex */
public final class f implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f281347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg2.h f281348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f281350d;

    public f(android.widget.ImageView imageView, hg2.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        this.f281347a = imageView;
        this.f281348b = hVar;
        this.f281349c = str;
        this.f281350d = continuation;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new hg2.e((android.graphics.Bitmap) obj, this.f281347a, this.f281348b, this.f281349c, this.f281350d));
    }
}
