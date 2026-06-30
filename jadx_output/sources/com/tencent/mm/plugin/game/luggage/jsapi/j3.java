package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class j3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final g02.c f139694e = new g02.c();

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        uk.i.a(r11);
        uk.i.a(r1);
        uk.i.a(r7);
        uk.i.a(r4);
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d2, code lost:
    
        r30 = r7;
        r3 = r3 + r8;
        r12 = r12 + r8;
        r5 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e1, code lost:
    
        if ((r3 + r5) <= r25) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e6, code lost:
    
        r5 = r5;
        r2 = 1048576;
        r7 = new byte[1048576];
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01eb, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ef, code lost:
    
        if (r8 >= r5) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f1, code lost:
    
        r23 = r5 - r8;
        r31 = r5;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f8, code lost:
    
        if (r23 <= r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01fb, code lost:
    
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fd, code lost:
    
        r2 = (int) r5;
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0201, code lost:
    
        r2 = r5.read(r7, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0205, code lost:
    
        if (r2 >= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0208, code lost:
    
        r11.write(r7, 0, r2);
        r8 = r8 + r2;
        r27 = r5;
        r7 = r7;
        r5 = r31;
        r2 = 1048576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021a, code lost:
    
        r11.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021d, code lost:
    
        if (r8 != r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0222, code lost:
    
        if (r2 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0237, code lost:
    
        r3 = r3 + r0[1];
        r12 = r12 + r0[2];
        r1.getChannel().position(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0246, code lost:
    
        r6 = r13;
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0224, code lost:
    
        uk.i.a(r11);
        uk.i.a(r1);
        uk.i.a(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0221, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x024d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0218, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01e3, code lost:
    
        r5 = r27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.tencent.mm.plugin.game.luggage.jsapi.j3 r33, android.content.Context r34, java.lang.String r35, java.lang.String r36, u43.b r37) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.j3.f(com.tencent.mm.plugin.game.luggage.jsapi.j3, android.content.Context, java.lang.String, java.lang.String, u43.b):void");
    }

    public static final void g(com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        j3Var.getClass();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.pm.PackageInfo a17 = ik1.b.a(context, str);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("patchApkChannel", "getFileMd5 failed pkgInfo = null");
            q5Var.a("get pkgInfo failed", null);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.d3(j3Var, str, a17));
            q5Var.a(null, null);
        }
    }

    public static final void h(com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Context context) {
        j3Var.getClass();
        if (str == null || str.length() == 0) {
            q5Var.a("patchDownloadUrl is null or empty", null);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.i3(j3Var, str, str2, context));
            q5Var.a(null, null);
        }
    }

    @Override // sd.c
    public java.lang.String b() {
        return "patchApkChannel";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.h3(e17, q5Var, this, context));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("pkgName", str);
            jSONObject.put("state", str2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
            com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, tw4.a.class, null);
            com.tencent.mm.plugin.game.luggage.jsevent.o.f139798a.a(bundle);
        } catch (org.json.JSONException unused) {
        }
    }

    public final void j(g02.c cVar, u43.b bVar) {
        bVar.field_appId = cVar.f267420a;
        bVar.field_scene = cVar.f267421b;
        bVar.field_ssid = cVar.f267437r;
        bVar.field_noticeId = cVar.f267436q;
        bVar.field_uiarea = cVar.f267435p;
        bVar.field_extInfo = cVar.f267432m;
        bVar.field_userSessionId = cVar.f267439t;
    }

    public final java.lang.String k(java.lang.String str) {
        java.lang.String str2 = r26.i0.t(str, ".", "", false) + java.lang.System.currentTimeMillis() + ".apk";
        java.lang.String str3 = com.tencent.mm.vfs.q7.c("gameDownload") + "/gameApk/";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        java.lang.String str5 = str3 + str2;
        com.tencent.mars.xlog.Log.i("patchApkChannel", "gamelog.jsapi, apkCopy,new apk path  = " + str5);
        return str5;
    }
}
