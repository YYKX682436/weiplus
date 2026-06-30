package nx0;

/* loaded from: classes5.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView f341159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.a3 f341160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView makeupView, nx0.a3 a3Var) {
        super(2);
        this.f341159d = makeupView;
        this.f341160e = a3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.b3 itemData = (nx0.b3) obj2;
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView makeupView = this.f341159d;
        if (!kotlin.jvm.internal.o.b(itemData, makeupView.f69610f)) {
            nx0.a3 a3Var = this.f341160e;
            int i17 = 0;
            for (java.lang.Object obj3 : a3Var.f341066d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.b3 b3Var = (nx0.b3) obj3;
                if (b3Var.f341078d) {
                    b3Var.f341078d = false;
                    a3Var.notifyItemChanged(i17);
                }
                i17 = i18;
            }
            makeupView.f69610f = itemData;
            boolean z17 = itemData.f341080f;
            java.util.List list = a3Var.f341066d;
            if (z17) {
                ((nx0.b3) list.get(intValue)).f341078d = true;
                a3Var.notifyItemChanged(intValue);
            } else {
                ((nx0.b3) list.get(intValue)).f341078d = true;
                ((nx0.b3) list.get(intValue)).f341079e = true;
                a3Var.notifyItemChanged(intValue);
            }
            nx0.k3 k3Var = new nx0.k3(itemData, a3Var, intValue);
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new nx0.m3(makeupView, k3Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
