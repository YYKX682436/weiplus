package gx0;

/* loaded from: classes.dex */
public final class eg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f276381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f276381d = continuation;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f276381d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        return jz5.f0.f302826a;
    }
}
