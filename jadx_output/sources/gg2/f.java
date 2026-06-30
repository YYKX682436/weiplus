package gg2;

/* loaded from: classes2.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271672d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg2.m f271674f;

    /* renamed from: g, reason: collision with root package name */
    public int f271675g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271674f = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271673e = obj;
        this.f271675g |= Integer.MIN_VALUE;
        return this.f271674f.l(this);
    }
}
