package sa5;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f405320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f405322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f405323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f405324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f405325i;

    public b(float f17, android.view.View view, long j17, int i17, long j18, yz5.a aVar) {
        this.f405320d = f17;
        this.f405321e = view;
        this.f405322f = j17;
        this.f405323g = i17;
        this.f405324h = j18;
        this.f405325i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa5.o oVar = new sa5.o(java.lang.Float.valueOf(this.f405320d), null);
        android.view.View view = this.f405321e;
        kotlin.jvm.internal.o.g(view, "view");
        oVar.f405351d = view;
        int i17 = this.f405323g;
        android.view.View view2 = this.f405321e;
        float f17 = this.f405320d;
        long j17 = this.f405322f;
        oVar.b(new sa5.a(i17, view2, f17, j17, this.f405324h, this.f405325i), j17);
    }
}
