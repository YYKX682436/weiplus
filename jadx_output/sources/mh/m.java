package mh;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.persist.FlattParcelable f326272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable) {
        super(0);
        this.f326272d = flattParcelable;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            com.tencent.matrix.battery.accumulate.persist.a.f52553a.b(this.f326272d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.FlattParcelable", new java.io.IOException("clear err: " + th6.getMessage()).getMessage());
        }
        return jz5.f0.f302826a;
    }
}
