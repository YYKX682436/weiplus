package ru;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399560e;

    /* renamed from: f, reason: collision with root package name */
    public long f399561f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.j f399563h;

    /* renamed from: i, reason: collision with root package name */
    public int f399564i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399563h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399562g = obj;
        this.f399564i |= Integer.MIN_VALUE;
        return ru.j.I(this.f399563h, this);
    }
}
