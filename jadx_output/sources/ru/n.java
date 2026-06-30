package ru;

/* loaded from: classes12.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399605e;

    /* renamed from: f, reason: collision with root package name */
    public long f399606f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.u f399608h;

    /* renamed from: i, reason: collision with root package name */
    public int f399609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ru.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399608h = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399607g = obj;
        this.f399609i |= Integer.MIN_VALUE;
        return this.f399608h.k(this);
    }
}
