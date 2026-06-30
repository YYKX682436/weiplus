package wf2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.h f445579e;

    /* renamed from: f, reason: collision with root package name */
    public int f445580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wf2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445579e = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445578d = obj;
        this.f445580f |= Integer.MIN_VALUE;
        return this.f445579e.d(null, this);
    }
}
