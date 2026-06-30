package if0;

/* loaded from: classes16.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f291011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(if0.k kVar) {
        super(0);
        this.f291011d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if0.k kVar = this.f291011d;
        if (!kVar.f291031d) {
            long j17 = kVar.f291028a.f364316b;
            if (j17 > 0) {
                com.tencent.mars.xlog.Log.i(kVar.d(), "startDelayRelease:" + j17 + ", background");
                pm0.v.X(new if0.j(kVar, 50, j17));
            }
        }
        return jz5.f0.f302826a;
    }
}
