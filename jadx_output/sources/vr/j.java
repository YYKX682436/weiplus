package vr;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.q f439412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vr.q qVar) {
        super(1);
        this.f439412d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map result = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(result, "result");
        this.f439412d.f439422f.invokeMethod("onEmoticonSelected", result);
        return jz5.f0.f302826a;
    }
}
