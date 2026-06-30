package sm3;

/* loaded from: classes10.dex */
public final class m implements sm3.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm3.o f409888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f409889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f409890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm3.n f409891d;

    public m(sm3.o oVar, int i17, kotlin.jvm.internal.f0 f0Var, sm3.n nVar) {
        this.f409888a = oVar;
        this.f409889b = i17;
        this.f409890c = f0Var;
        this.f409891d = nVar;
    }

    public void a(sm3.c0 edge, int i17, int i18) {
        kotlin.jvm.internal.o.g(edge, "edge");
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksAdapter", "onSlidingStarted: " + i17 + ", " + i18);
        float f17 = (float) i17;
        sm3.o oVar = this.f409888a;
        long widthPerMills = (long) (f17 / oVar.f409897e.getWidthPerMills());
        long widthPerMills2 = (long) (((float) i18) / oVar.f409897e.getWidthPerMills());
        sm3.q qVar = (sm3.q) oVar.f409896d;
        qVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSlidingStarted: index=");
        int i19 = this.f409889b;
        sb6.append(i19);
        sb6.append(", startTime=");
        sb6.append(widthPerMills);
        sb6.append(", endTime=");
        sb6.append(widthPerMills2);
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", sb6.toString());
        sm3.u callback = qVar.f409903a.getCallback();
        if (callback != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onTrackSlidingStarted: index=" + i19 + ", startTime=" + widthPerMills + ", endTime=" + widthPerMills2);
            pk4.c cVar = ((mm3.h) callback).f329639g.f151186n;
            if (cVar != null) {
                ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).a();
            }
            kl3.t.g().a().pause();
        }
    }
}
