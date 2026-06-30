package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes5.dex */
public class a4 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137453n;

    /* renamed from: o, reason: collision with root package name */
    public final int f137454o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.c4 f137455p;

    public a4(com.tencent.mm.plugin.fts.logic.c4 c4Var, int i17, java.lang.String str) {
        this.f137455p = c4Var;
        this.f137454o = i17;
        this.f137453n = str;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.c4 c4Var = this.f137455p;
        if (c4Var.f137484f == null) {
            c4Var.f137484f = com.tencent.mm.vfs.w6.M("/sdcard/test_insert_msg_words.txt").split(",");
        }
        if (c4Var.f137485g == null) {
            c4Var.f137485g = new java.util.ArrayList();
            java.lang.String str = this.f137453n;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                android.database.Cursor r17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r();
                while (r17.moveToNext()) {
                    c4Var.f137485g.add(r17.getString(0));
                }
                r17.close();
            } else {
                c4Var.f137485g.add(str);
            }
        }
        if (c4Var.f137484f != null) {
            int i17 = 0;
            while (true) {
                int i18 = this.f137454o;
                if (i17 >= i18) {
                    break;
                }
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
                java.util.List list = c4Var.f137485g;
                f9Var.u1((java.lang.String) (list.size() > 1 ? list.get(new java.util.Random().nextInt(list.size() - 1)) : list.get(0)));
                f9Var.e1(java.lang.System.currentTimeMillis() - 250327040);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(stringBuffer2.length()), java.lang.Long.valueOf(f9Var.getMsgId()));
                i17++;
            }
        }
        return true;
    }
}
