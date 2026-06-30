package gu0;

/* loaded from: classes5.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275707d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275709f;

    /* renamed from: g, reason: collision with root package name */
    public int f275710g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275709f = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275708e = obj;
        this.f275710g |= Integer.MIN_VALUE;
        return gu0.k2.d(this.f275709f, this);
    }
}
