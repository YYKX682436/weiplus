package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes5.dex */
public class b4 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.c4 f137475n;

    public b4(com.tencent.mm.plugin.fts.logic.c4 c4Var, com.tencent.mm.plugin.fts.logic.u3 u3Var) {
        this.f137475n = c4Var;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.c4 c4Var = this.f137475n;
        if (c4Var.f137484f == null) {
            c4Var.f137484f = com.tencent.mm.vfs.w6.M("/sdcard/test_insert_msg_words.txt").split(",");
        }
        if (c4Var.f137485g == null) {
            c4Var.f137485g = new java.util.ArrayList();
            android.database.Cursor r17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r();
            while (r17.moveToNext()) {
                c4Var.f137485g.add(r17.getString(0));
            }
            r17.close();
        }
        if (c4Var.f137484f != null) {
            int[] iArr = {1000, 2000, 5000, 10000, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL, 50000, 100000};
            for (int i17 = 0; i17 < 7; i17++) {
                for (int i18 = 0; i18 < iArr[i17]; i18++) {
                    java.lang.String[] strArr = c4Var.f137484f;
                    java.util.Random random = new java.util.Random();
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    for (int i19 = 0; i19 < 300; i19++) {
                        stringBuffer.append(strArr[random.nextInt(strArr.length - 1)]);
                    }
                    java.lang.String stringBuffer2 = stringBuffer.toString();
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.setType(1);
                    f9Var.j1(1);
                    f9Var.r1(4);
                    f9Var.d1(stringBuffer2);
                    f9Var.u1((java.lang.String) c4Var.f137485g.get(i17));
                    f9Var.e1(java.lang.System.currentTimeMillis());
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr[i17]), java.lang.Integer.valueOf(stringBuffer2.length()), java.lang.Long.valueOf(f9Var.getMsgId()));
                }
            }
        }
        return true;
    }
}
