package d6;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d6.l f226645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f226646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d6.k f226647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d6.l lVar, android.view.ViewTreeObserver viewTreeObserver, d6.k kVar) {
        super(1);
        this.f226645d = lVar;
        this.f226646e = viewTreeObserver;
        this.f226647f = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.ViewTreeObserver viewTreeObserver = this.f226646e;
        kotlin.jvm.internal.o.f(viewTreeObserver, "viewTreeObserver");
        boolean isAlive = viewTreeObserver.isAlive();
        d6.k kVar = this.f226647f;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(kVar);
        } else {
            ((d6.f) this.f226645d).f226639c.getViewTreeObserver().removeOnPreDrawListener(kVar);
        }
        return jz5.f0.f302826a;
    }
}
