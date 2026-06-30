package ru;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f399583d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399584e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f399585f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.u f399587h;

    /* renamed from: i, reason: collision with root package name */
    public int f399588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ru.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399587h = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399586g = obj;
        this.f399588i |= Integer.MIN_VALUE;
        return this.f399587h.D(null, this);
    }
}
