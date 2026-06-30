package tw5;

/* loaded from: classes8.dex */
public final class a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final long f422484d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f422485e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f422486f;

    /* renamed from: g, reason: collision with root package name */
    public final ww5.c f422487g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f422488h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f422489i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f422490m;

    /* renamed from: n, reason: collision with root package name */
    public final float f422491n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, java.lang.String frameSetRootId, java.lang.String frameSetId, android.content.Context context, ww5.c canvasViewType, int i17, kotlin.jvm.internal.i iVar) {
        super(context);
        canvasViewType = (i17 & 16) != 0 ? ww5.c.f450396d : canvasViewType;
        kotlin.jvm.internal.o.g(frameSetRootId, "frameSetRootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(canvasViewType, "canvasViewType");
        this.f422484d = j17;
        this.f422485e = frameSetRootId;
        this.f422486f = frameSetId;
        this.f422487g = canvasViewType;
        this.f422491n = context.getResources().getDisplayMetrics().density;
    }

    public final float getDensity() {
        return this.f422491n;
    }

    public final int getFrameSetViewHeight() {
        return (int) (getHeight() / this.f422491n);
    }

    public final int getFrameSetViewWidth() {
        return (int) (getWidth() / this.f422491n);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f422488h) {
            return;
        }
        float f17 = i19 - i17;
        float f18 = this.f422491n;
        com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b.f220042b.f(this.f422484d, this.f422486f, this.f422485e, (int) (f17 / f18), (int) ((i27 - i18) / f18));
        this.f422488h = true;
        yz5.l lVar = this.f422490m;
        if (lVar != null) {
            if (lVar != null) {
                lVar.invoke(this);
            } else {
                kotlin.jvm.internal.o.o("onFrameSetViewBound");
                throw null;
            }
        }
    }

    public final void setUpOnFrameSetViewBoundCallback(yz5.l onFrameSetViewBound) {
        kotlin.jvm.internal.o.g(onFrameSetViewBound, "onFrameSetViewBound");
        this.f422490m = onFrameSetViewBound;
    }
}
