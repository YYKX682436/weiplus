package tt2;

/* loaded from: classes3.dex */
public final class s0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f421991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f421992f;

    public s0(tt2.e1 e1Var, boolean z17, cm2.m0 m0Var) {
        this.f421990d = e1Var;
        this.f421991e = z17;
        this.f421992f = m0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String string;
        r45.y23 y23Var;
        r45.rt3 rt3Var;
        tt2.e1 e1Var = this.f421990d;
        g4Var.g(1, e1Var.f421880h.getString(com.tencent.mm.R.string.nus), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        android.content.Context context = e1Var.f421880h;
        java.util.List list = g4Var.f228344d;
        android.content.Context context2 = g4Var.f228346f;
        if (this.f421991e) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.nuv);
            int color = context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9);
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.nut);
            db5.h4 h4Var = new db5.h4(context2, 2, 0);
            h4Var.f228368i = string2;
            h4Var.f228370n = color;
            h4Var.f228373q = string3;
            h4Var.f228374r = com.tencent.mm.R.color.BW_0_Alpha_0_5;
            h4Var.f228375s = false;
            ((java.util.ArrayList) list).add(h4Var);
            return;
        }
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.nuv);
        int color2 = context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5);
        cm2.m0 m0Var = this.f421992f;
        if (m0Var == null || (y23Var = m0Var.f43368v) == null || (rt3Var = (r45.rt3) y23Var.getCustom(69)) == null || (string = rt3Var.getString(2)) == null) {
            string = context.getString(com.tencent.mm.R.string.nuu);
        }
        db5.h4 h4Var2 = new db5.h4(context2, 2, 0);
        h4Var2.f228368i = string4;
        h4Var2.f228370n = color2;
        h4Var2.f228373q = string;
        h4Var2.f228374r = com.tencent.mm.R.color.BW_0_Alpha_0_3;
        h4Var2.f228375s = true;
        ((java.util.ArrayList) list).add(h4Var2);
    }
}
