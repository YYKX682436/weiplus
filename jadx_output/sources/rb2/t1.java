package rb2;

/* loaded from: classes10.dex */
public final class t1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f393765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f393766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f393767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f393768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393771i;

    public t1(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f393763a = z2Var;
        this.f393764b = s0Var;
        this.f393765c = j17;
        this.f393766d = j18;
        this.f393767e = j60Var;
        this.f393768f = viewGroup;
        this.f393769g = view;
        this.f393770h = view2;
        this.f393771i = view3;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
        sb6.append(bitmap != null);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
        rb2.z2 z2Var = this.f393763a;
        in5.s0 s0Var = this.f393764b;
        long j17 = this.f393765c;
        long j18 = this.f393766d;
        r45.j60 j60Var = this.f393767e;
        android.view.ViewGroup loadLayout = this.f393768f;
        kotlin.jvm.internal.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f393769g;
        kotlin.jvm.internal.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f393770h;
        kotlin.jvm.internal.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f393771i;
        kotlin.jvm.internal.o.f(loadFailText, "$loadFailText");
        rb2.z2.B(z2Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, bitmap != null);
    }
}
