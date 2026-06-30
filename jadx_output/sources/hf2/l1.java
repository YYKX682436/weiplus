package hf2;

/* loaded from: classes10.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(hf2.p1 p1Var) {
        super(1);
        this.f281103d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qc0.g1 g1Var;
        qc0.j2 status = (qc0.j2) obj;
        kotlin.jvm.internal.o.g(status, "status");
        boolean b17 = kotlin.jvm.internal.o.b(status, qc0.d2.f361375c);
        hf2.p1 p1Var = this.f281103d;
        if (b17 && (g1Var = p1Var.f281139d) != null) {
            qc0.g1.a(g1Var, null, 1, null);
        }
        com.tencent.mars.xlog.Log.i(p1Var.f281137b, "dropBitmap StickerItemBehaviorStatus: " + status);
        return jz5.f0.f302826a;
    }
}
