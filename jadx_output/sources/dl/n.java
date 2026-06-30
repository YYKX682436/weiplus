package dl;

/* loaded from: classes10.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f235111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f235112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f235113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.t f235114g;

    public n(dl.t tVar, float f17, float f18, float f19) {
        this.f235114g = tVar;
        this.f235111d = f17;
        this.f235112e = f18;
        this.f235113f = f19;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.t tVar = this.f235114g;
        ok.c cVar = tVar.H;
        cVar.f345920k = 1000L;
        android.graphics.Rect rect = tVar.f235130x;
        cVar.f345915f = this.f235112e;
        cVar.f345916g = this.f235113f;
        cVar.f345917h = rect;
        cVar.f345918i.set(rect);
        cVar.f345914e = this.f235111d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "onAnimationEnd to launch hide nine grid");
        tVar.M();
        tVar.H.b();
    }
}
