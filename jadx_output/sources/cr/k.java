package cr;

/* loaded from: classes12.dex */
public final class k implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f221575d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f221576e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221577f;

    /* renamed from: g, reason: collision with root package name */
    public final z12.h f221578g;

    public k(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, yz5.p callback) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f221575d = emojiInfo;
        this.f221576e = callback;
        this.f221577f = "MicroMsg.EmojiFetcherConfigRetriever";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(emojiInfo.getMd5());
        boolean z17 = false;
        this.f221578g = new z12.h(linkedList, 0);
        cr.i a17 = a(emojiInfo);
        java.lang.String str = a17.f221569b;
        boolean z18 = true;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFetcherConfigRetriever", "config retriever: db url is empty");
        } else {
            boolean b17 = b(str);
            try {
                z17 = android.webkit.URLUtil.isValidUrl(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EmojiFetcherConfigRetriever", "isUrlValid: " + e17);
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EmojiFetcherConfigRetriever", "url invalid ".concat(str));
            }
            if (z17) {
                z18 = b17;
            }
        }
        if (!z18) {
            this.f221576e.invoke(java.lang.Boolean.TRUE, a17);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f221577f, "config retriever: db url is empty");
        h12.f.a(9L, 1L);
        gm0.j1.n().f273288b.a(697, this);
        gm0.j1.n().f273288b.g(this.f221578g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cr.i a(com.tencent.mm.storage.emotion.EmojiInfo r12) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr.k.a(com.tencent.mm.storage.emotion.EmojiInfo):cr.i");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final boolean b(java.lang.String str) {
        boolean z17;
        java.lang.StringBuilder sb6;
        java.lang.String str2;
        boolean z18;
        java.lang.String str3 = this.f221577f;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EmojiUpdateUrlDomain");
        java.lang.String[] split = com.tencent.mm.sdk.platformtools.t8.K0(d17) ? null : d17.split(",");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (split != null) {
                try {
                    if (kz5.z.G(split, host)) {
                        com.tencent.mars.xlog.Log.i(str3, "config retriever: blocked host:" + host + ", list:" + kz5.z.d0(split, null, null, null, 0, null, null, 63, null));
                        return true;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    z17 = false;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isUrlBlocked: error ");
                    sb7.append(e);
                    sb7.append("; url ");
                    sb7.append(str);
                    sb7.append(", list:");
                    if (split != null) {
                        sb6 = sb7;
                        str2 = kz5.z.d0(split, null, null, null, 0, null, null, 63, null);
                    } else {
                        sb6 = sb7;
                        str2 = null;
                    }
                    sb6.append(str2);
                    com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                    if (split != null) {
                        int length = split.length;
                        ?? r152 = z17;
                        while (true) {
                            if (r152 >= length) {
                                z18 = z17;
                                break;
                            }
                            java.lang.String str4 = split[r152];
                            kotlin.jvm.internal.o.d(str4);
                            if (r26.n0.D(str, str4, z17, 2, null)) {
                                z18 = true;
                                break;
                            }
                            r152++;
                        }
                        if (z18) {
                            return true;
                        }
                    }
                    return z17;
                }
            }
            return false;
        } catch (java.lang.Exception e18) {
            e = e18;
            z17 = false;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        int type = scene.getType();
        java.lang.String str2 = this.f221577f;
        com.tencent.mars.xlog.Log.i(str2, "onSceneEnd: " + i17 + ", " + i18 + ", " + type);
        if (type == 697) {
            z12.h hVar = this.f221578g;
            if (kotlin.jvm.internal.o.b(scene, hVar)) {
                gm0.j1.n().f273288b.q(697, this);
                r45.ye I = hVar.I();
                java.util.LinkedList linkedList = I != null ? I.f391008g : null;
                boolean z17 = linkedList == null || linkedList.isEmpty();
                yz5.p pVar = this.f221576e;
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f221575d;
                if (z17) {
                    if (i17 == 0 && i18 == 0) {
                        com.tencent.mars.xlog.Log.i(str2, "onSceneEnd: response list is empty");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(164L, 11L);
                        com.tencent.mm.autogen.mmdata.rpt.AbnormalEmoticonClientReportStruct abnormalEmoticonClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AbnormalEmoticonClientReportStruct();
                        abnormalEmoticonClientReportStruct.f55013d = abnormalEmoticonClientReportStruct.b("Md5", emojiInfo.getMd5(), true);
                        abnormalEmoticonClientReportStruct.f55014e = 5L;
                        abnormalEmoticonClientReportStruct.k();
                        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_sync_test, 0) & 4) > 0 && n22.m.k(emojiInfo)) {
                            gm0.j1.n().f273288b.g(new z12.g(0, 2, kz5.b0.c(emojiInfo.getMd5()), null));
                            com.tencent.mm.storage.n5.f().c().n1(kz5.b0.c(emojiInfo.getMd5()), 0);
                        }
                    }
                    pVar.invoke(java.lang.Boolean.FALSE, null);
                    return;
                }
                com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(emojiInfo.getMd5());
                if (u17 == null) {
                    u17 = emojiInfo;
                }
                n22.m.a((r45.ri0) I.f391008g.get(0), u17);
                n22.m.a((r45.ri0) I.f391008g.get(0), emojiInfo);
                cr.i a17 = a(u17);
                java.lang.String str3 = a17.f221569b;
                if (!(str3.length() > 0)) {
                    pVar.invoke(java.lang.Boolean.FALSE, null);
                    return;
                }
                if (b(str3)) {
                    com.tencent.mm.autogen.mmdata.rpt.AbnormalEmoticonClientReportStruct abnormalEmoticonClientReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.AbnormalEmoticonClientReportStruct();
                    abnormalEmoticonClientReportStruct2.f55013d = abnormalEmoticonClientReportStruct2.b("Md5", emojiInfo.getMd5(), true);
                    abnormalEmoticonClientReportStruct2.f55014e = 4L;
                    abnormalEmoticonClientReportStruct2.k();
                }
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().m(u17);
                pm0.v.L("EmojiFetcherConfigRetriever_onSceneEnd", true, new cr.j(this, a17));
            }
        }
    }
}
