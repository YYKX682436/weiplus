package kf3;

/* loaded from: classes5.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307398f;

    public m1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, java.lang.String str, int i17) {
        this.f307398f = massSendMsgUI;
        this.f307396d = str;
        this.f307397e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        com.tencent.mm.modelcontrol.VideoTransPara cj6 = d11.s.fj().cj();
        r45.vh4 vh4Var = new r45.vh4();
        vh4Var.f388235e = true;
        kf3.j1 j1Var = new kf3.j1(this);
        java.lang.String str = this.f307396d;
        if (di3.y.a(str, cj6, vh4Var, j1Var)) {
            di3.y.b(str, cj6, vh4Var, new kf3.k1(this));
        }
        com.tencent.mm.sdk.platformtools.u3.h(new kf3.l1(this));
    }
}
