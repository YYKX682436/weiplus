package sn1;

/* loaded from: classes9.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sn1.z f410098e;

    /* renamed from: f, reason: collision with root package name */
    public int f410099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sn1.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f410098e = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f410097d = obj;
        this.f410099f |= Integer.MIN_VALUE;
        return this.f410098e.e(null, this);
    }
}
