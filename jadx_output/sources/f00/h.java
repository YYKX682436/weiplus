package f00;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf00/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class h implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("EcsProductWxaCoverWidget", "createWidget data:" + iPCString.f68406d);
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            java.lang.String optString = jSONObject.optString("feedId");
            java.lang.String optString2 = jSONObject.optString("nonceId");
            long Z = pm0.v.Z(optString);
            java.lang.String optString3 = jSONObject.optString("lastGMsgId");
            java.lang.String str = "";
            if (optString3 == null) {
                optString3 = "";
            }
            java.lang.String optString4 = jSONObject.optString("ecSource");
            java.lang.String optString5 = jSONObject.optString("finderLiveID");
            java.lang.String optString6 = jSONObject.optString("finderUsername");
            com.tencent.mars.xlog.Log.i("EcsProductWxaCoverWidget", "feedId:" + pm0.v.u(Z) + ", nonceId:" + optString2 + ", lastGMsgId:" + optString3);
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(2, 3, 65);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            kotlin.jvm.internal.o.d(optString4);
            if (optString4.length() > 0) {
                intent.putExtra("key_enter_live_param_ecsource", optString4);
            }
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.d(optString6);
            ((vd2.f1) e0Var).Di(context, intent, optString6, null, wk0Var, new f00.g(intent, optString3));
            r45.br2 br2Var = new r45.br2();
            br2Var.set(0, optString5);
            br2Var.set(2, java.lang.String.valueOf(Z));
            br2Var.set(1, optString6);
            s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
            java.lang.String string = br2Var.getString(0);
            if (string != null) {
                str = string;
            }
            ((com.tencent.mm.feature.finder.live.t6) b1Var).getClass();
            ((com.tencent.mm.feature.finder.live.t6) b1Var).Ui(br2Var, "enter_live", zl2.b0.f473663a.b(br2Var, str, 1));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("EcsProductWxaCoverWidget", "click error:" + th6);
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }
}
