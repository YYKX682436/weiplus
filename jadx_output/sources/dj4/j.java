package dj4;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f232988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232991i;

    public j(android.widget.ImageView imageView, int i17, android.graphics.Bitmap bitmap, mj4.h hVar, android.content.Context context, java.lang.String str) {
        this.f232986d = imageView;
        this.f232987e = i17;
        this.f232988f = bitmap;
        this.f232989g = hVar;
        this.f232990h = context;
        this.f232991i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (kotlin.jvm.internal.o.b(this.f232986d.getTag(com.tencent.mm.R.id.f484121d41), java.lang.Integer.valueOf(this.f232987e))) {
            dj4.u.i(dj4.u.f233049a, this.f232986d, this.f232988f, ((mj4.k) this.f232989g).v(), this.f232990h, 0.0f, this.f232991i, 16, null);
        }
    }
}
