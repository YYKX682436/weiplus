package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class x5 {

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.pluginsdk.model.app.x5 f189142i;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f189145c;

    /* renamed from: e, reason: collision with root package name */
    public long f189147e;

    /* renamed from: h, reason: collision with root package name */
    public long f189150h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f189143a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f189144b = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f189146d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f189148f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f189149g = false;

    public static com.tencent.mm.pluginsdk.model.app.x5 c() {
        if (f189142i == null) {
            f189142i = new com.tencent.mm.pluginsdk.model.app.x5();
        }
        return f189142i;
    }

    public final void a(com.tencent.mm.pluginsdk.model.app.m mVar, r45.qe4 qe4Var) {
        mVar.field_appName = qe4Var.f383897i;
        mVar.field_appName_en = qe4Var.f383893e;
        mVar.field_appName_tw = qe4Var.f383894f;
        mVar.field_appName_hk = qe4Var.f383906u;
        mVar.f238393y0 = qe4Var.f383895g;
        mVar.f238375l1 = qe4Var.f383896h;
        mVar.f238381p1 = qe4Var.f383900o;
        mVar.field_serviceAppInfoFlag = qe4Var.f383899n;
        mVar.field_serviceAppType = qe4Var.f383898m;
        mVar.f238391x1 = qe4Var.f383901p;
        mVar.A = true;
        mVar.field_serviceShowFlag = qe4Var.f383902q;
    }

    public final void b(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "get service app, offset = %d, lang = %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.pluginsdk.model.app.y3 y3Var = new com.tencent.mm.pluginsdk.model.app.y3(i17, 20, str);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(y3Var);
    }

    public void d(android.content.Context context) {
        if (!gm0.j1.a() || context == null || this.f189144b) {
            return;
        }
        this.f189144b = true;
        if (java.lang.System.currentTimeMillis() - this.f189150h < 43200000) {
            this.f189144b = false;
            return;
        }
        gm0.j1.i();
        this.f189150h = gm0.j1.u().c().s(352276, 0L);
        if (java.lang.System.currentTimeMillis() - this.f189150h < 43200000) {
            this.f189144b = false;
            return;
        }
        if (this.f189145c == null) {
            this.f189145c = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        }
        b(this.f189145c, this.f189148f);
    }

    public void e(android.content.Context context) {
        if (!gm0.j1.a() || context == null || this.f189144b) {
            return;
        }
        this.f189144b = true;
        if (this.f189145c == null) {
            this.f189145c = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "getServiceAppListImmediately");
        b(this.f189145c, this.f189148f);
    }

    public final void f(com.tencent.mm.pluginsdk.model.app.z zVar, java.util.List list) {
        boolean z17;
        if (zVar == null || list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (ap3.e.a() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getAllServices, getISubCorePluginBase() == null");
        } else {
            ((kt.a) ap3.e.a()).getClass();
            com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
            Ri.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
            sb6.append("select * from AppInfo where serviceAppType > 0");
            android.database.Cursor rawQuery = Ri.rawQuery(sb6.toString(), new java.lang.String[0]);
            if (rawQuery == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getAllServices : cursor is null");
                rawQuery = null;
            } else {
                rawQuery.getCount();
            }
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
                    mVar.convertFrom(rawQuery);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_openId)) {
                        arrayList.add(mVar);
                    }
                }
                rawQuery.close();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "oldList %d", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.model.app.m mVar2 = (com.tencent.mm.pluginsdk.model.app.m) it.next();
                if (mVar2.field_appId != null) {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = false;
                            break;
                        }
                        if (mVar2.field_appId.equals((java.lang.String) it6.next())) {
                            z17 = true;
                            break;
                        }
                    }
                    if (!z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SuggestionAppListLogic", "delete old service : %s, %s", mVar2.field_appId, java.lang.Boolean.valueOf(zVar.delete(mVar2, new java.lang.String[0])));
                    }
                }
            }
        }
    }
}
