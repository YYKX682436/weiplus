package df2;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f229857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(df2.d4 d4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229857d = d4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.c4(this.f229857d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.c4 c4Var = (df2.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yg2.b viewScope;
        yg2.b viewScope2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int h07 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f));
        df2.d4 d4Var = this.f229857d;
        xt2.r5 r5Var = d4Var.f229939n;
        if (r5Var == null) {
            r5Var = new xt2.r5(d4Var.O6(), d4Var.getStore().getLiveRoomData(), h07);
        }
        d4Var.f229939n = r5Var;
        xt2.r5 r5Var2 = d4Var.f229939n;
        if (r5Var2 != null) {
            cm2.m0 m0Var = (cm2.m0) d4Var.f229940o.getValue();
            df2.a4 a4Var = new df2.a4(d4Var);
            r5Var2.w();
            r5Var2.z();
            r5Var2.f456997p = m0Var;
            r5Var2.f456998q = a4Var;
            if (((java.util.ArrayList) r5Var2.f456996o).isEmpty()) {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null && (viewScope2 = k0Var.getViewScope()) != null) {
                    kotlinx.coroutines.l.d(viewScope2, null, null, new xt2.p5(r5Var2, null), 3, null);
                }
            } else {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
                if (k0Var2 != null && (viewScope = k0Var2.getViewScope()) != null) {
                    kotlinx.coroutines.l.d(viewScope, null, null, new xt2.q5(r5Var2, null), 3, null);
                }
            }
        }
        xt2.r5 r5Var3 = d4Var.f229939n;
        if (r5Var3 != null) {
            r5Var3.f456999r = new df2.b4(d4Var);
        }
        return jz5.f0.f302826a;
    }
}
