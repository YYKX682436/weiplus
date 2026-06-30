package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class m0 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f185668d;

    public m0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f185668d = openFileChooserUI;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "optMediaTabPicker finish");
        boolean z17 = obj instanceof qc0.m1;
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f185668d;
        if (z17) {
            final qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f361411b != -1 || m1Var.f361412c != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
                openFileChooserUI.setResult(m1Var.f361411b, intent);
                openFileChooserUI.finish();
                return;
            }
            qc0.l1 a17 = m1Var.a();
            if (!a17.a()) {
                if (!(a17.f361395a == qc0.n1.f361419f)) {
                    android.os.Bundle bundle = m1Var.f361414e;
                    java.lang.String string = bundle != null ? bundle.getString("sourceType", "unknow") : "unknow";
                    java.lang.String str = a17.f361396b;
                    openFileChooserUI.f183631n = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str);
                    if (!openFileChooserUI.c7(openFileChooserUI.f183632o)) {
                        java.lang.String str2 = a17.f361397c;
                        if (openFileChooserUI.c7(str2)) {
                            openFileChooserUI.f183632o = str2;
                        }
                    }
                    com.tencent.mm.vfs.r6 r6Var = !android.text.TextUtils.isEmpty(openFileChooserUI.f183631n) ? new com.tencent.mm.vfs.r6(openFileChooserUI.f183631n) : null;
                    if (r6Var != null && r6Var.m()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", openFileChooserUI.f183631n);
                        openFileChooserUI.X6(openFileChooserUI.f183631n, string);
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", openFileChooserUI.f183631n);
                }
            }
            dw4.a.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.m0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI2;
                    boolean z18;
                    boolean z19;
                    com.tencent.mm.plugin.webview.ui.tools.m0 m0Var = com.tencent.mm.plugin.webview.ui.tools.m0.this;
                    m0Var.getClass();
                    android.content.Intent intent2 = new android.content.Intent();
                    qc0.m1 m1Var2 = m1Var;
                    android.os.Bundle bundle2 = m1Var2.f361414e;
                    if (bundle2 != null) {
                        intent2.putExtra("sourceType", bundle2.getString("sourceType", "unknow"));
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = m1Var2.f361413d.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        openFileChooserUI2 = m0Var.f185668d;
                        if (!hasNext) {
                            break;
                        }
                        qc0.l1 l1Var = (qc0.l1) it.next();
                        java.lang.String str3 = l1Var.f361396b;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str3);
                        } else {
                            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
                            java.lang.String str4 = a18.f213279f;
                            if (str4 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                                if (!str4.equals(l17)) {
                                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                                if (l1Var.f361395a == qc0.n1.f361419f) {
                                    if (l1Var.f361403i == 1 && com.tencent.mm.vfs.w6.j(l1Var.f361399e)) {
                                        z18 = false;
                                        z19 = true;
                                    } else {
                                        aq.u0 Ai = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(l1Var.f361401g, l1Var.f361400f, l1Var.f361396b, openFileChooserUI2.getIntent().getIntExtra("key_live_photo_max_duration", 0));
                                        z19 = Ai.f12975a.f12960a;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "livePhoto is no parse >> parse result :%b errCode: %s", java.lang.Boolean.valueOf(z19), Ai.toString());
                                        z18 = true;
                                    }
                                    if (z19) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "getVideoMetaData success");
                                        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(z18 ? l1Var.f361400f : l1Var.f361399e);
                                        java.lang.String str5 = b17.f182736e;
                                        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                                        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(l1Var.f361396b);
                                        java.lang.String str6 = d17.f182736e;
                                        d17.f182748t = l1Var.f361402h;
                                        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s videolocal id is : %s", l1Var.f361399e, str6, str5);
                                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                                        try {
                                            jSONObject.put(dm.i4.COL_LOCALID, str6);
                                            jSONObject.put("videoLocalId", str5);
                                        } catch (org.json.JSONException e17) {
                                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenFileChooserUI", e17, "", new java.lang.Object[0]);
                                        }
                                        arrayList.add(jSONObject.toString());
                                    }
                                }
                                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d18 = com.tencent.mm.plugin.webview.model.m4.d(str3);
                                d18.f182748t = true;
                                d18.f182742n = 1;
                                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d18);
                                arrayList.add(d18.f182736e);
                                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str3, d18.f182736e);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str3);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture localIds is empty");
                        intent2.putExtra("key_pick_local_pic_fail_reason", "picture localIds is empty!");
                        openFileChooserUI2.setResult(1, intent2);
                        openFileChooserUI2.finish();
                        return;
                    }
                    java.lang.String g17 = com.tencent.mm.sdk.platformtools.t8.D0(openFileChooserUI2.f183633p, com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME) ? com.tencent.mm.plugin.webview.model.o5.g(arrayList) : com.tencent.mm.plugin.webview.model.o5.h(arrayList);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
                    intent2.putExtra("key_pick_local_media_local_ids", g17);
                    intent2.putExtra("key_pick_local_media_callback_type", 2);
                    intent2.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI2.f183636s);
                    intent2.putExtra("key_pick_local_pic_source_type", openFileChooserUI2.f183634q ? "camera" : com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
                    openFileChooserUI2.setResult(m1Var2.f361411b, intent2);
                    openFileChooserUI2.finish();
                }
            });
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
        openFileChooserUI.setResult(1, intent2);
        openFileChooserUI.finish();
    }
}
