package s72;

/* loaded from: classes12.dex */
public final class s implements o72.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f404145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f404147c;

    public s(java.util.LinkedList linkedList, s72.j0 j0Var, kotlin.jvm.internal.g0 g0Var) {
        this.f404145a = linkedList;
        this.f404146b = j0Var;
        this.f404147c = g0Var;
    }

    public final boolean a() {
        byte[] d17;
        boolean z17;
        boolean z18;
        boolean update;
        long j17;
        while (true) {
            java.util.LinkedList linkedList = this.f404145a;
            if (linkedList.isEmpty()) {
                return true;
            }
            r45.b50 b50Var = (r45.b50) linkedList.getFirst();
            linkedList.removeFirst();
            int i17 = b50Var.f370530d;
            s72.j0 j0Var = this.f404146b;
            if (i17 == 200) {
                byte[] d18 = x51.j1.d(b50Var.f370531e);
                if (d18 == null) {
                    continue;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] cmd id = " + b50Var.f370530d + ", buffer size = " + d18.length);
                    com.tencent.mm.protobuf.f parseFrom = new r45.d4().parseFrom(d18);
                    kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddFavItem");
                    r45.d4 d4Var = (r45.d4) parseFrom;
                    java.util.HashSet hashSet = s72.j0.f404069i;
                    j0Var.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] favId = " + d4Var.f372060d + ", flag = " + d4Var.f372062f + ", update time = " + d4Var.f372063g);
                    if ((d4Var.f372062f & 1) != 0) {
                        o72.x1.l(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(d4Var.f372060d), false, null, 2, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] delete fav, favId = " + d4Var.f372060d);
                        j17 = -1;
                    } else {
                        o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(d4Var.f372060d);
                        if (re6 == null) {
                            re6 = new o72.r2();
                            re6.field_updateTime = d4Var.f372063g * 1000;
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        re6.field_id = d4Var.f372060d;
                        int i18 = d4Var.f372064h;
                        re6.field_updateSeq = i18;
                        if (re6.field_localSeq == i18) {
                            z18 = z17;
                            re6.field_updateTime = d4Var.f372063g * 1000;
                        } else {
                            z18 = z17;
                        }
                        re6.field_flag = d4Var.f372062f;
                        re6.field_type = d4Var.f372061e;
                        if (z18) {
                            re6.field_localId = java.lang.System.currentTimeMillis() + j0Var.f404072h;
                            update = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().insert(re6);
                            if (!update) {
                                java.lang.Long Y6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Y6();
                                j0Var.f404072h = (Y6.longValue() - re6.field_localId) + 1;
                                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] insert new failed, try fix localid { old:" + re6.field_localId + ", max:" + Y6 + " } and insert again");
                                re6.field_localId = Y6.longValue() + 1;
                                update = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().insert(re6);
                            }
                            if (update) {
                                o72.d2.i(true, true);
                            } else {
                                o72.d2.i(false, false);
                            }
                            j0Var.f404072h++;
                        } else {
                            update = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(re6, dm.i4.COL_LOCALID);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[updateFavItemInfoDB] finish favId = " + d4Var.f372060d + ", need insert = " + z18 + ", dbRet = " + update);
                        j17 = update ? d4Var.f372063g : -20240306L;
                    }
                    kotlin.jvm.internal.g0 g0Var = this.f404147c;
                    if (j17 == -20240306) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] update db failed, ignore cur sync resp");
                        g0Var.f310121d = -20240306L;
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] update time = " + j17 + ", minUpdateTime = " + g0Var.f310121d);
                    long j18 = g0Var.f310121d;
                    if (j18 < 0 || (j17 > 0 && j17 < j18)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] min update time change, last min update time = " + g0Var.f310121d + ", new min update time = " + j17);
                        g0Var.f310121d = j17;
                    }
                }
            }
            if (b50Var.f370530d == 229 && (d17 = x51.j1.d(b50Var.f370531e)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDB] cmd id = " + b50Var.f370530d + ", buffer size = " + d17.length);
                com.tencent.mm.protobuf.f parseFrom2 = new r45.nq0().parseFrom(d17);
                kotlin.jvm.internal.o.e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavTag");
                s72.j0.T6(j0Var, (r45.nq0) parseFrom2);
            }
        }
    }
}
