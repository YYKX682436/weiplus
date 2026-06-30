package yf2;

/* loaded from: classes3.dex */
public final class b0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.g0 f461660d;

    public b0(yf2.g0 g0Var) {
        this.f461660d = g0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.content.Intent intent;
        android.content.Intent intent2;
        r45.q12 q12Var = (r45.q12) obj;
        yf2.g0 g0Var = this.f461660d;
        if (g0Var.f461699o) {
            yf2.g0.a7(g0Var, null, q12Var, 1, null);
        } else {
            yf2.g0.a7(g0Var, (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) g0Var.business(mm2.g1.class)).f329078s).getValue(), null, 2, null);
            com.tencent.mm.ui.MMActivity N6 = g0Var.N6();
            if (((N6 == null || (intent2 = N6.getIntent()) == null) ? 0 : intent2.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) == 4) {
                g0Var.Z6(q12Var, false);
                com.tencent.mm.ui.MMActivity N62 = g0Var.N6();
                if (N62 != null && (intent = N62.getIntent()) != null) {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
                }
            }
            g0Var.f461699o = true;
        }
        return jz5.f0.f302826a;
    }
}
