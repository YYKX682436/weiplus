package dl;

/* loaded from: classes10.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f235056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f235057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f235058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.c0 f235059g;

    public b0(dl.c0 c0Var, float f17, float f18, float f19) {
        this.f235059g = c0Var;
        this.f235056d = f17;
        this.f235057e = f18;
        this.f235058f = f19;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.c0 c0Var = this.f235059g;
        ok.c cVar = c0Var.f235064e.H;
        cVar.f345920k = 1000L;
        cVar.f345915f = this.f235057e;
        cVar.f345916g = this.f235058f;
        android.graphics.Rect rect = c0Var.f235063d;
        cVar.f345917h = rect;
        cVar.f345918i.set(rect);
        cVar.f345914e = this.f235056d;
        c0Var.f235064e.H.b();
    }
}
