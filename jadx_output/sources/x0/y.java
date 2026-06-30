package x0;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yz5.l lVar) {
        super(1);
        this.f450961d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        x0.s invalid = (x0.s) obj;
        kotlin.jvm.internal.o.g(invalid, "invalid");
        x0.m mVar = (x0.m) this.f450961d.invoke(invalid);
        synchronized (x0.z.f450963b) {
            x0.z.f450964c = x0.z.f450964c.j(mVar.d());
        }
        return mVar;
    }
}
