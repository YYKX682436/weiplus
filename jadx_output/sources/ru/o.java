package ru;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f399610d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399611e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ru.u f399613g;

    /* renamed from: h, reason: collision with root package name */
    public int f399614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ru.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399613g = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399612f = obj;
        this.f399614h |= Integer.MIN_VALUE;
        return this.f399613g.m(this);
    }
}
