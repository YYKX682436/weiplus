package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f175780a = new java.util.ArrayList();

    public static final r45.h70 a(com.tencent.mm.plugin.vlog.model.h1 composition, r45.i70 outputConfig) {
        kotlin.jvm.internal.o.g(composition, "composition");
        kotlin.jvm.internal.o.g(outputConfig, "outputConfig");
        r45.h70 h70Var = new r45.h70();
        long j17 = 1000;
        h70Var.f375898e = composition.i().getStartUs() / j17;
        h70Var.f375899f = composition.i().getEndUs() / j17;
        java.util.LinkedList linkedList = h70Var.f375897d;
        java.util.ArrayList arrayList = composition.f175597c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.vlog.model.i1 track = (com.tencent.mm.plugin.vlog.model.i1) it.next();
            r45.ho6 ho6Var = new r45.ho6();
            kotlin.jvm.internal.o.g(track, "track");
            ho6Var.f376333d = track.f175616a;
            ho6Var.f376334e = track.f175617b;
            rm5.j jVar = track.f175627l;
            ho6Var.f376335f = jVar.f397502d;
            ho6Var.f376336g = jVar.f397503e;
            ho6Var.f376337h = jVar.f397504f;
            ho6Var.f376338i = jVar.f397505g;
            ho6Var.f376339m = jVar.f397508j;
            ho6Var.f376340n = track.f175621f;
            ho6Var.f376341o = track.f175622g;
            ho6Var.f376342p = track.f175623h;
            ho6Var.f376343q = jVar.f397507i;
            r45.ka0 ka0Var = new r45.ka0();
            ho6Var.f376344r = ka0Var;
            ka0Var.f378526d = new r45.aj4();
            ka0Var.f378529g = new r45.vl5();
            ka0Var.f378527e = new r45.vl5();
            ka0Var.f378528f = new r45.vl5();
            ka0Var.f378530h = new r45.vl5();
            com.tencent.mm.plugin.vlog.model.y yVar = track.f175624i;
            android.graphics.Matrix matrix = yVar.f175784a;
            r45.aj4 matrix2 = ka0Var.f378526d;
            kotlin.jvm.internal.o.f(matrix2, "matrix");
            kotlin.jvm.internal.o.g(matrix, "matrix");
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            java.util.LinkedList linkedList2 = matrix2.f370052d;
            linkedList2.clear();
            for (int i17 = 0; i17 < 9; i17++) {
                linkedList2.add(java.lang.Float.valueOf(fArr[i17]));
            }
            r45.vl5 contentRect = ka0Var.f378529g;
            kotlin.jvm.internal.o.f(contentRect, "contentRect");
            g(yVar.f175787d, contentRect);
            r45.vl5 cropRect = ka0Var.f378527e;
            kotlin.jvm.internal.o.f(cropRect, "cropRect");
            g(yVar.f175785b, cropRect);
            r45.vl5 viewRect = ka0Var.f378528f;
            kotlin.jvm.internal.o.f(viewRect, "viewRect");
            g(yVar.f175786c, viewRect);
            android.graphics.Rect rect = jVar.f397513o;
            r45.vl5 trackCropRect = ka0Var.f378530h;
            kotlin.jvm.internal.o.f(trackCropRect, "trackCropRect");
            g(rect, trackCropRect);
            r45.wp6 wp6Var = new r45.wp6();
            ho6Var.f376346t = wp6Var;
            rm5.n transition = jVar.f397515q;
            kotlin.jvm.internal.o.g(transition, "transition");
            wp6Var.f389379d = transition.f397529a;
            wp6Var.f389381f = transition.f397531c;
            ho6Var.f376345s = track.f175618c;
            arrayList2.add(ho6Var);
        }
        linkedList.addAll(arrayList2);
        h70Var.f375900g = composition.f175600f;
        h70Var.f375903m = true;
        h70Var.f375902i = outputConfig;
        h70Var.f375901h = composition.f175602h;
        h70Var.f375907q = composition.f175603i;
        h70Var.f375908r = new java.util.LinkedList();
        for (java.util.Map.Entry entry : so4.g.f410783h.entrySet()) {
            r45.j70 j70Var = new r45.j70();
            j70Var.f377620d = (java.lang.String) entry.getKey();
            java.lang.Object first = ((android.util.Pair) entry.getValue()).first;
            kotlin.jvm.internal.o.f(first, "first");
            j70Var.f377621e = ((java.lang.Number) first).intValue();
            java.lang.Object second = ((android.util.Pair) entry.getValue()).second;
            kotlin.jvm.internal.o.f(second, "second");
            j70Var.f377622f = ((java.lang.Number) second).longValue();
            h70Var.f375908r.add(j70Var);
        }
        return h70Var;
    }

    public static final java.lang.String b(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        int i17 = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i18 = length - 1;
                if (str.charAt(length) == '/') {
                    i17 = length;
                    break;
                }
                if (i18 < 0) {
                    break;
                }
                length = i18;
            }
        }
        java.lang.String substring = str.substring(i17 + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final com.tencent.mm.plugin.vlog.model.i1 c(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(h1Var, "<this>");
        java.util.Iterator it = h1Var.f175597c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            rm5.j jVar = ((com.tencent.mm.plugin.vlog.model.i1) obj).f175627l;
            if (jVar.f397502d <= j17 && jVar.f397503e > j17) {
                break;
            }
        }
        return (com.tencent.mm.plugin.vlog.model.i1) obj;
    }

    public static final com.tencent.mm.plugin.vlog.model.h1 d(r45.h70 proto, com.tencent.mm.xeffect.effect.EffectManager effectMgr) {
        int i17;
        int i18;
        java.lang.String str;
        uq5.y i19;
        uq5.y i27;
        java.lang.String str2;
        uq5.y i28;
        uq5.y yVar;
        int i29;
        uq5.y i37;
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(effectMgr, "effectMgr");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList tracks = proto.f375897d;
        kotlin.jvm.internal.o.f(tracks, "tracks");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tracks, 10));
        java.util.Iterator it = tracks.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.ho6 ho6Var = (r45.ho6) it.next();
            java.lang.String path = ho6Var.f376333d;
            kotlin.jvm.internal.o.f(path, "path");
            com.tencent.mm.plugin.vlog.model.i1 i1Var = new com.tencent.mm.plugin.vlog.model.i1(path, ho6Var.f376334e, 0);
            i1Var.e(ho6Var.f376335f);
            i1Var.a(ho6Var.f376336g);
            i1Var.d(ho6Var.f376337h);
            i1Var.c(ho6Var.f376338i);
            i1Var.f175621f = ho6Var.f376340n;
            i1Var.f175622g = ho6Var.f376341o;
            i1Var.f175623h = ho6Var.f376342p;
            i1Var.f175627l.f(ho6Var.f376343q);
            r45.vl5 vl5Var = ho6Var.f376344r.f378527e;
            rm5.j jVar = i1Var.f175627l;
            f(vl5Var, jVar.f397512n);
            f(ho6Var.f376344r.f378530h, jVar.f397513o);
            r45.wp6 wp6Var = ho6Var.f376346t;
            if (wp6Var != null) {
                rm5.n transition = jVar.f397515q;
                kotlin.jvm.internal.o.g(transition, "transition");
                java.lang.String path2 = wp6Var.f389379d;
                kotlin.jvm.internal.o.f(path2, "path");
                transition.f397529a = path2;
                transition.f397531c = wp6Var.f389381f;
            }
            arrayList.add(i1Var);
        }
        linkedList.addAll(arrayList);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(linkedList);
        r45.i70 i70Var = proto.f375902i;
        if (i70Var.f376793y != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            f(proto.f375902i.f376793y, rect);
            i17 = rect.width();
            i18 = rect.height();
        } else {
            i17 = i70Var.f376776e;
            i18 = i70Var.f376777f;
        }
        h1Var.e().l(i17, i18);
        h1Var.s(proto.f375898e, proto.f375899f);
        boolean z17 = true;
        java.lang.String str3 = "musicPath";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(proto.f375901h)) {
            java.lang.String musicPath = proto.f375901h;
            kotlin.jvm.internal.o.f(musicPath, "musicPath");
            h1Var.a(musicPath, true);
        }
        h1Var.d(proto.f375900g);
        if (proto.f375902i.f376778g != null) {
            android.graphics.Rect rect2 = new android.graphics.Rect();
            f(proto.f375902i.f376778g, rect2);
            h1Var.t(rect2);
        } else {
            android.graphics.Rect rect3 = new android.graphics.Rect();
            r45.i70 i70Var2 = proto.f375902i;
            r45.y25 y25Var = i70Var2.f376794z;
            if (y25Var != null) {
                f(y25Var.f390730d, rect3);
            } else {
                f(i70Var2.A.f390730d, rect3);
            }
            h1Var.t(rect3);
        }
        java.util.Iterator it6 = h1Var.f175597c.iterator();
        while (true) {
            str = "getAssets(...)";
            if (!it6.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.vlog.model.i1 i1Var2 = (com.tencent.mm.plugin.vlog.model.i1) it6.next();
            if (i1Var2.f175627l.f397515q.a()) {
                boolean A = r26.i0.A(i1Var2.f175627l.f397515q.f397529a, "assets://", false, 2, null);
                uq5.k kVar = uq5.k.PAGTransitionEffect;
                if (A) {
                    android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                    kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                    i37 = effectMgr.h(kVar, assets, i1Var2.f175627l.f397515q.f397529a);
                } else {
                    i37 = effectMgr.i(kVar, i1Var2.f175627l.f397515q.f397529a);
                }
                i1Var2.f175627l.f397515q.f397530b = i37;
                effectMgr.c(i37);
            }
        }
        h1Var.q(effectMgr);
        java.util.LinkedList stickerEffectList = proto.f375911u;
        kotlin.jvm.internal.o.f(stickerEffectList, "stickerEffectList");
        java.util.Iterator it7 = ((java.util.ArrayList) kz5.n0.t0(stickerEffectList, f175780a)).iterator();
        while (it7.hasNext()) {
            r45.fe6 fe6Var = (r45.fe6) it7.next();
            java.lang.String str4 = fe6Var.f374259e;
            boolean z18 = (str4 == null || str4.length() == 0) ? z17 : false;
            uq5.k kVar2 = uq5.k.StickerEffect;
            if (z18) {
                com.tencent.mm.protobuf.g gVar = fe6Var.f374260f;
                if (gVar != null) {
                    byte[] bArr = gVar.f192156a;
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                    yVar = effectMgr.j(kVar2, bArr);
                } else {
                    yVar = null;
                }
            } else {
                java.lang.String path3 = fe6Var.f374259e;
                kotlin.jvm.internal.o.f(path3, "path");
                yVar = effectMgr.i(kVar2, path3);
            }
            uq5.w wVar = yVar instanceof uq5.w ? (uq5.w) yVar : null;
            if (wVar != null) {
                r45.oi0 oi0Var = fe6Var.f374263i;
                r45.ni0 ni0Var = fe6Var.f374264m;
                java.lang.String str5 = str3;
                java.lang.String str6 = str;
                wVar.b(oi0Var.f382275d, oi0Var.f382276e);
                uq5.f fVar = new uq5.f(ni0Var.f381414d, ni0Var.f381415e, ni0Var.f381416f, ni0Var.f381417g);
                uq5.q qVar = wVar.f430265d;
                qVar.getClass();
                com.tencent.mm.xeffect.effect.VLogEffectJNI vLogEffectJNI = com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE;
                vLogEffectJNI.setEffectLayout$renderlib_release(qVar.f430261a.f430269c, fVar);
                int i38 = fe6Var.f374261g;
                if (i38 != 0 && (i29 = fe6Var.f374262h) != 0) {
                    vLogEffectJNI.setStickerSize$renderlib_release(wVar.f430269c, i38, i29);
                }
                effectMgr.c(wVar);
                str3 = str5;
                str = str6;
                z17 = true;
            }
        }
        java.lang.String str7 = str3;
        java.lang.String str8 = str;
        java.util.LinkedList baseItemData = proto.f375904n.f374939e;
        kotlin.jvm.internal.o.f(baseItemData, "baseItemData");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : baseItemData) {
            int i39 = ((r45.de) obj).f372338d;
            zu3.e eVar = zu3.e.f475796e;
            if (i39 == 8) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            r45.de deVar = (r45.de) it8.next();
            kotlin.jvm.internal.o.d(deVar);
            zu3.y yVar2 = new zu3.y(deVar);
            java.lang.String str9 = yVar2.f475865g;
            boolean A2 = r26.i0.A(str9, "assets://", false, 2, null);
            uq5.k kVar3 = uq5.k.PAGTextEffect;
            if (A2) {
                android.content.res.AssetManager assets2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                str2 = str8;
                kotlin.jvm.internal.o.f(assets2, str2);
                i28 = effectMgr.h(kVar3, assets2, str9);
            } else {
                str2 = str8;
                i28 = effectMgr.i(kVar3, str9);
            }
            effectMgr.c(i28);
            android.util.Size size = new android.util.Size(0, 0);
            yVar2.f475868j = size.getWidth();
            yVar2.f475869k = size.getHeight();
            android.graphics.Rect rect4 = new android.graphics.Rect();
            f(proto.f375904n.f374938d, rect4);
            yVar2.f475873o.set(rect4);
            yVar2.p(yVar2.f475763f);
            yVar2.f475866h = i28 != null ? i28.f430267a : 0L;
            str8 = str2;
        }
        java.lang.String str10 = str8;
        java.util.LinkedList<r45.ci4> magicInfoList = proto.f375905o;
        kotlin.jvm.internal.o.f(magicInfoList, "magicInfoList");
        for (r45.ci4 ci4Var : magicInfoList) {
            java.lang.String path4 = ci4Var.f371574d;
            kotlin.jvm.internal.o.f(path4, "path");
            boolean y17 = r26.i0.y(path4, "assets://", false);
            uq5.k kVar4 = uq5.k.PAGGlobalAnimateEffect;
            if (y17) {
                android.content.res.AssetManager assets3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                kotlin.jvm.internal.o.f(assets3, str10);
                java.lang.String path5 = ci4Var.f371574d;
                kotlin.jvm.internal.o.f(path5, "path");
                i27 = effectMgr.h(kVar4, assets3, path5);
            } else {
                java.lang.String path6 = ci4Var.f371574d;
                kotlin.jvm.internal.o.f(path6, "path");
                i27 = effectMgr.i(kVar4, path6);
            }
            if (i27 != null) {
                i27.b(ci4Var.f371575e, ci4Var.f371576f);
            }
            effectMgr.c(i27);
        }
        r45.tz6 tz6Var = proto.f375906p;
        if (tz6Var != null) {
            java.lang.String templatePath = tz6Var.f386890d;
            kotlin.jvm.internal.o.f(templatePath, "templatePath");
            boolean y18 = r26.i0.y(templatePath, "assets://", false);
            uq5.k kVar5 = uq5.k.PAGVideoTemplateEffect;
            if (y18) {
                android.content.res.AssetManager assets4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                kotlin.jvm.internal.o.f(assets4, str10);
                java.lang.String templatePath2 = proto.f375906p.f386890d;
                kotlin.jvm.internal.o.f(templatePath2, "templatePath");
                i19 = effectMgr.h(kVar5, assets4, templatePath2);
            } else {
                java.lang.String templatePath3 = proto.f375906p.f386890d;
                kotlin.jvm.internal.o.f(templatePath3, "templatePath");
                i19 = effectMgr.i(kVar5, templatePath3);
            }
            effectMgr.c(i19);
            new android.util.Size(0, 0);
            kotlin.jvm.internal.o.f(proto.f375906p.f386890d, "templatePath");
            kotlin.jvm.internal.o.f(proto.f375906p.f386891e, str7);
            long j17 = proto.f375906p.f386892f;
            new java.util.ArrayList();
            effectMgr.f();
            if (i19 != null) {
                i19.b(0L, j17);
            }
            java.lang.String str11 = proto.f375906p.f386891e;
            kotlin.jvm.internal.o.f(str11, str7);
            h1Var.a(str11, false);
            java.util.Iterator it9 = h1Var.f175597c.iterator();
            while (it9.hasNext()) {
                ((com.tencent.mm.plugin.vlog.model.i1) it9.next()).f175627l.f397514p = false;
            }
        }
        h1Var.f175603i = proto.f375907q;
        if (h1Var.f175603i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.LinkedList<r45.j70> trackLabelInfoList = proto.f375908r;
            kotlin.jvm.internal.o.f(trackLabelInfoList, "trackLabelInfoList");
            for (r45.j70 j70Var : trackLabelInfoList) {
                java.lang.String path7 = j70Var.f377620d;
                kotlin.jvm.internal.o.f(path7, "path");
                hashMap.put(path7, java.lang.Integer.valueOf(j70Var.f377621e));
            }
            uq5.y g17 = effectMgr.g(uq5.k.ImageEnhanceEffect);
            uq5.p pVar = g17 instanceof uq5.p ? (uq5.p) g17 : null;
            if (pVar != null) {
                pVar.b(h1Var.j(), h1Var.h());
            }
            effectMgr.c(pVar);
            boolean z19 = com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", 0) == 1;
            if (z19 && pVar != null) {
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setShowLandmarks$renderlib_release(pVar.f430269c, z19);
            }
            java.lang.String M = com.tencent.mm.vfs.w6.M(dp4.b.f242263b);
            kotlin.jvm.internal.o.d(M);
            if ((M.length() > 0) && pVar != null) {
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setConfigJson$renderlib_release(pVar.f430269c, M);
            }
            h1Var.f175595a.a(new com.tencent.mm.plugin.vlog.model.n1(h1Var, hashMap, pVar));
        }
        return h1Var;
    }

    public static final zv3.c e(r45.h70 proto) {
        float[] fArr;
        int width;
        int height;
        kotlin.jvm.internal.o.g(proto, "proto");
        lt3.n nVar = lt3.n.f321260a;
        java.util.LinkedList<r45.de> baseItemData = proto.f375904n.f374939e;
        kotlin.jvm.internal.o.f(baseItemData, "baseItemData");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "get the editor data which is waiting for run mixing");
        for (r45.de deVar : baseItemData) {
            int i17 = deVar.f372338d;
            zu3.e eVar = zu3.e.f475796e;
            if (i17 == 1) {
                arrayList.add(new zu3.b0(context).d(new zu3.a0(deVar)));
            } else if (i17 == 2) {
                zu3.j jVar = new zu3.j(deVar);
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = jVar.f475810g;
                kotlin.jvm.internal.o.d(iEmojiInfo);
                av3.e eVar2 = new av3.e(iEmojiInfo, jVar.f475763f);
                r45.bi0 bi0Var = new r45.bi0();
                bv3.d dVar = jVar.f475760c;
                bi0Var.f370772d = dVar.c();
                bi0Var.f370773e = dVar.b();
                eVar2.f14213c = bi0Var;
                arrayList.add(eVar2);
            } else if (i17 == 3) {
                zu3.z zVar = new zu3.z(context);
                zu3.s sVar = new zu3.s(deVar);
                arrayList.add(new av3.c(zVar.c(sVar), sVar.f475763f));
            } else if (i17 == 4) {
                zu3.c0 c0Var = new zu3.c0(context);
                zu3.a0 a0Var = new zu3.a0(deVar);
                arrayList.add(new av3.c(c0Var.c(a0Var), a0Var.f475763f));
            } else if (i17 == 5) {
                arrayList.add(new zu3.m(context).r(new zu3.t(deVar)));
            } else {
                zu3.e eVar3 = zu3.e.f475801m;
                if (i17 == 6) {
                    byte[] bArr = deVar.f372339e.f371841f.f192156a;
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                    arrayList.add(new av3.d(new zu3.d(eVar3, bArr)));
                } else {
                    zu3.e eVar4 = zu3.e.f475802n;
                    if (i17 == 7) {
                        byte[] bArr2 = deVar.f372339e.f371841f.f192156a;
                        kotlin.jvm.internal.o.f(bArr2, "getBytes(...)");
                        arrayList.add(new av3.d(new zu3.d(eVar4, bArr2)));
                    }
                }
            }
        }
        java.util.LinkedList values = proto.f375904n.f374938d.f388350d;
        kotlin.jvm.internal.o.f(values, "values");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(values, 10));
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf(((java.lang.Integer) it.next()).intValue()));
        }
        float[] P0 = kz5.n0.P0(arrayList2);
        r45.vl5 vl5Var = proto.f375904n.f374941g;
        if (vl5Var != null) {
            java.util.LinkedList values2 = vl5Var.f388350d;
            kotlin.jvm.internal.o.f(values2, "values");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(values2, 10));
            java.util.Iterator it6 = values2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Float.valueOf(((java.lang.Integer) it6.next()).intValue()));
            }
            fArr = kz5.n0.P0(arrayList3);
        } else {
            fArr = null;
        }
        float[] fArr2 = fArr;
        r45.i70 i70Var = proto.f375902i;
        if (i70Var.f376793y == null) {
            width = i70Var.f376776e;
            height = i70Var.f376777f;
        } else {
            android.graphics.Rect rect = new android.graphics.Rect();
            f(proto.f375902i.f376793y, rect);
            width = rect.width();
            height = rect.height();
        }
        return new zv3.f(P0, fArr2, arrayList, width, height);
    }

    public static final void f(r45.vl5 vl5Var, android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        if (vl5Var != null && vl5Var.f388350d.size() == 4) {
            java.lang.Object obj = vl5Var.f388350d.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            int intValue = ((java.lang.Number) obj).intValue();
            java.lang.Object obj2 = vl5Var.f388350d.get(1);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            int intValue2 = ((java.lang.Number) obj2).intValue();
            java.lang.Object obj3 = vl5Var.f388350d.get(2);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            int intValue3 = ((java.lang.Number) obj3).intValue();
            java.lang.Object obj4 = vl5Var.f388350d.get(3);
            kotlin.jvm.internal.o.f(obj4, "get(...)");
            rect.set(intValue, intValue2, intValue3, ((java.lang.Number) obj4).intValue());
        }
    }

    public static final void g(android.graphics.Rect rect, r45.vl5 proto) {
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(proto, "proto");
        proto.f388350d.clear();
        proto.f388350d.add(java.lang.Integer.valueOf(rect.left));
        proto.f388350d.add(java.lang.Integer.valueOf(rect.top));
        proto.f388350d.add(java.lang.Integer.valueOf(rect.right));
        proto.f388350d.add(java.lang.Integer.valueOf(rect.bottom));
    }
}
