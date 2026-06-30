package li;

/* loaded from: classes12.dex */
public class d extends qi.b {

    /* renamed from: m, reason: collision with root package name */
    public static li.e f318744m;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f318745h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318746i = false;

    public d(android.content.Context context) {
        this.f318745h = context;
    }

    @Override // qi.b
    public java.lang.String b() {
        return "OpenglLeak";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        pi.b bVar = pi.b.f354494e;
        android.app.Activity a17 = pi.b.a();
        if (a17 != null) {
            bVar.f354495d = new pi.a(a17.hashCode(), a17.getLocalClassName());
            com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().updateCurrActivity(bVar.f354495d.toString());
        }
        application.registerActivityLifecycleCallbacks(bVar);
        pi.d.f354497d.start();
    }

    @Override // qi.b
    public void e() {
        super.e();
        new java.lang.Thread(new li.a(this)).start();
    }
}
