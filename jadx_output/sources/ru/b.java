package ru;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399548d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru.j f399550f;

    /* renamed from: g, reason: collision with root package name */
    public int f399551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399550f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399549e = obj;
        this.f399551g |= Integer.MIN_VALUE;
        return ru.j.E(this.f399550f, null, this);
    }
}
