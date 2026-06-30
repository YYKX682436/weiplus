package df2;

/* loaded from: classes3.dex */
public final class lc implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.tc f230654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230655e;

    public lc(df2.tc tcVar, android.view.ViewGroup viewGroup) {
        this.f230654d = tcVar;
        this.f230655e = viewGroup;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.gw1 gw1Var = (r45.gw1) obj;
        com.tencent.mars.xlog.Log.i("LiveAnchorGuideController", "try to show anchor guide bubble, id " + gw1Var.getString(0) + " type " + gw1Var.getInteger(1) + " text " + gw1Var.getString(2));
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) this.f230655e;
        df2.tc tcVar = this.f230654d;
        tcVar.getClass();
        java.lang.String string = gw1Var.getString(2);
        if (string != null) {
            android.view.View findViewById = k0Var.findViewById(com.tencent.mm.R.id.fbe);
            yg2.b viewScope = k0Var.getViewScope();
            if (viewScope != null) {
                com.tencent.mm.plugin.finder.live.widget.sl slVar = new com.tencent.mm.plugin.finder.live.widget.sl(tcVar.O6());
                slVar.c(string);
                kotlin.jvm.internal.o.d(findViewById);
                slVar.f119800d = findViewById;
                slVar.f119799c = 8000L;
                slVar.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118845e;
                slVar.f119809m = 130;
                slVar.f119801e = new df2.nc(tcVar, gw1Var);
                slVar.f119802f = new df2.oc(gw1Var);
                slVar.f119803g = new df2.pc(gw1Var);
                slVar.b();
                tcVar.f231433n.put(java.lang.Integer.valueOf(gw1Var.getInteger(1)), slVar);
                if (!k0Var.isScreenClear()) {
                    java.util.Set set = tcVar.f231432m;
                    if (!kz5.n0.O(set, gw1Var.getString(0))) {
                        java.lang.String string2 = gw1Var.getString(0);
                        if (string2 != null) {
                            set.add(string2);
                        }
                        slVar.d(viewScope);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", "6");
                        i95.m c17 = i95.n0.c(zy2.zb.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328362m, jSONObject.toString(), null, 4, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
