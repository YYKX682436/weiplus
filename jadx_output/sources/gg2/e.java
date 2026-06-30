package gg2;

/* loaded from: classes2.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271668e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg2.m f271670g;

    /* renamed from: h, reason: collision with root package name */
    public int f271671h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271670g = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271669f = obj;
        this.f271671h |= Integer.MIN_VALUE;
        return this.f271670g.a(null, this);
    }
}
