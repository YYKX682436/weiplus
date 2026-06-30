package cw2;

/* loaded from: classes10.dex */
public final class l0 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.videocomposition.play.VideoCompositionPlayView f223820a;

    /* renamed from: b, reason: collision with root package name */
    public final zv3.c f223821b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.xeffect.effect.EffectManager f223822c;

    /* renamed from: d, reason: collision with root package name */
    public final long f223823d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f223824e;

    public l0(android.content.Context context, r45.mb4 media) {
        java.lang.String wi6;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(media, "media");
        com.tencent.mm.xeffect.effect.EffectManager effectManager = new com.tencent.mm.xeffect.effect.EffectManager();
        this.f223822c = effectManager;
        this.f223820a = new com.tencent.mm.videocomposition.play.VideoCompositionPlayView(context);
        r45.h70 h70Var = (r45.h70) media.getCustom(21);
        r45.h70 h70Var2 = h70Var == null ? new r45.h70() : h70Var;
        h70Var2.f375901h = "";
        h70Var2.f375900g = false;
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        zv3.c e17 = com.tencent.mm.plugin.vlog.model.x.e(h70Var2);
        this.f223821b = e17;
        ((zv3.f) e17).e();
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        rm5.v hj6 = ((b92.u2) ((bg0.v) c17)).hj(h70Var2, effectManager, e17, null, 0);
        this.f223823d = hj6.i();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_hdr_cover_color_correct, 1) == 1) {
            java.util.Iterator it = hj6.f397584l.iterator();
            while (it.hasNext()) {
                rm5.j jVar = (rm5.j) it.next();
                if (jVar.f397500b == 2 && (wi6 = ((rs0.s) ((ss0.e) i95.n0.c(ss0.e.class))).wi(jVar.f397499a)) != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(wi6);
                        ((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).wi(hj6, jSONObject.optInt("colorStandard"), jSONObject.optInt("colorTransfer"), java.lang.Integer.valueOf(jSONObject.optInt("ffmpegColorPrimaries")));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
        this.f223820a.o(hj6);
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        kotlin.jvm.internal.o.g(onReady, "onReady");
        kotlin.jvm.internal.o.g(onDestroy, "onDestroy");
        kotlin.jvm.internal.o.g(onSeekFrame, "onSeekFrame");
        this.f223824e = onDestroy;
        this.f223820a.setPlayerCallback(new cw2.k0(this, onReady, onSeekFrame));
    }

    @Override // cw2.aa
    public void destroy() {
        ((zv3.f) this.f223821b).a();
        this.f223822c.k();
        this.f223820a.g();
        yz5.a aVar = this.f223824e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // cw2.aa
    public android.graphics.Bitmap getBitmap() {
        return this.f223820a.getBitmap();
    }

    @Override // cw2.aa
    public long getCurrentPositionMs() {
        return this.f223820a.getPosition();
    }

    @Override // cw2.aa
    public android.view.View getView() {
        return this.f223820a;
    }

    @Override // cw2.aa
    public void resume() {
        this.f223820a.h();
    }

    @Override // cw2.aa
    public void seekTo(long j17) {
        this.f223820a.j(j17 + this.f223823d);
    }
}
