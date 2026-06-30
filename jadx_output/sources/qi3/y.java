package qi3;

/* loaded from: classes12.dex */
public interface y extends i95.m {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f363762e1 = 0;

    static void p4() {
        jm.y yVar = (jm.y) ((qi3.y) i95.n0.c(qi3.y.class));
        yVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).r(new jm.u(yVar), "reportC2CMediaInfo");
        com.tencent.mm.sdk.platformtools.o4.L().B("last_calcC2CMediaInfo", java.lang.System.currentTimeMillis());
    }

    static boolean r9() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        return ot0.l3.a();
    }

    static void sc() {
        java.util.ArrayList arrayList;
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        android.database.Cursor r17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().r(null, 0, 100);
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int columnIndex = r17.getColumnIndex(dm.i4.COL_USERNAME);
            while (r17.moveToNext()) {
                arrayList2.add(r17.getString(columnIndex));
            }
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                int i19 = 0;
                int i27 = 0;
                int i28 = 0;
                do {
                    arrayList = new java.util.ArrayList();
                    android.database.Cursor p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p1(str, i19, 500);
                    while (p17.moveToNext()) {
                        try {
                            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                            f9Var.convertFrom(p17);
                            i19++;
                            arrayList.add(f9Var);
                            if (f9Var.getType() == 3) {
                                i28++;
                            } else if (f9Var.getType() == 43) {
                                i27++;
                            }
                        } finally {
                        }
                    }
                    p17.close();
                    vz5.b.a(p17, null);
                } while (!arrayList.isEmpty());
                if (i17 < i28) {
                    i17 = i28;
                }
                if (i18 < i27) {
                    i18 = i27;
                }
            }
            com.tencent.mm.sdk.platformtools.o4.L().A("daily_storage_max_img_msg_len", i17);
            com.tencent.mm.sdk.platformtools.o4.L().A("daily_storage_max_video_msg_len", i18);
            com.tencent.mm.sdk.platformtools.o4.L().B("last_calcTypeMessageStorage", java.lang.System.currentTimeMillis());
        } catch (java.lang.Throwable unused) {
        }
        r17.close();
    }
}
