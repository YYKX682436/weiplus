package if0;

/* loaded from: classes16.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f291019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(if0.k kVar) {
        super(0);
        this.f291019d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if0.k kVar = this.f291019d;
        long j17 = kVar.f291028a.f364317c;
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i(kVar.d(), "startDelayRelease:" + j17 + ", deepBackground");
            pm0.v.X(new if0.j(kVar, 100, j17));
        }
        return jz5.f0.f302826a;
    }
}
