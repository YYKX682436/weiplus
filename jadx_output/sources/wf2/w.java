package wf2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445624e;

    /* renamed from: f, reason: collision with root package name */
    public int f445625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wf2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445624e = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445623d = obj;
        this.f445625f |= Integer.MIN_VALUE;
        return this.f445624e.c7(this);
    }
}
