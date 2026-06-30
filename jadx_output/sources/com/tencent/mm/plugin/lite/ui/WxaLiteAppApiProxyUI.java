package com.tencent.mm.plugin.lite.ui;

@db5.a(7)
@com.tencent.mm.ui.a2
/* loaded from: classes.dex */
public class WxaLiteAppApiProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f144319d = 0;

    public final void T6(final int i17, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("preview_page_save_md5");
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "doEmojiPreviewPageSaveError, md5 == null");
            return;
        }
        if (((com.tencent.mm.feature.emoji.c4) ((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class))).wi(this, stringExtra, intent.getStringExtra("preview_page_save_emojiInfoBuf"), intent.getIntExtra("preview_page_save_emotionScene", 47), 1, intent.getBooleanExtra("preview_page_save_disableAutoShowSucToast", false))) {
            mmSetOnActivityResultCallback(new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$g
                @Override // com.tencent.mm.ui.xc
                public final void mmOnActivityResult(int i18, int i19, android.content.Intent intent2) {
                    int i27 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
                    com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.this;
                    wxaLiteAppApiProxyUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startActivityForResult: %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    java.util.HashMap hashMap = m93.j.R;
                    int i28 = i17;
                    com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i28));
                    if (pVar != null) {
                        pVar.l(i18, i19, intent2);
                        hashMap.remove(java.lang.Integer.valueOf(i28));
                    }
                    wxaLiteAppApiProxyUI.finish();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U6(final int i17, java.util.HashMap hashMap) {
        gd5.a aVar;
        com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$a
            @Override // com.tencent.mm.ui.xc
            public final void mmOnActivityResult(int i18, int i19, android.content.Intent intent) {
                int i27 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
                com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.this;
                wxaLiteAppApiProxyUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "startAppActivityForResult %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                m93.j.d(i17, i18, i19, intent);
                wxaLiteAppApiProxyUI.finish();
            }
        };
        boolean containsKey = hashMap.containsKey("is_game_card");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "start SelectConversationUI");
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f334118b = 1;
        rVar.f334119c = daVar;
        if (getIntent().getIntExtra("Select_Conv_Type", 0) == 259) {
            rVar.f334126j = false;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(getContext(), rVar);
            return;
        }
        rVar.f334117a = true;
        n13.v vVar = n13.v.f334140a;
        if (containsKey) {
            java.lang.String str = hashMap.get("nickname") == null ? "" : (java.lang.String) hashMap.get("nickname");
            java.lang.String str2 = hashMap.get("card_desc") == null ? "" : (java.lang.String) hashMap.get("card_desc");
            java.lang.String str3 = hashMap.get("url") == null ? "" : (java.lang.String) hashMap.get("url");
            java.lang.String str4 = hashMap.get("card_image_url") == null ? "" : (java.lang.String) hashMap.get("card_image_url");
            java.lang.String str5 = hashMap.get("card_tail") == null ? "" : (java.lang.String) hashMap.get("card_tail");
            qc5.a aVar2 = new qc5.a();
            aVar2.k(vVar.c(str4, str2, str, str5, str3, hashMap));
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(getContext(), aVar2, rVar);
            return;
        }
        java.lang.String str6 = hashMap.get("isWeb") == null ? "" : (java.lang.String) hashMap.get("isWeb");
        boolean equals = "true".equals(hashMap.getOrDefault("isText", ""));
        if (str6.equals("true")) {
            se5.a aVar3 = new se5.a();
            hashMap.put("appId", hashMap.get("srcId") != null ? (java.lang.String) hashMap.get("srcId") : "");
            aVar3.l(vVar.e(hashMap));
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(getContext(), aVar3, rVar);
            return;
        }
        if (equals) {
            ne5.a aVar4 = new ne5.a();
            aVar4.n((java.lang.String) hashMap.getOrDefault(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, ""));
            aVar = aVar4;
        } else {
            gd5.a aVar5 = new gd5.a();
            aVar5.k(vVar.d(hashMap));
            aVar = aVar5;
        }
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(getContext(), aVar, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V6(final int i17, java.lang.String str, java.util.HashMap hashMap) {
        gd5.a aVar;
        com.tencent.mm.ui.widget.dialog.j jVar = new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$e
            @Override // com.tencent.mm.ui.widget.dialog.j
            public final void a(boolean z17, java.lang.String str2, int i18) {
                int i19 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
                com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.this;
                wxaLiteAppApiProxyUI.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_User", wxaLiteAppApiProxyUI.getIntent().getStringExtra("Select_Conv_User"));
                intent.putExtra("custom_send_text", str2);
                m93.j.d(i17, 1, z17 ? -1 : 0, intent);
                wxaLiteAppApiProxyUI.finish();
            }
        };
        android.content.DialogInterface.OnDismissListener onDismissListener = new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI$$f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                int i18 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
                com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.this;
                wxaLiteAppApiProxyUI.getClass();
                m93.j.d(i17, 1, 0, new android.content.Intent());
                wxaLiteAppApiProxyUI.finish();
            }
        };
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        if ("true".equals(hashMap.getOrDefault("isText", ""))) {
            ne5.a aVar2 = new ne5.a();
            aVar2.n((java.lang.String) hashMap.getOrDefault(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, ""));
            aVar = aVar2;
        } else {
            gd5.a aVar3 = new gd5.a();
            aVar3.k(n13.v.f334140a.d(hashMap));
            aVar = aVar3;
        }
        n13.t tVar = new n13.t();
        tVar.f334133a = jVar;
        tVar.f334136d = onDismissListener;
        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(getContext(), aVar, str, tVar);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 3224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
    }
}
