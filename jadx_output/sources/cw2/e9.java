package cw2;

/* loaded from: classes2.dex */
public final class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f223679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.ca f223681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f223682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f223683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f223684i;

    public e9(long j17, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, cw2.ca caVar, long j18, int i17, int i18) {
        this.f223679d = j17;
        this.f223680e = finderVideoLayout;
        this.f223681f = caVar;
        this.f223682g = j18;
        this.f223683h = i17;
        this.f223684i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f223679d > 0) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223680e;
            if (finderVideoLayout.U == -1.0f) {
                cw2.ca caVar = this.f223681f;
                if (caVar.getIsSeekBarTrackingTouch()) {
                    com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout newSeekBarLayout = finderVideoLayout.getNewSeekBarLayout();
                    if (newSeekBarLayout != null && newSeekBarLayout.getSeekBarDragStyleEnable()) {
                        cw2.ca caVar2 = this.f223681f;
                        long j17 = this.f223682g;
                        long j18 = this.f223679d;
                        caVar2.h((((float) j17) * 1.0f) / ((float) j18), j17, j18);
                        return;
                    }
                    return;
                }
                cw2.ca caVar3 = this.f223681f;
                long j19 = this.f223682g;
                long j27 = this.f223679d;
                caVar3.h((((float) j19) * 1.0f) / ((float) j27), j19, j27);
                int i17 = finderVideoLayout.V;
                int i18 = this.f223683h;
                if (i17 != i18) {
                    int i19 = this.f223684i;
                    caVar.o((i18 * 1.0f) / i19, i18, i19);
                    finderVideoLayout.V = i18;
                }
            }
        }
    }
}
