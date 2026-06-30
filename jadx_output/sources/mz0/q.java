package mz0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mz0.b2 b2Var) {
        super(0);
        this.f333025d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bg0.z zVar = (bg0.z) i95.n0.c(bg0.z.class);
        mz0.b2 b2Var = this.f333025d;
        android.app.Activity context = b2Var.getContext();
        dz0.d behaviorHolder = b2Var.l7();
        ((ag0.q) zVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(behaviorHolder, "behaviorHolder");
        com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer = new com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer(context);
        segmentClipThumbSeekBarContainer.setupBehaviorHolder(behaviorHolder);
        return segmentClipThumbSeekBarContainer;
    }
}
