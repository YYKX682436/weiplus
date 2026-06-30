package jr;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f301301a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f301302b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f301303c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f301304d;

    public i(im5.b bVar) {
        this.f301301a = bVar;
    }

    public void a(java.lang.String desc, jr.n nVar) {
        java.lang.Integer num;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(desc, "desc");
        int i19 = 0;
        int i27 = 1;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_suggest_remote_enable, false) && com.tencent.mm.storage.h5.f195006d.Bi();
        boolean isTeenMode = ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: remoteEnable " + z17);
        jr.j jVar = jr.j.f301305a;
        long j17 = jr.j.f301307c;
        int i28 = jr.j.f301306b;
        java.util.LinkedList linkedList = jr.j.f301308d;
        synchronized (linkedList) {
        }
        jr.q qVar = new jr.q(j17, i28, linkedList.size(), null, 8, null);
        if (isTeenMode || !z17) {
            if (nVar != null) {
                nVar.a(kz5.p0.f313996d, qVar);
                return;
            }
            return;
        }
        jr.e y07 = com.tencent.mm.storage.n5.f().f195178p.y0(desc);
        if (y07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: has cache " + y07.field_updateTime);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1418L, (long) 32, 1L);
            r45.hl5 hl5Var = new r45.hl5();
            byte[] bArr = y07.field_content;
            if (bArr != null) {
                try {
                    hl5Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            java.lang.String str = hl5Var.f376268e;
            if (str == null) {
                str = "";
            }
            qVar.f301321d = str;
            if (nVar != null) {
                java.util.LinkedList Emoji = hl5Var.f376267d;
                kotlin.jvm.internal.o.f(Emoji, "Emoji");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Emoji, 10));
                int i29 = 0;
                for (java.lang.Object obj : Emoji) {
                    int i37 = i29 + 1;
                    if (i29 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.yk5 yk5Var = (r45.yk5) obj;
                    com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(yk5Var.f391180d.f384886d);
                    if (u17 == null) {
                        u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
                        n22.m.a(yk5Var.f391180d, u17);
                        u17.field_catalog = 65;
                    }
                    java.util.ArrayList d17 = gr.t.g().d();
                    kotlin.jvm.internal.o.f(d17, "getEmojiGroupInfoList(...)");
                    if (!d17.isEmpty()) {
                        java.util.Iterator it = d17.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next()).field_productID, u17.field_groupId)) {
                                i17 = i27;
                                break;
                            }
                        }
                    }
                    i17 = i19;
                    if (yk5Var.f391184h == i27) {
                        if (i17 != 0) {
                            i18 = i19;
                            arrayList.add(new jr.p(u17, new jr.o(i18, yk5Var.f391184h, hl5Var.f376270g, i37)));
                            i29 = i37;
                            i27 = 1;
                            i19 = 0;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: delete local emoji " + u17.getMd5());
                        }
                    }
                    i18 = i27;
                    arrayList.add(new jr.p(u17, new jr.o(i18, yk5Var.f391184h, hl5Var.f376270g, i37)));
                    i29 = i37;
                    i27 = 1;
                    i19 = 0;
                }
                num = null;
                nVar.a(arrayList, qVar);
            } else {
                num = null;
            }
        } else {
            num = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: no cache");
            if (nVar != null) {
                nVar.a(kz5.p0.f313996d, qVar);
            }
        }
        jr.e y08 = com.tencent.mm.storage.n5.f().f195178p.y0(desc);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate: ");
        sb6.append(desc);
        sb6.append(", ");
        sb6.append(y08 != null ? java.lang.Integer.valueOf(y08.field_updateTime) : num);
        sb6.append(" needUpdate:");
        sb6.append(y08 != null ? java.lang.Boolean.valueOf(y08.t0()) : num);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", sb6.toString());
        if (y08 == null || y08.t0()) {
            r45.db4 db4Var = new r45.db4();
            if (this.f301304d) {
                java.util.ArrayList B = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).B(desc);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_shuffle_size, 20);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestMatchWord", "checkUpdate: shuffle " + Ni + ", local " + B.size());
                int min = java.lang.Math.min(Ni, B.size());
                for (int i38 = 0; i38 < min; i38++) {
                    db4Var.f372284d.add(B.get(i38));
                }
            }
            r45.gl5 gl5Var = new r45.gl5();
            gl5Var.f375333d = desc;
            gl5Var.f375334e = this.f301302b;
            gl5Var.f375335f = this.f301303c;
            gl5Var.f375338i = 4;
            gl5Var.f375339m = new com.tencent.mm.protobuf.g(db4Var.toByteArray());
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct suggestEmoiconPreloadStruct = new com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct();
            suggestEmoiconPreloadStruct.f60993d = suggestEmoiconPreloadStruct.b("SessionId", this.f301303c, true);
            suggestEmoiconPreloadStruct.f60994e = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1418L, 40, 1L);
            new gr.c(gl5Var).l().K(new jr.h(this, suggestEmoiconPreloadStruct, desc));
        }
    }
}
