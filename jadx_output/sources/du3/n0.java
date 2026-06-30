package du3;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f243664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(du3.t0 t0Var) {
        super(2);
        this.f243664d = t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoBrushPlugin", "click position >> " + intValue);
        hk0.e eVar = new hk0.e(hk0.h.f281740e, intValue2, intValue);
        du3.t0 t0Var = this.f243664d;
        t0Var.f243713n = eVar;
        t0Var.B().b7(t0Var.f243713n);
        return jz5.f0.f302826a;
    }
}
