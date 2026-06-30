package jz0;

/* loaded from: classes5.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302610d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302612f;

    /* renamed from: g, reason: collision with root package name */
    public int f302613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f302612f = maasFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f302611e = obj;
        this.f302613g |= Integer.MIN_VALUE;
        return this.f302612f.S6(this);
    }
}
