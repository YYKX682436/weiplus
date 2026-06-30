package sn1;

/* loaded from: classes9.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sn1.z f410075e;

    /* renamed from: f, reason: collision with root package name */
    public int f410076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sn1.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f410075e = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f410074d = obj;
        this.f410076f |= Integer.MIN_VALUE;
        return this.f410075e.d(null, null, this);
    }
}
