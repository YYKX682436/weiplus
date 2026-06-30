package j8;

/* loaded from: classes15.dex */
public class n implements j8.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f298124a;

    /* renamed from: b, reason: collision with root package name */
    public final j8.a f298125b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.m f298126c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.OrientationEventListener f298127d;

    /* renamed from: e, reason: collision with root package name */
    public j8.h f298128e = null;

    public n(android.content.Context context, j8.a aVar, j8.m mVar) {
        this.f298124a = context;
        this.f298125b = aVar;
        this.f298126c = mVar;
    }

    @Override // j8.b
    public void a() {
        if (this.f298127d != null) {
            this.f298125b.a(this.f298128e);
            return;
        }
        j8.l lVar = new j8.l(this, this.f298124a, this.f298126c.f298123d);
        this.f298127d = lVar;
        if (lVar.canDetectOrientation()) {
            this.f298127d.enable();
        }
    }

    @Override // j8.b
    public void b() {
        android.view.OrientationEventListener orientationEventListener = this.f298127d;
        if (orientationEventListener == null) {
            return;
        }
        orientationEventListener.disable();
        this.f298127d = null;
    }
}
