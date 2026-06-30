package jz0;

/* loaded from: classes5.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302603d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302605f;

    /* renamed from: g, reason: collision with root package name */
    public int f302606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f302605f = maasFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f302604e = obj;
        this.f302606g |= Integer.MIN_VALUE;
        return com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.O6(this.f302605f, this);
    }
}
