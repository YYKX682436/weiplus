package ru;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399553d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399554e;

    /* renamed from: f, reason: collision with root package name */
    public long f399555f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.j f399557h;

    /* renamed from: i, reason: collision with root package name */
    public int f399558i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399557h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399556g = obj;
        this.f399558i |= Integer.MIN_VALUE;
        return ru.j.H(this.f399557h, this);
    }
}
