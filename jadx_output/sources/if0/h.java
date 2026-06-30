package if0;

/* loaded from: classes16.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f291023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(if0.k kVar) {
        super(0);
        this.f291023d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if0.k kVar = this.f291023d;
        com.tencent.mars.xlog.Log.i(kVar.d(), "doReleaseCallback");
        kVar.f291030c.invoke();
        return jz5.f0.f302826a;
    }
}
