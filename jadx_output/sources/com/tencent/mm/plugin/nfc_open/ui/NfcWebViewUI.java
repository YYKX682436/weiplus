package com.tencent.mm.plugin.nfc_open.ui;

/* loaded from: classes8.dex */
public class NfcWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public static final java.lang.String D3 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/security/readtemplate?t=bus_recharge/index_error";
    public java.lang.String A3 = null;
    public boolean B3 = false;
    public final com.tencent.mm.plugin.nfc_open.model.ApduEngineFuncListener C3 = new com.tencent.mm.plugin.nfc_open.model.ApduEngineFuncListener();

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        super.B8();
        if (m9()) {
            finish();
            com.tencent.mars.xlog.Log.w("MicroMsg.NfcWebViewUI", "not login, go to SimpleLogin");
        } else {
            u9(com.tencent.mm.pluginsdk.ui.p.LOGIN_OK, getIntent());
            n9(false);
        }
    }

    public final boolean m9() {
        try {
            if (!this.K1.T7()) {
                return false;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.NfcWebViewUI", "not login");
            android.content.Intent intent = new android.content.Intent(this, getClass());
            intent.putExtras(getIntent());
            intent.addFlags(67108864);
            this.K1.af(intent);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NfcWebViewUI", e17, "", new java.lang.Object[0]);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[Catch: RemoteException -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00f4, blocks: (B:27:0x00ae, B:31:0x00e7), top: B:26:0x00ae }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n9(boolean r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI.n9(boolean):void");
    }

    public final void o9() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        j45.l.u(this, "com.tencent.mm.ui.LauncherUI", intent, null);
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477848d6);
        com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "lo-nfc-setBackBtn:back click after login");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.B3) {
            o9();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent = getIntent();
        if (t9(intent)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "onCreate judgeIllegalCall finish");
            try {
                intent.putExtra("key_trust_url", false);
            } catch (java.lang.Exception unused) {
            }
            super.onCreate(bundle);
            finish();
            return;
        }
        intent.putExtra("key_trust_url", false);
        super.onCreate(bundle);
        this.C3.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "onCreate, intent action = " + intent.getAction());
        setBackBtn(new eo3.a(this));
        getIntent().putExtra("showShare", false);
        a8(false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.C3.dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (t9(intent)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "onNewIntent judgeIllegalCall finish");
            return;
        }
        intent.putExtra("key_trust_url", false);
        super.onNewIntent(intent);
        java.lang.String F7 = F7();
        setIntent(intent);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(F7) && com.tencent.mm.sdk.platformtools.t8.K0(F7())) {
            intent.putExtra("rawUrl", F7);
        }
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "wizard_activity_result_code", Integer.MAX_VALUE);
        com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "onNewIntent, resultCode = " + g17);
        if (g17 != Integer.MAX_VALUE) {
            this.B3 = true;
        }
        if (g17 == -1) {
            u9(com.tencent.mm.pluginsdk.ui.p.LOGIN_OK, intent);
        } else if (g17 == 0) {
            m9();
            return;
        } else if (g17 == 1) {
            u9(com.tencent.mm.pluginsdk.ui.p.LOGIN_CANCEL, intent);
        }
        n9(true);
        com.tencent.mars.xlog.Log.i("Foreground dispatch", "Discovered tag with intent: " + intent);
    }

    public final boolean p9(wn3.a aVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "nfc-doCmd start");
        yn3.a c17 = yn3.a.c();
        c17.getClass();
        xn3.a aVar2 = new xn3.a(1, "def", aVar);
        c17.b(aVar2);
        java.lang.String cVar = aVar2.f455595g.toString();
        return !com.tencent.mm.sdk.platformtools.t8.K0(cVar) && java.util.regex.Pattern.compile(str, 2).matcher(cVar).find();
    }

    public final java.lang.String q9(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl start");
        this.A3 = "";
        r45.hw4 hw4Var = new r45.hw4();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                hw4Var.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                if (hw4Var.f376511d != null) {
                    boolean z17 = false;
                    for (int i17 = 0; i17 < hw4Var.f376511d.size(); i17++) {
                        r45.qt qtVar = (r45.qt) hw4Var.f376511d.get(i17);
                        yn3.d dVar = yn3.a.c().f464015d;
                        if (dVar != null) {
                            dVar.c();
                        }
                        if (qtVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(qtVar.f384250e) && !com.tencent.mm.sdk.platformtools.t8.L0(qtVar.f384249d)) {
                            for (int i18 = 0; i18 < qtVar.f384249d.size(); i18++) {
                                if (!com.tencent.mm.sdk.platformtools.t8.L0(((r45.s90) qtVar.f384249d.get(i18)).f385577d)) {
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= ((r45.s90) qtVar.f384249d.get(i18)).f385577d.size()) {
                                            break;
                                        }
                                        if (((r45.s90) qtVar.f384249d.get(i18)).f385577d.get(i19) != null && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.z40) ((r45.s90) qtVar.f384249d.get(i18)).f385577d.get(i19)).f391685d) && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.z40) ((r45.s90) qtVar.f384249d.get(i18)).f385577d.get(i19)).f391686e)) {
                                            if (!p9(new wn3.a(zn3.a.b(((r45.z40) ((r45.s90) qtVar.f384249d.get(i18)).f385577d.get(i19)).f391685d)), ((r45.z40) ((r45.s90) qtVar.f384249d.get(i18)).f385577d.get(i19)).f391686e)) {
                                                z17 = false;
                                                break;
                                            }
                                            z17 = true;
                                        }
                                        i19++;
                                    }
                                    if (z17) {
                                        break;
                                    }
                                }
                            }
                            if (z17) {
                                java.lang.String str2 = qtVar.f384250e;
                                com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "doCardTypeReport start");
                                s75.d.b(new eo3.b(this, str2), getClass().getName());
                                return qtVar.f384250e;
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NfcWebViewUI", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "[NFC] Common get nfc card type exception!" + e17.toString());
                com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "isConnect:" + yn3.a.c().d(getContext()));
                java.lang.String s96 = s9(1);
                this.A3 = s96;
                return s96;
            }
        }
        return this.A3;
    }

    public final java.lang.String r9(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl start");
        this.A3 = "";
        try {
            java.lang.String[] split = str.split(" ");
            if (split != null && split.length > 1) {
                int i17 = 0;
                boolean z17 = false;
                while (i17 < split.length - 1) {
                    java.lang.String str2 = split[i17];
                    int i18 = i17 + 1;
                    z17 = p9(new wn3.a(zn3.a.b(str2)), split[i18]);
                    if (!z17) {
                        break;
                    }
                    i17 = i18 + 1;
                }
                if (z17) {
                    java.lang.String str3 = split[split.length - 1];
                    this.A3 = str3;
                    return str3;
                }
            }
            return this.A3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NfcWebViewUI", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "[NFC] Debug get nfc card type exception!" + e17.toString());
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "isConnect:" + yn3.a.c().d(getContext()));
            java.lang.String s96 = s9(1);
            this.A3 = s96;
            return s96;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String s9(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI.D3
            r0.<init>(r1)
            java.lang.String r1 = "&type="
            r0.append(r1)
            r0.append(r3)
            boolean r3 = com.tencent.mm.sdk.platformtools.a0.f192448k
            if (r3 != 0) goto L21
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.m2.d()
            java.lang.String r1 = "zh_CN"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L21
            goto L2d
        L21:
            boolean r3 = com.tencent.mm.sdk.platformtools.m2.n()
            if (r3 == 0) goto L2b
            java.lang.String r1 = "zh_TW"
            goto L2d
        L2b:
            java.lang.String r1 = "en"
        L2d:
            java.lang.String r3 = "&lang="
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI.s9(int):java.lang.String");
    }

    public final boolean t9(android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "intent is null");
            return true;
        }
        try {
            java.util.Iterator<java.lang.String> it = intent.getExtras().keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next != null && !next.startsWith("android.nfc")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "extra wrong key = ".concat(next));
                    it.remove();
                }
            }
            android.os.Parcelable j17 = com.tencent.mm.sdk.platformtools.c2.j(intent, "android.nfc.extra.TAG");
            if (((j17 == null || !(j17 instanceof android.nfc.Tag)) ? null : (android.nfc.Tag) j17) != null) {
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "tag is null");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "judgeIllegalCall e:%s", e17);
            return true;
        }
    }

    public void u9(com.tencent.mm.pluginsdk.ui.p pVar, android.content.Intent intent) {
        if (pVar.ordinal() != 0) {
            finish();
            return;
        }
        android.os.Parcelable j17 = com.tencent.mm.sdk.platformtools.c2.j(intent, "android.nfc.extra.TAG");
        android.nfc.Tag tag = (j17 == null || !(j17 instanceof android.nfc.Tag)) ? null : (android.nfc.Tag) j17;
        if (tag == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "[NFC]tag is null");
            return;
        }
        try {
            yn3.a.c().e(tag);
            com.tencent.mars.xlog.Log.i("MicroMsg.NfcWebViewUI", "[NFC] connect status : " + yn3.a.c().a(getContext()));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NfcWebViewUI", "exp protect");
        }
    }
}
