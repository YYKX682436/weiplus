package gm1;

/* loaded from: classes7.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f273306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gm1.e f273307e;

    public b(boolean[] zArr, gm1.e eVar) {
        this.f273306d = zArr;
        this.f273307e = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.wxassistant.c3 c3Var = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a;
        boolean[] zArr = this.f273306d;
        boolean z17 = zArr[0];
        c3Var.getClass();
        f06.v[] vVarArr = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92151b;
        com.tencent.mm.plugin.appbrand.wxassistant.c3.f92152c.c(c3Var, vVarArr[0], java.lang.Boolean.valueOf(z17));
        boolean z18 = zArr[1];
        c3Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.c3.f92153d.c(c3Var, vVarArr[1], java.lang.Boolean.valueOf(z18));
        boolean z19 = zArr[2];
        c3Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.c3.f92154e.c(c3Var, vVarArr[2], java.lang.Boolean.valueOf(z19));
        this.f273307e.getActivity().finish();
    }
}
