package hk;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final hk.n f281683a = new hk.n();

    /* renamed from: b, reason: collision with root package name */
    public static hk.b f281684b;

    public final java.util.List a(java.lang.String bizName, java.lang.String slotId) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(slotId, "slotId");
        hk.b b17 = b();
        if (b17 != null) {
            java.lang.String concat = "select * from AdvertisePushDBInfo where message_slotid=".concat(slotId);
            arrayList = new java.util.ArrayList();
            android.database.Cursor rawQuery = b17.rawQuery(concat, new java.lang.String[0]);
            while (rawQuery.moveToNext()) {
                hk.a aVar = new hk.a();
                aVar.convertFrom(rawQuery);
                arrayList.add(aVar);
            }
            rawQuery.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.AdvertisePushDBInfoStorage", "getSpecificSlotMsg:" + arrayList);
        } else {
            arrayList = new java.util.ArrayList();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27060, bizName, 1, slotId, java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public final hk.b b() {
        if (f281684b == null && gm0.j1.a()) {
            synchronized (this) {
                if (f281684b == null) {
                    f281684b = f281683a.c();
                }
            }
        }
        return f281684b;
    }

    public final hk.b c() {
        java.lang.String str = gm0.j1.u().h() + "AdvertisePushMsg.db";
        d95.b0 b0Var = new d95.b0();
        if (b0Var.S(str, kz5.c1.i(new jz5.l(1254747469, hk.m.f281682a)), true, true)) {
            return new hk.b(b0Var);
        }
        throw new android.database.sqlite.SQLiteException("AdvertisePushMsg db init failed");
    }
}
