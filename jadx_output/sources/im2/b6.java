package im2;

/* loaded from: classes3.dex */
public final class b6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292264d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f292265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292266f = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        im2.b6 b6Var = new im2.b6(this.f292266f, continuation);
        b6Var.f292265e = obj;
        return b6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.b6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.y0 y0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292264d;
        im2.h6 h6Var = this.f292266f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f292265e;
            java.lang.Integer num = h6Var.Y().f410660o;
            if (num == null || num.intValue() <= 0) {
                y0Var = y0Var3;
                kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, null, null, new im2.a6(h6Var, null), 3, null);
                h6Var.getClass();
                com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, null, null, new im2.y5(b17, h6Var, null), 3, null);
                h6Var.getClass();
                com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, null, null, new im2.d6(b17, h6Var, null), 3, null);
                h6Var.getClass();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.f1 L = com.tencent.mm.plugin.finder.live.plugin.oo0.L(h6Var, kotlinx.coroutines.internal.b0.f310484a, null, new im2.f6(b17, h6Var, null), 2, null);
                h6Var.getClass();
                com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, null, null, new im2.z5(b17, L, h6Var, null), 3, null);
                return jz5.f0.f302826a;
            }
            long intValue = num.intValue();
            this.f292265e = y0Var3;
            this.f292264d = 1;
            if (kotlinx.coroutines.k1.b(intValue, this) == aVar) {
                return aVar;
            }
            y0Var2 = y0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var2 = (kotlinx.coroutines.y0) this.f292265e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        y0Var = y0Var2;
        kotlinx.coroutines.f1 b172 = kotlinx.coroutines.l.b(y0Var, null, null, new im2.a6(h6Var, null), 3, null);
        h6Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, null, null, new im2.y5(b172, h6Var, null), 3, null);
        h6Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, null, null, new im2.d6(b172, h6Var, null), 3, null);
        h6Var.getClass();
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.f1 L2 = com.tencent.mm.plugin.finder.live.plugin.oo0.L(h6Var, kotlinx.coroutines.internal.b0.f310484a, null, new im2.f6(b172, h6Var, null), 2, null);
        h6Var.getClass();
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, null, null, new im2.z5(b172, L2, h6Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
