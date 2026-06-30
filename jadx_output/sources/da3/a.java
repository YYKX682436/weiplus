package da3;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da3.c f227760d;

    public a(da3.c cVar) {
        this.f227760d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        da3.c cVar = this.f227760d;
        com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) g0Var).Bj(cVar.f227765b);
        if (Bj != null) {
            cVar.f227766c = Bj.path + "/pkg/";
        }
    }
}
