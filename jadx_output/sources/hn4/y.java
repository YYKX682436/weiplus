package hn4;

/* loaded from: classes15.dex */
public class y implements fn4.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f282606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hn4.z f282607b;

    public y(hn4.z zVar) {
        this.f282607b = zVar;
        this.f282606a = i65.a.k(zVar.getContext());
    }

    @Override // fn4.c
    public void a() {
        hn4.z zVar = this.f282607b;
        if (!(zVar.f264521s.getVisibility() == 0)) {
            if (zVar.G.getVisibility() == 0) {
                zVar.G.w();
                return;
            }
            zVar.G.x();
            if (zVar.getListItemUIComponent() != null) {
                ((hn4.d0) zVar.getListItemUIComponent()).t();
                ((hn4.d0) zVar.getListItemUIComponent()).m();
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
        float f18 = f17 / this.f282606a;
        hn4.z zVar = this.f282607b;
        fn4.c1 c1Var = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.f264573b;
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
        hn4.z zVar = this.f282607b;
        zVar.G.f162476i.setVisibility(0);
        zVar.f264510e.setVisibility(8);
        zVar.f(i17);
    }

    @Override // fn4.c
    public boolean g() {
        return !(this.f282607b.f264521s.getVisibility() == 0);
    }

    @Override // fn4.c
    public int getCurrentPosition() {
        fn4.c1 c1Var = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) this.f282607b.getListVideoUIComponent()).f175126J.f264573b;
        if (c1Var != null) {
            return c1Var.getCurrPosSec();
        }
        return 0;
    }

    @Override // fn4.c
    public void h() {
        hn4.z zVar = this.f282607b;
        zVar.f264510e.setVisibility(0);
        zVar.G.f162476i.setVisibility(8);
    }
}
