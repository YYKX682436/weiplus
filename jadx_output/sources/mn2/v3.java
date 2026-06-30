package mn2;

/* loaded from: classes4.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f330136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f330138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f330139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f330140h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f330141i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(mn2.x3 x3Var, java.lang.String str, long j17, long j18, kotlin.jvm.internal.c0 c0Var, boolean z17) {
        super(0);
        this.f330136d = x3Var;
        this.f330137e = str;
        this.f330138f = j17;
        this.f330139g = j18;
        this.f330140h = c0Var;
        this.f330141i = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mn2.x3 x3Var = this.f330136d;
        if (x3Var.f330162g.get()) {
            com.tencent.mars.xlog.Log.w("Finder.VideoDownloader", "has stop!");
        } else {
            pm0.c cVar = new pm0.c("onMoovReady");
            t21.h0 h0Var = x3Var.f330160e;
            boolean z17 = h0Var instanceof com.tencent.mm.plugin.finder.video.FinderVideoView;
            long j17 = this.f330138f;
            if (z17) {
                com.tencent.mm.plugin.finder.video.FinderVideoView finderVideoView = (com.tencent.mm.plugin.finder.video.FinderVideoView) h0Var;
                boolean z18 = this.f330140h.f310112d;
                com.tencent.mars.xlog.Log.i(finderVideoView.f189739e, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s isPreparedMoovReadyResult:%s", finderVideoView.N(), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(finderVideoView.A1), finderVideoView.f71650y0, java.lang.Boolean.valueOf(z18));
                if (finderVideoView.A1 != 0) {
                    com.tencent.mars.xlog.Log.w(finderVideoView.f189739e, "moov had callback, do nothing.");
                } else {
                    com.tencent.mm.pluginsdk.ui.e3 e3Var = finderVideoView.R;
                    if (e3Var.f190806m == 0) {
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        e3Var.f190806m = java.lang.System.currentTimeMillis();
                    }
                    try {
                        d61.f fVar = finderVideoView.f71652z1;
                        int i17 = 1;
                        if (fVar == null) {
                            com.tencent.mars.xlog.Log.w(finderVideoView.f189739e, "%s parser is null, thread is error.", finderVideoView.N());
                        } else {
                            if (!z18 && !fVar.a(finderVideoView.f71645l1, j17)) {
                                com.tencent.mars.xlog.Log.w(finderVideoView.f189739e, "%s mp4 parse moov error. cdnMediaId %s", finderVideoView.N(), finderVideoView.f71650y0);
                                finderVideoView.f71648x0.a(finderVideoView.f71650y0, 0, -1);
                            }
                            finderVideoView.A1 = finderVideoView.f71652z1.c();
                            com.tencent.mars.xlog.Log.i(finderVideoView.f189739e, "%s mp4 parse moov success. duration %d cdnMediaId %s ", finderVideoView.N(), java.lang.Integer.valueOf(finderVideoView.A1), finderVideoView.f71650y0);
                            if (finderVideoView.b0(0)) {
                                finderVideoView.g0();
                            }
                            if (finderVideoView.B1 != -1) {
                                i17 = 2;
                            }
                            finderVideoView.f71651y1 = i17;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(finderVideoView.f189739e, e17, "%s deal moov ready error [%s]", finderVideoView.N(), finderVideoView.f71650y0);
                    }
                }
            }
            cw2.eb ebVar = x3Var.f330159d;
            if (ebVar != null) {
                ebVar.K((int) j17, (int) this.f330139g, x3Var.f330161f, this.f330141i);
            }
            com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "onMoovReady man " + cVar + " mediaId: " + this.f330137e);
        }
        return jz5.f0.f302826a;
    }
}
