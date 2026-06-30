package ru;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399565d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru.j f399567f;

    /* renamed from: g, reason: collision with root package name */
    public int f399568g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399567f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399566e = obj;
        this.f399568g |= Integer.MIN_VALUE;
        return ru.j.J(this.f399567f, this);
    }
}
