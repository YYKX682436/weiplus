package dj4;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f232936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232937g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f232938h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232939i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dj4.a f232940m;

    public c(android.widget.ImageView imageView, int i17, android.graphics.Bitmap bitmap, mj4.h hVar, java.lang.ref.WeakReference weakReference, java.lang.String str, dj4.a aVar) {
        this.f232934d = imageView;
        this.f232935e = i17;
        this.f232936f = bitmap;
        this.f232937g = hVar;
        this.f232938h = weakReference;
        this.f232939i = str;
        this.f232940m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (kotlin.jvm.internal.o.b(this.f232934d.getTag(com.tencent.mm.R.id.f484121d41), java.lang.Integer.valueOf(this.f232935e))) {
            dj4.u.i(dj4.u.f233049a, this.f232934d, this.f232936f, ((mj4.k) this.f232937g).v(), (android.content.Context) this.f232938h.get(), 0.0f, this.f232939i, 16, null);
            dj4.a aVar = this.f232940m;
            if (aVar != null) {
                ((dj4.h) aVar).a();
            }
        }
    }
}
