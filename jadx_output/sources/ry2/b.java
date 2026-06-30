package ry2;

/* loaded from: classes10.dex */
public final class b implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ry2.e f401367a;

    public b(ry2.e eVar) {
        this.f401367a = eVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ry2.a(this.f401367a, bitmap));
        }
    }
}
