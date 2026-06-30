package com.tencent.mm.plugin.webview.luggage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class LuggageWebViewLongClickHelper$QBarLogicTask implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f182133d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f182134e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182135f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182136g;

    private LuggageWebViewLongClickHelper$QBarLogicTask() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f182135f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.1
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                if (!(recogQBarOfImageFileResultEvent2 instanceof com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent)) {
                    return false;
                }
                com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask luggageWebViewLongClickHelper$QBarLogicTask = com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.this;
                java.util.Map map = luggageWebViewLongClickHelper$QBarLogicTask.f182134e;
                if (map != null) {
                    if (!((java.util.HashMap) map).containsKey(recogQBarOfImageFileResultEvent2.f54661g.f6368a)) {
                        return false;
                    }
                }
                java.util.Map map2 = luggageWebViewLongClickHelper$QBarLogicTask.f182134e;
                if (map2 != null) {
                    ((java.util.HashMap) map2).remove(recogQBarOfImageFileResultEvent2.f54661g.f6368a);
                }
                com.tencent.mm.vfs.w6.h(recogQBarOfImageFileResultEvent2.f54661g.f6368a);
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
                int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
                int d17 = s6Var.d(recogQBarOfImageFileResultEvent2);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("file_path", recogQBarOfImageFileResultEvent2.f54661g.f6368a);
                bundle.putString("result", e17);
                bundle.putInt("code_type", c17);
                bundle.putInt("code_version", d17);
                luggageWebViewLongClickHelper$QBarLogicTask.f182133d.a(bundle);
                return false;
            }
        };
        this.f182136g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.2
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask luggageWebViewLongClickHelper$QBarLogicTask = com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.this;
                java.util.Map map = luggageWebViewLongClickHelper$QBarLogicTask.f182134e;
                if (map != null) {
                    if (!((java.util.HashMap) map).containsKey(recogQBarOfImageFileFailedEvent2.f54660g.f6278a)) {
                        return false;
                    }
                }
                java.util.Map map2 = luggageWebViewLongClickHelper$QBarLogicTask.f182134e;
                if (map2 != null) {
                    ((java.util.HashMap) map2).remove(recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.QBarLogicTask", "delete qb recog fail: %s", recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                com.tencent.mm.vfs.w6.h(recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f182133d = rVar;
        int i17 = bundle.getInt("type");
        java.lang.String string = bundle.getString("img_path");
        int i18 = bundle.getInt("x_down");
        int i19 = bundle.getInt("y_down");
        if (i17 == 1) {
            if (this.f182134e == null) {
                this.f182134e = new java.util.HashMap();
                this.f182135f.alive();
                this.f182136g.alive();
            }
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
            c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(i18));
            c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(i19));
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
            am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
            aqVar.f6175b = string;
            aqVar.f6174a = java.lang.System.currentTimeMillis();
            recogQBarOfImageFileEvent.e();
            ((java.util.HashMap) this.f182134e).put(string, 1);
            return;
        }
        if (i17 == 2) {
            java.util.Map map = this.f182134e;
            if (map == null || !((java.util.HashMap) map).containsKey(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QBarLogicTask", "%s is not recognizing", string);
                return;
            }
            com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
            cancelRecogImageFileEvent.f54026g.getClass();
            cancelRecogImageFileEvent.e();
            ((java.util.HashMap) this.f182134e).remove(string);
            com.tencent.mm.vfs.w6.h(string);
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            java.lang.String string2 = bundle.getString("wxa_result");
            int i27 = bundle.getInt("wxa_code_type", 0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QBarLogicTask", "resultStr is null");
                return;
            } else {
                ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
                new com.tencent.mm.plugin.scanner.y().a(i27, new kd0.f2(string2)).a(new com.tencent.mm.plugin.webview.luggage.s3(this));
                return;
            }
        }
        java.lang.String string3 = bundle.getString("result");
        java.lang.String string4 = bundle.getString("url");
        java.lang.String string5 = bundle.getString("imageUrl");
        int i28 = bundle.getInt("codeType");
        int i29 = bundle.getInt("codeVersion");
        java.lang.String string6 = bundle.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity.class);
        intent.setFlags(872415232);
        intent.putExtra("key_string_for_scan", string3);
        intent.putExtra("key_string_for_url", string4);
        intent.putExtra("key_string_for_image_url", string5);
        intent.putExtra("key_codetype_for_scan", i28);
        intent.putExtra("key_codeversion_for_scan", i29);
        intent.putExtra("key_file_path_for_scan", string6);
        intent.putExtra("key_delete_file_after_deal", true);
        java.lang.String string7 = bundle.getString("preUsername");
        java.lang.String string8 = bundle.getString("preChatName");
        java.lang.String string9 = bundle.getString("rawUrl");
        java.lang.String a17 = c01.n2.a("WebviewQrCode");
        c01.l2 c18 = c01.n2.d().c(a17, true);
        c18.i("preUsername", string7);
        c18.i("preChatName", string8);
        c18.i("url", string4);
        c18.i("Contact_Sub_Scene", java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(string4) ? 1 : 6));
        c18.i("Contact_Scene_Note", string4);
        c18.i("rawUrl", string9);
        intent.putExtra("img_gallery_session_id", a17);
        java.lang.String string10 = bundle.getString("pre_username");
        if (string10 != null && c01.e2.G(string10)) {
            intent.putExtra("key_string_for_from_username", string10);
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$QBarLogicTask", "reqDealQBarResult", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$QBarLogicTask", "reqDealQBarResult", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
