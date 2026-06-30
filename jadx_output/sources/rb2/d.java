package rb2;

/* loaded from: classes10.dex */
public final class d extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.v f393599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f393600b;

    public d(rb2.v vVar, long j17) {
        this.f393599a = vVar;
        this.f393600b = j17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            this.f393599a.f393686e.j().e(this.f393600b);
        }
    }
}
