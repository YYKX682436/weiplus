package j25;

@j95.b
/* loaded from: classes11.dex */
public class n extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f297322d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f297323e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f297324f = new j25.m(this);

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        java.util.List list = this.f297323e;
        ((java.util.ArrayList) list).add(new k25.c());
        ((java.util.ArrayList) list).add(new k25.b());
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f297322d = handler;
        handler.postDelayed(this.f297324f, 15000L);
    }
}
