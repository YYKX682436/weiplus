package pn2;

/* loaded from: classes3.dex */
public final class z implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f357036a;

    public z(pn2.c0 c0Var) {
        this.f357036a = c0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        pn2.c0 c0Var = this.f357036a;
        android.widget.ImageView C = c0Var.C();
        if (C != null) {
            C.post(new pn2.y(bitmap, c0Var));
        }
    }
}
