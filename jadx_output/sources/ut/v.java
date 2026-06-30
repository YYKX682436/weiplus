package ut;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p25.e f430760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ut.q0 q0Var, p25.e eVar) {
        super(1);
        this.f430759d = q0Var;
        this.f430760e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendFileTask", this.f430759d.id() + " invokeOnCancellation");
        ((z25.d) this.f430760e).f();
        return jz5.f0.f302826a;
    }
}
