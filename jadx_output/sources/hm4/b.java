package hm4;

/* loaded from: classes8.dex */
public final class b implements hm4.a {
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.vt2 r11) {
        /*
            r10 = this;
            r0 = 0
            java.util.LinkedList r11 = r11.getList(r0)
            java.lang.String r1 = "getRevoke_tab_tips_info(...)"
            kotlin.jvm.internal.o.f(r11, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = kz5.d0.q(r11, r2)
            r1.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L19:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r11.next()
            r45.wt2 r3 = (r45.wt2) r3
            java.lang.String r3 = r3.getString(r0)
            r1.add(r3)
            goto L19
        L2d:
            java.util.Iterator r11 = r1.iterator()
        L31:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lf8
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto La1
            java.lang.String r3 = "Listen.Entrance"
            java.lang.String r4 = "Listen.MentionEntrance"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.util.List r3 = kz5.c0.i(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kz5.d0.q(r3, r2)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L59:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<zy2.b6> r6 = zy2.b6.class
            i95.m r6 = i95.n0.c(r6)
            zy2.b6 r6 = (zy2.b6) r6
            c61.l7 r6 = (c61.l7) r6
            zy2.fa r6 = r6.nk()
            com.tencent.mm.plugin.finder.extension.reddot.jb r5 = r6.L0(r5)
            r4.add(r5)
            goto L59
        L7b:
            java.util.Iterator r3 = r4.iterator()
        L7f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.tencent.mm.plugin.finder.extension.reddot.jb r5 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r5
            if (r5 == 0) goto L91
            java.lang.String r5 = r5.field_revokeId
            goto L92
        L91:
            r5 = r1
        L92:
            boolean r5 = kotlin.jvm.internal.o.b(r5, r0)
            if (r5 == 0) goto L7f
            goto L9a
        L99:
            r4 = r1
        L9a:
            com.tencent.mm.plugin.finder.extension.reddot.jb r4 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r4
            if (r4 == 0) goto La1
            r45.vs2 r3 = r4.field_ctrInfo
            goto La2
        La1:
            r3 = r1
        La2:
            if (r3 == 0) goto L31
            java.util.LinkedList r4 = r3.f388489g
            java.lang.String r5 = "show_infos"
            kotlin.jvm.internal.o.f(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        Lb0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r4.next()
            r45.f03 r5 = (r45.f03) r5
            java.lang.Class<qk.d9> r6 = qk.d9.class
            i95.m r6 = i95.n0.c(r6)
            qk.d9 r6 = (qk.d9) r6
            if (r0 != 0) goto Lc9
            java.lang.String r7 = ""
            goto Lca
        Lc9:
            r7 = r0
        Lca:
            ef0.z3 r6 = (ef0.z3) r6
            r6.getClass()
            em4.c r6 = em4.c.f255213a
            java.lang.Object[] r6 = new java.lang.Object[]{r7}
            java.lang.String r8 = "MicroMsg.TingRedDotReporter"
            java.lang.String r9 = "reportTingRedDotRevoked [%s]"
            com.tencent.mars.xlog.Log.i(r8, r9, r6)
            r6 = 4
            java.util.Map r5 = em4.c.b(r3, r5, r1, r6, r1)
            java.lang.String r6 = "view_id"
            java.lang.String r8 = "tyt_reddot"
            r5.put(r6, r8)
            java.lang.String r6 = "tab_tips_revoke_id"
            r5.put(r6, r7)
            java.lang.String r6 = "red_dot_revoked"
            em4.c.d(r6, r5)
            goto Lb0
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hm4.b.a(r45.vt2):void");
    }

    public void b(com.tencent.wechat.aff.newlife.FinderCmdItem cmdItem, int i17) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        int i18 = cmdItem.cmdId;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotSyncHandler", "handleCmd cmdId: " + cmdItem.cmdId + ", scene: " + i17);
        switch (i18) {
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL /* 40000 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotSyncHandler", "processTabTips");
                try {
                    r45.dz2 dz2Var = new r45.dz2();
                    com.tencent.mm.protobuf.g gVar = cmdItem.cmdBuf;
                    if (gVar != null) {
                        dz2Var.parseFrom(gVar.g());
                        d(dz2Var);
                        ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).e1(dz2Var, "ting_processTabTips");
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TingRedDotSyncHandler", "processTabTips cmdBuf null");
                    }
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingRedDotSyncHandler", e17, "processTabTips exception", new java.lang.Object[0]);
                    return;
                }
            case 40001:
                try {
                    r45.vt2 vt2Var = new r45.vt2();
                    com.tencent.mm.protobuf.g gVar2 = cmdItem.cmdBuf;
                    if (gVar2 != null) {
                        vt2Var.parseFrom(gVar2.g());
                        c(vt2Var);
                        a(vt2Var);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().o(vt2Var);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TingRedDotSyncHandler", "processRevokeTabTips cmdBuf null");
                    }
                    return;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingRedDotSyncHandler", e18, "processRevokeTabTips exception", new java.lang.Object[0]);
                    return;
                }
            default:
                return;
        }
    }

    public final void c(r45.vt2 vt2Var) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Listen.SlideOver");
        java.util.LinkedList list = vt2Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getRevoke_tab_tips_info(...)");
        java.util.Iterator it = list.iterator();
        boolean z17 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.wt2 wt2Var = (r45.wt2) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotSyncHandler", "onRevokeTabTips revoke_id: " + wt2Var.getString(0));
            if (kotlin.jvm.internal.o.b(wt2Var.getString(0), L0 != null ? L0.field_revokeId : null)) {
                z17 = true;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRevokeTabTips current.revokeId: ");
        sb6.append(L0 != null ? L0.field_revokeId : null);
        sb6.append(", needClearTaskBarRecommendData: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotSyncHandler", sb6.toString());
        if (z17) {
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).f252198f = null;
            gm4.a.f273557a.f("key_taskbar_recommend_data");
        }
    }

    public final void d(r45.dz2 dz2Var) {
        java.util.LinkedList<r45.f03> linkedList;
        r45.f03 f03Var;
        java.util.LinkedList<r45.gz2> list = dz2Var.getList(0);
        if (list != null) {
            for (r45.gz2 gz2Var : list) {
                r45.vs2 vs2Var = (r45.vs2) gz2Var.getCustom(0);
                if (vs2Var != null && (linkedList = vs2Var.f388489g) != null) {
                    for (r45.f03 f03Var2 : linkedList) {
                        if (!kotlin.jvm.internal.o.b(f03Var2 != null ? f03Var2.f373892i : null, "Listen.Entrance")) {
                            if (kotlin.jvm.internal.o.b(f03Var2 != null ? f03Var2.f373892i : null, "Listen.MentionEntrance")) {
                            }
                        }
                        r45.vs2 vs2Var2 = (r45.vs2) gz2Var.getCustom(0);
                        kotlin.jvm.internal.o.d(vs2Var2);
                        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                        java.lang.String str = f03Var2.f373892i;
                        if (str == null) {
                            str = "";
                        }
                        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0(str);
                        if (L0 != null) {
                            java.lang.String str2 = f03Var2.f373892i;
                            f03Var = L0.I0(str2 != null ? str2 : "");
                        } else {
                            f03Var = null;
                        }
                        qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
                        r45.vs2 vs2Var3 = L0 != null ? L0.field_ctrInfo : null;
                        ((ef0.z3) d9Var).getClass();
                        em4.c cVar = em4.c.f255213a;
                        if (vs2Var3 != null && f03Var != null && em4.c.f255213a.c(f03Var.f373892i)) {
                            java.util.Map b17 = em4.c.b(vs2Var3, f03Var, null, 4, null);
                            org.json.JSONObject a17 = ri.l0.a(em4.c.b(vs2Var2, f03Var2, null, 4, null));
                            if (a17 != null) {
                                java.lang.String jSONObject = a17.toString();
                                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                                byte[] bytes = jSONObject.getBytes(r26.c.f368865a);
                                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
                                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                                b17.put("base64_cover_reddot_info", encodeToString);
                            }
                            em4.c.d("red_dot_covered", b17);
                        }
                    }
                }
            }
        }
    }
}
