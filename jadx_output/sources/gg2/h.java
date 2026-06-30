package gg2;

/* loaded from: classes2.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271678d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271679e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f271680f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f271681g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg2.m f271683i;

    /* renamed from: m, reason: collision with root package name */
    public int f271684m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271683i = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271682h = obj;
        this.f271684m |= Integer.MIN_VALUE;
        return this.f271683i.m(null, null, null, this);
    }
}
