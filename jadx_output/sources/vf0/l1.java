package vf0;

@j95.b
/* loaded from: classes12.dex */
public class l1 extends i95.w implements wf0.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f436218d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f436219e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f436220f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f436221g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final wf0.u1 f436222h = new vf0.k1(this);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        t21.o2.Ui().b(this.f436222h, android.os.Looper.getMainLooper());
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        t21.o2.Ui().A(this.f436222h);
    }
}
