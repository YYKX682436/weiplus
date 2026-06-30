package du0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f243433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlinx.coroutines.q qVar) {
        super(1);
        this.f243433d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelgeo.Addr addr = (com.tencent.mm.modelgeo.Addr) obj;
        com.tencent.mars.xlog.Log.i("LocationUIC", "onPermissionsGranted: result addr " + addr);
        ou0.a.a(this.f243433d, addr != null ? by0.h.a(addr) : null);
        return jz5.f0.f302826a;
    }
}
