package t20;

/* loaded from: classes11.dex */
public final class b implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t20.g f414665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f414666b;

    public b(t20.g gVar, android.view.View view) {
        this.f414665a = gVar;
        this.f414666b = view;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        if (kotlin.jvm.internal.o.b(str, "view_clk")) {
            this.f414665a.Bi(this.f414666b);
        }
    }
}
