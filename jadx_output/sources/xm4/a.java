package xm4;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.plugin.ball.service.s4 {
    public static void t0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        byte[] byteArray;
        if (ballInfo != null) {
            synchronized (ballInfo) {
                byteArray = ballInfo.i("key_context") ? ballInfo.G.getByteArray("key_context") : null;
            }
            r45.wn6 wn6Var = new r45.wn6();
            try {
                wn6Var.parseFrom(byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryFloatBallHelper", e17, "handleBallInfoClicked exception:%s", e17);
            }
            java.util.LinkedList linkedList = wn6Var.f389324r;
            if (linkedList.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryFloatBallHelper", "handleBallInfoClicked, cache video list size == 0");
                return;
            }
            r45.un6 un6Var = new r45.un6();
            un6Var.f387506i = wn6Var.f389322p;
            un6Var.f387510p = wn6Var.f389317h;
            r45.xn6 xn6Var = (r45.xn6) linkedList.get(0);
            un6Var.f387509o = xn6Var;
            java.lang.String str = xn6Var.f390259h;
            un6Var.f387501d = str;
            un6Var.f387503f = wn6Var.f389315f;
            un6Var.f387502e = wn6Var.f389314e;
            un6Var.f387504g = wn6Var.f389316g;
            un6Var.f387505h = wn6Var.f389318i;
            java.lang.String str2 = wn6Var.f389319m;
            un6Var.f387512r = str2;
            un6Var.A = wn6Var.f389321o;
            un6Var.f387513s = wn6Var.f389320n;
            un6Var.f387508n = wn6Var.f389323q;
            un6Var.f387511q = wn6Var.f389325s;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFloatBallHelper", "handleBallInfoClicked, contextId:%s videoId:%s", str2, str);
            su4.r2.r(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), un6Var);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f93086f = 7;
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return true;
    }

    public void u0(r45.un6 un6Var, r45.xn6 xn6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFloatBallHelper", "updateFloatBallData contextId:%s videoId:%s", un6Var.f387512r, xn6Var.f390259h);
        r45.wn6 wn6Var = new r45.wn6();
        wn6Var.f389313d = un6Var.f387501d;
        wn6Var.f389314e = un6Var.f387502e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(un6Var.f387507m)) {
            wn6Var.f389315f = un6Var.f387503f;
        } else {
            wn6Var.f389315f = un6Var.f387507m;
        }
        wn6Var.f389316g = un6Var.f387504g;
        wn6Var.f389317h = un6Var.f387510p;
        wn6Var.f389319m = un6Var.f387512r;
        wn6Var.f389321o = un6Var.A;
        wn6Var.f389320n = un6Var.f387513s;
        wn6Var.f389318i = un6Var.f387505h;
        wn6Var.f389322p = un6Var.f387506i;
        wn6Var.f389323q = un6Var.f387508n;
        wn6Var.f389325s = un6Var.f387511q;
        wn6Var.f389324r.add(xn6Var);
        try {
            Z(xn6Var.f390255d);
            U("key_context", wn6Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryFloatBallHelper", e17, "updateFloatBallData exception:%s", e17);
        }
        t().f93087g = wn6Var.f389315f;
        t().f93088h = xn6Var.f390259h;
        t().f93085e = wn6Var.f389322p;
        g();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return true;
    }
}
