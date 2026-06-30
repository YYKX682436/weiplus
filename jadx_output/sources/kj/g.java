package kj;

/* loaded from: classes12.dex */
public class g implements jj.e {
    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        oj.j.c("AllSceneFrameListener", "[report] FPS:%s %s", java.lang.Float.valueOf(f19), toString());
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (kj.h hVar : kj.h.values()) {
                jSONObject.put(hVar.name(), iArr[hVar.ordinal()]);
                jSONObject2.put(hVar.name(), iArr2[hVar.ordinal()]);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            oj.d.d(jSONObject3, bVar.f363453e);
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
            jSONObject3.put("dropLevel", jSONObject);
            jSONObject3.put("dropSum", jSONObject2);
            jSONObject3.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, f19);
            for (kj.i iVar : kj.i.values()) {
                jSONObject3.put(iVar.name(), jArr[iVar.ordinal()]);
                if (iVar.equals(kj.i.TOTAL_DURATION)) {
                    break;
                }
            }
            if (kj.m.f308241w >= 31) {
                jSONObject3.put("GPU_DURATION", jArr[9]);
            }
            jSONObject3.put("DROP_COUNT", java.lang.Math.round(f17));
            jSONObject3.put("REFRESH_RATE", (int) f18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_FPS";
            d0Var.f395862d = jSONObject3;
            bVar.d(d0Var);
        } catch (org.json.JSONException e17) {
            oj.j.b("AllSceneFrameListener", "json error", e17);
        }
    }

    @Override // jj.e
    public boolean b() {
        return false;
    }

    @Override // jj.e
    public int c() {
        return 10000;
    }

    @Override // jj.e
    public int d() {
        return 0;
    }

    @Override // jj.e
    public java.lang.String getName() {
        return null;
    }
}
