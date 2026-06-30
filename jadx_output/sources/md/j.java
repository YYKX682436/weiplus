package md;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f325696a = 300;

    /* renamed from: b, reason: collision with root package name */
    public int f325697b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f325698c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f325699d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.OrientationEventListener f325700e;

    public j(android.content.Context context, int i17) {
        this.f325699d = new java.lang.ref.WeakReference(context);
        md.i iVar = new md.i(this, context.getApplicationContext(), i17, new java.lang.ref.WeakReference(this));
        this.f325700e = iVar;
        iVar.enable();
    }
}
