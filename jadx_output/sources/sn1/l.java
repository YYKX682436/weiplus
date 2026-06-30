package sn1;

/* loaded from: classes9.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sn1.z f410051e;

    /* renamed from: f, reason: collision with root package name */
    public int f410052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sn1.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f410051e = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f410050d = obj;
        this.f410052f |= Integer.MIN_VALUE;
        return this.f410051e.c(null, null, this);
    }
}
