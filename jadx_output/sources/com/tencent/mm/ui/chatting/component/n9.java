package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.g2.class)
/* loaded from: classes9.dex */
public class n9 extends com.tencent.mm.ui.chatting.component.a implements sb5.g2 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f199569g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f199571i;

    /* renamed from: m, reason: collision with root package name */
    public long f199572m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f199574o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f199567e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f199568f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f199570h = false;

    /* renamed from: n, reason: collision with root package name */
    public long f199573n = -1;

    /* renamed from: p, reason: collision with root package name */
    public r15.g f199575p = null;

    /* renamed from: q, reason: collision with root package name */
    public r15.g f199576q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Boolean f199577r = java.lang.Boolean.FALSE;

    /* renamed from: s, reason: collision with root package name */
    public g15.b f199578s = null;

    /* renamed from: t, reason: collision with root package name */
    public final e75.a f199579t = new e75.a() { // from class: com.tencent.mm.ui.chatting.component.n9$$a
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
        
            if (r2.o() == r1.o()) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
        @Override // e75.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onChanged(java.lang.Object r8) {
            /*
                r7 = this;
                ti3.d r8 = (ti3.d) r8
                com.tencent.mm.ui.chatting.component.n9 r0 = com.tencent.mm.ui.chatting.component.n9.this
                r0.getClass()
                java.lang.String r1 = r8.f419582b
                yb5.d r2 = r0.f198580d
                java.lang.String r2 = r2.x()
                boolean r1 = com.tencent.mm.sdk.platformtools.t8.D0(r1, r2)
                if (r1 == 0) goto L9b
                yb5.d r1 = r0.f198580d
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f460717l
                java.lang.String r1 = r1.f198151e
                java.lang.String r2 = r8.f419584d
                boolean r1 = com.tencent.mm.sdk.platformtools.t8.D0(r2, r1)
                if (r1 != 0) goto L9b
                g15.b r1 = r0.f199578s
                g15.b r2 = r8.f419583c
                if (r2 != 0) goto L2c
                if (r1 != 0) goto L2c
                goto L6e
            L2c:
                if (r2 == 0) goto L70
                if (r1 != 0) goto L31
                goto L70
            L31:
                java.lang.String r3 = r2.k()
                java.lang.String r4 = r1.k()
                boolean r3 = com.tencent.mm.sdk.platformtools.t8.m(r3, r4)
                if (r3 == 0) goto L70
                g15.d r3 = r2.l()
                r4 = 0
                if (r3 == 0) goto L4f
                long r5 = r3.j()
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                goto L50
            L4f:
                r3 = r4
            L50:
                g15.d r5 = r1.l()
                if (r5 == 0) goto L5e
                long r4 = r5.j()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
            L5e:
                boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
                if (r3 == 0) goto L70
                boolean r3 = r2.o()
                boolean r1 = r1.o()
                if (r3 != r1) goto L70
            L6e:
                r1 = 0
                goto L71
            L70:
                r1 = 1
            L71:
                if (r1 == 0) goto L9b
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r0.f199577r = r8
                r0.p0(r2)
                r0.f199578s = r2
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r1 = "draft info changed,will reset draft ui when next resume,new draft is "
                r8.<init>(r1)
                g15.b r0 = r0.f199578s
                if (r0 != 0) goto L8a
                java.lang.String r0 = "null"
                goto L8e
            L8a:
                java.lang.String r0 = r0.toString()
            L8e:
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.String r0 = "MicroMsg.ChattingUI.DraftComponent"
                com.tencent.mars.xlog.Log.i(r0, r8)
                goto L9e
            L9b:
                r8.toString()
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.n9$$a.onChanged(java.lang.Object):void");
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.o9 f199580u = com.tencent.mm.ui.chatting.component.o9.hide;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        ((e75.g) ((jz5.n) ti3.c.f419579a.b().f193039b).getValue()).removeObserver(this.f199579t);
        super.I();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        ((e75.g) ((jz5.n) ti3.c.f419579a.b().f193039b).getValue()).uiObserve(this.f198580d.f460717l, this.f199579t);
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 == 212) {
            if (intent == null) {
                return;
            }
            sb5.s0 s0Var = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
            java.lang.String stringExtra = intent.getStringExtra("select_raw_user_name");
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                ((java.util.LinkedList) ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.f190041p1.f190741c).add("");
                this.f199567e = false;
                return;
            }
            com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) s0Var;
            ((java.util.LinkedList) jbVar.f199263e.f190041p1.f190741c).add(stringExtra2);
            jbVar.f199263e.r(this.f198580d.x(), stringExtra, stringExtra2);
            this.f199567e = true;
            jbVar.v0();
            return;
        }
        if (i17 == 229 && intent != null) {
            com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f198580d.x());
            sb5.s0 s0Var2 = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
            java.lang.String stringExtra3 = intent.getStringExtra("KSelectUserList");
            java.lang.String[] split = stringExtra3.split(",");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DraftComponent", "update at Someone record from chatroom");
            ((qd0.c) ((rd0.s0) i95.n0.c(rd0.s0.class))).wi(this.f198580d.x(), stringExtra3);
            for (java.lang.String str : split) {
                java.lang.String string = str.equals("notify@all") ? this.f198580d.s().getString(com.tencent.mm.R.string.a6j, "") : c01.e2.t(z07, str, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DraftComponent", "atSomeOne username:%s, DisplayName:%s", str, string);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    ((java.util.LinkedList) ((com.tencent.mm.ui.chatting.component.jb) s0Var2).f199263e.f190041p1.f190741c).add("");
                } else {
                    com.tencent.mm.ui.chatting.component.jb jbVar2 = (com.tencent.mm.ui.chatting.component.jb) s0Var2;
                    ((java.util.LinkedList) jbVar2.f199263e.f190041p1.f190741c).add(string);
                    jbVar2.f199263e.r(this.f198580d.x(), str, string);
                    this.f199567e = true;
                }
            }
            ((com.tencent.mm.ui.chatting.component.jb) s0Var2).v0();
        }
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class));
        this.f199569g = jbVar.f199263e.getLastText();
        this.f199572m = jbVar.f199263e.getLastQuoteMsgId();
        this.f199575p = jbVar.f199263e.getLastPartialQuoteText();
        this.f199574o = jbVar.f199263e.getLastQuoteMsgTalker();
        m0();
    }

    @Override // yn.d
    public boolean d0(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            sb5.s0 s0Var = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
            if (keyEvent.getAction() == 0) {
                if (((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.getCharAtCursor() == 8197) {
                    this.f199568f = true;
                } else {
                    this.f199568f = false;
                }
            }
            if (keyEvent.getAction() == 1 && this.f199568f) {
                this.f199568f = false;
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e;
                java.lang.String x17 = this.f198580d.x();
                int selectionStart = chatFooter.getSelectionStart();
                java.lang.String substring = chatFooter.getLastText().substring(0, selectionStart);
                int lastIndexOf = substring.lastIndexOf(64);
                if (lastIndexOf < substring.length() && lastIndexOf >= 0) {
                    chatFooter.setLastText(substring.substring(0, lastIndexOf) + chatFooter.getLastText().substring(selectionStart));
                    chatFooter.f190021m.setSelection(lastIndexOf);
                    int i18 = 0;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(substring)) {
                        int i19 = -1;
                        while (true) {
                            int indexOf = substring.indexOf(8197, i19);
                            if (indexOf == -1) {
                                break;
                            }
                            i19 = indexOf + 1;
                            i18++;
                        }
                        i18++;
                    }
                    com.tencent.mm.pluginsdk.ui.chat.x4 x4Var = chatFooter.f190041p1;
                    java.util.LinkedList linkedList = (java.util.LinkedList) x4Var.f190743e.get(x17);
                    java.lang.String substring2 = substring.substring(lastIndexOf + 1, selectionStart);
                    if (linkedList != null && linkedList.size() >= i18) {
                        int i27 = i18 - 1;
                        if (((java.util.HashMap) linkedList.get(i27)).containsKey(substring2)) {
                            linkedList.remove(i27);
                            x4Var.f190743e.put(x17, linkedList);
                        }
                    }
                }
            }
        }
        return false;
    }

    public void m0() {
        int length;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x())) {
            return;
        }
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class));
        if (jbVar.f199263e != null) {
            boolean z17 = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f199569g) && this.f199572m == 0) {
                java.lang.String str = this.f199569g;
                java.lang.String lastText = jbVar.f199263e.getLastText();
                if (str != lastText && (str == null || lastText == null || !str.equals(lastText))) {
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DraftComponent", "clear footer last text");
                    jbVar.f199263e.setLastText(this.f199569g);
                }
                if (jbVar.f199263e.getLastQuoteMsgId() != this.f199572m) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DraftComponent", "clear footer last quote msg");
                    jbVar.f199263e.j1(this.f199574o, this.f199572m, null);
                }
                if (((com.tencent.mm.ui.chatting.component.pg) ((sb5.b1) this.f198580d.f460708c.a(sb5.b1.class))).f199710e) {
                    jbVar.f199263e.setHint(this.f198580d.s().getString(com.tencent.mm.R.string.b6o));
                    return;
                } else if (jbVar.f199263e.getIsVoiceInputPanleShow()) {
                    jbVar.I0();
                    return;
                } else {
                    o0();
                    return;
                }
            }
            boolean z18 = jbVar.f199263e.getMode() == 1 && com.tencent.mm.sdk.platformtools.t8.K0(jbVar.f199271p);
            boolean z19 = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class))).f199296g;
            if (!z18 || z19) {
                o0();
            } else {
                n0();
            }
            jbVar.f199263e.j1(this.f199574o, this.f199572m, this.f199575p);
            boolean z27 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198754s;
            if ((this.f198580d.C() || z27) && this.f199567e) {
                this.f199567e = false;
                java.util.List<java.lang.String> atSomebodyList = jbVar.f199263e.getAtSomebodyList();
                if (atSomebodyList != null && atSomebodyList.size() > 0) {
                    int insertPos = jbVar.f199263e.getInsertPos();
                    if (insertPos > this.f199569g.length()) {
                        insertPos = this.f199569g.length();
                    }
                    java.lang.String substring = this.f199569g.substring(0, insertPos);
                    int i17 = insertPos;
                    int i18 = 0;
                    for (java.lang.String str2 : atSomebodyList) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            if (i18 > 0) {
                                substring = substring + "@" + str2 + (char) 8197;
                                length = str2.length() + 2;
                            } else {
                                substring = substring + str2 + (char) 8197;
                                length = str2.length() + 1;
                            }
                            i17 += length;
                        }
                        i18++;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(substring);
                    java.lang.String str3 = this.f199569g;
                    sb6.append(str3.substring(insertPos, str3.length()));
                    java.lang.String sb7 = sb6.toString();
                    jbVar.f199263e.setLastContent(sb7);
                    jbVar.f199263e.k1(sb7, i17, false);
                    ((java.util.LinkedList) jbVar.f199263e.f190041p1.f190741c).clear();
                    n0();
                }
            } else {
                jbVar.f199263e.setLastContent(this.f199569g);
                jbVar.f199263e.setLastText(this.f199569g);
                if ((!com.tencent.mm.sdk.platformtools.t8.K0(this.f199569g) || this.f199572m != 0) && com.tencent.mm.sdk.platformtools.t8.K0(jbVar.f199271p)) {
                    jbVar.G0();
                    if (!z19) {
                        this.f198580d.M(true, true, false);
                    }
                }
            }
            jbVar.I0();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f199569g) || !this.f199570h) {
                return;
            }
            com.tencent.mm.ui.chatting.component.y8 y8Var = (com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) this.f198580d.f460708c.a(sb5.i0.class));
            y8Var.f200299t = true;
            a31.m mVar = y8Var.f200292m;
            if (mVar != null) {
                mVar.f990x = true;
                com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = mVar.f969c;
                if (speechInputLayout != null) {
                    speechInputLayout.c(1);
                }
            }
        }
    }

    public final void n0() {
        sb5.s0 s0Var = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
        if (((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e;
        chatFooter.getClass();
        chatFooter.postDelayed(new com.tencent.mm.pluginsdk.ui.chat.b4(chatFooter), 500L);
    }

    public final void o0() {
        sb5.s0 s0Var = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
        if (((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e == null) {
            return;
        }
        boolean z17 = this.f199580u == com.tencent.mm.ui.chatting.component.o9.show;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e;
        chatFooter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "withoutLastText: ");
        chatFooter.A0();
        chatFooter.U0(z17);
    }

    public final void p0(g15.b bVar) {
        if (bVar == null) {
            this.f199569g = "";
            this.f199571i = "";
            this.f199570h = false;
            this.f199572m = 0L;
            this.f199573n = 0L;
            this.f199574o = "";
            this.f199575p = null;
            this.f199576q = null;
            return;
        }
        java.lang.String k17 = bVar.k();
        this.f199569g = k17;
        this.f199571i = k17;
        this.f199570h = bVar.o();
        if (bVar.l() == null) {
            this.f199572m = 0L;
            this.f199573n = 0L;
            this.f199574o = "";
            this.f199575p = null;
            this.f199576q = null;
            return;
        }
        long j17 = bVar.l().j();
        this.f199572m = j17;
        this.f199573n = j17;
        this.f199574o = bVar.l().k();
        r15.g l17 = bVar.l().l();
        this.f199575p = l17;
        this.f199576q = l17;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (this.f199577r.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DraftComponent", "will reset draft to ui");
            this.f199577r = java.lang.Boolean.FALSE;
            m0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x054f  */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y() {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.n9.y():void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        java.lang.String str;
        g15.d l17;
        java.lang.String str2;
        java.lang.String str3;
        this.f199577r = java.lang.Boolean.FALSE;
        this.f199580u = com.tencent.mm.ui.chatting.component.o9.hide;
        if (this.f198580d.u() != null) {
            g15.b bVar = new g15.b();
            pt0.m mVar = (pt0.m) i95.n0.c(pt0.m.class);
            java.lang.String x17 = this.f198580d.x();
            ez.j jVar = (ez.j) mVar;
            jVar.getClass();
            g15.b wi6 = jVar.wi(x17);
            r15.g gVar = null;
            java.util.LinkedList n17 = wi6 != null ? wi6.n() : null;
            if (n17 != null) {
                bVar.r(n17);
            }
            com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class));
            if (aVar.f198753r) {
                bVar.p(r01.q3.aj().J0(aVar.w0()).field_editingMsg);
            } else {
                str = "";
                if (((com.tencent.mm.ui.chatting.component.h3) ((sb5.s) this.f198580d.f460708c.a(sb5.s.class))).u()) {
                    zy2.g6 g6Var = (zy2.g6) i95.n0.c(zy2.g6.class);
                    java.lang.String x18 = this.f198580d.x();
                    ((com.tencent.mm.plugin.finder.service.v1) g6Var).getClass();
                    if (!(x18.length() == 0)) {
                        if (!com.tencent.mm.storage.z3.V3(x18)) {
                            throw new java.lang.RuntimeException("sessionId[" + x18 + "] is not session");
                        }
                        java.lang.String str4 = ((c61.l7) i95.n0.c(c61.l7.class)).Kj().D0(x18).field_editingMsg;
                        if (str4 != null) {
                            str = str4;
                        }
                    }
                    bVar.p(str);
                } else if (((com.tencent.mm.ui.chatting.component.h4) ((sb5.x) this.f198580d.f460708c.a(sb5.x.class))).t()) {
                    u53.a0 a0Var = (u53.a0) i95.n0.c(u53.a0.class);
                    java.lang.String x19 = this.f198580d.x();
                    ((z53.q) a0Var).getClass();
                    if (!com.tencent.mm.storage.z3.a4(x19)) {
                        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "check sessionId failed");
                        r5 = false;
                    }
                    if (r5 && (str3 = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().z0(x19).field_editingMsg) != null) {
                        str = str3;
                    }
                    bVar.p(str);
                } else if (((com.tencent.mm.ui.chatting.component.u7) ((sb5.h0) this.f198580d.f460708c.a(sb5.h0.class))).G()) {
                    bi4.x0 x0Var = (bi4.x0) i95.n0.c(bi4.x0.class);
                    java.lang.String x27 = this.f198580d.x();
                    ((ki4.a0) x0Var).getClass();
                    if (!(x27.length() == 0) && (str2 = ni4.x.f337776d.h().z0(x27).field_editingMsg) != null) {
                        str = str2;
                    }
                    bVar.p(str);
                } else if (aVar.G0()) {
                    java.lang.String str5 = yq1.u0.Di().z0(this.f198580d.x()).field_editingMsg;
                    bVar.p(str5 != null ? str5 : "");
                } else if (aVar.H0()) {
                    java.lang.String str6 = yq1.u0.Vi().z0(this.f198580d.x()).field_editingMsg;
                    bVar.p(str6 != null ? str6 : "");
                } else if (((com.tencent.mm.ui.chatting.component.b9) ((sb5.j0) this.f198580d.f460708c.a(sb5.j0.class))).s()) {
                    gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
                    java.lang.String x28 = this.f198580d.x();
                    fr4.g0 g0Var = (fr4.g0) fVar;
                    g0Var.getClass();
                    if (!(x28.length() == 0)) {
                        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "getEditing of ".concat(x28));
                        java.lang.String str7 = g0Var.Bi().y0(x28).field_editingMsg;
                        if (str7 != null) {
                            str = str7;
                        }
                    }
                    bVar.p(str);
                } else {
                    com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
                    if (p17 != null) {
                        g15.b a17 = ti3.c.f419579a.a(this.f198580d.x());
                        if (a17 != null) {
                            bVar = a17;
                        } else {
                            bVar.p(p17.A0());
                            pt0.m mVar2 = (pt0.m) i95.n0.c(pt0.m.class);
                            java.lang.String msgTalker = p17.h1();
                            ez.j jVar2 = (ez.j) mVar2;
                            jVar2.getClass();
                            kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
                            g15.b wi7 = jVar2.wi(msgTalker);
                            bVar.s(java.lang.Boolean.valueOf(wi7 != null ? wi7.o() : false).booleanValue());
                            if (p17.D0() != 0) {
                                g15.d dVar = new g15.d();
                                dVar.n(p17.D0());
                                dVar.o(p17.h1());
                                pt0.m mVar3 = (pt0.m) i95.n0.c(pt0.m.class);
                                java.lang.String msgTalker2 = p17.h1();
                                java.lang.Long valueOf = java.lang.Long.valueOf(p17.D0());
                                ez.j jVar3 = (ez.j) mVar3;
                                jVar3.getClass();
                                kotlin.jvm.internal.o.g(msgTalker2, "msgTalker");
                                g15.b wi8 = jVar3.wi(msgTalker2);
                                if (wi8 != null) {
                                    g15.d l18 = wi8.l();
                                    if (com.tencent.mm.sdk.platformtools.t8.m(l18 != null ? java.lang.Long.valueOf(l18.j()) : null, valueOf) && (l17 = wi8.l()) != null) {
                                        gVar = l17.l();
                                    }
                                }
                                dVar.p(gVar);
                                bVar.q(dVar);
                            }
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DraftComponent", "doCreate draft info is %s", bVar);
            this.f199578s = bVar;
            p0(bVar);
        }
    }
}
