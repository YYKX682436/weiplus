package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class n9 {

    /* renamed from: t, reason: collision with root package name */
    public static jz5.l f202017t;

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f202018a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f202021d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f202022e;

    /* renamed from: f, reason: collision with root package name */
    public b12.o f202023f;

    /* renamed from: g, reason: collision with root package name */
    public b12.j f202024g;

    /* renamed from: h, reason: collision with root package name */
    public b12.g f202025h;

    /* renamed from: m, reason: collision with root package name */
    public f21.g f202030m;

    /* renamed from: n, reason: collision with root package name */
    public oq.e f202031n;

    /* renamed from: o, reason: collision with root package name */
    public f21.e f202032o;

    /* renamed from: p, reason: collision with root package name */
    public jh5.a f202033p;

    /* renamed from: q, reason: collision with root package name */
    public d12.b f202034q;

    /* renamed from: r, reason: collision with root package name */
    public jh5.b f202035r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f202036s;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChattingAnimFrame f202019b = null;

    /* renamed from: c, reason: collision with root package name */
    public kh5.h f202020c = null;

    /* renamed from: i, reason: collision with root package name */
    public int f202026i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f202027j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f202028k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final kh5.a f202029l = new com.tencent.mm.ui.chatting.o9(this);

    public n9() {
        jh5.a aVar = jh5.a.f299861e;
        this.f202033p = jh5.a.f299861e;
        this.f202036s = false;
    }

    public static void a(com.tencent.mm.ui.chatting.n9 n9Var, d12.b bVar, f21.e eVar, android.app.Activity context, boolean z17) {
        n9Var.getClass();
        if (eVar == null) {
            return;
        }
        int i17 = eVar.f258881q;
        if (i17 == 3) {
            if (bVar == null) {
                return;
            }
            int i18 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String keyword = bVar.f225715a;
            kotlin.jvm.internal.o.g(keyword, "keyword");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("keyword", keyword);
            bundle.putString("trace_id", bVar.f225716b);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, bVar.f225717c);
            bundle.putString("egg_name", eVar.f258872e);
            bundle.putString("background", eVar.f258879o.f258859n);
            bundle.putBoolean("is_chat_room", z17);
            intent.putExtras(bundle);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/EggMgr", "onLuckyClick", "(Lcom/tencent/mm/plugin/eggspring/model/LuckyBagInfo;Lcom/tencent/mm/modelpackage/EggInfo;Landroid/app/Activity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/chatting/EggMgr", "onLuckyClick", "(Lcom/tencent/mm/plugin/eggspring/model/LuckyBagInfo;Lcom/tencent/mm/modelpackage/EggInfo;Landroid/app/Activity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 == 2) {
            f21.d dVar = eVar.f258882r;
            if (dVar == null) {
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(dVar.f258851h)) {
                q80.d0 d0Var = new q80.d0(eVar.f258882r.f258851h);
                d0Var.f360671w = 3000L;
                d0Var.f360664p = com.tencent.mm.R.anim.f477857df;
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new com.tencent.mm.ui.chatting.q9(n9Var, d0Var, context));
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.f258882r.f258849f)) {
                return;
            }
            java.lang.String str = eVar.f258882r.f258849f;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str);
            intent2.putExtra("from_shortcut", true);
            intent2.putExtra("disable_minimize", true);
            intent2.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
            intent2.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent2, 3001);
            context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            return;
        }
        if (i17 == 4) {
            if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f225720f)) {
                return;
            }
            java.lang.String str2 = bVar.f225720f;
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", str2);
            intent3.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
            intent3.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent3, 3001);
            context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            return;
        }
        if (i17 == 5) {
            java.lang.String str3 = eVar.f258886v.f258905e;
            e30.e eVar2 = (e30.e) i95.n0.c(e30.e.class);
            java.lang.String str4 = n9Var.f202025h.f17051f;
            d30.a aVar = (d30.a) eVar2;
            aVar.getClass();
            l81.b1 b1Var = new l81.b1();
            b1Var.f317012a = str3;
            boolean z18 = 1 == bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Egg_PreviewMiniApp_Int, 0);
            b1Var.f317032k = 1189;
            if (z18) {
                b1Var.f317016c = 2;
            } else {
                b1Var.f317016c = 0;
            }
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                b1Var.f317028i = new d30.d(aVar, str4);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "goMiniApp username:%s", str3);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.ui.chatting.m9 b(java.lang.String r8, f21.g r9, oq.e r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.n9.b(java.lang.String, f21.g, oq.e):com.tencent.mm.ui.chatting.m9");
    }

    public static boolean d(f21.e eVar) {
        if (eVar == null) {
            return false;
        }
        int i17 = eVar.f258881q;
        return i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5;
    }

    public final void c(final f21.e eVar, java.lang.String keyword) {
        int i17;
        if (eVar == null || com.tencent.mm.sdk.platformtools.t8.K0(keyword)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(eVar != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.EggMgr", "egg info or keyWord err!!! info != null:[%s].", objArr);
            return;
        }
        b12.k.f17060a.b(2, b12.k.f17067h, "");
        if (d(eVar)) {
            int i18 = eVar.f258881q;
            if (i18 == 3) {
                if (this.f202023f == null) {
                    this.f202023f = new b12.o();
                }
                b12.o oVar = this.f202023f;
                oVar.f17084e = new yz5.l() { // from class: com.tencent.mm.ui.chatting.n9$$a
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        d12.b bVar = (d12.b) obj;
                        com.tencent.mm.ui.chatting.n9 n9Var = com.tencent.mm.ui.chatting.n9.this;
                        n9Var.getClass();
                        f21.e eVar2 = eVar;
                        if (eVar2.f258879o.f258869x == null && eVar2.f258884t != 1) {
                            return null;
                        }
                        n9Var.f(eVar2, bVar);
                        return null;
                    }
                };
                oVar.f17085f = new com.tencent.mm.ui.chatting.n9$$b();
                java.lang.String str = eVar.f258879o.f258852d;
                kotlin.jvm.internal.o.g(keyword, "keyword");
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggHelper", "start check egg: appId=" + str + ", keyword=" + keyword + " lastCheckTime： " + oVar.f17082c + " now: " + elapsedRealtime);
                long j17 = oVar.f17082c;
                if (j17 > 0 && (i17 = oVar.f17083d) > 0) {
                    long j18 = elapsedRealtime - j17;
                    if (j18 < i17 * 1000) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggHelper", "The check is too frequent, interval=" + oVar.f17083d + ", delta=" + j18);
                        yz5.l lVar = oVar.f17085f;
                        if (lVar != null) {
                            lVar.invoke(b12.l.f17069e);
                            return;
                        }
                        return;
                    }
                }
                oVar.f17082c = elapsedRealtime;
                kotlinx.coroutines.r2 r2Var = oVar.f17081b;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                oVar.f17081b = kotlinx.coroutines.l.d(oVar.f17080a, null, null, new b12.n(oVar, keyword, str, null), 3, null);
                return;
            }
            if (i18 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "initLuckyBagOrNot: game lucky egg %s", eVar.f258882r.f258847d);
                com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202019b;
                if (chattingAnimFrame != null) {
                    chattingAnimFrame.post(new com.tencent.mm.ui.chatting.r9(this, eVar));
                    ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
                    return;
                }
                return;
            }
            if (i18 == 4) {
                if (this.f202024g == null) {
                    this.f202024g = new b12.j();
                }
                b12.j jVar = this.f202024g;
                jVar.f17059e = new com.tencent.mm.ui.chatting.s9(this, eVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: ");
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                if (android.os.SystemClock.elapsedRealtime() - jVar.f17057c <= jVar.f17058d) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: " + jVar.f17057c + ", " + jVar.f17058d + ", " + elapsedRealtime2);
                    return;
                }
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_egg_red_envelope_percent, 100);
                int d17 = c06.e.f37716d.d(100);
                com.tencent.mars.xlog.Log.i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: percent " + Ni + ", " + d17);
                if (d17 >= Ni) {
                    return;
                }
                jVar.f17057c = elapsedRealtime2;
                kotlinx.coroutines.r2 r2Var2 = jVar.f17056b;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                jVar.f17056b = kotlinx.coroutines.l.d(jVar.f17055a, null, null, new b12.i(jVar, null), 3, null);
                return;
            }
            if (i18 == 5) {
                if (this.f202025h == null) {
                    this.f202025h = new b12.g();
                }
                b12.g gVar = this.f202025h;
                gVar.f17050e = new com.tencent.mm.ui.chatting.t9(this, eVar);
                java.lang.Long l17 = b12.k.f17064e;
                com.tencent.mars.xlog.Log.i("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + l17);
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                if (android.os.SystemClock.elapsedRealtime() - gVar.f17048c <= gVar.f17049d) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + gVar.f17048c + ", " + gVar.f17049d + ", " + elapsedRealtime3);
                    return;
                }
                ((d30.a) ((e30.e) i95.n0.c(e30.e.class))).getClass();
                int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmoticonLuckyBagProb", 100);
                int nextInt = new java.util.Random().nextInt(100);
                com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "enablePlayLuckyEffect config:%d, random:%d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(nextInt));
                if (nextInt < b17) {
                    gVar.f17048c = elapsedRealtime3;
                    kotlinx.coroutines.r2 r2Var3 = gVar.f17047b;
                    if (r2Var3 != null) {
                        kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
                    }
                    gVar.f17047b = kotlinx.coroutines.l.d(gVar.f17046a, null, null, new b12.f(gVar, l17, null), 3, null);
                }
            }
        }
    }

    public final boolean e() {
        f21.e eVar = this.f202032o;
        if (eVar == null || eVar.f258881q <= 0) {
            return true;
        }
        if (!(this.f202036s || this.f202027j)) {
            com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202019b;
            if (!(chattingAnimFrame.R != null && (chattingAnimFrame.f198192f > 0 || chattingAnimFrame.Q))) {
                return true;
            }
        }
        return false;
    }

    public final void f(f21.e eVar, d12.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "playLuckyEffect: ");
        int i17 = eVar.f258884t;
        b12.k kVar = b12.k.f17060a;
        if (i17 == 1) {
            this.f202034q = bVar;
            kVar.b(3, b12.k.f17067h, "");
            g(this.f202035r, true, this.f202033p, false);
            return;
        }
        if (e()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EggMgr", "lucky anim is not playing, ignore");
            return;
        }
        this.f202034q = bVar;
        this.f202019b.b();
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202019b;
        chattingAnimFrame.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "showLuckyBag: ");
        if (chattingAnimFrame.f198204u == null || chattingAnimFrame.M == null || chattingAnimFrame.Q) {
            return;
        }
        kVar.b(3, b12.k.f17067h, "");
        chattingAnimFrame.Q = true;
        chattingAnimFrame.S = bVar;
        chattingAnimFrame.f198190d.addView(chattingAnimFrame.f198204u);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "lucky bag start anim!!!");
        chattingAnimFrame.M.start();
        chattingAnimFrame.f198204u.x();
    }

    public final void g(jh5.b bVar, boolean z17, jh5.a aVar, boolean z18) {
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EggMgr", "meta is null");
            return;
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EggMgr", "extData is null");
            return;
        }
        jh5.a aVar2 = z17 ? new jh5.a("", 0L, aVar.f299864c) : new jh5.a(aVar.f299862a, aVar.f299863b, aVar.f299864c, z18);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
        java.lang.String a17 = aVar.a();
        java.lang.String eggKey = bVar.f299867a;
        java.lang.String eggId = bVar.f299868b;
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "playMagicEgg: eggKey:%s, eggId:%s, clickable:%s, isContinue:%s, extInfo:%s", eggKey, eggId, valueOf, valueOf2, a17);
        kh5.h hVar = this.f202020c;
        if (hVar != null) {
            hVar.getClass();
            if (!kotlin.jvm.internal.o.b(hVar.f308077q, jh5.b.f299866d) && !kotlin.jvm.internal.o.b(hVar.f308077q, bVar)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MEChattingMgr", "[ME]: markMagicEgg trying to override eggMeta");
                hVar.X0(hVar.f308077q, 2);
            }
            if (!kotlin.jvm.internal.o.b(hVar.f308077q, bVar)) {
                hVar.prepare();
                hVar.f308077q = bVar;
            }
            kotlin.jvm.internal.o.g(eggKey, "eggKey");
            kotlin.jvm.internal.o.g(eggId, "eggId");
            java.lang.String sceneId = bVar.f299869c;
            kotlin.jvm.internal.o.g(sceneId, "sceneId");
            com.tencent.mm.autogen.mmdata.rpt.MagicEmojiEasterEggReportStruct magicEmojiEasterEggReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicEmojiEasterEggReportStruct();
            magicEmojiEasterEggReportStruct.f59086e = magicEmojiEasterEggReportStruct.b("sessionid", eggId, true);
            magicEmojiEasterEggReportStruct.f59088g = magicEmojiEasterEggReportStruct.b("chatid", sceneId, true);
            magicEmojiEasterEggReportStruct.f59089h = magicEmojiEasterEggReportStruct.b("activityid", eggKey, true);
            magicEmojiEasterEggReportStruct.f59087f = 5;
            magicEmojiEasterEggReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME]: markMagicEgg: " + bVar + ' ' + z17 + ' ' + aVar2);
            java.util.ArrayList arrayList = hVar.f308079s;
            if (!arrayList.isEmpty()) {
                arrayList.add(new kh5.c(java.lang.System.currentTimeMillis(), z17, aVar2));
                return;
            }
            if (z17) {
                hVar.m1(hVar.f308077q, true, aVar2);
                return;
            }
            if (((java.lang.Boolean) hVar.f308074n.invoke(java.lang.Long.valueOf(aVar2.f299863b))).booleanValue()) {
                hVar.m1(hVar.f308077q, false, aVar2);
            } else {
                arrayList.add(new kh5.c(java.lang.System.currentTimeMillis(), false, aVar2));
            }
        }
    }

    public void h() {
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202019b;
        if (chattingAnimFrame != null) {
            chattingAnimFrame.e();
        }
        b12.o oVar = this.f202023f;
        if (oVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispose: job is running: ");
            kotlinx.coroutines.r2 r2Var = oVar.f17081b;
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggHelper", sb6.toString());
            kotlinx.coroutines.r2 r2Var2 = oVar.f17081b;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            oVar.f17081b = null;
        }
        b12.j jVar = this.f202024g;
        if (jVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dispose: ");
            kotlinx.coroutines.r2 r2Var3 = jVar.f17056b;
            sb7.append(r2Var3 != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var3).a()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.EggRedEnvelopeHelper", sb7.toString());
            kotlinx.coroutines.r2 r2Var4 = jVar.f17056b;
            if (r2Var4 != null) {
                kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
            }
            jVar.f17056b = null;
            jVar.f17059e = null;
        }
        this.f202036s = false;
        jh5.a aVar = jh5.a.f299861e;
        this.f202033p = jh5.a.f299861e;
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "egg has been stop, %s", this.f202019b);
    }
}
