package ut2;

/* loaded from: classes3.dex */
public final class z4 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f431175a;

    public z4(ut2.j5 j5Var) {
        this.f431175a = j5Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        ut2.j5 j5Var = this.f431175a;
        if (bitmap == null) {
            j5Var.g().setVisibility(8);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float dimension = j5Var.g().getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        pm0.v.X(new ut2.y4(j5Var, (width * dimension) / height, dimension));
    }
}
