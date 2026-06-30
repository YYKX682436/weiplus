package df2;

/* loaded from: classes3.dex */
public final class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f231252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hm f231253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f231254f;

    public rl(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, df2.hm hmVar, android.view.ViewGroup viewGroup) {
        this.f231252d = finderJumpInfo;
        this.f231253e = hmVar;
        this.f231254f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveHeatController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.hm hmVar = this.f231253e;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f231252d;
        if (info != null) {
            if (zl2.r4.f473950a.w1()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.z4 z4Var = ml2.z4.I1;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 2);
                zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c18;
                ml2.b4 b4Var = ml2.b4.T1;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", 2);
                ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
            }
            boolean U6 = hmVar.U6();
            android.view.ViewGroup viewGroup = this.f231254f;
            if (U6) {
                hmVar.W6(new df2.ql(viewGroup, info));
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                kotlin.jvm.internal.o.g(info, "info");
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(info);
                p0Var.f453252n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        } else {
            com.tencent.mars.xlog.Log.e(hmVar.f230335m, "jumpinfo is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
