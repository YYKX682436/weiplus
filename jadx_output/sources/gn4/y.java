package gn4;

/* loaded from: classes15.dex */
public class y implements fn4.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f273662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273663b;

    public y(gn4.z zVar) {
        this.f273663b = zVar;
        this.f273662a = i65.a.k(zVar.getContext());
    }

    @Override // fn4.c
    public void a() {
        gn4.z zVar = this.f273663b;
        if (!(zVar.f264521s.getVisibility() == 0)) {
            if (zVar.G.getVisibility() == 0) {
                zVar.G.w();
                return;
            }
            zVar.G.x();
            if (zVar.getFSItemUIComponent() != null) {
                ((fn4.m) zVar.getFSItemUIComponent()).t();
                ((fn4.m) zVar.getFSItemUIComponent()).m();
            }
        }
    }

    @Override // fn4.c
    public void b(float f17) {
    }

    @Override // fn4.c
    public void c() {
    }

    @Override // fn4.c
    public int d(int i17, float f17) {
        float f18 = f17 / this.f273662a;
        gn4.z zVar = this.f273663b;
        fn4.c1 c1Var = zVar.getFSVideoUIComponent().I2().f264573b;
        int videoDurationSec = c1Var != null ? c1Var.getVideoDurationSec() : 0;
        int currentPosition = getCurrentPosition() + ((int) (videoDurationSec * f18));
        int i18 = currentPosition >= 0 ? currentPosition > videoDurationSec ? videoDurationSec : currentPosition : 0;
        java.lang.String a17 = vv4.e1.a(videoDurationSec * 1000);
        zVar.f264510e.setText(vv4.e1.a(i18 * 1000) + "/" + a17);
        return i18;
    }

    @Override // fn4.c
    public void e(float f17) {
    }

    @Override // fn4.c
    public void f(int i17, float f17) {
        gn4.z zVar = this.f273663b;
        zVar.G.f162476i.setVisibility(0);
        zVar.f264510e.setVisibility(8);
        zVar.f(i17);
    }

    @Override // fn4.c
    public boolean g() {
        return !(this.f273663b.f264521s.getVisibility() == 0);
    }

    @Override // fn4.c
    public int getCurrentPosition() {
        fn4.c1 c1Var = this.f273663b.getFSVideoUIComponent().I2().f264573b;
        if (c1Var != null) {
            return c1Var.getCurrPosSec();
        }
        return 0;
    }

    @Override // fn4.c
    public void h() {
        gn4.z zVar = this.f273663b;
        zVar.f264510e.setVisibility(0);
        zVar.G.f162476i.setVisibility(8);
    }
}
