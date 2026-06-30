package f53;

/* loaded from: classes15.dex */
public final class d implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f259638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig f259639b;

    public d(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig) {
        this.f259638a = h0Var;
        this.f259639b = gameAtSomeoneConfig;
    }

    @Override // vl1.n
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        o33.f fVar;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a5w) : null;
        if (imageView == null || (fVar = (o33.f) ((java.util.LinkedList) ((com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) this.f259638a.f310123d).getmAdapter().f259675e).get(i17)) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        cl0.g gVar = new cl0.g();
        gVar.h("userName", fVar.f342737d);
        gVar.h("nickName", fVar.f342738e);
        jSONObject.put("gamecenterIdentifier", this.f259639b.f139514i);
        jSONObject.put("userData", gVar.toString());
        java.util.ArrayList arrayList = (java.util.ArrayList) f53.f.f259645b;
        if (arrayList.contains(fVar.f342737d)) {
            arrayList.remove(fVar.f342737d);
            imageView.setVisibility(8);
            jSONObject.put("action", "del");
        } else {
            java.lang.String username = fVar.f342737d;
            kotlin.jvm.internal.o.f(username, "username");
            arrayList.add(username);
            imageView.setVisibility(0);
            jSONObject.put("action", "add");
        }
        if (!f53.f.f259647d) {
            s43.j jVar = s43.i.f402956a;
            com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig = f53.f.f259648e;
            if (gameAtSomeoneConfig != null) {
                jVar.b(gameAtSomeoneConfig.f139514i, jSONObject);
                return;
            } else {
                kotlin.jvm.internal.o.o("atSomeoneConfig");
                throw null;
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193055c;
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig2 = f53.f.f259648e;
        if (gameAtSomeoneConfig2 == null) {
            kotlin.jvm.internal.o.o("atSomeoneConfig");
            throw null;
        }
        bundle.putString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, gameAtSomeoneConfig2.f139514i);
        bundle.putString("jsonData", jSONObject.toString());
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, f53.b.class, null);
    }
}
