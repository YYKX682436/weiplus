package sl4;

/* loaded from: classes11.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f409276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sl4.l lVar) {
        super(0);
        this.f409276d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMinimizeModule", "removeMinimize");
        sl4.a aVar = this.f409276d.f409280g;
        if (aVar != null) {
            ((sl4.g) aVar).w0(true, qk.z9.f364415g);
        }
        return jz5.f0.f302826a;
    }
}
