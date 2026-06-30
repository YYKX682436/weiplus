package tt2;

/* loaded from: classes.dex */
public final class f0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f421906a;

    public f0(v65.n nVar) {
        this.f421906a = nVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        v65.n nVar2 = this.f421906a;
        if (bitmap != null) {
            java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, false);
            nVar2.a(fj6);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            nVar2.a(null);
        }
    }
}
