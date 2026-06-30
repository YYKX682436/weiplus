package pk2;

/* loaded from: classes3.dex */
public final class o3 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f356055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f356056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f356058d;

    public o3(r45.t62 t62Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2) {
        this.f356055a = t62Var;
        this.f356056b = q3Var;
        this.f356057c = view;
        this.f356058d = t62Var2;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mars.xlog.Log.i("AnchorRecommendOption", "onDispatch: actionName=" + str + ", data=" + obj);
        if (kotlin.jvm.internal.o.b(str, "submitPickCity") && (obj instanceof org.json.JSONObject)) {
            r45.t62 t62Var = this.f356055a;
            pk2.q3 q3Var = this.f356056b;
            android.view.View view = this.f356057c;
            r45.t62 t62Var2 = this.f356058d;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                org.json.JSONArray optJSONArray = ((org.json.JSONObject) obj).optJSONArray("areas");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (optJSONArray != null) {
                    if (!(optJSONArray.length() > 0)) {
                        optJSONArray = null;
                    }
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                            if (optJSONObject != null) {
                                java.lang.String string = optJSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                                if (string == null) {
                                    string = "";
                                }
                                int optInt = optJSONObject.optInt("adcode", 0);
                                arrayList.add(string);
                                arrayList2.add(java.lang.Integer.valueOf(optInt));
                            }
                        }
                    }
                }
                pm0.v.X(new pk2.n3(t62Var, arrayList, arrayList2, ((org.json.JSONObject) obj).optInt("cityCount", 0), q3Var, view, t62Var2));
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("AnchorRecommendOption", m524exceptionOrNullimpl, "onDispatch: parse json error", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
