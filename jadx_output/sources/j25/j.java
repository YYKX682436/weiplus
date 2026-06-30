package j25;

@j95.b
/* loaded from: classes11.dex */
public class j extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f297315d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f297316e = new j25.i(this);

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f297315d = handler;
        handler.postDelayed(this.f297316e, 20000L);
    }
}
