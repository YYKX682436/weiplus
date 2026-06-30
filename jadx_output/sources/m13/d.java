package m13;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final m13.d f322865a = new m13.d();

    public final void a(android.content.Context context, i13.c item, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        if (item instanceof i13.p) {
            i13.p pVar = (i13.p) item;
            com.tencent.mm.autogen.events.NotifyEnterChattingEvent notifyEnterChattingEvent = new com.tencent.mm.autogen.events.NotifyEnterChattingEvent();
            am.ll llVar = notifyEnterChattingEvent.f54540g;
            java.lang.String str = pVar.f287313h;
            llVar.f7250a = str;
            if (notifyEnterChattingEvent.e()) {
                com.tencent.mars.xlog.Log.i("ForceNotifyUtil", "jumpChattingUI LauncherUI running, jump chatting username:" + str);
            } else {
                com.tencent.mars.xlog.Log.i("ForceNotifyUtil", "jumpChattingUI LauncherUI background, jump chatting username:" + str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", c01.z1.r());
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(1, 1, pVar.f287313h, i17, item.f287275d);
            return;
        }
        if (item instanceof i13.o) {
            i13.o oVar = (i13.o) item;
            java.lang.String str2 = oVar.f287309s;
            long Z = pm0.v.Z(oVar.f287302i);
            long Z2 = pm0.v.Z(oVar.f287303m);
            i95.m c17 = i95.n0.c(zy2.pa.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.pa.pa((zy2.pa) c17, Z, Z2, "", -1, -1, 7L, "temp_7", -1, -1, "", "", java.lang.System.currentTimeMillis(), -1, null, null, null, 57344, null);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bl("temp_7");
            android.content.Intent intent2 = new android.content.Intent();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("notice_id", str2 == null ? "" : str2);
            } catch (java.lang.Throwable unused) {
            }
            intent2.putExtra("key_chnl_extra", jSONObject.toString());
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(25, 14, 65);
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(Z));
            m84Var.set(1, java.lang.Long.valueOf(Z2));
            java.lang.String str3 = oVar.f287304n;
            if (str3 == null) {
                str3 = "";
            }
            m84Var.set(2, str3);
            java.lang.String str4 = oVar.f287308r;
            if (str4 == null) {
                str4 = "";
            }
            m84Var.set(3, str4);
            m84Var.set(4, "");
            m84Var.set(5, "");
            m84Var.set(6, ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(Z2));
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a() && ((r45.nw1) m84Var.getCustom(6)) != null) {
                db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, "命中liveinfo预加载");
            }
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, -1);
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(0, java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 2 : 1));
            ta4Var.set(12, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(oVar.f287310t, 0)));
            wk0Var.set(7, ta4Var);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ri(context, intent2, m84Var, true, wk0Var, null);
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(1, 2, oVar.f287302i, i17, item.f287275d);
        }
    }
}
