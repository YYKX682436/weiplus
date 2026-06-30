package zk1;

/* loaded from: classes5.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f473406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f473408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f473409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f473410h;

    public h(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f473406d = view;
        this.f473407e = i17;
        this.f473408f = i18;
        this.f473409g = i19;
        this.f473410h = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zk1.j jVar = zk1.m.f473414l;
        ((zk1.f) zk1.m.f473415m.getValue()).Mi(this.f473406d, this.f473407e, this.f473408f, this.f473409g, this.f473410h);
    }
}
