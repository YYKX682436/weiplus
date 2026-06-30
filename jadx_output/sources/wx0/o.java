package wx0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wx0.c0 c0Var) {
        super(1);
        this.f450519d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            com.tencent.maas.camstudio.MJBeautyAdjustmentDesc beautyDesc = this.f450519d.f450459g.V;
            yy0.m7 m7Var = (yy0.m7) l0Var;
            m7Var.getClass();
            kotlin.jvm.internal.o.g(beautyDesc, "beautyDesc");
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.h5(m7Var, beautyDesc, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
