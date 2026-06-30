package xv4;

/* loaded from: classes8.dex */
public final class g extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 30;
    }

    @Override // pk3.b
    public boolean Mb(com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(info, "info");
        return true;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject f17;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        r45.ax5 ax5Var = new r45.ax5();
        try {
            ax5Var.parseFrom(info.field_data);
            su4.j2 j2Var = new su4.j2();
            j2Var.f412943f = ax5Var.getBoolean(2);
            j2Var.f412939b = ax5Var.getInteger(0);
            j2Var.f412940c = ax5Var.getInteger(1);
            j2Var.f412942e = su4.r2.f(ax5Var.getInteger(0));
            j2Var.f412938a = com.tencent.mm.sdk.platformtools.x2.f193071a;
            j2Var.f412945h = true;
            j2Var.G = info;
            r45.w60 w60Var = new r45.w60();
            w60Var.set(0, animateData);
            j2Var.H = pm0.v.D(w60Var);
            java.lang.String string = ax5Var.getString(4);
            if (string == null || (jSONObject = pv4.a.f(string)) == null) {
                jSONObject = new org.json.JSONObject();
            }
            java.lang.String string2 = ax5Var.getString(5);
            if (string2 != null && (f17 = pv4.a.f(string2)) != null) {
                j2Var.f412954q = f17.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                j2Var.f412947j = f17.optBoolean("hideNavBar");
                boolean optBoolean = f17.optBoolean("hideSearchBar");
                j2Var.f412946i = optBoolean;
                if (optBoolean) {
                    j2Var.f412950m = com.tencent.mm.R.color.f478491c;
                }
                jSONObject.put("hideNavBar", j2Var.f412947j);
                jSONObject.put("hideSearchInput", j2Var.f412946i);
            }
            j2Var.f412944g = d75.b.e(jSONObject, xv4.f.f457434d);
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            getActivity().overridePendingTransition(0, 0);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SearchMultiTaskRegisterUIC", "taskData parse failed");
        }
    }

    @Override // pk3.h
    public void Q6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo obj, int i17) {
        kotlin.jvm.internal.o.g(obj, "obj");
        zg0.p3 p3Var = (zg0.p3) i95.n0.c(zg0.p3.class);
        java.lang.String id6 = obj.field_id;
        ((yg0.q4) p3Var).getClass();
        com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a;
        kotlin.jvm.internal.o.g(id6, "id");
        kVar.c(id6);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }
}
