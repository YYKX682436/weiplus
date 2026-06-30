package zx2;

/* loaded from: classes15.dex */
public class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f477064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f477065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f477066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f477067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zx2.t f477068h;

    public r(zx2.t tVar, int i17, int i18, int i19, int i27) {
        this.f477068h = tVar;
        this.f477064d = i17;
        this.f477065e = i18;
        this.f477066f = i19;
        this.f477067g = i27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        zx2.t tVar = this.f477068h;
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = tVar.f477080p;
        m3.e eVar = com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout.f133098x0;
        finderTabLayout.getClass();
        int i17 = this.f477065e;
        int round = this.f477064d + java.lang.Math.round((i17 - r2) * animatedFraction);
        tVar.f477080p.getClass();
        int i18 = this.f477067g;
        tVar.d(round, this.f477066f + java.lang.Math.round(animatedFraction * (i18 - r3)));
    }
}
