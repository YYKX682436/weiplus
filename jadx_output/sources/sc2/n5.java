package sc2;

/* loaded from: classes2.dex */
public final class n5 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f406097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406098b;

    public n5(sc2.d6 d6Var, android.view.View view) {
        this.f406097a = d6Var;
        this.f406098b = view;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        boolean z17 = ((android.graphics.Bitmap) obj) != null;
        this.f406097a.getClass();
        android.view.View iconLayout = this.f406098b;
        kotlin.jvm.internal.o.g(iconLayout, "iconLayout");
        pm0.v.X(new sc2.m5(z17, iconLayout));
    }
}
