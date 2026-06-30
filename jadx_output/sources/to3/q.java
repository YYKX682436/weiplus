package to3;

/* loaded from: classes9.dex */
public class q {

    /* renamed from: c, reason: collision with root package name */
    public static final int f420973c;

    /* renamed from: d, reason: collision with root package name */
    public static int f420974d = 5000;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f420975a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f420976b;

    static {
        int intValue;
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, null);
        if (m17 != null) {
            int intValue2 = ((java.lang.Integer) m17).intValue();
            f420974d = intValue2;
            if (intValue2 == 0) {
                f420974d = 5000;
            }
        }
        gm0.j1.i();
        java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_MAX_POS_TIME_INT, 0);
        if (m18 == null || (intValue = ((java.lang.Integer) m18).intValue()) == 0) {
            return;
        }
        f420973c = intValue;
    }

    public q() {
        to3.o oVar = new to3.o(this);
        this.f420975a = oVar;
        this.f420976b = new com.tencent.mm.sdk.platformtools.b4(new to3.p(this), false);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, oVar);
    }

    public static void a(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        wo3.q D0 = to3.c0.Ai().Di().D0(str);
        if (D0 != null) {
            b(D0, i17);
            return;
        }
        wo3.q qVar = new wo3.q();
        qVar.field_reqkey = str;
        qVar.field_status = i17;
        to3.c0.Ai().Di().P0(qVar);
    }

    public static boolean b(wo3.q qVar, int i17) {
        if (i17 == 4) {
            i17 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        }
        boolean c17 = c(qVar.field_status, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "in changeStatus: isallow=%b; old status = %d; new status = %d", java.lang.Boolean.valueOf(c17), java.lang.Integer.valueOf(qVar.field_status), java.lang.Integer.valueOf(i17));
        if (c17) {
            qVar.field_status = i17;
            to3.c0.Ai().Di().P0(qVar);
        }
        return c17;
    }

    public static boolean c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "checkStatus from=" + i17 + ";to=" + i18);
        if (i17 == i18) {
            return false;
        }
        if (i17 == 0) {
            return true;
        }
        if (i17 == 24) {
            return i18 != 24;
        }
        if (i17 == 6) {
            return i18 == 20000;
        }
        if (i17 == 5) {
            return i18 == 20000;
        }
        if (i17 == 4) {
            return i18 == 20000;
        }
        if (i17 == 20) {
            return i18 == 20000;
        }
        if (i17 == 8 || i17 == 23) {
            return i18 == 6 || i18 == 20000;
        }
        if (i17 == 10001) {
            return i18 == 6 || i18 == 20000;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: to3.q.d(java.lang.String, java.lang.String):boolean");
    }

    public static void e() {
        long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "endAllOldOrder");
        xo3.a Di = to3.c0.Ai().Di();
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "end all orders to final status. orders count: %d, latest 3 orders: %s", java.lang.Integer.valueOf(Di.J0()), Di.z0(3));
        java.lang.String format = java.lang.String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1;", "rowid", "OfflineOrderStatus", "rowid");
        l75.k0 k0Var = Di.f455766d;
        android.database.Cursor f17 = k0Var.f(format, null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders: error. cursor is null \n");
            j17 = 0;
        } else {
            f17.moveToFirst();
            j17 = (f17.isAfterLast() || f17.getColumnCount() <= 0) ? 0L : f17.getLong(0);
            f17.close();
        }
        long j18 = j17 - 10;
        if (j18 > 0) {
            java.lang.String format2 = java.lang.String.format("DELETE FROM %s WHERE %s < %d;", "OfflineOrderStatus", "rowid", java.lang.Long.valueOf(j18));
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. sql: %s", java.lang.Long.valueOf(j17), format2);
            k0Var.A("OfflineOrderStatus", format2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. do nothing", java.lang.Long.valueOf(j17));
        }
        k0Var.A("OfflineOrderStatus", "UPDATE OfflineOrderStatus SET status=20000 where status!=20000");
    }

    public static boolean f(wo3.q qVar) {
        if (qVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "isOrderClosed lastest status req_key=" + qVar.field_reqkey);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL));
        hashSet.add(6);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(-1);
        if (qVar != null && !hashSet.contains(java.lang.Integer.valueOf(qVar.field_status))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "isOrderClosed false");
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "status=" + qVar.field_status + ";req_key=" + qVar.field_reqkey);
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOrderClosed true;status==null?");
        sb6.append(qVar == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", sb6.toString());
        if (qVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "isOrderClosed status.field_status=" + qVar.field_status);
        }
        return true;
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "OFFLINEGETMSGLOGIN STOP; IS stopped=" + this.f420976b.e());
        if (this.f420976b.e()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 62L, 1L, true);
        this.f420976b.d();
    }
}
