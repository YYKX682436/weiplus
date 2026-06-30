package lr;

/* loaded from: classes16.dex */
public class p implements lr.l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f320565a;

    /* renamed from: b, reason: collision with root package name */
    public final nr.j f320566b;

    /* renamed from: c, reason: collision with root package name */
    public final nr.c f320567c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.v9 f320568d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.k0 f320569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f320570f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f320571g;

    /* renamed from: h, reason: collision with root package name */
    public int f320572h;

    public p(int i17, nr.j jVar, nr.c cVar) {
        this.f320565a = i17;
        this.f320566b = jVar;
        this.f320567c = cVar;
    }

    public static final void c(lr.p pVar, android.content.Context context, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        pVar.getClass();
        qk.x6 m17 = iEmojiInfo.m1();
        iEmojiInfo.F1(qk.x6.STATUS_UPLOADING);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(emojiInfo);
        emojiInfo.F1(m17);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().c(emojiInfo.getMd5());
    }

    @Override // lr.k0
    public void a(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        int i18;
        java.lang.String str;
        java.lang.String localClassName;
        java.lang.String string;
        yz5.a aVar;
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelClickListener", "onClick: " + i17 + ", " + u0Var);
        if (u0Var == null) {
            return;
        }
        nr.j jVar = this.f320566b;
        if (jVar != null) {
            jVar.f339055c = this.f320565a;
        }
        nr.c cVar = this.f320567c;
        if (cVar != null) {
            cVar.f339036c = this.f320565a;
        }
        ((com.tencent.mm.ui.chatting.o2) ((ty.g0) i95.n0.c(ty.g0.class))).wi();
        boolean z17 = false;
        int i19 = u0Var.f293907a;
        if (i19 == 0) {
            ir.g gVar = (ir.g) u0Var;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = gVar.f293836b;
            if (n22.m.l(iEmojiInfo2)) {
                iEmojiInfo = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().d((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo2);
                kotlin.jvm.internal.o.f(iEmojiInfo, "getRandomEmoji(...)");
            } else {
                iEmojiInfo = iEmojiInfo2;
            }
            gr.t.g().a();
            int size = gr.t.g().a().size();
            if (i17 > 997 || i17 > size) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EmojiPanelClickListener", "reportClick error : " + i17 + ", md5: " + iEmojiInfo2.getMd5() + ", count: " + size + ", group: " + iEmojiInfo2.getGroupId() + ", designer: " + iEmojiInfo2.X0());
            }
            if (jVar != null) {
                java.lang.String md52 = iEmojiInfo2.getMd5();
                java.lang.String groupId = iEmojiInfo2.getGroupId();
                java.lang.String X0 = iEmojiInfo2.X0();
                java.lang.String S0 = iEmojiInfo2.S0();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16029, md52, groupId, X0, S0, java.lang.Integer.valueOf(jVar.f339055c), java.lang.Long.valueOf(currentTimeMillis - jVar.f339053a), java.lang.Integer.valueOf(jVar.f339054b), java.lang.Integer.valueOf(jVar.f339056d), java.lang.Integer.valueOf(jVar.f339057e), 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jVar.f339058f), 0, 0, java.lang.Integer.valueOf(jVar.f339059g), jVar.f339060h, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(jVar.f339053a), java.lang.Integer.valueOf(jVar.f339063k), jVar.f339061i, java.lang.Integer.valueOf(jVar.f339062j));
                i18 = 1;
                jVar.f339054b++;
            } else {
                i18 = 1;
            }
            int i27 = gVar.f293837c;
            if (i27 == 0) {
                iEmojiInfo.v1(qk.z6.SEND_FROM_SCENE_CUSTOM_TAB);
            } else if (i27 == i18) {
                iEmojiInfo.v1(qk.z6.SEND_FROM_SCENE_CAMERA_TAB);
            } else if (i27 == 2) {
                iEmojiInfo.v1(qk.z6.SEND_FROM_SCENE_STORE_TAB);
            }
            com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = this.f320568d;
            if (v9Var != null) {
                v9Var.b((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
                return;
            }
            return;
        }
        if (i19 == 1) {
            ir.a1 a1Var = (ir.a1) u0Var;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().g(a1Var.f293814b.f274663a);
            java.lang.String d17 = com.tencent.mm.smiley.e1.b().d(a1Var.f293814b.f274663a);
            kotlin.jvm.internal.o.f(d17, "getText(...)");
            java.lang.String str2 = this.f320570f;
            if (str2 != null) {
                r10 = com.tencent.mm.storage.z3.R4(str2) ? 2 : 1;
                str = str2;
            } else {
                str = "";
                r10 = 0;
            }
            boolean z18 = a1Var.f293815c;
            nr.a.f339029a = z18;
            if (cVar != null) {
                java.lang.String t17 = r26.i0.t(d17, ",", " ", false);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13470, t17, java.lang.Integer.valueOf(cVar.f339036c), java.lang.Integer.valueOf(z18 ? 1 : 0), 0, 0, java.lang.Integer.valueOf(a1Var.f293816d), java.lang.Integer.valueOf(cVar.f339038e ? 1 : 0), java.lang.Integer.valueOf(cVar.f339037d), java.lang.Integer.valueOf(cVar.f339035b), java.lang.Long.valueOf(currentTimeMillis2 - cVar.f339034a), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(cVar.f339034a), java.lang.Integer.valueOf(cVar.f339039f), cVar.f339040g, java.lang.Integer.valueOf(r10), str);
                cVar.f339035b++;
            }
            com.tencent.mm.pluginsdk.ui.k0 k0Var = this.f320569e;
            if (k0Var != null) {
                k0Var.a(d17);
                return;
            }
            return;
        }
        if (i19 == 2) {
            if (((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode()) {
                ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context2);
                return;
            }
            nr.d.f339041a.a(2);
            ir.i0 i0Var = (ir.i0) u0Var;
            r45.v75 v75Var = i0Var.f293867c;
            if (v75Var != null) {
                android.app.Activity a17 = q75.a.a(context);
                qk.v vVar = new qk.v();
                vVar.f364027g = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(v75Var.f387964d));
                java.lang.String str3 = v75Var.f387965e;
                if (str3 == null) {
                    str3 = "";
                }
                vVar.f364030j = str3;
                java.lang.String str4 = v75Var.f387966f;
                if (str4 == null) {
                    str4 = "";
                }
                vVar.f364031k = str4;
                java.lang.String str5 = v75Var.f387967g;
                if (str5 == null) {
                    str5 = "";
                }
                vVar.f364032l = str5;
                java.lang.String str6 = v75Var.f387969i;
                if (str6 == null) {
                    str6 = "";
                }
                vVar.f364034n = str6;
                java.lang.String str7 = v75Var.f387970m;
                vVar.f364033m = str7 != null ? str7 : "";
                vVar.f364035o = i0Var.f293869e;
                vVar.f364046z = true;
                if (a17 != null && (localClassName = a17.getLocalClassName()) != null && r26.n0.B(localClassName, "AppBrandUI", false)) {
                    z17 = true;
                }
                if (z17) {
                    vVar.f364041u = true;
                }
                vVar.f364156b = true;
                boolean z19 = i0Var.f293868d;
                vVar.f364155a = z19 ? 66 : 65;
                vVar.A = z19 ? 1 : 0;
                com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
                if (q6Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiPanelClickListener", "emoticon page service not found");
                    return;
                }
                if (a17 != null) {
                    context2 = a17;
                }
                ((com.tencent.mm.feature.emoji.h4) q6Var).wi(context2, vVar);
                return;
            }
            return;
        }
        if (i19 == 3) {
            int i28 = ((ir.z) u0Var).f293921b;
            if (i28 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11594, 1);
                android.content.Intent intent = new android.content.Intent();
                if (context2 instanceof com.tencent.mm.ui.xb) {
                    context2 = ((com.tencent.mm.ui.xb) context2).getBaseContext();
                }
                intent.putExtra("key_from_scene", 1);
                j45.l.j(context2, "emoji", ".ui.EmojiCustomUI", intent, null);
                return;
            }
            if (i28 == 1 && ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().p()) {
                int i29 = this.f320572h;
                int i37 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                if (i29 == 1) {
                    r10 = 3;
                } else if (i29 == 2) {
                    r10 = 4;
                } else if (i29 == 3) {
                    r10 = 5;
                }
                o22.i.b(context2, r10, this.f320570f);
                return;
            }
            return;
        }
        if (i19 != 6) {
            if (i19 != 7) {
                if (i19 == 10 && (aVar = this.f320571g) != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            if (((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().p()) {
                int i38 = this.f320572h;
                int i39 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                if (i38 == 1) {
                    r10 = 3;
                } else if (i38 == 2) {
                    r10 = 4;
                } else if (i38 == 3) {
                    r10 = 5;
                }
                o22.i.b(context2, r10, this.f320570f);
                return;
            }
            return;
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = ((ir.g) u0Var).f293836b;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelClickListener", "penn send capture emoji click emoji: %s status: %d.", iEmojiInfo3.getMd5(), java.lang.Integer.valueOf(iEmojiInfo3.p0()));
        qk.x6 m17 = iEmojiInfo3.m1();
        int i47 = m17 == null ? -1 : lr.h.f320524a[m17.ordinal()];
        if (i47 == 1) {
            com.tencent.mm.pluginsdk.ui.chat.v9 v9Var2 = this.f320568d;
            if (v9Var2 != null) {
                v9Var2.b(iEmojiInfo3);
            }
            iEmojiInfo3.getMd5();
            return;
        }
        if (i47 == 2 || i47 == 3) {
            db5.e1.T(context2, context2.getString(com.tencent.mm.R.string.f491086bv2));
            return;
        }
        if (i47 == 4) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context2);
            u1Var.g(context2.getString(com.tencent.mm.R.string.bux));
            u1Var.m(com.tencent.mm.R.string.c0h);
            u1Var.k(context.getResources().getColor(com.tencent.mm.R.color.f479482a31));
            u1Var.b(new lr.i(iEmojiInfo3));
            u1Var.q(false);
            return;
        }
        if (i47 != 5) {
            return;
        }
        qk.y6 y17 = iEmojiInfo3.y1();
        y17.ordinal();
        switch (y17.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
                com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(context2);
                u1Var2.g(context2.getString(com.tencent.mm.R.string.f491085bv1));
                u1Var2.m(com.tencent.mm.R.string.buz);
                u1Var2.b(new lr.j(this, context2, iEmojiInfo3));
                u1Var2.q(false);
                return;
            case 5:
                gr.v vVar2 = gr.v.f274696a;
                vVar2.a(false);
                if (vVar2.b().getBoolean("capture_full", false)) {
                    com.tencent.mm.ui.widget.dialog.u1 u1Var3 = new com.tencent.mm.ui.widget.dialog.u1(context2);
                    u1Var3.g(context2.getString(com.tencent.mm.R.string.c0g));
                    u1Var3.n(context2.getString(com.tencent.mm.R.string.byz));
                    u1Var3.b(new lr.k(context2));
                    u1Var3.q(false);
                    return;
                }
                com.tencent.mm.ui.widget.dialog.u1 u1Var4 = new com.tencent.mm.ui.widget.dialog.u1(context2);
                u1Var4.g(context2.getString(com.tencent.mm.R.string.f491085bv1));
                u1Var4.m(com.tencent.mm.R.string.buz);
                u1Var4.b(new lr.l(this, context2, iEmojiInfo3));
                u1Var4.q(false);
                return;
            case 6:
                com.tencent.mm.ui.widget.dialog.u1 u1Var5 = new com.tencent.mm.ui.widget.dialog.u1(context2);
                u1Var5.g(context2.getString(com.tencent.mm.R.string.f491085bv1));
                u1Var5.m(com.tencent.mm.R.string.buz);
                u1Var5.b(new lr.m(this, context2, iEmojiInfo3));
                u1Var5.q(false);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
                if (qk.y6.ERR_LOCAL_FILE == iEmojiInfo3.y1()) {
                    string = context2.getString(com.tencent.mm.R.string.bux);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else if (qk.y6.ERR_OVER_SIZE == iEmojiInfo3.y1()) {
                    string = context2.getString(com.tencent.mm.R.string.bvl);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else if (qk.y6.ERR_SPAM == iEmojiInfo3.y1()) {
                    string = context2.getString(com.tencent.mm.R.string.f491084bv0);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    string = context2.getString(com.tencent.mm.R.string.buy);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
                com.tencent.mm.ui.widget.dialog.u1 u1Var6 = new com.tencent.mm.ui.widget.dialog.u1(context2);
                u1Var6.g(string);
                u1Var6.m(com.tencent.mm.R.string.c0h);
                u1Var6.k(context.getResources().getColor(com.tencent.mm.R.color.f479482a31));
                u1Var6.b(new lr.n(iEmojiInfo3));
                u1Var6.q(false);
                return;
            default:
                com.tencent.mm.ui.widget.dialog.u1 u1Var7 = new com.tencent.mm.ui.widget.dialog.u1(context2);
                u1Var7.g(context2.getString(com.tencent.mm.R.string.f491085bv1));
                u1Var7.m(com.tencent.mm.R.string.buz);
                u1Var7.b(new lr.o(this, context2, iEmojiInfo3));
                u1Var7.q(false);
                return;
        }
    }

    public /* synthetic */ p(int i17, nr.j jVar, nr.c cVar, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : jVar, (i18 & 4) != 0 ? null : cVar);
    }
}
