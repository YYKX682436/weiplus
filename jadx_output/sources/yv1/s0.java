package yv1;

/* loaded from: classes11.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f466152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f466153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f466154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f466155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f466156h;

    public s0(java.util.List list, yv1.n0 n0Var, long j17, long j18, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f466152d = list;
        this.f466153e = n0Var;
        this.f466154f = j17;
        this.f466155g = j18;
        this.f466156h = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long j17;
        java.lang.String str4;
        yv1.n0 n0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Sync delete messages, talker count: " + this.f466152d.size());
        if (kotlin.jvm.internal.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_use_new_sync_delete", "1"), "0")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Use old sync delete");
            java.util.List list = this.f466152d;
            yv1.n0 n0Var2 = this.f466153e;
            long j18 = this.f466154f;
            final long j19 = this.f466155g;
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f466156h;
            java.util.Map map = c01.w9.f37539b;
            java.lang.String str5 = " AND type = ";
            str = "MicroMsg.CleanService";
            java.lang.String str6 = " AND createTime >= ? AND createTime < ?)";
            java.lang.String str7 = " AND (type = ";
            if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
                final c01.j8 j8Var = (c01.j8) i95.n0.c(c01.j8.class);
                java.lang.String str8 = "voiceinfo";
                l75.k0 k0Var = gm0.j1.u().f273153f;
                if (n0Var2 != null) {
                    str3 = "videoinfo2";
                    str2 = " AND type IN ";
                    n0Var2.b(0, list.size());
                } else {
                    str2 = " AND type IN ";
                    str3 = "videoinfo2";
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                yv1.n0 n0Var3 = n0Var2;
                int i17 = 0;
                int i18 = 0;
                while (i17 < list.size()) {
                    int i19 = i17 + 1;
                    java.lang.String str9 = str6;
                    int min = java.lang.Math.min(i19, list.size());
                    final java.util.List subList = list.subList(i17, min);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
                    java.util.List list2 = list;
                    sb6.append(android.text.TextUtils.join(",", new pm5.l(subList, new c01.w9$$c())));
                    sb6.append(")");
                    java.lang.String sb7 = sb6.toString();
                    long nanoTime = java.lang.System.nanoTime();
                    c01.j8 j8Var2 = j8Var;
                    ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: c01.w9$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.util.Iterator it = subList.iterator();
                            while (it.hasNext()) {
                                ((com.tencent.mm.plugin.fts.logic.r3) j8Var).Ai((java.lang.String) it.next(), j19);
                            }
                        }
                    }, "SyncDeleteFTSTalker");
                    k0Var.b();
                    try {
                        try {
                            objArr[0] = java.lang.Long.valueOf(j18);
                            objArr[1] = java.lang.Long.valueOf(j19);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "deleteMsgByTalkerSync ");
                            k0Var.j("ImgInfo2", "DELETE FROM ImgInfo2 WHERE id IN (SELECT ImgInfo2.reserved1 FROM message JOIN ImgInfo2 ON message.msgId = ImgInfo2.msglocalid OR message.msgSvrId = ImgInfo2.msgSvrId WHERE talker IN " + sb7 + str5 + "3 AND message.createTime >= ? AND message.createTime < ?)", objArr, cancellationSignal);
                            k0Var.j("ImgInfo2", "DELETE FROM ImgInfo2 WHERE msglocalid IN (SELECT msgId FROM message WHERE talker IN " + sb7 + str5 + 3 + str9, objArr, cancellationSignal);
                            k0Var.j("ImgInfo2", "DELETE FROM ImgInfo2 WHERE msgSvrId IN (SELECT msgSvrId FROM message WHERE talker IN " + sb7 + str5 + 3 + str9, objArr, cancellationSignal);
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            sb8.append("(");
                            sb8.append(android.text.TextUtils.join(",", java.util.Arrays.asList(43, 62, 44, 486539313)));
                            sb8.append(")");
                            java.lang.String sb9 = sb8.toString();
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                            sb10.append("DELETE FROM videoinfo2 WHERE filename IN (SELECT videoinfo2.origin_file_name FROM message JOIN videoinfo2 ON message.imgPath = videoInfo2.filename WHERE talker IN ");
                            sb10.append(sb7);
                            java.lang.String str10 = str2;
                            sb10.append(str10);
                            sb10.append(sb9);
                            sb10.append(" AND message.createTime >= ? AND message.createTime < ?)");
                            long j27 = j18;
                            java.lang.String str11 = str3;
                            k0Var.j(str11, sb10.toString(), objArr, cancellationSignal);
                            k0Var.j(str11, "DELETE FROM videoinfo2 WHERE filename IN (SELECT imgPath FROM message WHERE talker IN " + sb7 + str10 + sb9 + str9, objArr, cancellationSignal);
                            pt0.e0 e0Var = pt0.f0.f358209b1;
                            if (e0Var.i()) {
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                                j17 = j19;
                                sb11.append("DELETE FROM videoinfo2 WHERE msglocalid IN (SELECT msgId FROM message WHERE talker IN ");
                                sb11.append(sb7);
                                sb11.append(str10);
                                sb11.append(sb9);
                                sb11.append(str9);
                                k0Var.j(str11, sb11.toString(), objArr, cancellationSignal);
                            } else {
                                j17 = j19;
                            }
                            java.lang.String str12 = str8;
                            k0Var.j(str12, "DELETE FROM voiceinfo WHERE FileName IN (SELECT imgPath FROM message WHERE talker IN " + sb7 + str5 + 34 + str9, objArr, cancellationSignal);
                            if (e0Var.j()) {
                                k0Var.j(str12, "DELETE FROM voiceinfo WHERE MsgLocalId IN (SELECT msgId FROM message WHERE talker IN " + sb7 + str5 + 34 + str9, objArr, cancellationSignal);
                            }
                            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                            sb12.append("DELETE FROM appattach WHERE msgInfoId IN (SELECT msgId FROM message WHERE talker IN ");
                            sb12.append(sb7);
                            java.lang.String str13 = str7;
                            sb12.append(str13);
                            sb12.append(49);
                            sb12.append(" OR type = ");
                            sb12.append(1090519089);
                            sb12.append(") AND createTime >= ? AND createTime < ?)");
                            k0Var.j("appattach", sb12.toString(), objArr, cancellationSignal);
                            k0Var.j("AppMessage", "DELETE FROM AppMessage WHERE msgId IN (SELECT msgId FROM message WHERE talker IN " + sb7 + str13 + "49 OR type >= 65585) AND createTime >= ? AND createTime < ?)", objArr, cancellationSignal);
                            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                            sb13.append("DELETE FROM message WHERE talker IN ");
                            sb13.append(sb7);
                            sb13.append(" AND createTime >= ? AND createTime < ?");
                            p75.e0 e0Var2 = (p75.e0) k0Var.z(sb13.toString());
                            e0Var2.a(objArr);
                            int b17 = e0Var2.b(cancellationSignal);
                            k0Var.r();
                            try {
                                k0Var.t();
                            } catch (java.lang.RuntimeException unused) {
                            }
                            i18 += b17;
                            if (n0Var3 != null) {
                                str4 = str5;
                                n0Var = n0Var3;
                                n0Var.b(min, list2.size());
                            } else {
                                str4 = str5;
                                n0Var = n0Var3;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "(time: %d, messages: %d) deleteMsgByTalkerSync: %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime) / 1000000), java.lang.Integer.valueOf(b17), sb7);
                            str8 = str12;
                            n0Var3 = n0Var;
                            str6 = str9;
                            str5 = str4;
                            j19 = j17;
                            i17 = i19;
                            list = list2;
                            str3 = str11;
                            str7 = str13;
                            str2 = str10;
                            j18 = j27;
                            j8Var = j8Var2;
                        } catch (com.tencent.wcdb.support.OperationCanceledException e17) {
                            int i27 = i18;
                            yv1.n0 n0Var4 = n0Var3;
                            if (n0Var4 == null) {
                                throw e17;
                            }
                            n0Var4.d(true, i27);
                            try {
                                k0Var.t();
                            } catch (java.lang.RuntimeException unused2) {
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            k0Var.t();
                        } catch (java.lang.RuntimeException unused3) {
                        }
                        throw th6;
                    }
                }
                int i28 = i18;
                yv1.n0 n0Var5 = n0Var3;
                if (n0Var5 != null) {
                    n0Var5.d(false, i28);
                }
            } else if (n0Var2 != null) {
                n0Var2.d(true, 0);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Use new sync delete");
            c01.w9.j(this.f466152d, this.f466153e, this.f466154f, this.f466155g, this.f466156h);
            str = "MicroMsg.CleanService";
        }
        com.tencent.mars.xlog.Log.i(str, "Done sync delete messages");
    }
}
