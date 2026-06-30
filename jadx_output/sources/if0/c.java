package if0;

/* loaded from: classes16.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f291018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(if0.k kVar) {
        super(0);
        this.f291018d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if0.k kVar = this.f291018d;
        if0.l lVar = kVar.f291032e;
        if (lVar != null) {
            com.tencent.mars.xlog.Log.i(kVar.d(), "delayTask:" + kVar.f291032e + ", cancel");
            lVar.f291033a.cancel(false);
            kVar.f291032e = null;
        }
        return jz5.f0.f302826a;
    }
}
