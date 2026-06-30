package h62;

@j95.b(dependencies = {c42.l.class})
/* loaded from: classes15.dex */
public class d extends i95.w implements e42.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final l62.d[] f279184d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final l62.b[] f279185e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f279186f = new jt0.j(500);

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f279187g = new jt0.j(1000);

    /* renamed from: h, reason: collision with root package name */
    public boolean f279188h = false;

    public static h62.d vj() {
        return (h62.d) i95.n0.c(h62.d.class);
    }

    public void Ai(java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                j62.c cVar = (j62.c) it.next();
                if (cVar != null) {
                    if (cVar.field_exptType == 10) {
                        vy4.n nVar = new vy4.n();
                        nVar.f441508a = cVar.field_exptId;
                        nVar.f441510c = cVar.field_startTime;
                        nVar.f441511d = cVar.field_endTime;
                        nVar.f441509b = cVar.field_exptSeq;
                        nVar.f441512e = cVar.E();
                        linkedList.add(nVar);
                    }
                }
            }
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                r45.w8 w8Var = (r45.w8) it6.next();
                vy4.o oVar = new vy4.o();
                oVar.f441513a = w8Var.f388956d;
                oVar.f441514b = w8Var.f388957e;
                linkedList2.add(oVar);
            }
        }
        vy4.k kVar = (vy4.k) ((vy4.i) i95.n0.c(vy4.i.class));
        kVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new vy4.j(kVar, linkedList, linkedList2, list3), "cross_welab");
    }

    public final synchronized void Aj() {
        ((lt0.f) this.f279186f).clear();
        ((lt0.f) this.f279187g).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList Bi() {
        /*
            r8 = this;
            l62.d r0 = r8.tj()
            r0.getClass()
            java.lang.String r1 = "select exptId from ExptItem ORDER BY exptId ASC"
            r2 = 0
            r3 = 0
            l75.k0 r0 = r0.f316768d     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            android.database.Cursor r0 = r0.B(r1, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L34
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L57
        L19:
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            if (r3 == 0) goto L2b
            int r3 = r0.getInt(r2)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            r1.add(r3)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L57
            goto L19
        L2b:
            r3 = r1
            goto L34
        L2d:
            r3 = move-exception
            goto L40
        L2f:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L40
        L34:
            if (r0 == 0) goto L56
            r0.close()
            goto L56
        L3a:
            r0 = move-exception
            goto L5a
        L3c:
            r0 = move-exception
            r1 = r3
            r3 = r0
            r0 = r1
        L40:
            java.lang.String r4 = "MicroMsg.ExptStorage"
            java.lang.String r5 = "get all expt id error[%s]"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L57
            r6[r2] = r3     // Catch: java.lang.Throwable -> L57
            com.tencent.mars.xlog.Log.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L55
            r0.close()
        L55:
            r3 = r1
        L56:
            return r3
        L57:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L5a:
            if (r3 == 0) goto L5f
            r3.close()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.Bi():java.util.ArrayList");
    }

    public final void Bj(int i17) {
        if (i17 <= 0) {
            i17 = 1;
        }
        kk.v vVar = new kk.v(gm0.j1.b().h());
        int abs = (int) java.lang.Math.abs(vVar.longValue() % i17);
        int i18 = (((int) com.tencent.mm.sdk.platformtools.t8.i1()) + (abs * 60)) - 86400;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT;
        int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
        int min = java.lang.Math.min(intValue, i18);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(min));
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "reset get expt time tryGetTime[%d] uin[%d] hashTime[%d] needUpdateTime[%d] lastTime[%d] fixLastUpdateTime[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(vVar.longValue()), java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(min));
    }

    public void Cj(boolean z17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEXT_GET_EXPT_APP_IS_INCREMENT_BOOLEAN, java.lang.Boolean.valueOf(z17));
        if (z17) {
            jx3.f.INSTANCE.idkeyStat(863L, 168L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(863L, 169L, 1L, false);
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ExptService", "set next get exptapp isIncrement [%b]", java.lang.Boolean.valueOf(z17));
    }

    public float Di(e42.b0 b0Var, float f17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? f17 : com.tencent.mm.sdk.platformtools.t8.L(Zi, f17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r5 == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dj(j62.c r4, j62.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L5f
            if (r4 == 0) goto Lf
            java.util.HashMap r0 = r4.E()
            goto L13
        Lf:
            java.util.HashMap r0 = r5.E()
        L13:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            if (r4 == 0) goto L2c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r4 = r4.field_exptId
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            goto L3d
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r5.f297879d
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L3d:
            r5 = 0
            r1[r5] = r4
            r4 = 1
            if (r0 == 0) goto L4a
            int r5 = r0.size()
            if (r5 != r4) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            r1[r4] = r0
            java.lang.String r4 = "Receive expt : %s %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            ku5.u0 r5 = ku5.t0.f312615d
            h62.a r0 = new h62.a
            r0.<init>(r3, r4)
            ku5.t0 r5 = (ku5.t0) r5
            r5.B(r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.Dj(j62.c, j62.a):void");
    }

    public void Ej(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.expt.ui.ExptAppDebugUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/expt/model/ExptService", "showExptAppUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/expt/model/ExptService", "showExptAppUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Fj(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.expt.ui.ExptDebugUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/expt/model/ExptService", "showExptUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/expt/model/ExptService", "showExptUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Gj(int i17) {
        gm0.j1.d().g(new h62.l(i17));
    }

    public void Hj(int i17) {
        ((ku5.t0) ku5.t0.f312615d).h(new h62.c(this, i17), "get_expt_app");
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x060b, code lost:
    
        if (r4 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060d, code lost:
    
        r4.w(java.lang.Long.valueOf(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0614, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptKeyMapIdStorage", "end update expt keymapid map size[%d] ret[%s] cost[%d]", java.lang.Integer.valueOf(r3.size()), java.lang.Integer.valueOf(r10), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x05ed, code lost:
    
        if (r4 != null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0561, code lost:
    
        if (r4 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0563, code lost:
    
        r4.w(java.lang.Long.valueOf(r34));
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x056a, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptKeyMapIdStorage", "end insert expt keymapid map size[%d] ret[%s] cost[%d]", java.lang.Integer.valueOf(r7.size()), java.lang.Integer.valueOf(r15), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0540, code lost:
    
        if (r4 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x021c, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptKeyMapIdStorage", "deleteExptKeyMapIdById exptIds size[%d] ret[%d]", java.lang.Integer.valueOf(r47.size()), java.lang.Integer.valueOf(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x01ea, code lost:
    
        if (r5 != null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0738 A[LOOP:8: B:208:0x0732->B:210:0x0738, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0326  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ij(int r46, java.util.List r47, java.util.List r48, java.util.List r49) {
        /*
            Method dump skipped, instructions count: 2101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.Ij(int, java.util.List, java.util.List, java.util.List):void");
    }

    public void Jj(int i17, java.util.List list, java.util.List list2) {
        int i18;
        java.util.HashMap E;
        com.tencent.mm.sdk.platformtools.o4 d17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z18 = true;
        if (i17 == 1) {
            j62.b f17 = j62.b.f();
            f17.getClass();
            try {
                f17.d().clear();
                f17.e().clear();
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.ExptAppReportStruct exptAppReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ExptAppReportStruct();
        com.tencent.mm.autogen.mmdata.rpt.ExptAppReportDeleteStruct exptAppReportDeleteStruct = new com.tencent.mm.autogen.mmdata.rpt.ExptAppReportDeleteStruct();
        int i19 = 0;
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                exptAppReportStruct.f56127d = intValue;
                exptAppReportStruct.f56128e = 0;
                exptAppReportStruct.f56129f = 3;
                exptAppReportStruct.l();
                j62.a g17 = j62.b.f().g(intValue);
                hashSet.add(g17);
                if (g17 != null) {
                    if (g17.f297889q == 7 ? z18 : false) {
                        h62.d vj6 = vj();
                        long j17 = g17.f297879d;
                        vj6.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeScriptDelete configID [%d]", java.lang.Long.valueOf(j17));
                        com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent newEdgeScriptDeleteEvent = new com.tencent.mm.autogen.events.NewEdgeScriptDeleteEvent();
                        newEdgeScriptDeleteEvent.f54529g.f6162a = j17;
                        newEdgeScriptDeleteEvent.e();
                    }
                }
                if (g17 != null) {
                    if (g17.f297889q == 8) {
                        h62.d vj7 = vj();
                        long j18 = g17.f297879d;
                        vj7.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeSqlDelete configID [%d]", java.lang.Long.valueOf(j18));
                        com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent newEdgeSqlDeleteEvent = new com.tencent.mm.autogen.events.NewEdgeSqlDeleteEvent();
                        newEdgeSqlDeleteEvent.f54531g.f6360a = j18;
                        newEdgeSqlDeleteEvent.e();
                    }
                }
                if (g17 != null) {
                    exptAppReportDeleteStruct.f56124d = g17.f297879d;
                    exptAppReportDeleteStruct.f56125e = g17.f297881f;
                    exptAppReportDeleteStruct.f56126f = g17.f297882g;
                    exptAppReportDeleteStruct.l();
                }
                z18 = true;
            }
        }
        if (list2 != null && list2.size() > 0) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                j62.a aVar = (j62.a) it6.next();
                hashSet.add(aVar);
                exptAppReportStruct.f56127d = aVar.f297879d;
                exptAppReportStruct.f56128e = aVar.f297881f;
                exptAppReportStruct.f56129f = 2;
                exptAppReportStruct.f56130g = aVar.f297882g;
                exptAppReportStruct.l();
                if (aVar.f297889q == 7) {
                    h62.d vj8 = vj();
                    long j19 = aVar.f297879d;
                    vj8.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeScriptUpdate configID [%d]", java.lang.Long.valueOf(j19));
                    com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent newEdgeScriptUpdateEvent = new com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent();
                    am.bl blVar = newEdgeScriptUpdateEvent.f54530g;
                    blVar.f6260a = j19;
                    blVar.f6261b = aVar;
                    newEdgeScriptUpdateEvent.e();
                }
                if (aVar.f297889q == 8) {
                    h62.d vj9 = vj();
                    long j27 = aVar.f297879d;
                    vj9.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notifyNewEdgeSqlUpdate configID [%d]", java.lang.Long.valueOf(j27));
                    com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent newEdgeSqlUpdateEvent = new com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent();
                    am.dl dlVar = newEdgeSqlUpdateEvent.f54532g;
                    dlVar.f6475a = j27;
                    dlVar.f6476b = aVar;
                    newEdgeSqlUpdateEvent.e();
                }
            }
        }
        j62.b f18 = j62.b.f();
        ((kk.l) f18.f297892a).clear();
        if (list == null || list.size() <= 0 || (d17 = f18.d()) == null) {
            i18 = 0;
        } else {
            java.util.Iterator it7 = list.iterator();
            i18 = 0;
            while (it7.hasNext()) {
                int intValue2 = ((java.lang.Integer) it7.next()).intValue();
                if (d17.contains(intValue2 + "")) {
                    d17.remove(intValue2 + "");
                    i18++;
                }
            }
        }
        j62.b f19 = j62.b.f();
        ((kk.l) f19.f297892a).clear();
        if (list2 != null && list2.size() > 0) {
            com.tencent.mm.sdk.platformtools.o4 d18 = f19.d();
            com.tencent.mm.sdk.platformtools.o4 e17 = f19.e();
            if (d18 != null && e17 != null) {
                java.util.Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    j62.a aVar2 = (j62.a) it8.next();
                    if (aVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f297883h) && (E = aVar2.E()) != null && E.size() > 0) {
                        java.util.Iterator it9 = E.keySet().iterator();
                        while (it9.hasNext()) {
                            e17.putInt((java.lang.String) it9.next(), aVar2.f297879d);
                        }
                        d18.putString(aVar2.f297879d + "", aVar2.f297883h);
                        i19++;
                    }
                }
            }
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        new com.tencent.mm.autogen.events.ExptChangeEvent().c("update_expt");
        zj(null, hashSet);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "update Expt app flag = %d, delCount = %d, replaceCount = %d cost = %d mmkvCost = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2));
    }

    public int Ni(e42.b0 b0Var, int i17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? i17 : com.tencent.mm.sdk.platformtools.t8.P(Zi, i17);
    }

    public int Ri(e42.b0 b0Var, bm5.h0 h0Var, int i17) {
        return Ni(b0Var, ((java.lang.Integer) bm5.o1.f22719a.b(h0Var, java.lang.Integer.valueOf(i17))).intValue());
    }

    public long Ui(e42.b0 b0Var, long j17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? j17 : com.tencent.mm.sdk.platformtools.t8.V(Zi, j17);
    }

    public java.lang.String Vi(e42.b0 b0Var, java.lang.String str) {
        return Zi(b0Var, str, true);
    }

    public final java.lang.String Zi(e42.b0 b0Var, java.lang.String str, boolean z17) {
        return bj(b0Var == null ? null : b0Var.name(), str, z17);
    }

    public java.lang.String aj(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return bj(str, str2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:20:0x0044, B:21:0x004c, B:24:0x0054, B:26:0x005a, B:29:0x0062, B:31:0x006e, B:33:0x0075, B:35:0x0089, B:36:0x00a2, B:38:0x00ac, B:39:0x00d7), top: B:19:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String bj(java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.bj(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public java.util.HashMap cj(int i17, boolean z17, com.tencent.mm.autogen.mmdata.rpt.XExptClientRptStruct xExptClientRptStruct, com.tencent.mm.pointers.PBool pBool) {
        java.util.HashMap hashMap = null;
        if (i17 <= 0) {
            return null;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        j62.c oj6 = oj(i17);
        if (oj6 == null || com.tencent.mm.sdk.platformtools.t8.K0(oj6.field_exptContent)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "expt item is null or expt content is null.");
        } else if (!z17 || oj6.y0()) {
            hashMap = oj6.E();
            if (oj6.g0()) {
                pBool.value = true;
                if (xExptClientRptStruct != null) {
                    xExptClientRptStruct.f63067d = oj6.field_exptId;
                    xExptClientRptStruct.f63068e = oj6.field_groupId;
                    xExptClientRptStruct.f63069f = oj6.field_exptSeq;
                    xExptClientRptStruct.f63070g = oj6.field_startTime;
                    xExptClientRptStruct.f63071h = oj6.field_endTime;
                    xExptClientRptStruct.f63074k = oj6.field_bucketSrc;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "expt time is invalid time[%d %d] seq[%d]", java.lang.Long.valueOf(oj6.field_startTime), java.lang.Long.valueOf(oj6.field_endTime), java.lang.Integer.valueOf(oj6.field_exptSeq));
        }
        android.os.SystemClock.elapsedRealtime();
        return hashMap;
    }

    public boolean fj(e42.b0 b0Var, boolean z17) {
        java.lang.String Zi = Zi(b0Var, "", true);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? z17 : com.tencent.mm.sdk.platformtools.t8.P(Zi, z17 ? 1 : 0) != 0;
    }

    public float hj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f22719a;
        float f17 = o1Var.f(eVar);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return o1Var.m(eVar) == 0 ? com.tencent.mm.sdk.platformtools.t8.L(aj(eVar.k(), null), f17) : o1Var.f(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        ((lt0.f) r0).put(r15, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int ij(java.lang.String r15) {
        /*
            r14 = this;
            kk.j r0 = r14.f279187g
            r1 = r0
            lt0.f r1 = (lt0.f) r1
            java.lang.Object r1 = r1.get(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L12
            int r15 = r1.intValue()
            return r15
        L12:
            l62.b r1 = r14.pj()
            r1.getClass()
            r2 = 1
            r3 = 0
            r4 = -1
            r5 = 0
            l75.k0 r6 = r1.f316763d     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r7 = "ExptKeyMapId"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r1 = "exptId"
            r8[r3] = r1     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r9 = "exptKey=?"
            java.lang.String[] r10 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r5 = r6.E(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r5 == 0) goto L41
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r1 == 0) goto L41
            int r1 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = r1
        L41:
            if (r5 == 0) goto L5e
            goto L5b
        L44:
            r15 = move-exception
            goto L68
        L46:
            r1 = move-exception
            java.lang.String r6 = "MicroMsg.ExptKeyMapIdStorage"
            java.lang.String r7 = "get expt id [%s] [%s]"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L44
            r8[r3] = r15     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            r8[r2] = r1     // Catch: java.lang.Throwable -> L44
            com.tencent.mars.xlog.Log.e(r6, r7, r8)     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L5e
        L5b:
            r5.close()
        L5e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            lt0.f r0 = (lt0.f) r0
            r0.put(r15, r1)
            return r4
        L68:
            if (r5 == 0) goto L6d
            r5.close()
        L6d:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.ij(java.lang.String):int");
    }

    public boolean mj(e42.b0 b0Var, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        j62.c oj6;
        if (pInt == null || pInt2 == null) {
            return false;
        }
        if ((gm0.j1.h() && gm0.j1.a()) ? false : true) {
            return j62.e.g().b(b0Var.name(), pInt, pInt2);
        }
        int ij6 = ij(b0Var.name());
        if (ij6 <= 0 || (oj6 = oj(ij6)) == null) {
            return false;
        }
        pInt.value = oj6.field_exptId;
        pInt2.value = oj6.field_groupId;
        return true;
    }

    public int nj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f22719a;
        int h17 = o1Var.h(eVar);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return o1Var.m(eVar) == 0 ? com.tencent.mm.sdk.platformtools.t8.P(aj(eVar.k(), null), h17) : o1Var.h(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j62.c oj(int r15) {
        /*
            r14 = this;
            kk.j r0 = r14.f279186f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = r0
            lt0.f r2 = (lt0.f) r2
            java.lang.Object r1 = r2.get(r1)
            j62.c r1 = (j62.c) r1
            if (r1 == 0) goto L12
            return r1
        L12:
            l62.d r1 = r14.tj()
            r1.getClass()
            r2 = 0
            r3 = 1
            r4 = 0
            l75.k0 r5 = r1.f316768d     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r6 = "ExptItem"
            r7 = 0
            java.lang.String r8 = "exptId=?"
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r1.append(r15)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r10 = ""
            r1.append(r10)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r9[r2] = r1     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r1 = r5.E(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            if (r1 == 0) goto L58
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L85
            if (r5 == 0) goto L58
            j62.c r5 = new j62.c     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L85
            r5.convertFrom(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L85
            r4 = r5
            goto L58
        L51:
            r4 = move-exception
            goto L64
        L53:
            r5 = move-exception
            r13 = r5
            r5 = r4
            r4 = r13
            goto L64
        L58:
            if (r1 == 0) goto L79
            r1.close()
            goto L79
        L5e:
            r15 = move-exception
            goto L87
        L60:
            r1 = move-exception
            r5 = r4
            r4 = r1
            r1 = r5
        L64:
            java.lang.String r6 = "MicroMsg.ExptStorage"
            java.lang.String r7 = "get expt error [%s]"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L85
            r3[r2] = r4     // Catch: java.lang.Throwable -> L85
            com.tencent.mars.xlog.Log.e(r6, r7, r3)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L78
            r1.close()
        L78:
            r4 = r5
        L79:
            if (r4 == 0) goto L84
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            lt0.f r0 = (lt0.f) r0
            r0.put(r15, r4)
        L84:
            return r4
        L85:
            r15 = move-exception
            r4 = r1
        L87:
            if (r4 == 0) goto L8c
            r4.close()
        L8c:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.oj(int):j62.c");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService", "onAccountRelease");
        Aj();
        ((ku5.t0) ku5.t0.f312615d).A("manual_get_expt");
        java.util.HashMap hashMap = k62.a.f304526a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptServiceShell", "destroy");
        k62.a.f304527b.dead();
        k62.a.f304526a.clear();
    }

    public final l62.b pj() {
        l62.b[] bVarArr = this.f279185e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                l62.b[] bVarArr2 = this.f279185e;
                if (bVarArr2[0] == null) {
                    bVarArr2[0] = new l62.b(((c42.l) i95.n0.c(c42.l.class)).wi());
                }
            }
        }
        return this.f279185e[0];
    }

    public long qj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f22719a;
        long j17 = o1Var.j(eVar);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return o1Var.m(eVar) == 0 ? com.tencent.mm.sdk.platformtools.t8.V(aj(eVar.k(), null), j17) : o1Var.j(eVar);
    }

    public int rj(e42.b0 b0Var, int i17) {
        java.lang.String Zi = Zi(b0Var, "", false);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? i17 : com.tencent.mm.sdk.platformtools.t8.P(Zi, i17);
    }

    public boolean sj(e42.b0 b0Var, boolean z17) {
        java.lang.String Zi = Zi(b0Var, "", false);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? z17 : com.tencent.mm.sdk.platformtools.t8.P(Zi, z17 ? 1 : 0) != 0;
    }

    public final l62.d tj() {
        l62.d[] dVarArr = this.f279184d;
        if (dVarArr[0] == null) {
            synchronized (dVarArr) {
                l62.d[] dVarArr2 = this.f279184d;
                if (dVarArr2[0] == null) {
                    dVarArr2[0] = new l62.d(((c42.l) i95.n0.c(c42.l.class)).wi());
                }
            }
        }
        return this.f279184d[0];
    }

    public java.lang.String uj(q55.e eVar) {
        bm5.o1 o1Var = bm5.o1.f22719a;
        java.lang.String l17 = o1Var.l(eVar);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return o1Var.m(eVar) == 0 ? aj(eVar.k(), l17) : o1Var.l(eVar);
    }

    public final void wi(int i17) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            return;
        }
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0)).intValue();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_INTERVAL_SEC_INT, 86400)).intValue();
        if (intValue2 <= 3600) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "interval is less than 1 hour, something warn here!!!");
            intValue2 = 3600;
        }
        if (com.tencent.mm.sdk.platformtools.t8.H1(intValue) >= intValue2) {
            Gj(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptKeyMapIdStorage", "get key count[%d] cost[%d]", java.lang.Long.valueOf(r6), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r5 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long wj() {
        /*
            r10 = this;
            l62.b r0 = r10.pj()
            r0.getClass()
            java.lang.String r1 = "MicroMsg.ExptKeyMapIdStorage"
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            r5 = 0
            r6 = 0
            l75.k0 r0 = r0.f316763d     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r8 = "SELECT count(*) FROM ExptKeyMapId"
            android.database.Cursor r5 = r0.B(r8, r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r5 == 0) goto L27
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r0 == 0) goto L27
            long r6 = r5.getLong(r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
        L27:
            if (r5 == 0) goto L40
            goto L3d
        L2a:
            r0 = move-exception
            goto L57
        L2c:
            r0 = move-exception
            java.lang.String r8 = "get key count error [%s]"
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a
            r9[r4] = r0     // Catch: java.lang.Throwable -> L2a
            com.tencent.mars.xlog.Log.e(r1, r8, r9)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L40
        L3d:
            r5.close()
        L40:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "get key count[%d] cost[%d]"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return r6
        L57:
            if (r5 == 0) goto L5c
            r5.close()
        L5c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.d.wj():long");
    }

    public void xj(j62.c cVar, boolean z17) {
        if (cVar != null && cVar.w0()) {
            if (cVar.field_subType == 1) {
                h62.d vj6 = vj();
                java.lang.String A0 = cVar.A0();
                boolean z07 = cVar.z0();
                vj6.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notify session config json[%b] needReport[%b] isDel[%b]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(A0)), java.lang.Boolean.valueOf(z07), java.lang.Boolean.FALSE);
                com.tencent.mm.autogen.events.SessionConfigChangeEvent sessionConfigChangeEvent = new com.tencent.mm.autogen.events.SessionConfigChangeEvent();
                am.st stVar = sessionConfigChangeEvent.f54758g;
                stVar.f7933a = A0;
                stVar.f7935c = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(A0));
                stVar.f7934b = java.lang.Boolean.valueOf(z07);
                sessionConfigChangeEvent.e();
            }
            if (cVar.field_subType == 2) {
                h62.d vj7 = vj();
                java.lang.String A02 = cVar.A0();
                vj7.getClass();
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(A02));
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notify session uba config json[%b] isDel[%b]", valueOf, bool);
                com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent sessionUBAConfigChangeEvent = new com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent();
                am.wt wtVar = sessionUBAConfigChangeEvent.f54762g;
                wtVar.f8322a = A02;
                wtVar.f8323b = bool;
                sessionUBAConfigChangeEvent.e();
            }
            if (cVar.field_subType == 3) {
                h62.d vj8 = vj();
                java.util.HashMap hashMap = cVar.H;
                long j17 = 0;
                if (hashMap != null && hashMap.size() > 0) {
                    j17 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) cVar.H.get("jsoncfg_param_" + cVar.field_exptId + "_sessionpageid"), 0L);
                }
                java.lang.String A03 = cVar.A0();
                boolean z08 = cVar.z0();
                vj8.getClass();
                java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
                java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z08);
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notify session page config sessionPageId [%d] json[%s] needReport[%b] isDel[%b]", valueOf2, A03, valueOf3, bool2);
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent sessionPageConfigChangeEvent = new com.tencent.mm.autogen.events.SessionPageConfigChangeEvent();
                am.vt vtVar = sessionPageConfigChangeEvent.f54761g;
                vtVar.f8215a = j17;
                vtVar.f8216b = A03;
                vtVar.f8218d = bool2;
                vtVar.f8219e = java.lang.Boolean.valueOf(z08);
                vtVar.f8217c = new java.util.ArrayList();
                vtVar.f8220f = 1;
                sessionPageConfigChangeEvent.e();
            }
            if (cVar.field_subType == 4) {
                h62.d vj9 = vj();
                long j18 = cVar.field_exptId;
                java.lang.String A04 = cVar.A0();
                vj9.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notify session view black list config sessionPageId [%d] json[%s] isDel[%b]", java.lang.Long.valueOf(j18), A04, java.lang.Boolean.valueOf(z17));
                com.tencent.mm.autogen.events.SessionViewBlackListChangeEvent sessionViewBlackListChangeEvent = new com.tencent.mm.autogen.events.SessionViewBlackListChangeEvent();
                sessionViewBlackListChangeEvent.f54763g.getClass();
                sessionViewBlackListChangeEvent.e();
            }
            if (cVar.field_subType == 5) {
                h62.d vj10 = vj();
                long j19 = cVar.field_exptId;
                java.lang.String A05 = cVar.A0();
                vj10.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notify session edge script config sessionPageId [%d] json[%s] isDel[%b]", java.lang.Long.valueOf(j19), A05, java.lang.Boolean.valueOf(z17));
                com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent sessionEdgeScriptChangeEvent = new com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent();
                java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(z17);
                am.tt ttVar = sessionEdgeScriptChangeEvent.f54759g;
                ttVar.f8036c = valueOf4;
                ttVar.f8035b = A05;
                ttVar.f8034a = j19;
                sessionEdgeScriptChangeEvent.e();
            }
            if (cVar.field_subType == 6) {
                h62.d vj11 = vj();
                long j27 = cVar.field_exptId;
                java.lang.String A06 = cVar.A0();
                vj11.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notify session edge sql config sessionPageId [%d] json[%s] isDel[%b]", java.lang.Long.valueOf(j27), A06, java.lang.Boolean.valueOf(z17));
                com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent sessionEdgeSqlChangeEvent = new com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent();
                java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(z17);
                am.ut utVar = sessionEdgeSqlChangeEvent.f54760g;
                utVar.f8137c = valueOf5;
                utVar.f8136b = A06;
                utVar.f8135a = j27;
                sessionEdgeSqlChangeEvent.e();
            }
        }
    }

    public void yj(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "receive expt xml but content is null");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        j62.c cVar = new j62.c();
        if (cVar.t0(str)) {
            if (cVar.field_exptId == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 9L, 1L, false);
                try {
                    Bj(new org.json.JSONObject(str).optInt("TryGetTime"));
                    this.f279188h = true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExptService", e17, "on get xml msg reset get expt time error [%s]", e17.toString());
                }
                Cj(false);
                Hj(4);
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService", "rece xml to get expt app");
                return;
            }
            if (cVar.field_exptSeq < 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 3L, 1L, false);
                linkedList.add(java.lang.Integer.valueOf(cVar.field_exptId));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 4L, 1L, false);
                linkedList2.add(cVar);
            }
        }
        Ij(0, linkedList, linkedList2, null);
        Dj(cVar, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "received expt xml [%s] ", str);
    }

    public void zj(java.util.HashSet hashSet, java.util.HashSet hashSet2) {
        int i17;
        java.util.HashMap E;
        java.util.HashMap E2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i18 = 0;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            i17 = 0;
            while (it.hasNext()) {
                j62.c cVar = (j62.c) it.next();
                if (cVar != null && (E2 = cVar.E()) != null) {
                    for (java.lang.String str : E2.keySet()) {
                        com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent = new com.tencent.mm.autogen.events.ConfigUpdatedEvent();
                        configUpdatedEvent.f54072g.f7126a = str;
                        configUpdatedEvent.e();
                        i17++;
                    }
                }
            }
        } else {
            i17 = 0;
        }
        if (hashSet2 != null) {
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                j62.a aVar = (j62.a) it6.next();
                if (aVar != null && (E = aVar.E()) != null) {
                    for (java.lang.String str2 : E.keySet()) {
                        com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent2 = new com.tencent.mm.autogen.events.ConfigUpdatedEvent();
                        configUpdatedEvent2.f54072g.f7126a = str2;
                        configUpdatedEvent2.e();
                        i18++;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "notifyExptChange cost[%d] notifyExptCount[%d] notifyExptAppCount[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
