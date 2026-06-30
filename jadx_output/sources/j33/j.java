package j33;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j33.j f297441a = new j33.j();

    public final void a(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        if (i17 < 200) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.u(i65.a.r(context, com.tencent.mm.R.string.f492187fj5));
            u1Var.n(i65.a.r(context, com.tencent.mm.R.string.fil));
            u1Var.l(j33.f.f297437a);
            u1Var.q(false);
            return;
        }
        if (i17 == 201) {
            java.util.HashMap hashMap = j33.e.f297435b;
            org.json.JSONObject jSONObject = (org.json.JSONObject) hashMap.get(java.lang.Integer.valueOf(i18));
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) hashMap.get(-1);
            int optInt = (jSONObject == null || !jSONObject.has("min-duration-ms")) ? (jSONObject2 == null || !jSONObject2.has("min-duration-ms")) ? 1000 : jSONObject2.optInt("min-duration-ms", 1000) : jSONObject.optInt("min-duration-ms", 1000);
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(context);
            java.lang.String string = context.getString(com.tencent.mm.R.string.fjd, java.lang.Integer.valueOf(optInt / 1000));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            u1Var2.u(string);
            u1Var2.n(i65.a.r(context, com.tencent.mm.R.string.fil));
            u1Var2.l(j33.i.f297440a);
            u1Var2.q(false);
            return;
        }
        if (i17 >= 300) {
            if (i17 < 400) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var3 = new com.tencent.mm.ui.widget.dialog.u1(context);
                u1Var3.u(i65.a.r(context, com.tencent.mm.R.string.fj7));
                u1Var3.n(i65.a.r(context, com.tencent.mm.R.string.fil));
                u1Var3.l(j33.g.f297438a);
                u1Var3.q(false);
                return;
            }
            return;
        }
        java.util.HashMap hashMap2 = j33.e.f297435b;
        org.json.JSONObject jSONObject3 = (org.json.JSONObject) hashMap2.get(java.lang.Integer.valueOf(i18));
        org.json.JSONObject jSONObject4 = (org.json.JSONObject) hashMap2.get(-1);
        int i19 = 300000;
        if (jSONObject3 != null && jSONObject3.has("max-duration-ms")) {
            i19 = jSONObject3.optInt("max-duration-ms", 300000);
        } else if (jSONObject4 != null && jSONObject4.has("max-duration-ms")) {
            i19 = jSONObject4.optInt("max-duration-ms", 300000);
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var4 = new com.tencent.mm.ui.widget.dialog.u1(context);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.fj_, java.lang.Integer.valueOf((i19 / 1000) / 60));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        u1Var4.u(string2);
        u1Var4.n(i65.a.r(context, com.tencent.mm.R.string.fil));
        u1Var4.l(j33.h.f297439a);
        u1Var4.q(false);
    }
}
