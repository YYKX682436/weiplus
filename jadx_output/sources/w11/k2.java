package w11;

/* loaded from: classes12.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f442076e;

    public k2(int i17, int i18) {
        this.f442075d = i17;
        this.f442076e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        java.io.BufferedReader bufferedReader2 = null;
        java.io.BufferedReader bufferedReader3 = null;
        android.database.Cursor x17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).x(null, null, new java.util.ArrayList());
        while (x17.moveToNext()) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(x17);
            w11.l2.f442083b.add(z3Var);
        }
        x17.close();
        try {
            try {
                try {
                    bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.mm.vfs.w6.E(lp0.b.D() + "/testaddmsg.txt")));
                    int i17 = 0;
                    while (true) {
                        try {
                            readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            i17++;
                            java.lang.String[] split = readLine.split("###");
                            if (split != null && split.length == 3) {
                                r45.j4 j4Var = new r45.j4();
                                r45.du5 du5Var = new r45.du5();
                                du5Var.f372756d = c01.z1.r();
                                du5Var.f372757e = true;
                                j4Var.f377559f = du5Var;
                                j4Var.f377562i = 2;
                                r45.cu5 cu5Var = new r45.cu5();
                                cu5Var.d(new byte[0]);
                                j4Var.f377564n = cu5Var;
                                j4Var.f377560g = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
                                j4Var.f377563m = com.tencent.mm.sdk.platformtools.t8.P(split[1], 0);
                                r45.du5 du5Var2 = new r45.du5();
                                du5Var2.f372756d = split[2];
                                du5Var2.f372757e = true;
                                j4Var.f377561h = du5Var2;
                                w11.l2.f442082a.add(j4Var);
                            }
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = java.lang.Integer.valueOf(i17);
                            objArr[1] = java.lang.Integer.valueOf(split == null ? -1 : split.length);
                            com.tencent.mars.xlog.Log.e("MicroMsg.TestSyncAddMsg", "readMsgFromFile parse line %d failed : len:%d ", objArr);
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            bufferedReader3 = bufferedReader;
                            com.tencent.mars.xlog.Log.e("MicroMsg.TestSyncAddMsg", "readMsgFromFile failed e:%s", e.getMessage());
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TestSyncAddMsg", e, "", new java.lang.Object[0]);
                            bufferedReader3.close();
                            bufferedReader2 = bufferedReader3;
                            arrayList = w11.l2.f442083b;
                            if (arrayList.size() > 0) {
                            }
                            com.tencent.mars.xlog.Log.e("MicroMsg.TestSyncAddMsg", "syncAddMsg get source failed cmd:%d contact:%d", java.lang.Integer.valueOf(w11.l2.f442082a.size()), java.lang.Integer.valueOf(arrayList.size()));
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            try {
                                bufferedReader.close();
                            } catch (java.lang.Exception unused) {
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    bufferedReader2 = readLine;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bufferedReader = bufferedReader2;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        } catch (java.lang.Exception unused2) {
        }
        arrayList = w11.l2.f442083b;
        if (arrayList.size() > 0 || w11.l2.f442082a.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TestSyncAddMsg", "syncAddMsg get source failed cmd:%d contact:%d", java.lang.Integer.valueOf(w11.l2.f442082a.size()), java.lang.Integer.valueOf(arrayList.size()));
        } else {
            new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new w11.j2(this), true).c(3000L, 3000L);
        }
    }
}
