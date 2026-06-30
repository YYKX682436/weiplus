package nx0;

/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView f341072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.q1 f341073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView faceEffectView, nx0.q1 q1Var) {
        super(2);
        this.f341072d = faceEffectView;
        this.f341073e = q1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.r1 itemData = (nx0.r1) obj2;
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView faceEffectView = this.f341072d;
        if (!kotlin.jvm.internal.o.b(itemData, faceEffectView.f69594f)) {
            nx0.q1 q1Var = this.f341073e;
            int i17 = 0;
            for (java.lang.Object obj3 : q1Var.f341202d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.r1 r1Var = (nx0.r1) obj3;
                if (r1Var.f341213d) {
                    r1Var.f341213d = false;
                    q1Var.notifyItemChanged(i17);
                }
                i17 = i18;
            }
            faceEffectView.f69594f = itemData;
            boolean z17 = itemData.f341215f;
            java.util.List list = q1Var.f341202d;
            if (z17) {
                ((nx0.r1) list.get(intValue)).f341213d = true;
                q1Var.notifyItemChanged(intValue);
            } else {
                ((nx0.r1) list.get(intValue)).f341213d = true;
                ((nx0.r1) list.get(intValue)).f341214e = true;
                q1Var.notifyItemChanged(intValue);
            }
            nx0.a2 a2Var = new nx0.a2(itemData, q1Var, intValue);
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new nx0.c2(faceEffectView, a2Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
