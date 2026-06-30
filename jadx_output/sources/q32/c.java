package q32;

/* loaded from: classes12.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public q32.f f359929d;

    public c() {
        gm0.j1.n().f273288b.a(1042, this);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1043, this);
        gm0.j1.n().f273288b.a(1040, this);
    }

    public java.util.ArrayList a(java.lang.String str) {
        java.util.ArrayList arrayList = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: param error");
            return null;
        }
        s32.d fj6 = com.tencent.mm.plugin.exdevice.model.l3.fj();
        fj6.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
        } else {
            java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? order by %s desc", "HardDeviceRankInfo", "rankID", ya.b.SCORE);
            java.lang.String[] strArr = new java.lang.String[1];
            if (str == null) {
                str = "";
            }
            strArr[0] = str;
            android.database.Cursor f17 = fj6.f402464d.f(format, strArr, 2);
            if (f17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
            } else {
                if (f17.moveToFirst()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    do {
                        r32.d dVar = new r32.d();
                        dVar.convertFrom(f17);
                        arrayList2.add(dVar);
                    } while (f17.moveToNext());
                    arrayList = arrayList2;
                }
                f17.close();
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof p32.l) {
            if (i17 == 0 && i18 == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error.");
            return;
        }
        if (m1Var instanceof p32.o) {
            if (i17 == 0 && i18 == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
            return;
        }
        if (m1Var instanceof p32.p) {
            if (i17 == 0 && i18 == 0) {
                return;
            }
            jx3.f.INSTANCE.idkeyStat(323L, 0L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
        }
    }
}
