package vz3;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz3.q f441683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.l lVar, vz3.q qVar) {
        super(1);
        this.f441682d = lVar;
        this.f441683e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f441682d.invoke(java.lang.Boolean.FALSE);
        } else {
            pm0.v.X(new vz3.g(this.f441683e));
        }
        return jz5.f0.f302826a;
    }
}
