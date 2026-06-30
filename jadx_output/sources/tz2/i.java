package tz2;

/* loaded from: classes14.dex */
public class i extends tz2.e {
    public e72.e F = new e72.e();
    public java.lang.String G = "";

    @Override // tz2.e, tz2.u
    public void b(android.widget.TextView textView) {
        wz2.a.j(textView, i65.a.r(textView.getContext(), com.tencent.mm.R.string.c7h));
    }

    @Override // tz2.e
    public int e() {
        return 1;
    }

    @Override // tz2.e
    public int g() {
        return 0;
    }

    @Override // tz2.e
    public int h() {
        return 0;
    }

    @Override // tz2.e
    public java.lang.String m(java.lang.String str, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            r45.mi miVar = new r45.mi();
            byte[] d17 = tz2.s.d(jSONObject, java.lang.String.valueOf(this.f423265g));
            miVar.f380533e = com.tencent.mm.protobuf.g.b(d17);
            miVar.f380532d = com.tencent.mm.protobuf.g.b(tz2.s.b(java.lang.String.valueOf(this.f423265g), d17, false));
            java.lang.String concat = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/release_out.fd");
            com.tencent.mm.plugin.facedetect.model.s0.l(miVar.toByteArray(), concat);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", "save verify result to bioId:%s file:%s  fileSize:%s", java.lang.String.valueOf(this.f423265g), concat, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(concat)));
            return concat;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "number get yt result data error", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tz2.e, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof c72.a0) && !(m1Var instanceof c72.b0)) {
            super.onSceneEnd(i17, i18, str, m1Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", "[cgi-ret]NetSceneGetBioConfig errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f423279x = java.lang.System.currentTimeMillis();
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
        vz2.c.b().f56194s = java.lang.System.currentTimeMillis();
        vz2.c.b().f56182g = i18;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i17 == 0 && i18 == 0) {
            c72.b bVar = (c72.b) m1Var;
            this.f423265g = bVar.g();
            java.lang.String decrypt = com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface.decrypt(this.f423265g + "", bVar.c(), bVar.c().length);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", "mBioId:%s decryptConfig:%s", java.lang.Long.valueOf(this.f423265g), decrypt);
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
                jSONObject.put("errormsg", "OK");
                jSONObject.put("type", 1);
                org.json.JSONArray optJSONArray = new org.json.JSONObject(decrypt).optJSONArray("face_action_seq");
                if (optJSONArray != null) {
                    for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                        if (optJSONObject != null && optJSONObject.optInt("action_id", 0) == 4) {
                            java.lang.String optString = optJSONObject.optString("action_data");
                            this.G = optString;
                            java.lang.String replaceAll = optString.replaceAll("(.)", "$1,");
                            jSONObject.put("action_data", replaceAll.substring(0, replaceAll.length() - 1));
                        }
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "reflect get config error", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "get mBioId failed");
            vz2.c.b().B = 3;
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90036);
                jSONObject.put("errormsg", "WeChat face get config error!");
                jSONObject.put("err_feedback", this.f423270o);
                jSONObject.put("err_msg", i65.a.r(this.f423271p, com.tencent.mm.R.string.net_fetch_failed));
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "reflect get config error2", new java.lang.Object[0]);
            }
        }
        hashMap.put("response", jSONObject.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", "set ytsdk number config:%s", hashMap);
        this.f423262d.onNetworkResponseEvent(hashMap, null);
    }

    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        this.F.b();
        e72.e eVar = this.F;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f249891a = null;
        e72.e eVar2 = this.F;
        tl.c f17 = h72.s.e().f();
        synchronized (eVar2.f249896f) {
            eVar2.f249896f.remove(f17);
        }
    }

    @Override // tz2.e, tz2.u
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", "release");
        super.release();
        e72.e eVar = this.F;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f249891a = null;
        com.tencent.mm.vfs.w6.h(this.F.f249893c);
    }

    @Override // tz2.e, tz2.u
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", "reset");
        super.reset();
        p();
        e72.e eVar = this.F;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f249891a = null;
        com.tencent.mm.vfs.w6.h(this.F.f249893c);
        this.F = new e72.e();
    }
}
