package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes15.dex */
public class q5 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143725g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f143726h = false;

    /* renamed from: i, reason: collision with root package name */
    public bw5.fi0 f143727i = bw5.fi0.DOCUMENT;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.q0 f143728m = new com.tencent.mm.modelcdntran.q0() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.q5$$a
        @Override // com.tencent.mm.modelcdntran.q0
        public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
            com.tencent.mm.plugin.lite.jsapi.comms.q5 q5Var = com.tencent.mm.plugin.lite.jsapi.comms.q5.this;
            q5Var.getClass();
            int ordinal = n1Var.f71103a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    dn.h hVar = n1Var.f71108f;
                    try {
                        byte[] bArr = hVar.f241781p.bizRspPayLoad;
                        bw5.fi0 fi0Var = bw5.fi0.IMAGE;
                        if ((bArr == null || bArr.length == 0) && q5Var.f143727i != fi0Var) {
                            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "response empty");
                            q5Var.f143442e.b("response empty");
                            return;
                        }
                        bw5.fi0 fi0Var2 = q5Var.f143727i;
                        if (fi0Var2 == bw5.fi0.DOCUMENT) {
                            bw5.bi0 bi0Var = new bw5.bi0();
                            bi0Var.parseFrom(hVar.f241781p.bizRspPayLoad);
                            q5Var.E(bi0Var);
                            return;
                        } else if (fi0Var2 == bw5.fi0.ARCHIVE) {
                            bw5.ai0 ai0Var = new bw5.ai0();
                            ai0Var.parseFrom(hVar.f241781p.bizRspPayLoad);
                            q5Var.D(ai0Var);
                            return;
                        } else {
                            if (fi0Var2 == fi0Var) {
                                q5Var.F();
                                return;
                            }
                            return;
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "response io exception. %s", e17.toString());
                        q5Var.f143442e.b(java.lang.String.format("response io exception. %s", e17.toString()));
                        return;
                    }
                }
                if (ordinal != 6 && ordinal != 7 && ordinal != 10) {
                    return;
                }
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f71105c);
            com.tencent.mm.modelcdntran.m1 m1Var = n1Var.f71103a;
            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "cnd listener action: %s, code: %s", m1Var, valueOf);
            q5Var.f143442e.b(java.lang.String.format("download error. %s code: %d", m1Var, java.lang.Integer.valueOf(n1Var.f71105c)));
        }
    };

    public static org.json.JSONArray A(java.util.LinkedList linkedList) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.ci0 ci0Var = (bw5.ci0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("subType", ci0Var.f26098g[1] ? ci0Var.f26095d : "");
            jSONObject.put("imgWidth", ci0Var.f26096e);
            jSONObject.put("imgHeight", ci0Var.f26097f);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static org.json.JSONArray B(bw5.bi0 bi0Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = bi0Var.f25686n.iterator();
        while (it.hasNext()) {
            bw5.di0 di0Var = (bw5.di0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("subType", di0Var.f26503g[2] ? di0Var.f26501e : "");
            jSONObject.put(ya.b.INDEX, di0Var.f26500d);
            jSONObject.put("images", A(di0Var.f26502f));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static org.json.JSONArray C(bw5.bi0 bi0Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = bi0Var.f25687o.iterator();
        while (it.hasNext()) {
            bw5.ij0 ij0Var = (bw5.ij0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.INDEX, ij0Var.f28614d);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, ij0Var.f28617g[2] ? ij0Var.f28615e : "");
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it6 = ij0Var.f28616f.iterator();
            while (it6.hasNext()) {
                bw5.so0 so0Var = (bw5.so0) it6.next();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("subType", so0Var.f33086h[3] ? so0Var.f33084f : "");
                jSONObject2.put("xIndex", so0Var.f33082d);
                jSONObject2.put("yIndex", so0Var.f33083e);
                jSONObject2.put("images", A(so0Var.f33085g));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("tiles", jSONArray2);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final void D(bw5.ai0 ai0Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i17 = ai0Var.f25209h;
            boolean[] zArr = ai0Var.f25214p;
            jSONObject.put("progress", i17);
            jSONObject.put("status", (zArr[2] ? ai0Var.f25206e : bw5.io0.PREVIEW_RUNNING).f28657d);
            jSONObject.put("limitReason", (zArr[4] ? ai0Var.f25208g : bw5.f30.PREVIEW_NONE).f27141d);
            jSONObject.put("version", zArr[9] ? ai0Var.f25213o : "");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList = ai0Var.f25210i;
                if (i18 >= linkedList.size()) {
                    break;
                }
                jSONArray.put(G((bw5.mr0) linkedList.get(i18)));
                i18++;
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("files", jSONArray);
            }
            this.f143442e.f(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "preview archive response json exception: %s", e17.toString());
            this.f143442e.b("preview archive response json exception");
        }
    }

    public final void E(bw5.bi0 bi0Var) {
        boolean[] zArr = bi0Var.f25691s;
        boolean z17 = zArr[2];
        bw5.io0 io0Var = bw5.io0.PREVIEW_RUNNING;
        bw5.io0 io0Var2 = z17 ? bi0Var.f25680e : io0Var;
        boolean[] zArr2 = bi0Var.f25691s;
        if (io0Var2 == bw5.io0.PREVIEW_ERROR) {
            this.f143442e.b("download error");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.f143726h) {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                jd.c cVar = this.f143442e;
                java.lang.String str = cVar.f299025b;
                long j17 = cVar.f299024a;
                java.lang.String str2 = this.f143725g;
                ((com.tencent.mm.feature.lite.i) g0Var).getClass();
                jSONObject.put(dm.i4.COL_LOCALID, com.tencent.mm.plugin.lite.LiteAppCenter.generateLiteAppLocalId(j17, str, str2));
                jSONObject.put("cache", false);
                this.f143442e.f(jSONObject, false);
                return;
            }
            jSONObject.put("imgWidth", bi0Var.f25684i);
            jSONObject.put("imgHeight", bi0Var.f25685m);
            boolean z18 = zArr2[5];
            bw5.vi0 vi0Var = bw5.vi0.PAGES;
            jSONObject.put("type", (z18 ? bi0Var.f25683h : vi0Var).f34376d);
            if (zArr2[2]) {
                io0Var = bi0Var.f25680e;
            }
            jSONObject.put("status", io0Var.f28657d);
            jSONObject.put("limitReason", (zArr[4] ? bi0Var.f25682g : bw5.f30.PREVIEW_NONE).f27141d);
            jSONObject.put("version", zArr[12] ? bi0Var.f25690r : "");
            boolean z19 = zArr2[5];
            if ((z19 ? bi0Var.f25683h : vi0Var) == vi0Var) {
                jSONObject.put("pages", B(bi0Var));
            } else {
                if (z19) {
                    vi0Var = bi0Var.f25683h;
                }
                if (vi0Var != bw5.vi0.SHEETS) {
                    return;
                } else {
                    jSONObject.put("sheets", C(bi0Var));
                }
            }
            this.f143442e.f(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "preview response json exception: %s", e17.toString());
            this.f143442e.b("preview response json exception");
        }
    }

    public final void F() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.f143726h) {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                jd.c cVar = this.f143442e;
                java.lang.String str = cVar.f299025b;
                long j17 = cVar.f299024a;
                java.lang.String str2 = this.f143725g;
                ((com.tencent.mm.feature.lite.i) g0Var).getClass();
                jSONObject.put(dm.i4.COL_LOCALID, com.tencent.mm.plugin.lite.LiteAppCenter.generateLiteAppLocalId(j17, str, str2));
                jSONObject.put("cache", false);
                this.f143442e.f(jSONObject, false);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "preview image response json exception: %s", e17.toString());
            this.f143442e.b("preview image response json exception");
        }
    }

    public org.json.JSONObject G(bw5.mr0 mr0Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, mr0Var.f30374o[1] ? mr0Var.f30366d : "");
        boolean[] zArr = mr0Var.f30374o;
        jSONObject.put("type", (zArr[2] ? mr0Var.f30367e : bw5.nr0.FILE).f30803d);
        jSONObject.put("size", mr0Var.f30368f);
        jSONObject.put("mtime", mr0Var.f30369g);
        boolean z17 = zArr[5];
        bw5.f30 f30Var = bw5.f30.PREVIEW_NONE;
        jSONObject.put("limitReason", (z17 ? mr0Var.f30370h : f30Var).f27141d);
        if (zArr[5]) {
            f30Var = mr0Var.f30370h;
        }
        jSONObject.put("limitReason", f30Var.f27141d);
        jSONObject.put("fileId", zArr[7] ? mr0Var.f30372m : "");
        byte[] g17 = (zArr[8] ? mr0Var.f30373n : com.tencent.mm.protobuf.g.f192155b).g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (byte b17 : g17) {
            sb6.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b17)));
        }
        jSONObject.put("md5", sb6.toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        while (true) {
            java.util.LinkedList linkedList = mr0Var.f30371i;
            if (i17 >= linkedList.size()) {
                break;
            }
            jSONArray.put(G((bw5.mr0) linkedList.get(i17)));
            i17++;
        }
        if (jSONArray.length() > 0) {
            jSONObject.put("files", jSONArray);
        }
        return jSONObject;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        java.lang.String optString = jSONObject.optString("fileId");
        java.lang.String optString2 = jSONObject.optString("aesKey");
        java.lang.String optString3 = jSONObject.optString("fileExt");
        long optLong = jSONObject.optLong("fileSize", 0L);
        java.lang.String optString4 = jSONObject.optString("subType");
        java.lang.String optString5 = jSONObject.optString("version");
        java.lang.String optString6 = jSONObject.optString("password");
        int optInt = jSONObject.optInt("previewType", 0);
        this.f143727i = optInt != 0 ? optInt != 1 ? optInt != 2 ? optInt != 3 ? null : bw5.fi0.ARCHIVE : bw5.fi0.VIDEO : bw5.fi0.IMAGE : bw5.fi0.DOCUMENT;
        if (optString.isEmpty() || optString2.isEmpty() || optString3.isEmpty()) {
            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "requestPreviewFileInfo failed. invalid params. %s", jSONObject.toString());
            this.f143442e.b("invalid params");
            return;
        }
        com.tencent.mars.xlog.Log.i("RequestPreviewFileInfo", "invoke %s fileId: %s, aesKey: %s, subType: %s", this.f299023d, optString, optString2, optString4);
        this.f143725g = com.tencent.mm.plugin.lite.logic.y2.g() + uk.k.d(java.lang.String.format("%s_%s_%s", optString, optString4, optString5).getBytes());
        if (optString4.isEmpty()) {
            z18 = false;
        } else {
            this.f143726h = true;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f143725g);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    jd.c cVar = this.f143442e;
                    java.lang.String str3 = cVar.f299025b;
                    long j17 = cVar.f299024a;
                    java.lang.String str4 = this.f143725g;
                    ((com.tencent.mm.feature.lite.i) g0Var).getClass();
                    jSONObject2.put(dm.i4.COL_LOCALID, com.tencent.mm.plugin.lite.LiteAppCenter.generateLiteAppLocalId(j17, str3, str4));
                    jSONObject2.put("cache", true);
                    this.f143442e.f(jSONObject2, false);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "preview response json exception: %s", e17.toString());
                    this.f143442e.b("preview response json exception");
                }
                com.tencent.mars.xlog.Log.i("RequestPreviewFileInfo", "file already exists.");
                return;
            }
            z18 = false;
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_DownloadPreviewImage";
        mVar.field_appType = 8;
        if (optLong / 1048576 > 25) {
            z18 = true;
        }
        mVar.field_fileType = z18 ? 7 : 5;
        mVar.f241789h = 8;
        mVar.field_fileId = optString;
        mVar.field_mediaId = java.lang.String.format("preview_%d_%d", java.lang.Long.valueOf(this.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        mVar.field_aesKey = optString2;
        mVar.field_fullpath = this.f143725g;
        mVar.f241809y0 = 20;
        bw5.ei0 ei0Var = new bw5.ei0();
        ei0Var.f26925d = optString3;
        boolean[] zArr = ei0Var.f26930i;
        zArr[1] = true;
        ei0Var.f26926e = optString4;
        zArr[2] = true;
        ei0Var.f26927f = optString5;
        zArr[3] = true;
        ei0Var.f26928g = optString6;
        zArr[4] = true;
        ei0Var.f26929h = this.f143727i;
        zArr[5] = true;
        try {
            mVar.P = ei0Var.toByteArray();
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("RequestPreviewFileInfo", "buildRequestTask failed. %s", e18.getMessage());
        }
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f143728m));
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
