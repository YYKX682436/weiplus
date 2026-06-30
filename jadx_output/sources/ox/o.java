package ox;

@j95.b
/* loaded from: classes7.dex */
public final class o extends i95.w implements tk.q {
    public void Ai(android.content.Context context, org.json.JSONObject jsonObject, tk.p publishCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        kotlin.jvm.internal.o.g(publishCallback, "publishCallback");
        Bi(context, jsonObject, null, publishCallback);
    }

    public final void Bi(android.content.Context context, org.json.JSONObject jSONObject, java.util.List list, tk.p pVar) {
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggd), false, 3, null);
        pm0.v.X(new ox.j(f17));
        com.tencent.mars.xlog.Log.i("MircoMsg.BizPublishImageExternalService", "parseData, publishScene: " + jSONObject.optString("publishScene"));
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Zi(context, new ox.n(pVar, jSONObject, this, list, context, f17));
    }

    public void Di(android.content.Context context, org.json.JSONObject jsonObject, java.util.List list, tk.p publishCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        kotlin.jvm.internal.o.g(publishCallback, "publishCallback");
        Bi(context, jsonObject, list, publishCallback);
    }

    public final int wi(org.json.JSONObject jSONObject) {
        tk.s[] sVarArr = tk.s.f419870d;
        int optInt = jSONObject.optInt("bizType", 0);
        if (jSONObject.optJSONObject("weAppParam").optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) != 1384) {
            return optInt;
        }
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Di()) {
            tk.s[] sVarArr2 = tk.s.f419870d;
            return 2;
        }
        tk.s[] sVarArr3 = tk.s.f419870d;
        return 1;
    }
}
