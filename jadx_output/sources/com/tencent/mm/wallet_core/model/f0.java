package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class f0 {
    public static r45.n34 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JumpItemUtil", "createFromJSONObject() jsonObject == null");
            return null;
        }
        r45.n34 n34Var = new r45.n34();
        n34Var.f381048d = jSONObject.optString("wording");
        n34Var.f381049e = jSONObject.optInt("action");
        n34Var.f381050f = jSONObject.optString("url");
        n34Var.f381051g = jSONObject.optString(dm.i4.COL_USERNAME);
        n34Var.f381052h = jSONObject.optString("pagepath");
        return n34Var;
    }

    public static org.json.JSONObject b(r45.n34 n34Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("wording", n34Var.f381048d);
            jSONObject.put("action", n34Var.f381049e);
            jSONObject.put("url", n34Var.f381050f);
            jSONObject.put(dm.i4.COL_USERNAME, n34Var.f381051g);
            jSONObject.put("pagepath", n34Var.f381052h);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JumpItemUtil", "getJSONObject() Exception: %s", e17.getMessage());
        }
        return jSONObject;
    }

    public static void c(android.content.Context context, r45.n34 n34Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = n34Var == null ? e(n34Var) : "null";
        objArr[1] = e0Var != null ? "no null" : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "handleAction() jumpItem:%s iJumpItemCallback:%s", objArr);
        if (n34Var == null) {
            return;
        }
        int i17 = n34Var.f381049e;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", n34Var.f381050f);
                        com.tencent.mm.wallet_core.ui.r1.T(context, intent);
                    } else if (i17 == 4) {
                        try {
                            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                            nxVar.f7466a = n34Var.f381051g;
                            nxVar.f7467b = n34Var.f381052h;
                            if (e0Var != null) {
                                nxVar.f7469d = e0Var.b();
                            } else {
                                nxVar.f7469d = 1000;
                            }
                            nxVar.f7468c = 0;
                            nxVar.f7471f = context;
                            startAppBrandUIFromOuterEvent.e();
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JumpItemUtil", "handleAction() Exception: %s", e17.getMessage());
                        }
                    } else if (i17 == 5 && e0Var != null) {
                        e0Var.e(obj);
                    }
                } else if (e0Var != null) {
                    e0Var.c(obj);
                }
            } else if (e0Var != null) {
                e0Var.f(obj);
            }
        } else if (e0Var != null) {
            e0Var.d(obj);
        }
        if (e0Var != null) {
            e0Var.a(obj);
        }
    }

    public static void d(android.content.Context context, r45.po5 po5Var, java.lang.Object obj, com.tencent.mm.wallet_core.model.e0 e0Var) {
        if (po5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JumpItemUtil", "showRemindWin() remindWin == null");
        } else {
            db5.e1.C(context, po5Var.f383254d, "", po5Var.f383255e.f381048d, context.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.wallet_core.model.v(context, po5Var, obj, e0Var), new com.tencent.mm.wallet_core.model.w()).show();
        }
    }

    public static java.lang.String e(r45.n34 n34Var) {
        if (n34Var == null) {
            return "JumpItem{null}";
        }
        return "JumpItem{wording='" + n34Var.f381048d + "', action=" + n34Var.f381049e + ", url='" + n34Var.f381050f + "', username='" + n34Var.f381051g + "', pagepath='" + n34Var.f381052h + "'}";
    }
}
