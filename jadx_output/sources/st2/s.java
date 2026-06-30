package st2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412439d;

    public s(st2.h1 h1Var) {
        this.f412439d = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ut2.u3 n17;
        r45.xv2 xv2Var;
        st2.h1 h1Var = this.f412439d;
        if (h1Var.h().isShowing && (xv2Var = (n17 = h1Var.n()).f431117g) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.f4 f4Var = ml2.f4.U;
            jSONObject.put("commerceAction", f4Var);
            jSONObject.put("cate_id", xv2Var.getLong(2));
            jSONObject.put("tab_lv2_name", xv2Var.getString(0));
            if (kotlin.jvm.internal.o.b(xv2Var.getString(0), n17.f431112b.getContext().getString(com.tencent.mm.R.string.ewi))) {
                jSONObject.put("tab_lv2_type", 3);
            } else {
                jSONObject.put("tab_lv2_type", xv2Var.getLong(2) != 0 ? 1 : 2);
            }
            jSONObject.put("tab_lv2_duration", c01.id.c() - n17.f431119i);
            jSONObject.put("total_duration", c01.id.c() - n17.f431118h);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Dj((ml2.r0) c17, f4Var, null, "", null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
            com.tencent.mars.xlog.Log.i(n17.f431113c, "onPanelHide json = " + jSONObject);
        }
        h1Var.h().a(new st2.r(h1Var));
    }
}
