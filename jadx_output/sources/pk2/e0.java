package pk2;

/* loaded from: classes3.dex */
public final class e0 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355697h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355698i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355697h = helper.M;
        this.f355698i = "anchorlive.more.creatorcenter";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f364427a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) o9Var2.c(mm2.c1.class)).f328778a5 ? ((mm2.o2) o9Var2.c(mm2.o2.class)).f329307p : ((mm2.c1) o9Var2.c(mm2.c1.class)).f328909x0;
        java.lang.String str2 = o9Var.f356072a;
        if (finderJumpInfo == null) {
            com.tencent.mars.xlog.Log.w(str2, "onItemClicked: creatorCenterEntrance is null, skip jump (后台未下发 creator_center_entrance_v2)");
        }
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.ui.MMActivity context = o9Var2.f356078d;
            r45.k74 lite_app_info = finderJumpInfo.getLite_app_info();
            if (lite_app_info == null || (str = lite_app_info.getString(2)) == null) {
                str = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Throwable unused) {
            }
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            jSONObject.put("rpt_finder_username", xy2.c.e(context2));
            jSONObject.put("rpt_liveid", n() ? pm0.v.u(((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0)) : "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AnchorCreatorCenterOption onClick, query:");
            sb6.append(jSONObject);
            sb6.append(", origin:");
            r45.k74 lite_app_info2 = finderJumpInfo.getLite_app_info();
            sb6.append(lite_app_info2 != null ? lite_app_info2.getString(2) : null);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            r45.k74 lite_app_info3 = finderJumpInfo.getLite_app_info();
            if (lite_app_info3 != null) {
                lite_app_info3.set(2, jSONObject.toString());
            }
            kotlin.jvm.internal.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 10, 2, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("element", 9);
        jSONObject2.put("type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355698i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f328778a5) {
            if (((mm2.o2) o9Var.c(mm2.o2.class)).f329307p != null) {
                return true;
            }
        } else if (((mm2.c1) o9Var.c(mm2.c1.class)).f328909x0 != null) {
            return true;
        }
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355697h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwp);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_creator_center, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0));
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 10, 1, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 9);
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f355697h;
    }
}
