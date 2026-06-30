package gf2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271314d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f271316f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f271317g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271319i;

    /* renamed from: m, reason: collision with root package name */
    public int f271320m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271319i = anchorMilestoneShareView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271318h = obj;
        this.f271320m |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.d(this.f271319i, null, this);
    }
}
