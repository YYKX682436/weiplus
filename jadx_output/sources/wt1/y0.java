package wt1;

/* loaded from: classes9.dex */
public class y0 extends com.tencent.mm.sdk.event.n {
    public y0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ShareCouponCardEvent shareCouponCardEvent = (com.tencent.mm.autogen.events.ShareCouponCardEvent) iEvent;
        if (shareCouponCardEvent instanceof com.tencent.mm.autogen.events.ShareCouponCardEvent) {
            am.hu huVar = shareCouponCardEvent.f54773g;
            java.lang.String str = huVar.f6867a;
            long j17 = huVar.f6868b;
            java.lang.String str2 = huVar.f6870d;
            xt1.f d17 = lu1.u.d(str);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("ShareCardEventListener", "item == null");
            } else if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.e("ShareCardEventListener", "cardAppMsg is empty");
            } else {
                ot0.q v17 = ot0.q.v(pt0.f0.Li(shareCouponCardEvent.f54773g.f6869c, j17).j());
                if (v17 != null) {
                    v17.U0 = lu1.u.c(d17);
                    v17.T0 = str;
                    v17.V0 = d17.f456471g;
                    v17.W0 = d17.f456468d;
                    y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                    xt1.q qVar = new xt1.q(v17.f348734z);
                    ((x60.e) fVar).getClass();
                    android.graphics.Bitmap d18 = x51.w0.d(qVar);
                    byte[] a17 = d18 != null ? com.tencent.mm.sdk.platformtools.x.a(d18) : null;
                    vt1.e eVar = (vt1.e) i95.n0.c(vt1.e.class);
                    java.lang.String str3 = v17.f348646d;
                    java.lang.String str4 = d17.f456471g;
                    ((ut1.a) eVar).getClass();
                    ((java.lang.Integer) com.tencent.mm.pluginsdk.model.app.k0.I(v17, str3, str4, str2, null, a17).first).intValue();
                    return true;
                }
            }
        }
        return false;
    }
}
