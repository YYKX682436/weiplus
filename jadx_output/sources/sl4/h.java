package sl4;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f409272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sl4.l lVar) {
        super(0);
        this.f409272d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sl4.l lVar = this.f409272d;
        java.lang.Boolean bool = lVar.f409282i;
        if (bool == null || kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMinimizeModule", "onEnterBackground");
            lVar.f409282i = java.lang.Boolean.FALSE;
            sl4.a aVar = lVar.f409280g;
            if (aVar != null) {
                aVar.i(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
