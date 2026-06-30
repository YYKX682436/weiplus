package lr;

/* loaded from: classes15.dex */
public final class f implements pr.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr.g f320513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f320514b;

    public f(lr.g gVar, android.view.View view) {
        this.f320513a = gVar;
        this.f320514b = view;
    }

    @Override // pr.e0
    public void a(int i17) {
        lr.g gVar = this.f320513a;
        if (lr.g.j(gVar).c() && this.f320514b.isAttachedToWindow()) {
            lr.g.j(gVar).e();
        }
    }
}
