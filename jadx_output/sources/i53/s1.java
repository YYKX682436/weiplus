package i53;

/* loaded from: classes8.dex */
public class s1 implements vl1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f288710a;

    public s1(i53.a2 a2Var) {
        this.f288710a = a2Var;
    }

    @Override // vl1.p
    public void a(android.view.View view, int i17, long j17) {
        p33.l lVar;
        p33.s sVar;
        i53.a2 a2Var = this.f288710a;
        i53.k0 k0Var = a2Var.f288500h.f288671e2;
        if (i17 >= 0) {
            java.util.LinkedList linkedList = k0Var.f288627i;
            if (i17 < linkedList.size()) {
                lVar = (p33.l) linkedList.get(i17);
                if (!lVar.f351603e || lVar.f351604f) {
                }
                a2Var.f288510u = lVar;
                p33.g0 g0Var = lVar.f351621z;
                if (!((g0Var == null || (sVar = g0Var.f351578e) == null) ? false : !com.tencent.mm.sdk.platformtools.t8.K0(sVar.f351642d)) || lVar.f351602d) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("game_straight_to_publish", a2Var.f288508s);
                    if (lVar.f351602d) {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(a2Var.getContext(), 7, lVar.f351614s, lVar.f351607i, null, null, a2Var.hashCode() & 65535, bundle, a2Var.f288509t);
                        return;
                    } else {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(a2Var.getContext(), 7, lVar.f351614s, null, lVar.f351607i, lVar.f351606h, a2Var.hashCode() & 65535, bundle, a2Var.f288509t);
                        return;
                    }
                }
                java.lang.String str = lVar.f351614s;
                java.lang.String str2 = lVar.f351615t;
                p33.s sVar2 = lVar.f351621z.f351578e;
                android.app.Activity activity = (android.app.Activity) a2Var.getContext();
                if (sVar2 == null || activity == null) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_game_video_appid", str);
                intent.putExtra("key_game_video_appname", str2);
                intent.putExtra("key_game_video_page_type", 1);
                intent.putExtra("key_game_video_encode_json_array", true);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("jumpType", sVar2.f351643e);
                jSONObject.put("jumpUrl", sVar2.f351642d);
                cl0.e eVar = new cl0.e();
                eVar.q(jSONObject);
                java.lang.String eVar2 = eVar.toString();
                kotlin.jvm.internal.o.f(eVar2, "toString(...)");
                intent.putExtra("key_video_info", eVar2);
                activity.setResult(-1, intent);
                activity.finish();
                return;
            }
        } else {
            k0Var.getClass();
        }
        lVar = null;
        if (lVar.f351603e) {
        }
    }
}
