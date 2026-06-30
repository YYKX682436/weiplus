package sg3;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {
    public m(sg3.r rVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.w7 w7Var = (com.tencent.mm.storage.w7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Vi();
        w7Var.getClass();
        android.database.Cursor B = w7Var.f196309d.B(java.lang.String.format("select count(rowid) from %s", "FriendUser"), null);
        int i17 = 0;
        if (B != null && B.moveToFirst()) {
            i17 = B.getInt(0);
            B.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.FriendUserStorage", "#recordCnts#, count:" + i17);
        }
        com.tencent.mm.storage.w7 w7Var2 = (com.tencent.mm.storage.w7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Vi();
        w7Var2.getClass();
        int delete = w7Var2.f196309d.delete("FriendUser", "(modifyTime< ?)", new java.lang.String[]{"" + (java.lang.System.currentTimeMillis() - (7 * 86400000))});
        if (delete > 0) {
            w7Var2.doNotify();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FriendUserStorage", "#Clear Records#, result:" + delete);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20460, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(delete));
    }
}
