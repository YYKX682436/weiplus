package sl4;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f409273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sl4.l lVar) {
        super(0);
        this.f409273d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sl4.l lVar = this.f409273d;
        java.lang.Boolean bool = lVar.f409282i;
        if (bool == null || kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMinimizeModule", "onEnterForeground");
            lVar.f409282i = java.lang.Boolean.TRUE;
            sl4.a aVar = lVar.f409280g;
            if (aVar != null) {
                aVar.h();
            }
        }
        return jz5.f0.f302826a;
    }
}
