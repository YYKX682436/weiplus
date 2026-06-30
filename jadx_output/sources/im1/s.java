package im1;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f292210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im1.x f292211f;

    public s(im1.x xVar, java.lang.String str, float f17) {
        this.f292211f = xVar;
        this.f292209d = str;
        this.f292210e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f292211f;
        if (xVar.f292221c) {
            rh0.d0 d0Var = xVar.f292220b;
            float f17 = this.f292210e;
            java.lang.String str = this.f292209d;
            ((p05.l4) d0Var).g(str, f17);
            xVar.f292226h = str;
        }
    }
}
