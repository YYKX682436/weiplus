package od;

/* loaded from: classes8.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final od.l f344514a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f344515b;

    public k(od.l lVar) {
        this.f344514a = lVar;
        this.f344515b = new com.tencent.mm.sdk.platformtools.n3("Js2JavaAsyncHandler_" + lVar.hashCode());
    }

    public java.lang.String a(java.lang.String str, boolean z17) {
        if (z17) {
            return b(str, true);
        }
        this.f344515b.post(new od.j(this, str));
        return "";
    }

    public final java.lang.String b(java.lang.String str, boolean z17) {
        od.i iVar;
        od.c cVar = null;
        try {
            iVar = new od.i(new org.json.JSONObject(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Js2JavaMessageQueue", "Message parse failed, ex = %s", e17.getMessage());
            iVar = null;
        }
        if (iVar == null) {
            return "";
        }
        com.tencent.mars.xlog.Log.i("Js2JavaMessageQueue", "processImpl, jsMsg.type = %s", iVar.f344496a.name());
        int ordinal = iVar.f344496a.ordinal();
        if (ordinal == 1) {
            od.f fVar = this.f344514a.f344518c;
            synchronized (fVar) {
                com.tencent.mars.xlog.Log.i("Java2JsMessageQueue", "ready");
                fVar.f344503c = true;
                java.util.LinkedList linkedList = fVar.f344502b;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    fVar.b((od.e) it.next());
                }
                linkedList.clear();
            }
        } else if (ordinal == 2) {
            od.l lVar = this.f344514a;
            lVar.getClass();
            try {
                od.g gVar = new od.g(lVar.f344518c, iVar, z17);
                java.lang.String str2 = gVar.f344505b;
                od.h hVar = (od.h) lVar.f344520e.get(str2);
                if (hVar != null) {
                    sd.h0 h0Var = (sd.h0) hVar;
                    sd.l0 l0Var = h0Var.f406604b;
                    l0Var.getClass();
                    sd.c cVar2 = h0Var.f406603a;
                    sd.i0 i0Var = new sd.i0(l0Var, cVar2, gVar);
                    td.c cVar3 = l0Var.f406619e;
                    if (cVar3 == null) {
                        cVar3 = td.c.f417583a;
                    }
                    cVar3.b(cVar2.b(), i0Var);
                } else {
                    com.tencent.mars.xlog.Log.e("LuggageBridge", "Invoke Listener Not Found: %s", str2);
                    gVar.a("system:function_not_exist", null);
                }
                if (gVar.f344507d) {
                    cVar = new od.c(gVar.f344509f, gVar.f344508e, gVar.f344510g, gVar.f344511h, false);
                }
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("LuggageBridge", "inflate Js2JavaInvokeContext failed: %s", e18);
            }
        } else if (ordinal == 3) {
            od.l lVar2 = this.f344514a;
            lVar2.getClass();
            try {
                org.json.JSONObject jSONObject = iVar.f344497b;
                jSONObject.getString(ya.b.METHOD);
                if (jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) == null) {
                    new org.json.JSONObject();
                }
                int optInt = jSONObject.optInt("callbackId", 0);
                jSONObject.optBoolean("keepCallback", false);
                android.support.v4.media.f.a(lVar2.f344522g.get(java.lang.Integer.valueOf(optInt)));
                com.tencent.mars.xlog.Log.e("LuggageBridge", "no listener for callback: %d", java.lang.Integer.valueOf(optInt));
            } catch (org.json.JSONException e19) {
                com.tencent.mars.xlog.Log.e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", e19);
            }
        } else if (ordinal == 4) {
            od.l lVar3 = this.f344514a;
            lVar3.getClass();
            try {
                org.json.JSONObject jSONObject2 = iVar.f344497b;
                java.lang.String string = jSONObject2.getString("event");
                if (jSONObject2.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) == null) {
                    new org.json.JSONObject();
                }
                com.tencent.mars.xlog.Log.i("LuggageBridge", "processEventFromJs, EventName = %s", string);
                android.support.v4.media.f.a(lVar3.f344521f.get(string));
                com.tencent.mars.xlog.Log.e("LuggageBridge", "no listener for event: %s", string);
            } catch (org.json.JSONException e27) {
                com.tencent.mars.xlog.Log.e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", e27);
            }
        }
        if (cVar != null) {
            cVar.f344496a.name();
        }
        return cVar == null ? "" : cVar.toString();
    }
}
