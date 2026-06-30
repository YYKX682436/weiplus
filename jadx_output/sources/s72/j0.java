package s72;

/* loaded from: classes12.dex */
public final class j0 extends jm0.g implements o72.y4 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashSet f404069i = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f404070f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f404071g;

    /* renamed from: h, reason: collision with root package name */
    public long f404072h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f404070f = jz5.h.b(new s72.d0(service));
    }

    public static final void T6(s72.j0 j0Var, r45.nq0 nq0Var) {
        j0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[favTagInfo] id = " + nq0Var.f381589d + ", name = " + nq0Var.f381590e + ", isDeleted = " + nq0Var.f381591f + ", seq = " + nq0Var.f381592g);
        t72.b bVar = t72.b.f416040a;
        t72.a e17 = bVar.e(nq0Var.f381589d);
        if (nq0Var.f381591f == 1) {
            if (e17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "not in database, return flow");
                return;
            } else {
                bVar.a(e17);
                return;
            }
        }
        if (e17 != null) {
            e17.field_id = nq0Var.f381589d;
            e17.field_name = nq0Var.f381590e;
            bVar.g(e17);
        } else {
            t72.a aVar = new t72.a();
            aVar.field_id = nq0Var.f381589d;
            aVar.field_name = nq0Var.f381590e;
            bVar.b(aVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(1:(1:(10:10|11|(4:14|(3:19|20|21)|22|12)|25|26|(2:30|(2:31|(3:33|(2:(4:39|(1:48)(1:43)|44|(2:46|47))|(3:50|51|(2:56|57))(1:61))(1:62)|59)(1:64)))(0)|65|66|(2:70|(1:72))|73)(2:75|76))(4:77|78|79|80))(11:113|(4:115|(1:117)(1:121)|118|(1:120))|122|123|124|125|126|127|128|129|(1:131)(1:132))|81|82|83|(4:85|(1:105)(1:89)|90|(3:92|(1:94)|(1:96)(1:97))(2:98|(1:100)(2:101|(1:103)(7:104|11|(1:12)|25|26|(3:28|30|(3:31|(0)(0)|59))(0)|65))))|66|(3:68|70|(0))|73))|141|6|(0)(0)|81|82|83|(0)|66|(0)|73|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0100, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029b A[EDGE_INSN: B:64:0x029b->B:65:0x029b BREAK  A[LOOP:1: B:31:0x0242->B:59:0x0242], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U6(s72.j0 r17, java.util.ArrayList r18, s72.h r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.U6(s72.j0, java.util.ArrayList, s72.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V6(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s72.k
            if (r0 == 0) goto L13
            r0 = r5
            s72.k r0 = (s72.k) r0
            int r1 = r0.f404076g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f404076g = r1
            goto L18
        L13:
            s72.k r0 = new s72.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f404074e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f404076g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f404073d
            s72.j0 r0 = (s72.j0) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.String r5 = "MicroMsg.FavSyncService"
            java.lang.String r2 = "[getAllFavTagsWithSuspend] start"
            com.tencent.mars.xlog.Log.i(r5, r2)
            r0.f404073d = r4
            r0.f404076g = r3
            java.lang.Object r5 = r4.W6(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r0 = r4
        L49:
            r0.getClass()
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1 = 352281(0x56019, float:4.93651E-40)
            r5.w(r1, r0)
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.V6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W6(kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.W6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope X6() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f404070f).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x019f -> B:11:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y6(long r26, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.Y6(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z6(java.util.List r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s72.o
            if (r0 == 0) goto L13
            r0 = r7
            s72.o r0 = (s72.o) r0
            int r1 = r0.f404117i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f404117i = r1
            goto L18
        L13:
            s72.o r0 = new s72.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f404115g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f404117i
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f404114f
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r2 = r0.f404113e
            s72.h r2 = (s72.h) r2
            java.lang.Object r4 = r0.f404112d
            s72.j0 r4 = (s72.j0) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L64
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "[handleBatchGetCgiCore] ids = "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.FavSyncService"
            com.tencent.mars.xlog.Log.i(r2, r7)
            s72.h r7 = new s72.h
            java.lang.String r2 = ""
            r4 = 0
            r7.<init>(r4, r2, r4, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r6)
            r4 = r5
            r6 = r2
            r2 = r7
        L64:
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L7a
            r0.f404112d = r4
            r0.f404113e = r2
            r0.f404114f = r6
            r0.f404117i = r3
            java.lang.Object r7 = r4.U6(r4, r6, r2, r0)
            if (r7 != r1) goto L64
            return r1
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.Z6(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void a7(java.util.List favObjects, java.lang.String source, yz5.a callback) {
        kotlin.jvm.internal.o.g(favObjects, "favObjects");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(callback, "callback");
        v65.i.b(X6(), null, new s72.r(this, favObjects, source, callback, null), 1, null);
    }

    public final boolean b7(r45.tp0 tp0Var, s72.h hVar, boolean z17, java.lang.String str) {
        o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var.f386638d);
        if (re6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] item = null, continue, source=" + str);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleBatchGetXml] batch get, source=" + str + ", xml = " + tp0Var.f386640f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tp0Var.f386640f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] xml is null, continue, source=" + str + ", favId=" + tp0Var.f386638d);
            pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "batchget_xml_empty", true, null, null, false, false, new s72.y(str, tp0Var), 60, null);
            return false;
        }
        java.lang.String str2 = tp0Var.f386640f;
        re6.field_xml = str2;
        if (!o72.d2.a(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] check illegal, source=" + str + ", xml = " + tp0Var.f386640f);
            hVar.f404046a = hVar.f404046a + 1;
            java.lang.String field_xml = re6.field_xml;
            kotlin.jvm.internal.o.f(field_xml, "field_xml");
            hVar.f404047b = field_xml;
            pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "batchget_xml_invalid_android_old", true, null, null, false, false, new s72.z(str, tp0Var), 60, null);
            return false;
        }
        boolean U0 = re6.U0(tp0Var.f386640f);
        if (z17 && !U0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] xml illegal, source=" + str + ", favId=" + tp0Var.f386638d + ", updateTime=" + tp0Var.f386642h + ", updateSeq=" + tp0Var.f386643i + "xml=" + tp0Var.f386640f);
            pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "batchget_xml_invalid", true, null, null, false, false, new s72.a0(str, tp0Var), 60, null);
            return false;
        }
        re6.field_flag = tp0Var.f386641g;
        re6.field_localSeq = tp0Var.f386643i;
        re6.field_updateTime = tp0Var.f386642h * 1000;
        o72.r2.G0(re6);
        o72.x1.Q0(re6);
        re6.field_itemStatus = 10;
        boolean update = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(re6, dm.i4.COL_LOCALID);
        if ((tp0Var.f386641g & 1) != 0) {
            o72.x1.k(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var.f386638d), null, 4);
        } else if (update && re6.field_type == 18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "handleBatchGetXml: notify note update, favLocalid:%s", java.lang.Long.valueOf(re6.field_localId));
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
            am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
            zlVar.field_localId = re6.field_localId;
            zlVar.f8578a = 13;
            notifyWNNoteOperationEvent.e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.c7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0437  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x02bb -> B:12:0x02bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0423 -> B:22:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(int r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.d7(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012f, code lost:
    
        if ((r8.length() == 0) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0289 -> B:11:0x029f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e7(kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.e7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void f7(int i17, int i18, yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[syncFavWithCallback] selector = " + i17);
        v65.i.b(X6(), null, new s72.h0(this, i17, i18, callback, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g7(int r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof s72.i0
            if (r0 == 0) goto L13
            r0 = r10
            s72.i0 r0 = (s72.i0) r0
            int r1 = r0.f404065g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f404065g = r1
            goto L18
        L13:
            s72.i0 r0 = new s72.i0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f404063e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f404065g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f404062d
            s72.j0 r8 = (s72.j0) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L61
        L3c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "[syncFavWithSuspend] selector = "
            r10.<init>(r2)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "MicroMsg.FavSyncService"
            com.tencent.mars.xlog.Log.i(r2, r10)
            o72.d2.m(r9)
            r0.f404062d = r7
            r0.f404065g = r5
            java.lang.Object r10 = r7.d7(r8, r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            r8 = r7
        L61:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            r8.getClass()
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 8217(0x2019, float:1.1514E-41)
            r2.w(r6, r5)
            r5 = 0
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 <= 0) goto L8d
            r2 = 0
            r0.f404062d = r2
            r0.f404065g = r4
            java.lang.Object r8 = r8.Y6(r9, r0)
            if (r8 != r1) goto L8d
            return r1
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.j0.g7(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
