package gf2;

/* loaded from: classes10.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271300e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271302g;

    /* renamed from: h, reason: collision with root package name */
    public int f271303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271302g = anchorMilestoneShareView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271301f = obj;
        this.f271303h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.b(this.f271302g, null, null, this);
    }
}
