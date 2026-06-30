package hf2;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f281062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(hf2.h0 h0Var, int i17) {
        super(1);
        this.f281062d = h0Var;
        this.f281063e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qc0.j2 status = (qc0.j2) obj;
        kotlin.jvm.internal.o.g(status, "status");
        hf2.h0 h0Var = this.f281062d;
        java.lang.String str = h0Var.f281071b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchStickerOperationContainer StickerItemBehaviorStatus: ");
        sb6.append(status);
        sb6.append(",stickerType:");
        int i17 = this.f281063e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (kotlin.jvm.internal.o.b(status, qc0.i2.f361389c)) {
            qc0.g1 g1Var = h0Var.f281072c;
            if (g1Var != null) {
                qc0.g1.a(g1Var, null, 1, null);
            }
        } else {
            boolean b17 = kotlin.jvm.internal.o.b(status, qc0.c2.f361362c);
            hf2.x xVar = h0Var.f281070a;
            if (b17) {
                xVar.n7("click item");
                h0Var.a();
                xVar.w7(i17, "");
            } else {
                ((hf2.f1) ((jz5.n) xVar.B).getValue()).a(i17, status);
            }
        }
        return jz5.f0.f302826a;
    }
}
