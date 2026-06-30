package xt2;

/* loaded from: classes2.dex */
public final class q3 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f456967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f456968c;

    public q3(xt2.r3 r3Var, android.view.View view, boolean z17) {
        this.f456966a = r3Var;
        this.f456967b = view;
        this.f456968c = z17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new xt2.p3(this.f456966a, bitmap, this.f456967b, this.f456968c));
        }
    }
}
