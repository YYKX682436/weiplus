package gf2;

/* loaded from: classes10.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f271306f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271308h;

    /* renamed from: i, reason: collision with root package name */
    public int f271309i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271308h = anchorMilestoneShareView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271307g = obj;
        this.f271309i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.c(this.f271308h, this);
    }
}
