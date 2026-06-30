package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151401e;

    public r2(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        this.f151400d = appCompatActivity;
        this.f151401e = musicMvMainUIC;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        r45.cs4 cs4Var;
        jz5.f0 f0Var;
        com.tencent.mm.protobuf.f fVar;
        r45.yr4 yr4Var;
        r45.yr4 yr4Var2;
        r45.yr4 yr4Var3;
        r45.yr4 yr4Var4;
        r45.pr4 pr4Var;
        fm3.u uVar;
        java.util.LinkedList linkedList;
        r45.es4 es4Var;
        int i19;
        if ((m1Var instanceof hm3.a) && (i19 = ((hm3.a) m1Var).f282222d) != 0 && i19 != this.f151400d.hashCode()) {
            com.tencent.mars.xlog.Log.i(this.f151401e.f150974d, "not the same page of netscene");
            return;
        }
        pf5.u uVar2 = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar2.c(this.f151400d).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        if (m1Var instanceof hm3.p) {
            if (i17 == 0 && i18 == 0 && (es4Var = ((hm3.p) m1Var).f282279o) != null) {
                this.f151401e.W6(es4Var);
            }
            this.f151401e.f150988u = true;
            return;
        }
        int i27 = 6;
        if (m1Var instanceof hm3.q) {
            if (i17 == 0 && i18 == 0) {
                r45.gs4 gs4Var = ((hm3.q) m1Var).f282283o;
                if (gs4Var != null) {
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151401e;
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f151400d;
                    java.lang.String str3 = gs4Var.f375513d;
                    if (str3 != null) {
                        if (!((str3.length() > 0) && android.text.TextUtils.isEmpty(n0Var.f151310i.getString(6)))) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            n0Var.f151310i.set(6, str3);
                        }
                    }
                    java.lang.String str4 = gs4Var.f375514e;
                    if (str4 != null) {
                        if (!(str4.length() > 0)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            n0Var.f151310i.set(7, str4);
                        }
                    }
                    java.lang.String str5 = gs4Var.f375515f;
                    if (str5 != null) {
                        if (!(str5.length() > 0)) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            n0Var.f151310i.set(8, str5);
                        }
                    }
                    java.lang.String str6 = gs4Var.f375516g;
                    if (str6 != null) {
                        if (!(str6.length() > 0)) {
                            str6 = null;
                        }
                        if (str6 != null) {
                            n0Var.f151310i.set(9, str6);
                        }
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(gs4Var.f375518i);
                    if (!(valueOf.longValue() > 0)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        n0Var.f151310i.set(11, java.lang.Long.valueOf(valueOf.longValue()));
                    }
                    java.lang.String str7 = gs4Var.f375519m;
                    if (str7 != null) {
                        if (!(str7.length() > 0)) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            n0Var.f151310i.set(16, str7);
                        }
                    }
                    t45.n0 n0Var2 = gs4Var.f375520n;
                    if (n0Var2 != null) {
                        n0Var.f151320v = n0Var2;
                    }
                    r45.at4 at4Var = gs4Var.f375521o;
                    if (at4Var != null) {
                        n0Var.f151322x = at4Var;
                    }
                    java.lang.String str8 = musicMvMainUIC.f150974d;
                    jm3.h1.f300322a.c(n0Var.f151310i);
                    java.lang.String str9 = musicMvMainUIC.f150974d;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resp.musician finder_username:");
                    r45.at4 at4Var2 = gs4Var.f375521o;
                    sb6.append(at4Var2 != null ? at4Var2.f370255d : null);
                    sb6.append(" jumpType:");
                    r45.at4 at4Var3 = gs4Var.f375521o;
                    sb6.append(at4Var3 != null ? java.lang.Integer.valueOf(at4Var3.f370257f) : null);
                    com.tencent.mars.xlog.Log.i(str9, sb6.toString());
                    com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150975e, "get lyric from SongStatus " + gs4Var.f375513d);
                    n0Var.S6();
                    ((com.tencent.mm.plugin.mv.ui.uic.s1) uVar2.c(appCompatActivity).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).V6(n0Var.f151310i, n0Var.f151311m, false);
                    n0Var.T6();
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.mv.ui.uic.p2(appCompatActivity, gs4Var));
                }
                fm3.j0.f264078a.i(this.f151400d, n0Var.f151310i, n0Var.f151309h, n0Var.Q6(), n0Var.O6(), n0Var.P6());
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.m) {
            if (i17 == 0 && i18 == 0) {
                hm3.m mVar = (hm3.m) m1Var;
                r45.h51 h51Var = mVar.f282269r;
                if (h51Var != null) {
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.P6(this.f151401e, h51Var, mVar.f282265n);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC2 = this.f151401e;
            java.util.Iterator it = musicMvMainUIC2.f150977g.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                lm3.e eVar = (lm3.e) next;
                if (eVar.f319482d.hashCode() == ((hm3.m) m1Var).f282265n) {
                    fm3.u mv6 = eVar.f319482d;
                    kotlin.jvm.internal.o.g(mv6, "mv");
                    mv6.f264138r = true;
                    mv6.f264130j = null;
                    mv6.f264129i = null;
                    mv6.f264127g.clear();
                    mv6.f264131k = 0;
                    mv6.f264132l = 0;
                    mv6.f264133m = 0;
                    mv6.f264134n = false;
                    mv6.f264137q = null;
                    mv6.f264140t = null;
                    mv6.f264141u.clear();
                    com.tencent.mars.xlog.Log.i(musicMvMainUIC2.f150974d, "notifyItemChanged5:" + i28);
                    musicMvMainUIC2.T6().notifyItemChanged(i28, "NetSceneMusicMvGetFinderFeedDetail_fail");
                    musicMvMainUIC2.a7(eVar.f319482d);
                }
                i28 = i29;
            }
            return;
        }
        if (m1Var instanceof hm3.j) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC3 = this.f151401e;
                musicMvMainUIC3.f150987t = true;
                java.lang.String str10 = musicMvMainUIC3.f150974d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSceneEnd MusicLiveGetBeatTrack songId:");
                hm3.j jVar = (hm3.j) m1Var;
                sb7.append(jVar.f282251i.getString(5));
                sb7.append(" trackPoint:");
                r45.tr4 tr4Var = jVar.f282256q;
                sb7.append(tr4Var != null ? tr4Var.f386745d : null);
                sb7.append(" flexSize:");
                r45.tr4 tr4Var2 = jVar.f282256q;
                sb7.append((tr4Var2 == null || (linkedList = tr4Var2.f386746e) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
                com.tencent.mars.xlog.Log.i(str10, sb7.toString());
                int i37 = jVar.f282252m;
                r45.tr4 tr4Var3 = jVar.f282256q;
                if (tr4Var3 != null) {
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC4 = this.f151401e;
                    n0Var.f151319u = tr4Var3.f386746e.size();
                    java.util.Iterator it6 = musicMvMainUIC4.f150977g.iterator();
                    int i38 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i38 = -1;
                            uVar = null;
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        lm3.e eVar2 = (lm3.e) next2;
                        if (eVar2.f319482d.hashCode() == jVar.f282253n) {
                            uVar = eVar2.f319482d;
                            break;
                        }
                        i38 = i39;
                    }
                    if (uVar != null) {
                        if (!(i38 >= 0 && uVar.f264127g.isEmpty())) {
                            uVar = null;
                        }
                        if (uVar != null) {
                            java.util.LinkedList<java.lang.Integer> break_point_ms = tr4Var3.f386745d;
                            kotlin.jvm.internal.o.f(break_point_ms, "break_point_ms");
                            int i47 = 0;
                            for (java.lang.Integer num : break_point_ms) {
                                r45.jf2 jf2Var = new r45.jf2();
                                jf2Var.set(2, 0L);
                                jf2Var.set(3, "");
                                jf2Var.set(0, java.lang.Long.valueOf(i47));
                                jf2Var.set(1, java.lang.Integer.valueOf(num.intValue() - i47));
                                jf2Var.set(4, 0L);
                                uVar.f264127g.add(jf2Var);
                                i47 = num.intValue();
                            }
                            if (i47 < i37) {
                                r45.jf2 jf2Var2 = new r45.jf2();
                                jf2Var2.set(2, 0L);
                                jf2Var2.set(3, "");
                                jf2Var2.set(0, java.lang.Long.valueOf(i47));
                                jf2Var2.set(1, java.lang.Integer.valueOf(i37 - i47));
                                jf2Var2.set(4, 0L);
                                uVar.f264127g.add(jf2Var2);
                            }
                        }
                    }
                    if (musicMvMainUIC4.f150988u) {
                        com.tencent.mars.xlog.Log.i(musicMvMainUIC4.f150974d, "get beat track notify");
                        com.tencent.mars.xlog.Log.i(musicMvMainUIC4.f150974d, "notifyItemChanged6:" + i38);
                        musicMvMainUIC4.T6().notifyItemChanged(i38, "NetSceneMusicMvGetBeatTrack");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.g) {
            if (i17 == 0 && i18 == 0 && (pr4Var = ((hm3.g) m1Var).f282245o) != null) {
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC5 = this.f151401e;
                n0Var.f151313o = pr4Var.f383328d;
                n0Var.f151310i.set(5, pr4Var.f383330f);
                n0Var.f151314p = pr4Var.f383329e;
                java.lang.String str11 = pr4Var.f383331g;
                if (str11 == null) {
                    str11 = "";
                }
                n0Var.A = str11;
                java.lang.String str12 = pr4Var.f383332h;
                n0Var.B = str12 != null ? str12 : "";
                musicMvMainUIC5.F = true;
                musicMvMainUIC5.V6();
                com.tencent.mars.xlog.Log.i(musicMvMainUIC5.f150974d, "NetSceneMusicMvCheckPermission songId:" + pr4Var.f383330f + " mvPostPermissionBit:" + pr4Var.f383328d + " statusVerifyInfo:" + pr4Var.f383329e);
                return;
            }
            return;
        }
        boolean z17 = m1Var instanceof hm3.o;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                hm3.o oVar = z17 ? (hm3.o) m1Var : null;
                java.lang.String str13 = (oVar == null || (yr4Var4 = oVar.f282275n) == null) ? null : yr4Var4.f391324d;
                hm3.o oVar2 = z17 ? (hm3.o) m1Var : null;
                java.lang.String str14 = (oVar2 == null || (yr4Var3 = oVar2.f282275n) == null) ? null : yr4Var3.f391325e;
                hm3.o oVar3 = z17 ? (hm3.o) m1Var : null;
                java.lang.String str15 = (oVar3 == null || (yr4Var2 = oVar3.f282275n) == null) ? null : yr4Var2.f391326f;
                hm3.o oVar4 = z17 ? (hm3.o) m1Var : null;
                java.lang.String str16 = (oVar4 == null || (yr4Var = oVar4.f282275n) == null) ? null : yr4Var.f391327g;
                com.tencent.mars.xlog.Log.i(this.f151401e.f150974d, "get ticket token:%s, scheme:%s, description:%s, confirmText:%s", str13, str14, str15, str16);
                androidx.lifecycle.c1 a18 = uVar2.c(this.f151400d).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.n0 n0Var3 = (com.tencent.mm.plugin.mv.ui.uic.n0) a18;
                androidx.lifecycle.c1 a19 = uVar2.c(this.f151400d).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class);
                kotlin.jvm.internal.o.f(a19, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC) a19;
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC6 = this.f151401e;
                lm3.e eVar3 = (lm3.e) kz5.n0.a0(musicMvMainUIC6.f150977g, musicMvMainUIC6.f150982o);
                fm3.u uVar3 = eVar3 != null ? eVar3.f319482d : null;
                ka0.q0 q0Var = (ka0.q0) i95.n0.c(ka0.q0.class);
                android.app.Activity context = this.f151401e.getContext();
                b21.r b17 = b21.m.b();
                kotlin.jvm.internal.o.f(b17, "getMusicWrapper(...)");
                ((ja0.m0) q0Var).wi(context, str13, str14, str15, str16, b17, musicMvSongInfoUIC.f150999d, new com.tencent.mm.plugin.mv.ui.uic.q2(musicMvSongInfoUIC, uVar3, this.f151401e, n0Var3));
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.f) {
            if (i17 == 0 && i18 == 0) {
                b21.r b18 = b21.m.b();
                com.tencent.mm.modelbase.o oVar5 = ((hm3.f) m1Var).f282241e;
                java.util.LinkedList linkedList2 = (oVar5 == null || (fVar = oVar5.f70711b.f70700a) == null) ? null : ((r45.bs4) fVar).f371024d;
                androidx.lifecycle.c1 a27 = uVar2.c(this.f151400d).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class);
                kotlin.jvm.internal.o.f(a27, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC2 = (com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC) a27;
                androidx.lifecycle.c1 a28 = uVar2.c(this.f151400d).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                kotlin.jvm.internal.o.f(a28, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.n0 n0Var4 = (com.tencent.mm.plugin.mv.ui.uic.n0) a28;
                if (linkedList2 == null || (cs4Var = (r45.cs4) linkedList2.get(0)) == null) {
                    return;
                }
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC7 = this.f151401e;
                androidx.appcompat.app.AppCompatActivity appCompatActivity2 = this.f151400d;
                if (cs4Var.f371808d != 0) {
                    com.tencent.mars.xlog.Log.e(musicMvMainUIC7.f150974d, "errCode:" + cs4Var.f371808d + ", errMsg:" + cs4Var.f371809e);
                    return;
                }
                if (cs4Var.f371810f != null) {
                    if (cs4Var.f371812h == 1 && musicMvSongInfoUIC2.f151002g) {
                        ((ja0.i0) ((ka0.o0) i95.n0.c(ka0.o0.class))).getClass();
                        ml3.c.f328399a.a(linkedList2);
                        n0Var4.f151310i.set(6, cs4Var.f371814m);
                        b18.Q = cs4Var.f371811g;
                        b21.m.i(b18);
                        n0Var4.S6();
                        ((com.tencent.mm.plugin.mv.ui.uic.s1) uVar2.c(appCompatActivity2).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).V6(n0Var4.f151310i, n0Var4.f151311m, false);
                        android.view.View view = musicMvSongInfoUIC2.f151003h;
                        if (view != null) {
                            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ojy);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "hideTryListenIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "hideTryListenIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        musicMvSongInfoUIC2.f151002g = false;
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e(musicMvMainUIC7.f150974d, "linkInfo.info is null");
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.e) {
            if (i17 == 0 && i18 == 0) {
                androidx.appcompat.app.AppCompatActivity appCompatActivity3 = this.f151400d;
                com.tencent.mm.protobuf.f fVar2 = ((hm3.e) m1Var).f282238m.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetInteractionInfoResp");
                r45.vr4 vr4Var = (r45.vr4) fVar2;
                androidx.lifecycle.c1 a29 = uVar2.c(appCompatActivity3).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                kotlin.jvm.internal.o.f(a29, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.n0 n0Var5 = (com.tencent.mm.plugin.mv.ui.uic.n0) a29;
                n0Var5.C = vr4Var.f388464d;
                n0Var5.D = vr4Var.f388467g;
                this.f151401e.T6().notifyItemChanged(0, "UniComponent");
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.d) {
            if (i17 == 0 && i18 == 0) {
                androidx.appcompat.app.AppCompatActivity appCompatActivity4 = this.f151400d;
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC8 = this.f151401e;
                hm3.d dVar = (hm3.d) m1Var;
                com.tencent.mm.protobuf.f fVar3 = dVar.f282236f.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemResponse");
                s45.f fVar4 = (s45.f) fVar3;
                androidx.lifecycle.c1 a37 = uVar2.c(appCompatActivity4).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                kotlin.jvm.internal.o.f(a37, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.n0 n0Var6 = (com.tencent.mm.plugin.mv.ui.uic.n0) a37;
                n0Var6.F.clear();
                n0Var6.G.clear();
                java.util.LinkedList linkedList3 = fVar4.f402979d;
                if (linkedList3 == null || linkedList3.size() <= 0) {
                    com.tencent.mars.xlog.Log.e(musicMvMainUIC8.f150974d, "NetSceneMMListenItem music results is empty");
                    return;
                }
                java.util.LinkedList<s45.h> results = fVar4.f402979d;
                kotlin.jvm.internal.o.f(results, "results");
                for (s45.h hVar : results) {
                    if (hVar != null && (str2 = hVar.f403000d) != null) {
                        n0Var6.F.add(str2);
                        com.tencent.mars.xlog.Log.i(musicMvMainUIC8.f150974d, "NetSceneMMListenItem tingIds:" + hVar.f403000d);
                    }
                }
                if (n0Var6.F.size() <= 0) {
                    com.tencent.mars.xlog.Log.e(musicMvMainUIC8.f150974d, "NetSceneMMListenItem tingIds is empty, don't getMusicStory");
                    return;
                }
                java.util.LinkedList linkedList4 = n0Var6.F;
                java.lang.String str17 = dVar.f282234d;
                musicMvMainUIC8.getClass();
                com.tencent.mars.xlog.Log.i(musicMvMainUIC8.f150974d, "getMusicStory ids size:", java.lang.Integer.valueOf(linkedList4.size()));
                androidx.appcompat.app.AppCompatActivity activity = musicMvMainUIC8.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                androidx.lifecycle.c1 a38 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                kotlin.jvm.internal.o.f(a38, "get(...)");
                gm0.j1.d().g(new hm3.c(linkedList4, 1, ((com.tencent.mm.plugin.mv.ui.uic.n0) a38).f151310i.getString(18), str17));
                return;
            }
            return;
        }
        if ((m1Var instanceof hm3.c) && i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC9 = this.f151401e;
            androidx.appcompat.app.AppCompatActivity activity2 = this.f151400d;
            hm3.c cVar = (hm3.c) m1Var;
            com.tencent.mm.protobuf.f fVar5 = cVar.f282232f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricResponse");
            com.tencent.mars.xlog.Log.i(musicMvMainUIC9.f150974d, "NetSceneMMListenGetLyric get music listen lyric callback");
            java.util.LinkedList linkedList5 = ((s45.d) fVar5).f402974d;
            if (linkedList5 != null) {
                int i48 = 0;
                for (java.lang.Object obj : linkedList5) {
                    int i49 = i48 + 1;
                    if (i48 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    s45.a aVar = (s45.a) obj;
                    com.tencent.mars.xlog.Log.i(musicMvMainUIC9.f150974d, "getLyricRespItem.lyric:%s", aVar.f402965d);
                    if (aVar.f402965d != null) {
                        kotlin.jvm.internal.o.g(activity2, "activity");
                        pf5.z zVar = pf5.z.f353948a;
                        androidx.lifecycle.c1 a39 = zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                        kotlin.jvm.internal.o.f(a39, "get(...)");
                        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var7 = (com.tencent.mm.plugin.mv.ui.uic.n0) a39;
                        n0Var7.f151310i.set(i27, aVar.f402965d);
                        n0Var7.S6();
                        n0Var7.f151312n = false;
                        ((com.tencent.mm.plugin.mv.ui.uic.s1) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).V6(n0Var7.f151310i, n0Var7.f151311m, true);
                        com.tencent.mars.xlog.Log.i(musicMvMainUIC9.f150974d, "putLyricsCache cacheKey:%s", cVar.f282230d);
                        fm3.y yVar = fm3.y.f264161a;
                        java.lang.String key = cVar.f282230d;
                        java.lang.String str18 = aVar.f402965d;
                        kotlin.jvm.internal.o.d(str18);
                        kotlin.jvm.internal.o.g(key, "key");
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", "putLyricsCache, key:" + key + ", timestamp:" + elapsedRealtime);
                        fm3.y.f264164d.put(new fm3.d0(key), new fm3.c0(str18, elapsedRealtime));
                        yVar.a(elapsedRealtime);
                    }
                    i48 = i49;
                    i27 = 6;
                }
            }
        }
    }
}
