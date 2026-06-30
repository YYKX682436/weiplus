package k53;

/* loaded from: classes4.dex */
public class g implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelvideo.MMVideoView f304358d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f304359e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f304360f;

    /* renamed from: g, reason: collision with root package name */
    public final k53.f f304361g = new k53.f(this, null);

    public g(com.tencent.mm.modelvideo.MMVideoView mMVideoView) {
        this.f304358d = mMVideoView;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        java.lang.String str2 = this.f304359e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(str)) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().p(str, i17, i18, 0);
        }
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameOnlineVideoProxy", "%s start http stream[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, str3, str2);
        this.f304359e = str;
        if (this.f304360f) {
            this.f304360f = false;
            com.tencent.mm.sdk.platformtools.u3.i(new k53.a(this, str, str3, str2), 1000L);
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_GameOnlineVideoProxy";
        oVar.field_mediaId = str;
        oVar.M1 = str3;
        oVar.H1 = 1;
        oVar.Z = 3;
        oVar.f241809y0 = 4;
        oVar.field_fullpath = str2;
        oVar.f241815c2 = this.f304361g;
        Di.e(oVar, false);
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, stop stream[%s]", java.lang.Integer.valueOf(hashCode()), str);
        java.lang.String str2 = this.f304359e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(str)) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().g(str, null);
        }
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        java.lang.String str2 = this.f304359e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.equals(str)) {
            return false;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return t21.o2.Di().o(str, i17, i18);
    }
}
