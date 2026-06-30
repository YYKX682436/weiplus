package xc2;

/* loaded from: classes8.dex */
public final class n2 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f453218a;

    public n2(android.view.View view) {
        this.f453218a = view;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        xc2.y2 y2Var = xc2.y2.f453343a;
        boolean z17 = bitmap != null;
        android.view.View view = this.f453218a;
        if (view != null) {
            pm0.v.X(new xc2.o1(z17, view));
        }
    }
}
