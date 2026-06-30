package dl;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f235034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f235035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f235036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.c0 f235037g;

    public a0(dl.c0 c0Var, float f17, float f18, float f19) {
        this.f235037g = c0Var;
        this.f235034d = f17;
        this.f235035e = f18;
        this.f235036f = f19;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.c0 c0Var = this.f235037g;
        ok.c cVar = c0Var.f235064e.H;
        cVar.f345920k = 100L;
        cVar.f345915f = this.f235035e;
        cVar.f345916g = this.f235036f;
        android.graphics.Rect rect = c0Var.f235063d;
        cVar.f345917h = rect;
        cVar.f345918i.set(rect);
        cVar.f345914e = this.f235034d;
        cVar.b();
    }
}
