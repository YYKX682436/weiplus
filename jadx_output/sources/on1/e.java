package on1;

/* loaded from: classes12.dex */
public abstract class e {
    public static void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackUtil", "cleanWxamDir");
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6[] G = lp0.b.h0("MicroMsg.BackupMoveServer").G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var : G) {
                r6Var.l();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackUtil", "cleanWxamDir done");
    }

    public static int b(on1.d dVar) {
        r45.ed edVar;
        java.lang.String str;
        if (dVar == null || (edVar = dVar.f346811b) == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = dVar == null ? "backupItemInfo" : "backupItemInfo.backupitem";
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPackUtil", "packBackupItem %s is null!", objArr);
            return 0;
        }
        java.lang.String str2 = dVar.f346810a;
        int k17 = (int) com.tencent.mm.vfs.w6.k(str2);
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPackUtil", "packBackupItem filePath error:" + str2);
            return 0;
        }
        if (dVar.f346814e) {
            return k17;
        }
        java.util.LinkedList linkedList = dVar.f346812c;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPackUtil", "packBackupItem error mediaInfoList null");
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(edVar.f373281f.f372756d);
        sb6.append("_");
        sb6.append(edVar.f373282g.f372756d);
        sb6.append("_");
        sb6.append(edVar.f373294v);
        sb6.append("_backup");
        java.lang.String str3 = dVar.f346815f;
        if (str3 == null) {
            str = "";
        } else {
            str = "_" + str3;
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.util.LinkedList linkedList2 = edVar.f373289q;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = sb7;
        du5Var.f372757e = true;
        linkedList2.add(du5Var);
        java.util.LinkedList linkedList3 = edVar.f373290r;
        r45.eu5 eu5Var = new r45.eu5();
        int i17 = dVar.f346813d;
        eu5Var.f373733d = i17;
        eu5Var.f373734e = true;
        linkedList3.add(eu5Var);
        edVar.f373288p = edVar.f373289q.size();
        if (dVar.f346817h == null) {
            dVar.f346817h = new wn1.s();
        }
        wn1.s sVar = dVar.f346817h;
        sVar.f447475m = edVar.f373294v;
        sVar.f447471f = sb7;
        sVar.f447472g = str2;
        sVar.f447473h = i17;
        if (!dVar.f346816g) {
            linkedList.add(sVar);
        }
        return 0;
    }
}
