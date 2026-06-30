package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.w.class)
/* loaded from: classes12.dex */
public class x3 extends com.tencent.mm.ui.chatting.component.a implements sb5.w {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f200199e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f200200f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f200201g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f200202h;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f200203i = new com.tencent.mm.ui.chatting.component.y3(this);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        o0(false);
        j41.c0 c0Var = (j41.c0) i95.n0.c(j41.c0.class);
        ((i41.l) c0Var).Di().remove(this.f200203i);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        boolean z17 = false;
        if (this.f200199e == null) {
            android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.f483657rf5);
            if (c17 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) c17;
                this.f200199e = viewGroup;
                viewGroup.setVisibility(8);
                m0(false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterToolbarComponent", "initView, foundView is not a ViewGroup!!!");
            }
        }
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null && ((h62.d) e0Var).fj(d0Var, false)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuExptUtil", "clicfg_kf_open_kefu_confirm_opt_2_android: " + z17);
        if (z17) {
            yb5.d dVar = this.f198580d;
            if (k41.h1.d(dVar == null ? null : dVar.x())) {
                ((i41.l) ((j41.c0) i95.n0.c(j41.c0.class))).Di().add(this.f200203i);
            }
        }
        r0();
    }

    public final void m0(boolean z17) {
        java.util.Set set = this.f200202h;
        if (set == null || ((java.util.HashSet) set).isEmpty()) {
            return;
        }
        java.util.Iterator it = ((java.util.HashSet) this.f200202h).iterator();
        while (it.hasNext()) {
            sb5.v vVar = (sb5.v) it.next();
            if (vVar != null) {
                vVar.a(z17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if ("1".equals(r1.getQueryParameter("isModal")) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r6 = r10;
        r5 = null;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        if ("1".equals(r1.getQueryParameter("isModal")) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q41.a n0(s31.f r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            android.net.Uri r1 = android.net.Uri.parse(r10)
        L9:
            if (r9 == 0) goto L17
            java.lang.CharSequence r9 = r9.f402440d
            if (r9 == 0) goto L17
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.toString()
            r4 = r9
            goto L18
        L17:
            r4 = r0
        L18:
            r9 = 0
            if (r10 == 0) goto L90
            java.lang.String r2 = "weixin://dl/businessWebview"
            boolean r2 = r10.startsWith(r2)
            r3 = 1
            if (r2 == 0) goto L31
            if (r1 == 0) goto L2e
            java.lang.String r10 = "url"
            java.lang.String r0 = r1.getQueryParameter(r10)
        L2e:
            r6 = r9
            goto L92
        L31:
            java.lang.String r2 = "weixin://dl/openWxa"
            boolean r2 = r10.startsWith(r2)
            java.lang.String r5 = "isModal"
            java.lang.String r6 = "isTransparent"
            java.lang.String r7 = "1"
            if (r2 == 0) goto L65
            if (r1 == 0) goto L4e
            java.lang.String r10 = r1.getQueryParameter(r6)
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L4e
            r10 = r3
            goto L4f
        L4e:
            r10 = r9
        L4f:
            r2 = 2
            if (r1 == 0) goto L60
            java.lang.String r1 = r1.getQueryParameter(r5)
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L60
        L5c:
            r6 = r10
            r5 = r0
            r7 = r3
            goto L63
        L60:
            r7 = r9
            r6 = r10
            r5 = r0
        L63:
            r3 = r2
            goto L94
        L65:
            java.lang.String r2 = "weixin://dl/openLiteApp"
            boolean r10 = r10.startsWith(r2)
            if (r10 == 0) goto L8b
            if (r1 == 0) goto L7c
            java.lang.String r10 = r1.getQueryParameter(r6)
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L7c
            r10 = r3
            goto L7d
        L7c:
            r10 = r9
        L7d:
            r2 = 3
            if (r1 == 0) goto L60
            java.lang.String r1 = r1.getQueryParameter(r5)
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L60
            goto L5c
        L8b:
            r10 = 4
            r6 = r9
            r7 = r6
            r3 = r10
            goto L93
        L90:
            r3 = r9
            r6 = r3
        L92:
            r7 = r6
        L93:
            r5 = r0
        L94:
            q41.a r9 = new q41.a
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.x3.n0(s31.f, java.lang.String):q41.a");
    }

    public void o0(boolean z17) {
        if (z17) {
            this.f200200f = null;
            this.f200201g = null;
        }
        android.view.ViewGroup viewGroup = this.f200199e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            if (z17) {
                this.f200199e.removeAllViews();
            }
            m0(false);
        }
    }

    public void p0(boolean z17) {
        android.view.ViewGroup viewGroup = this.f200199e;
        if (viewGroup == null) {
            return;
        }
        if (!z17) {
            if (viewGroup.getChildCount() <= 0) {
                o0(false);
                return;
            } else {
                this.f200199e.setVisibility(0);
                m0(true);
                return;
            }
        }
        java.lang.String x17 = this.f198580d.x();
        boolean z18 = (android.text.TextUtils.isEmpty(this.f200201g) || android.text.TextUtils.equals(this.f200201g, x17)) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "showToolbar() called needReload hideToolbarNeedReset:%s lastUsernameOfXml:%s lastUsername:%s", java.lang.Boolean.valueOf(z18), this.f200201g, x17);
        o0(z18);
        com.tencent.mm.ui.chatting.component.z3 z3Var = new com.tencent.mm.ui.chatting.component.z3(this, x17);
        com.tencent.mm.storage.z3 u17 = this.f198580d.u();
        java.lang.String d17 = u17 == null ? null : u17.d1();
        if (d17 == null || d17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterToolbarComponent", "reloadToolbarDsl, talker invalid, username: " + d17 + ", contact: " + u17);
            z3Var.a(null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "reloadToolbarDsl, username: ".concat(d17));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.storage.z3.p4(d17)) {
            if (d17.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, username invalid: ".concat(d17));
                z3Var.a(null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, username: ".concat(d17));
            yb5.d dVar = this.f198580d;
            android.content.Intent n17 = dVar == null ? null : dVar.n();
            e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean z19 = e0Var != null && ((h62.d) e0Var).fj(d0Var, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuExptUtil", "clicfg_kf_open_kefu_confirm_opt_2_android: " + z19);
            if (z19 && k41.h1.d(d17) && n17 != null && n17.getBooleanExtra("KEY_KEFU_DIRECT_ENTER", false)) {
                n17.removeExtra("KEY_KEFU_DIRECT_ENTER");
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, direct-enter hit, use local cache, username: ".concat(d17));
                return;
            }
            j41.h0 h0Var = new j41.h0(0, d17, null);
            h0Var.f297635e = true;
            j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
            com.tencent.mm.ui.chatting.component.a4 a4Var = new com.tencent.mm.ui.chatting.component.a4(this, z3Var, d17);
            ((l41.b2) yVar).getClass();
            k41.h1.b(h0Var, new l41.z1(h0Var, a4Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029b A[Catch: Exception -> 0x02f2, TryCatch #5 {Exception -> 0x02f2, blocks: (B:116:0x0270, B:118:0x027c, B:120:0x0282, B:122:0x0288, B:130:0x029b, B:132:0x02ab, B:134:0x02b3, B:135:0x02b6, B:137:0x02c6, B:138:0x02cc), top: B:115:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01cd A[Catch: Exception -> 0x01ed, TryCatch #1 {Exception -> 0x01ed, blocks: (B:159:0x01a6, B:161:0x01ad, B:163:0x01b3, B:165:0x01b7, B:167:0x01c0, B:175:0x01cd, B:180:0x01e6, B:183:0x01de), top: B:158:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160 A[Catch: Exception -> 0x0170, TRY_LEAVE, TryCatch #0 {Exception -> 0x0170, blocks: (B:64:0x0135, B:66:0x013b, B:68:0x0144, B:70:0x014a, B:74:0x0158, B:76:0x0160), top: B:63:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(java.lang.String r20, com.tencent.mm.ui.chatting.component.b4 r21) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.x3.q0(java.lang.String, com.tencent.mm.ui.chatting.component.b4):void");
    }

    public final void r0() {
        final java.lang.String x17 = this.f198580d.x();
        if (!com.tencent.mm.storage.z3.p4(x17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "tryShowToolbarInCache, not OpenIM kefu, username: ".concat(x17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "tryShowToolbarInCache, try to get contact from cache, username: ".concat(x17));
        final k41.g0 g0Var = (k41.g0) ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(x17);
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "tryShowToolbarInCache, no cached contact found, username: ".concat(x17));
            return;
        }
        final java.lang.String str = g0Var.field_kefuToolsInfo;
        if (str == null || str.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "tryShowToolbarInCache, no toolbar DSL in cached contact, username: ".concat(x17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "tryShowToolbarInCache, found cached toolbar DSL, username: " + x17 + ", DSL: " + str);
        this.f198580d.q().post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.x3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.chatting.component.x3 x3Var = com.tencent.mm.ui.chatting.component.x3.this;
                x3Var.getClass();
                x3Var.q0(x17, new com.tencent.mm.ui.chatting.component.d4(g0Var, str));
            }
        });
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        p0(true);
    }
}
