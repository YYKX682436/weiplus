package wo4;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wo4.y yVar) {
        super(0);
        this.f448290d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "video onEncodeEnd");
        gs0.b bVar = this.f448290d.f448297d;
        if (bVar != null) {
            bVar.f();
        }
        this.f448290d.f448305l = true;
        this.f448290d.c();
        return jz5.f0.f302826a;
    }
}
