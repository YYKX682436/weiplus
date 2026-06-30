package xt2;

/* loaded from: classes3.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456956d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveCartEduAnimView f456958f;

    /* renamed from: g, reason: collision with root package name */
    public int f456959g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.shopping.view.FinderLiveCartEduAnimView finderLiveCartEduAnimView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f456958f = finderLiveCartEduAnimView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f456957e = obj;
        this.f456959g |= Integer.MIN_VALUE;
        return this.f456958f.b(this);
    }
}
