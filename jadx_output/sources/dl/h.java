package dl;

/* loaded from: classes10.dex */
public class h implements hk0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f235094a;

    public h(dl.t tVar) {
        this.f235094a = tVar;
    }

    @Override // hk0.b1
    public void a(float f17) {
        dl.t tVar = this.f235094a;
        int i17 = (int) (r1.f454935h * f17);
        tVar.D.f454934g = i17;
        xk0.c.f454928s.setAlpha(i17);
        tVar.r();
    }
}
