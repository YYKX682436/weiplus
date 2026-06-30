package xg;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f454347a;

    /* renamed from: b, reason: collision with root package name */
    public int f454348b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.OrientationEventListener f454349c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f454350d = new java.util.ArrayList();

    public c(android.content.Context context) {
        this.f454347a = context;
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        this.f454348b = windowManager.getDefaultDisplay().getRotation();
        this.f454349c = new xg.a(this, context, windowManager);
    }
}
