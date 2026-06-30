package xn1;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.l lVar) {
        super(1);
        this.f455472d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        if (th6 instanceof java.util.concurrent.CancellationException) {
            this.f455472d.invoke(th6);
        }
        return jz5.f0.f302826a;
    }
}
