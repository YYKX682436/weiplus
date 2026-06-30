package df2;

/* loaded from: classes3.dex */
public final class a implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.g f229646d;

    public a(df2.g gVar) {
        this.f229646d = gVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.f0 f0Var;
        r45.gw1 gw1Var = (r45.gw1) obj;
        if (gw1Var != null) {
            java.lang.String string = gw1Var.getString(0);
            if (string == null) {
                string = "";
            }
            df2.g gVar = this.f229646d;
            if (gVar.f230181q.contains(string)) {
                com.tencent.mars.xlog.Log.w("CreateNextNoticeGuide", "observe: has shown this guide, msgId=".concat(string));
                return;
            }
            gVar.f230181q.add(string);
            com.tencent.mars.xlog.Log.i("CreateNextNoticeGuide", "showBubble: show msgId=" + gw1Var.getString(0) + ", guideTitle=" + gw1Var.getString(2) + ", guideText=" + gw1Var.getString(3));
            gVar.k7(gVar);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.U1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            gVar.h7(new df2.b(gVar));
            java.lang.String string2 = gw1Var.getString(2);
            if (string2 == null || string2.length() == 0) {
                string2 = gVar.O6().getResources().getString(com.tencent.mm.R.string.mn_);
            }
            java.lang.String str = string2;
            java.lang.String string3 = gw1Var.getString(3);
            if (string3 == null || string3.length() == 0) {
                string3 = gVar.O6().getResources().getString(com.tencent.mm.R.string.mn9);
            }
            java.lang.String str2 = string3;
            java.lang.String string4 = gVar.O6().getResources().getString(com.tencent.mm.R.string.mn8);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            gVar.l7(new df2.d9(str, str2, string4, null, 0, 0, 48, null));
            gVar.g7(new df2.f(gVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("CreateNextNoticeGuide", "observe: post null");
        }
    }
}
