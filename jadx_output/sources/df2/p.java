package df2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s f231025d;

    public p(df2.s sVar) {
        this.f231025d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/AnchorMiniViewController$checkShowMiniViewBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        df2.s sVar = this.f231025d;
        gk2.e liveRoomData = sVar.getStore().getLiveRoomData();
        java.lang.String str = sVar.f231278m;
        com.tencent.mars.xlog.Log.i(str, "doMiniWindow");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i(str, "doMiniWindow permission ok");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
            sVar.X6(qo0.b.B, bundle);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.U = true;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
        } else {
            com.tencent.mars.xlog.Log.e(str, "doMiniWindow, permission denied");
            if2.b.Y6(sVar, qo0.b.D, null, 2, null);
            tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
            java.lang.String string = context.getString(com.tencent.mm.R.string.gff);
            df2.r rVar = new df2.r(sVar, liveRoomData);
            java.lang.String a17 = n25.a.a();
            ((sb0.f) iVar).getClass();
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(context, string, rVar, false, a17);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.D1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 2);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/AnchorMiniViewController$checkShowMiniViewBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
