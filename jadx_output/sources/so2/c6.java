package so2;

/* loaded from: classes2.dex */
public final class c6 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f410301a;

    public c6(so2.m6 m6Var, kotlinx.coroutines.q qVar) {
        this.f410301a = qVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlinx.coroutines.q qVar = this.f410301a;
        if (bitmap != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new android.graphics.drawable.BitmapDrawable(bitmap)));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        com.tencent.mars.xlog.Log.i("Finder.SyncGetImageModel", "getImage resource :" + bitmap);
    }
}
