package uw;

/* loaded from: classes.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f431508d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uw.y f431510f;

    /* renamed from: g, reason: collision with root package name */
    public int f431511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uw.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f431510f = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f431509e = obj;
        this.f431511g |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f431510f.a(this);
        return a17 == pz5.a.f359186d ? a17 : kotlin.Result.m520boximpl(a17);
    }
}
