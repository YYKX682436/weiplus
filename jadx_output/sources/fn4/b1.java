package fn4;

/* loaded from: classes15.dex */
public class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final fn4.b1 f264481b = new fn4.b1();

    /* renamed from: a, reason: collision with root package name */
    public r45.xn6 f264482a;

    public void a(com.tencent.mm.ui.MMActivity mMActivity, r45.un6 un6Var, r45.xn6 xn6Var) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.f390264p) ? mMActivity.getString(com.tencent.mm.R.string.hsm) : xn6Var.f390264p;
        gp0Var.K0(xn6Var.f390262n);
        gp0Var.O0(xn6Var.f390263o);
        gp0Var.m0(string);
        gp0Var.o0(xn6Var.f390266q);
        gp0Var.x0(true);
        gp0Var.z0(true);
        gp0Var.h0(5);
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.o(xn6Var.f390266q);
        tq0Var.p(xn6Var.f390263o);
        tq0Var.j(string);
        bq0Var.r(tq0Var);
        su4.l2 l2Var = new su4.l2();
        l2Var.f412983b = xn6Var.f390259h;
        l2Var.f412984c = xn6Var.f390273x;
        l2Var.f412985d = un6Var.f387507m;
        l2Var.f412986e = xn6Var.f390272w;
        l2Var.f412987f = 100201L;
        l2Var.f412988g = xn6Var.f390262n;
        l2Var.f412989h = xn6Var.f390263o;
        l2Var.f412990i = xn6Var.f390264p;
        l2Var.f412991j = xn6Var.f390266q;
        l2Var.f412992k = xn6Var.f390267r;
        l2Var.f412993l = xn6Var.f390268s;
        l2Var.f412994m = xn6Var.f390269t;
        l2Var.f412995n = xn6Var.f390270u;
        l2Var.f412996o = xn6Var.f390274y;
        l2Var.f412997p = xn6Var.f390275z;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(un6Var.f387511q);
        linkedList.addAll(xn6Var.W);
        l2Var.f412999r = pm4.w.s(xn6Var.D).toString();
        l2Var.f412998q = c(linkedList).toString();
        l2Var.f413000s = xn6Var.M;
        l2Var.f413001t = xn6Var.f390257f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l2Var.c(sb6, null, null, null, 0, 0);
        tq0Var.q(sb6.toString());
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(3);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.f(xn6Var.f390262n);
        jq0Var.i(xn6Var.f390262n);
        java.lang.String str = gp0Var.f375404d;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6315a = bq0Var;
        c4Var.f6327m = 25;
        c4Var.getClass();
        c4Var.f6317c = 5;
        c4Var.f6323i = mMActivity;
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        doFavoriteEvent.e();
    }

    public void b(fn4.b bVar, int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (i17 == 1024) {
            if (i18 == -1) {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490560yi, 1).show();
                pm4.y.h(bVar.r0(), this.f264482a, "1", c01.z1.r(), "");
                return;
            }
            return;
        }
        if (i17 != 2048 || i18 != -1 || (stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames")) == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (com.tencent.mm.storage.z3.R4(next)) {
                sb6.append("3;");
            } else {
                sb6.append("2;");
            }
            sb7.append(next);
            sb7.append(";");
        }
        pm4.y.h(bVar.r0(), this.f264482a, sb6.toString(), c01.z1.r(), sb7.toString());
    }

    public final org.json.JSONArray c(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                r45.x50 x50Var = (r45.x50) list.get(i17);
                jSONObject.put("key", x50Var.f389788d);
                jSONObject.put("uintValue", x50Var.f389789e);
                jSONObject.put("textValue", x50Var.f389790f);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONArray;
    }
}
