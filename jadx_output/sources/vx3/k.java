package vx3;

/* loaded from: classes10.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public static vx3.i c(vx3.k kVar, long j17, long j18, com.tencent.mm.protocal.protobuf.FinderObject finderObject, long j19, t45.n0 n0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        dk4.a rj6;
        java.lang.String d17;
        t45.g gVar;
        t45.n0 n0Var2 = (i17 & 16) != 0 ? null : n0Var;
        java.lang.String str2 = (i17 & 32) != 0 ? null : str;
        boolean z18 = false;
        boolean z19 = (i17 & 64) != 0 ? false : z17;
        kVar.getClass();
        vx3.i iVar = new vx3.i();
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null && (rj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).rj(finderMedia, j19, false)) != null) {
            rj6.f234483t += ".ring";
            iVar.f441287d = finderObject;
            iVar.f441286c = j18;
            iVar.f441285b = j17;
            iVar.f441289f = n0Var2;
            iVar.f441288e = str2;
            iVar.f441290g = java.lang.Math.min(com.tencent.wcdb.core.Database.DictDefaultMatchValue, j18 - j17);
            iVar.f441284a = rj6;
            bm5.o1 o1Var = bm5.o1.f22719a;
            bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_RingBackAudio_Int;
            if (o1Var.g(h0Var, 0) != 0 && o1Var.g(h0Var, 0) == 1) {
                z18 = true;
            }
            if (z18) {
                d17 = "A2";
            } else {
                d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingBackAudioFlag");
                if (d17 == null) {
                    d17 = "A0";
                }
            }
            rj6.f234481r = d17;
            java.lang.String coverUrl = finderMedia.getCoverUrl();
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (coverUrl == null) {
                coverUrl = "";
            }
            java.lang.String cover_url_token = finderMedia.getCover_url_token();
            if (cover_url_token == null) {
                cover_url_token = "";
            }
            java.lang.String concat = coverUrl.concat(cover_url_token);
            kotlin.jvm.internal.o.g(concat, "<set-?>");
            iVar.f441294k = concat;
            iVar.m(true);
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f27);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            iVar.f441291h = string;
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f28);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            iVar.f441293j = string2;
            java.lang.String nickname = finderObject.getNickname();
            if (nickname != null) {
                iVar.f441293j = nickname;
            }
            iVar.f441297n = z19;
            iVar.f441298o = j19;
            java.lang.String objectNonceId = finderObject.getObjectNonceId();
            if (objectNonceId == null) {
                objectNonceId = "";
            }
            iVar.f441299p = objectNonceId;
            if (n0Var2 != null && (gVar = n0Var2.f415617f) != null) {
                java.lang.String str3 = gVar.f415567n;
                if (str3 == null) {
                    str3 = "";
                }
                iVar.f441309z = str3;
                java.lang.String str4 = gVar.f415569p;
                if (str4 == null) {
                    str4 = "";
                }
                iVar.f441304u = str4;
                java.lang.String str5 = gVar.f415571r;
                iVar.f441305v = str5 != null ? str5 : "";
                iVar.f441306w = gVar.f415570q;
                iVar.f441307x = gVar.f415566m;
                vx3.l.E.a(gVar, iVar);
            }
            iVar.f441301r = n0Var2 != null ? n0Var2.f415621m : null;
        }
        return iVar;
    }

    public static /* synthetic */ vx3.i h(vx3.k kVar, long j17, long j18, t45.n0 n0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            str = null;
        }
        return kVar.g(j17, j18, n0Var, str);
    }

    public final void a(t45.g gVar, vx3.i receiver) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        java.lang.String str = gVar.f415563g;
        jz5.f0 f0Var = null;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                receiver.f441293j = str;
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i2u, str);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                receiver.f441291h = string;
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f27);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                receiver.f441292i = string2;
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f28);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            receiver.f441293j = string3;
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f27);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            receiver.f441291h = string4;
            java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f27);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            receiver.f441292i = string5;
        }
        t45.h0 h0Var = gVar.f415576w;
        if (h0Var != null) {
            java.lang.String str2 = h0Var.f415584d;
            java.lang.String str3 = h0Var.f415585e;
            if (str2 == null || str3 == null) {
                return;
            }
            if (str2.length() > 0) {
                if (str3.length() > 0) {
                    receiver.l(str2 + " - " + str3);
                    receiver.f441292i = str2;
                    receiver.f441293j = str3;
                    receiver.f441308y = true;
                }
            }
        }
    }

    public final vx3.i b() {
        vx3.i iVar = new vx3.i();
        dk4.a aVar = new dk4.a("voip_default_sound", mx3.f0.f332548a.d(mx3.f0.f332552e), "", 0, 0);
        iVar.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getText(com.tencent.mm.R.string.i2q).toString());
        iVar.f441285b = 0L;
        iVar.f441286c = 4400L;
        iVar.f441290g = 4400L;
        aVar.f234468e = true;
        iVar.f441284a = aVar;
        t45.e1 e1Var = new t45.e1();
        e1Var.f415548d = "phonering.HE";
        iVar.f441301r = e1Var;
        return iVar;
    }

    public final vx3.i d(long j17, long j18, t45.g detail, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        dk4.a rj6;
        java.lang.String d17;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        kotlin.jvm.internal.o.g(detail, "detail");
        t45.f fVar = detail.f415560d;
        java.lang.String str = null;
        if (fVar == null) {
            return null;
        }
        long j19 = fVar.f415549d;
        java.lang.String str2 = fVar.f415550e;
        if (str2 == null) {
            return null;
        }
        vx3.i iVar = new vx3.i();
        iVar.f441285b = j17;
        iVar.f441286c = j18;
        a(detail, iVar);
        iVar.f441298o = j19;
        iVar.f441299p = str2;
        java.lang.String str3 = detail.f415567n;
        if (str3 == null) {
            str3 = "";
        }
        iVar.f441309z = str3;
        if (finderObject != null && (contact = finderObject.getContact()) != null) {
            str = contact.getHeadUrl();
        }
        if (str == null) {
            str = "";
        }
        iVar.f441303t = str;
        java.lang.String str4 = detail.f415569p;
        if (str4 == null) {
            str4 = "";
        }
        iVar.f441304u = str4;
        java.lang.String str5 = detail.f415571r;
        if (str5 == null) {
            str5 = "";
        }
        iVar.f441305v = str5;
        iVar.f441306w = detail.f415570q;
        iVar.f441307x = detail.f415566m;
        dk4.a aVar = iVar.f441284a;
        java.lang.String str6 = "A2";
        if (aVar != null) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_RingBackAudio_Int;
            if (o1Var.g(h0Var, 0) != 0 && o1Var.g(h0Var, 0) == 1) {
                d17 = "A2";
            } else {
                d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingBackAudioFlag");
                if (d17 == null) {
                    d17 = "A0";
                }
            }
            aVar.f234481r = d17;
        }
        iVar.m(true);
        java.lang.String str7 = detail.f415563g;
        if (str7 != null) {
            java.lang.String str8 = iVar.f441293j + " · " + str7;
            kotlin.jvm.internal.o.g(str8, "<set-?>");
            iVar.f441293j = str8;
        }
        java.lang.String str9 = detail.f415562f;
        iVar.f441294k = str9 != null ? str9 : "";
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null && (rj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).rj(finderMedia, j19, false)) != null) {
            rj6.f234483t += ".ring";
            bm5.o1 o1Var2 = bm5.o1.f22719a;
            bm5.h0 h0Var2 = bm5.h0.RepairerConfig_VOIP_RingBackAudio_Int;
            if (!(o1Var2.g(h0Var2, 0) != 0 && o1Var2.g(h0Var2, 0) == 1)) {
                java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingBackAudioFlag");
                str6 = d18 != null ? d18 : "A0";
            }
            rj6.f234481r = str6;
            iVar.f441284a = rj6;
            iVar.f441287d = finderObject;
        }
        return iVar;
    }

    public final vx3.i e(t45.g detail, t45.n0 info) {
        java.lang.String str;
        java.lang.String d17;
        kotlin.jvm.internal.o.g(detail, "detail");
        kotlin.jvm.internal.o.g(info, "info");
        t45.f fVar = detail.f415560d;
        if (fVar == null) {
            return b();
        }
        long j17 = fVar.f415549d;
        if (fVar == null || (str = fVar.f415550e) == null) {
            return b();
        }
        vx3.i iVar = new vx3.i();
        a(detail, iVar);
        iVar.f441298o = j17;
        iVar.f441299p = str;
        java.lang.String str2 = detail.f415567n;
        if (str2 == null) {
            str2 = "";
        }
        iVar.f441309z = str2;
        java.lang.String str3 = detail.f415569p;
        if (str3 == null) {
            str3 = "";
        }
        iVar.f441304u = str3;
        java.lang.String str4 = detail.f415571r;
        if (str4 == null) {
            str4 = "";
        }
        iVar.f441305v = str4;
        iVar.f441306w = detail.f415570q;
        iVar.f441307x = detail.f415566m;
        dk4.a aVar = iVar.f441284a;
        if (aVar != null) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_RingBackAudio_Int;
            boolean z17 = false;
            if (o1Var.g(h0Var, 0) != 0 && o1Var.g(h0Var, 0) == 1) {
                z17 = true;
            }
            if (z17) {
                d17 = "A2";
            } else {
                d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingBackAudioFlag");
                if (d17 == null) {
                    d17 = "A0";
                }
            }
            aVar.f234481r = d17;
        }
        iVar.m(true);
        iVar.f441301r = info.f415621m;
        java.lang.String str5 = detail.f415562f;
        iVar.f441294k = str5 != null ? str5 : "";
        return iVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(167:1|(6:2|3|4|5|6|(1:8)(1:341))|(164:10|(1:12)|13|14|15|16|(1:18)(1:336)|(156:20|21|22|23|(1:25)(1:331)|(150:27|28|29|30|(1:32)(1:326)|(144:34|35|36|37|(1:39)(1:321)|(138:41|42|43|44|(1:46)(1:316)|(132:48|(1:50)|51|52|53|(1:55)(1:311)|(125:57|(1:59)|60|61|62|(1:64)(1:306)|(118:66|(1:68)|69|70|71|(1:73)(1:301)|(111:75|(1:77)|78|79|80|(1:82)(1:296)|(104:84|(1:86)|87|88|89|(1:91)(1:291)|(97:93|94|95|96|(1:98)(1:286)|(91:100|101|102|103|(1:105)(1:281)|(85:107|(1:109)|110|111|112|(1:114)(1:276)|(78:116|117|118|119|(1:121)(1:271)|(72:123|124|125|126|(1:128)(1:266)|(66:130|131|132|133|(1:135)(1:261)|(1:137)|139|140|141|(1:143)(1:258)|(55:145|(1:147)|148|149|150|(1:152)(1:253)|(48:154|(1:156)|157|158|159|(1:161)(1:248)|(41:163|(1:165)|166|167|168|(1:170)(1:243)|(34:172|173|174|175|(1:177)(1:238)|(28:179|180|181|182|(1:184)(1:233)|(22:186|(1:188)|189|190|191|(1:193)(1:228)|(15:195|(1:197)|198|199|200|(1:202)(1:223)|(1:204)|(1:207)|208|209|210|(1:212)(1:220)|(1:214)|216|217)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|315|(0)|51|52|53|(0)(0)|(0)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|320|42|43|44|(0)(0)|(0)|315|(0)|51|52|53|(0)(0)|(0)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|325|35|36|37|(0)(0)|(0)|320|42|43|44|(0)(0)|(0)|315|(0)|51|52|53|(0)(0)|(0)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|330|28|29|30|(0)(0)|(0)|325|35|36|37|(0)(0)|(0)|320|42|43|44|(0)(0)|(0)|315|(0)|51|52|53|(0)(0)|(0)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|335|21|22|23|(0)(0)|(0)|330|28|29|30|(0)(0)|(0)|325|35|36|37|(0)(0)|(0)|320|42|43|44|(0)(0)|(0)|315|(0)|51|52|53|(0)(0)|(0)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217)|340|(0)|13|14|15|16|(0)(0)|(0)|335|21|22|23|(0)(0)|(0)|330|28|29|30|(0)(0)|(0)|325|35|36|37|(0)(0)|(0)|320|42|43|44|(0)(0)|(0)|315|(0)|51|52|53|(0)(0)|(0)|310|(0)|60|61|62|(0)(0)|(0)|305|(0)|69|70|71|(0)(0)|(0)|300|(0)|78|79|80|(0)(0)|(0)|295|(0)|87|88|89|(0)(0)|(0)|290|94|95|96|(0)(0)|(0)|285|101|102|103|(0)(0)|(0)|280|(0)|110|111|112|(0)(0)|(0)|275|117|118|119|(0)(0)|(0)|270|124|125|126|(0)(0)|(0)|265|131|132|133|(0)(0)|(0)|139|140|141|(0)(0)|(0)|257|(0)|148|149|150|(0)(0)|(0)|252|(0)|157|158|159|(0)(0)|(0)|247|(0)|166|167|168|(0)(0)|(0)|242|173|174|175|(0)(0)|(0)|237|180|181|182|(0)(0)|(0)|232|(0)|189|190|191|(0)(0)|(0)|227|(0)|198|199|200|(0)(0)|(0)|(0)|208|209|210|(0)(0)|(0)|216|217) */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0354, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0355, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetBoolean", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0336, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0337, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0316, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0317, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02f5, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02f6, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02d7, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02d8, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02b8, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02b9, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0296, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0297, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0276, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0277, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0256, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0257, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x023a, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x023b, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x021d, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x021e, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetBoolean", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01fb, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01fc, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01d9, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01da, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01b7, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01b8, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x019a, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x019b, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0177, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0178, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0155, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0156, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0135, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0136, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0115, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0116, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00f5, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00f6, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00d5, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00d6, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00b8, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00b9, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0099, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x009a, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x007a, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x007b, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x005b, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x005c, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0193 A[Catch: Exception -> 0x019a, TRY_LEAVE, TryCatch #13 {Exception -> 0x019a, blocks: (B:96:0x0188, B:100:0x0193), top: B:95:0x0188, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2 A[Catch: Exception -> 0x01b7, TRY_LEAVE, TryCatch #2 {Exception -> 0x01b7, blocks: (B:103:0x01a7, B:107:0x01b2), top: B:102:0x01a7, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d2 A[Catch: Exception -> 0x01d9, TRY_LEAVE, TryCatch #14 {Exception -> 0x01d9, blocks: (B:112:0x01c7, B:116:0x01d2), top: B:111:0x01c7, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f6 A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #24 {Exception -> 0x01fb, blocks: (B:119:0x01eb, B:123:0x01f6), top: B:118:0x01eb, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0216 A[Catch: Exception -> 0x021d, TRY_LEAVE, TryCatch #11 {Exception -> 0x021d, blocks: (B:126:0x020b, B:130:0x0216), top: B:125:0x020b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0235 A[Catch: Exception -> 0x023a, TRY_LEAVE, TryCatch #25 {Exception -> 0x023a, blocks: (B:133:0x022a, B:137:0x0235), top: B:132:0x022a, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0251 A[Catch: Exception -> 0x0256, TRY_LEAVE, TryCatch #19 {Exception -> 0x0256, blocks: (B:141:0x0246, B:145:0x0251), top: B:140:0x0246, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0271 A[Catch: Exception -> 0x0276, TRY_LEAVE, TryCatch #5 {Exception -> 0x0276, blocks: (B:150:0x0266, B:154:0x0271), top: B:149:0x0266, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0291 A[Catch: Exception -> 0x0296, TRY_LEAVE, TryCatch #18 {Exception -> 0x0296, blocks: (B:159:0x0286, B:163:0x0291), top: B:158:0x0286, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b1 A[Catch: Exception -> 0x02b8, TRY_LEAVE, TryCatch #0 {Exception -> 0x02b8, blocks: (B:168:0x02a6, B:172:0x02b1), top: B:167:0x02a6, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d0 A[Catch: Exception -> 0x02d7, TRY_LEAVE, TryCatch #16 {Exception -> 0x02d7, blocks: (B:175:0x02c5, B:179:0x02d0), top: B:174:0x02c5, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f0 A[Catch: Exception -> 0x02f5, TRY_LEAVE, TryCatch #6 {Exception -> 0x02f5, blocks: (B:182:0x02e5, B:186:0x02f0), top: B:181:0x02e5, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0311 A[Catch: Exception -> 0x0316, TRY_LEAVE, TryCatch #17 {Exception -> 0x0316, blocks: (B:191:0x0306, B:195:0x0311), top: B:190:0x0306, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0331 A[Catch: Exception -> 0x0336, TRY_LEAVE, TryCatch #4 {Exception -> 0x0336, blocks: (B:200:0x0326, B:204:0x0331), top: B:199:0x0326, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: Exception -> 0x005b, TRY_LEAVE, TryCatch #12 {Exception -> 0x005b, blocks: (B:16:0x0049, B:20:0x0054), top: B:15:0x0049, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x034f A[Catch: Exception -> 0x0354, TRY_LEAVE, TryCatch #23 {Exception -> 0x0354, blocks: (B:210:0x0345, B:214:0x034f), top: B:209:0x0345, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #26 {Exception -> 0x007a, blocks: (B:23:0x0068, B:27:0x0073), top: B:22:0x0068, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: Exception -> 0x0099, TRY_LEAVE, TryCatch #15 {Exception -> 0x0099, blocks: (B:30:0x0087, B:34:0x0092), top: B:29:0x0087, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:37:0x00a6, B:41:0x00b1), top: B:36:0x00a6, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #22 {Exception -> 0x00d5, blocks: (B:44:0x00c5, B:48:0x00d0), top: B:43:0x00c5, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0 A[Catch: Exception -> 0x00f5, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f5, blocks: (B:53:0x00e5, B:57:0x00f0), top: B:52:0x00e5, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110 A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #21 {Exception -> 0x0115, blocks: (B:62:0x0105, B:66:0x0110), top: B:61:0x0105, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130 A[Catch: Exception -> 0x0135, TRY_LEAVE, TryCatch #7 {Exception -> 0x0135, blocks: (B:71:0x0125, B:75:0x0130), top: B:70:0x0125, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150 A[Catch: Exception -> 0x0155, TRY_LEAVE, TryCatch #20 {Exception -> 0x0155, blocks: (B:80:0x0145, B:84:0x0150), top: B:79:0x0145, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0172 A[Catch: Exception -> 0x0177, TRY_LEAVE, TryCatch #3 {Exception -> 0x0177, blocks: (B:89:0x0167, B:93:0x0172), top: B:88:0x0167, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vx3.i f(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx3.k.f(java.lang.String):vx3.i");
    }

    public final vx3.i g(long j17, long j18, t45.n0 rawDetail, java.lang.String str) {
        t45.e0 e0Var;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(rawDetail, "rawDetail");
        t45.f0 f0Var = rawDetail.f415616e;
        if (f0Var == null || (e0Var = f0Var.f415551d) == null) {
            return null;
        }
        int i17 = e0Var.f415547d;
        java.lang.String str3 = "music_ringtone_" + i17;
        java.lang.String e17 = mx3.f0.f332548a.e(i17, str3);
        vx3.i iVar = new vx3.i();
        iVar.f441284a = new dk4.a(str3, e17, f0Var.f415555h, 0, 0);
        iVar.f441285b = j17;
        t45.f0 f0Var2 = rawDetail.f415616e;
        java.lang.String str4 = f0Var2 != null ? f0Var2.f415554g : null;
        if (str4 == null) {
            str4 = "";
        }
        iVar.f441294k = str4;
        iVar.f441289f = rawDetail;
        iVar.f441286c = j18;
        iVar.f441288e = str;
        iVar.f441290g = f0Var.f415556i;
        t45.f0 f0Var3 = rawDetail.f415616e;
        if (f0Var3 == null || (linkedList = f0Var3.f415553f) == null || (str2 = (java.lang.String) kz5.n0.Z(linkedList)) == null) {
            str2 = "";
        }
        iVar.f441293j = str2;
        t45.f0 f0Var4 = rawDetail.f415616e;
        java.lang.String str5 = f0Var4 != null ? f0Var4.f415552e : null;
        java.lang.String str6 = str5 != null ? str5 : "";
        iVar.f441291h = str6;
        iVar.f441292i = str6;
        iVar.f441300q = i17;
        iVar.f441301r = rawDetail.f415621m;
        return iVar;
    }

    public final vx3.i i(t45.n0 extRingBackDetail) {
        kotlin.jvm.internal.o.g(extRingBackDetail, "extRingBackDetail");
        int i17 = extRingBackDetail.f415615d;
        if (i17 == 1) {
            vx3.i h17 = h(this, 0L, 0L, extRingBackDetail, null, 8, null);
            if (h17 == null) {
                return null;
            }
            h17.f441289f = extRingBackDetail;
            return h17;
        }
        if (i17 != 2) {
            return b();
        }
        t45.g gVar = extRingBackDetail.f415617f;
        if (gVar == null) {
            return null;
        }
        vx3.i e17 = e(gVar, extRingBackDetail);
        e17.f441286c = 0L;
        e17.f441285b = 0L;
        e17.f441289f = extRingBackDetail;
        e17.f441301r = extRingBackDetail.f415621m;
        return e17;
    }
}
