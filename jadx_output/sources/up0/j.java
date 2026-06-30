package up0;

/* loaded from: classes13.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem, org.json.JSONObject data, com.tencent.mm.view.MMPAGView pagView) {
        kotlin.jvm.internal.o.g(fileSystem, "fileSystem");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(pagView, "pagView");
        pagView.n();
        org.json.JSONObject optJSONObject = data.optJSONObject("pagPara");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("pagFilePath") : null;
        if (optString == null) {
            optString = "";
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(optString);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        int i17 = 0;
        if (!K0) {
            ik1.b0 b0Var = new ik1.b0();
            com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = fileSystem.readFile(optString, b0Var);
            kotlin.jvm.internal.o.f(readFile, "readFile(...)");
            if (readFile != j1Var) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MBBootsPlayPagManager", "fileSystem readPAGFile function fail");
                return false;
            }
            if (pagView.getUseRfx()) {
                com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a));
                if (Load == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MBBootsPlayPagManager", "pagFile null");
                    return false;
                }
                pagView.setComposition(Load);
            } else {
                org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a));
                if (Load2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MBBootsPlayPagManager", "pagFile null");
                    return false;
                }
                pagView.setComposition(Load2);
            }
        }
        java.lang.Integer valueOf = optJSONObject != null ? java.lang.Integer.valueOf(optJSONObject.optInt("count", 1)) : null;
        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("textArray") : null;
        org.json.JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("imageArray") : null;
        org.json.JSONArray optJSONArray3 = optJSONObject != null ? optJSONObject.optJSONArray("fontArray") : null;
        pagView.setRepeatCount(valueOf != null ? valueOf.intValue() : 1);
        pagView.a(new up0.f(pagView));
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                if (pagView.getUseRfx()) {
                    com.tencent.mm.rfx.RfxPagFile rfxComposition = pagView.getRfxComposition();
                    if (rfxComposition != null) {
                        com.tencent.mm.rfx.RfxPagText textData = rfxComposition.getTextData(optJSONObject2.optInt(ya.b.INDEX, 0));
                        textData.text = optJSONObject2.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
                        rfxComposition.replaceText(optJSONObject2.optInt(ya.b.INDEX, 0), textData);
                    }
                } else {
                    int i19 = i17;
                    org.libpag.PAGComposition composition = pagView.getComposition();
                    org.libpag.PAGFile pAGFile = composition instanceof org.libpag.PAGFile ? (org.libpag.PAGFile) composition : null;
                    if (pAGFile != null) {
                        org.libpag.PAGText textData2 = pAGFile.getTextData(optJSONObject2.optInt(ya.b.INDEX, i19));
                        textData2.text = optJSONObject2.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
                        pAGFile.replaceText(optJSONObject2.optInt(ya.b.INDEX, i19), textData2);
                    }
                }
                i18++;
                i17 = 0;
            }
        }
        if (optJSONArray3 != null) {
            boolean useRfx = pagView.getUseRfx();
            if (optJSONArray3.length() > 0) {
                java.lang.String optString2 = optJSONArray3.optString(0);
                kotlin.jvm.internal.o.d(optString2);
                if (optString2.length() > 0) {
                    ik1.b0 b0Var2 = new ik1.b0();
                    com.tencent.mm.plugin.appbrand.appstorage.j1 readFile2 = fileSystem.readFile(optString2, b0Var2);
                    kotlin.jvm.internal.o.f(readFile2, "readFile(...)");
                    if (readFile2 != j1Var) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MBBootsPlayPagManager", "fileSystem readFontFile function fail");
                    } else {
                        byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var2.f291824a);
                        kotlin.jvm.internal.o.f(a17, "arrayOfByteBuffer(...)");
                        if (useRfx) {
                            if (!(a17.length == 0)) {
                                com.tencent.mm.rfx.RfxPagFont.RegisterFontBytes(a17, a17.length, 0);
                            }
                        } else {
                            if (!(a17.length == 0)) {
                                org.libpag.PAGFont.RegisterFontBytes(a17, a17.length, 0);
                            }
                        }
                    }
                }
            }
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new up0.i(pagView, data, optJSONArray2, fileSystem, c0Var, null), 3, null);
        return c0Var.f310112d;
    }
}
