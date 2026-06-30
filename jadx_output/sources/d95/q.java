package d95;

/* loaded from: classes12.dex */
public final class q implements com.tencent.wcdb.core.Database.ExceptionTracer {

    /* renamed from: a, reason: collision with root package name */
    public static d95.v f227701a = new d95.v();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f227702b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f227703c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f227704d;

    static {
        d95.q qVar = new d95.q();
        com.tencent.wcdb.core.Database.setSoftHeapLimit(f227701a.f227707a);
        com.tencent.wcdb.core.Database.setAutoCheckpointMinFrames(f227701a.f227708b);
        com.tencent.wcdb.core.Database.globalTraceException(qVar);
        com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback(new d95.r());
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new d95.s());
        f227704d = java.lang.System.nanoTime() % 10 == 0;
    }

    public static com.tencent.wcdb.core.Database a(java.lang.String str, java.util.List list, int i17) {
        java.lang.String str2;
        f227703c = !com.tencent.mm.vfs.w6.j(str);
        com.tencent.wcdb.core.Database database = new com.tencent.wcdb.core.Database(str);
        if ((i17 & 16) != 0) {
            database.setAutoCheckpointEnable(false);
            database.setConfig("SyncCheckpoint", new d95.q$$a(), com.tencent.wcdb.core.Database.ConfigPriority.highest);
        }
        if ((i17 & 1) != 0) {
            int h17 = gm0.j1.b().h();
            java.util.Iterator it = com.tencent.mm.storagebase.IMEISave.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (java.lang.String) it.next();
                byte[] bytes = kk.k.g((str2 + h17).getBytes()).substring(0, 7).getBytes();
                if ((i17 & 2) != 0) {
                    database.setCipherKey(bytes, 4096, com.tencent.wcdb.core.Database.CipherVersion.version1);
                    if (database.canOpen()) {
                        break;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.NewDB", "Tried imei '" + str2 + "' and pageSize 4096 failed: " + str);
                }
                database.setCipherKey(bytes, 1024, com.tencent.wcdb.core.Database.CipherVersion.version1);
                if (database.canOpen()) {
                    break;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.NewDB", "Tried imei '" + str2 + "' and pageSize 1024 failed: " + str);
            }
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewDB", "Corruption on open: " + str);
                jx3.f fVar = jx3.f.INSTANCE;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(database.getPath());
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!a17.f213279f.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                java.lang.String str4 = a17.f213279f;
                int lastIndexOf = str4.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str4 = str4.substring(lastIndexOf + 1);
                }
                fVar.d(22323, str4, 0, "wcdb2Open", 0, 0, android.os.Build.FINGERPRINT);
                if ((i17 & 4) != 0) {
                    d95.f.r(str);
                } else {
                    database.removeFiles();
                }
                database.setCipherKey(kk.k.g((wo.w0.g(true) + h17).getBytes()).substring(0, 7).getBytes(), (i17 & 2) == 0 ? 1024 : 4096, com.tencent.wcdb.core.Database.CipherVersion.version1);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewDB", "Use imei '" + str2 + "': " + str);
            }
        }
        if ((i17 & 4) == 0) {
            database.setNotificationWhenCorrupted(new d95.u(list));
        } else {
            database.setNotificationWhenCorrupted(new d95.w(list));
        }
        if ((i17 & 8) != 0) {
            database.tracePerformance(new f95.l(database));
        }
        if (list != null) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it6.next();
                database.createTable((java.lang.String) pair.first, (com.tencent.wcdb.orm.TableBinding) pair.second);
            }
        }
        return database;
    }

    @Override // com.tencent.wcdb.core.Database.ExceptionTracer
    public void onTrace(com.tencent.wcdb.base.WCDBException wCDBException) {
        int i17 = d95.t.f227705a[wCDBException.level.ordinal()];
        if (i17 == 1 || i17 == 2) {
            com.tencent.mars.xlog.Log.e("WCDB", wCDBException.toStringForLog());
            if (f227704d) {
                java.lang.String sql = wCDBException.sql();
                jx3.f.INSTANCE.d(14225, 0, wCDBException.code, java.lang.Long.valueOf(wCDBException.tag()), 0, wCDBException.extendCode(), wCDBException.message(), sql == null ? "" : sql.replace(',', ';'), wCDBException.path());
                return;
            }
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.w("WCDB", wCDBException.toStringForLog());
        } else {
            if (i17 != 4) {
                return;
            }
            com.tencent.mars.xlog.Log.i("WCDB", wCDBException.toStringForLog());
        }
    }
}
