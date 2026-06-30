package ru;

/* loaded from: classes12.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399618d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru.u f399620f;

    /* renamed from: g, reason: collision with root package name */
    public int f399621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ru.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399620f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399619e = obj;
        this.f399621g |= Integer.MIN_VALUE;
        return this.f399620f.B(this);
    }
}
