package s43;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f402957a = new java.util.HashMap();

    public j(s43.g gVar) {
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.l0 runtime;
        s43.h hVar = (s43.h) this.f402957a.get(str);
        if (hVar != null) {
            com.tencent.mm.plugin.game.luggage.jsapi.c5 c5Var = (com.tencent.mm.plugin.game.luggage.jsapi.c5) hVar;
            s43.i.f402956a.f402957a.remove(c5Var.f139610c);
            if (jSONObject != null) {
                c5Var.f139608a.getClass();
                com.tencent.mars.xlog.Log.i("showAtSomeoneView", "onFinish result = " + jSONObject);
                sd.a aVar = (sd.a) c5Var.f139609b.f406596a;
                if (aVar == null || (runtime = aVar.getRuntime()) == null) {
                    return;
                }
                runtime.b("GameAtSomeoneStateFinish", jSONObject);
            }
        }
    }

    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.l0 runtime;
        s43.h hVar = (s43.h) this.f402957a.get(str);
        if (hVar != null) {
            com.tencent.mm.plugin.game.luggage.jsapi.c5 c5Var = (com.tencent.mm.plugin.game.luggage.jsapi.c5) hVar;
            if (jSONObject == null) {
                return;
            }
            c5Var.f139608a.getClass();
            com.tencent.mars.xlog.Log.i("showAtSomeoneView", "GameAtSomeoneStateChange onChanged state = " + jSONObject);
            sd.a aVar = (sd.a) c5Var.f139609b.f406596a;
            if (aVar == null || (runtime = aVar.getRuntime()) == null) {
                return;
            }
            runtime.b("GameAtSomeoneStateChange", jSONObject);
        }
    }
}
