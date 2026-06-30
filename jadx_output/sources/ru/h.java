package ru;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399571d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399572e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f399573f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f399574g;

    /* renamed from: h, reason: collision with root package name */
    public long f399575h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399576i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ru.j f399577m;

    /* renamed from: n, reason: collision with root package name */
    public int f399578n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399577m = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399576i = obj;
        this.f399578n |= Integer.MIN_VALUE;
        return ru.j.L(this.f399577m, this);
    }
}
