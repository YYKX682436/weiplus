package pa1;

/* loaded from: classes7.dex */
public class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa1.o f352963a;

    public m(pa1.o oVar) {
        this.f352963a = oVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        android.graphics.Bitmap d17 = ((ce.o) ((ce.g) this.f352963a.B1(ce.g.class))).f40686g.getMagicBrush().f48591o.d();
        com.tencent.mars.xlog.Log.i("AppBrandGame.WAGamePageView", "try get game sharing screenshot: %s", d17);
        return d17;
    }
}
