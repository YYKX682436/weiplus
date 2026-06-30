package jz0;

/* loaded from: classes5.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302617d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302619f;

    /* renamed from: g, reason: collision with root package name */
    public int f302620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f302619f = maasFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f302618e = obj;
        this.f302620g |= Integer.MIN_VALUE;
        return this.f302619f.T6(this);
    }
}
