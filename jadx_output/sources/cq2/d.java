package cq2;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f221378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f221378d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f221378d.resumeWith(kotlin.Result.m521constructorimpl((java.util.LinkedList) obj));
        return jz5.f0.f302826a;
    }
}
