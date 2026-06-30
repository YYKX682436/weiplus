package t21;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f414836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t21.p3 f414839g;

    public m3(t21.p3 p3Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f414839g = p3Var;
        this.f414836d = m1Var;
        this.f414837e = i17;
        this.f414838f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        t21.p3.f414863y++;
        com.tencent.mm.modelbase.m1 m1Var = this.f414836d;
        int type = m1Var.getType();
        int i18 = this.f414837e;
        t21.p3 p3Var = this.f414839g;
        if (type == 150) {
            p3Var.f414873p = false;
            t21.r0 r0Var = (t21.r0) m1Var;
            i17 = r0Var.f414914r;
            p3Var.f414878u = null;
            str = r0Var.f414905f;
        } else {
            if (m1Var.getType() != 149) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoService", "onSceneEnd Error SceneType:" + m1Var.getType());
                t21.p3.f414863y = t21.p3.f414863y + (-1);
                return;
            }
            if (i18 == 4 && this.f414838f == 102) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ignore_c2c_retry_upload_video_error, true)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "upload video returns 102 code, waiting for the retried response");
                    t21.p3.f414863y--;
                    return;
                }
            }
            if (m1Var instanceof t21.w0) {
                t21.w0 w0Var = (t21.w0) m1Var;
                int i19 = w0Var.f415036i;
                boolean h17 = ih.a.h("clicfg_video_service_ignore_duplicate", true);
                java.lang.String str2 = w0Var.f415033f;
                if (!h17 && !((java.util.HashMap) p3Var.f414872o).containsKey(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "call end duplicate, just return, file name = " + str2);
                    return;
                }
                str = str2;
                i17 = i19;
            } else {
                str = m1Var instanceof t21.q1 ? ((t21.q1) m1Var).f414886f : null;
                i17 = 0;
            }
            p3Var.f414874q = false;
            p3Var.f414879v = null;
        }
        if (str != null && ((java.util.HashMap) p3Var.f414872o).get(str) != null) {
            java.util.Map map = p3Var.f414872o;
            ((fp.j) ((java.util.HashMap) map).get(str)).a();
            ((java.util.HashMap) map).remove(str);
        }
        m1Var.getType();
        java.util.Objects.toString(m1Var);
        if (i18 == 3 && i17 != 0) {
            p3Var.f414876s--;
        } else if (i18 != 0) {
            p3Var.f414876s = 0;
        }
        int i27 = p3Var.f414876s;
        boolean z17 = p3Var.f414873p;
        boolean z18 = p3Var.f414874q;
        if (i27 > 0) {
            t21.p3.b(p3Var);
        } else if (!z18 && !z17) {
            p3Var.f();
        }
        t21.p3.f414863y--;
    }

    public java.lang.String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
