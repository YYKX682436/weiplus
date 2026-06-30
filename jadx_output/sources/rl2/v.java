package rl2;

/* loaded from: classes8.dex */
public final class v extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final rl2.n f397212e = new rl2.n(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f397213f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Vector f397214g;

    /* renamed from: h, reason: collision with root package name */
    public static d95.b0 f397215h;

    /* renamed from: i, reason: collision with root package name */
    public static rl2.v f397216i;

    /* renamed from: d, reason: collision with root package name */
    public final d95.b0 f397217d;

    static {
        java.lang.String createSQLs = l75.n0.getCreateSQLs(dm.s4.D, "FinderLiveTipsBar");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f397213f = new java.lang.String[]{createSQLs};
        f397214g = new java.util.Vector();
    }

    public v(d95.b0 b0Var, kotlin.jvm.internal.i iVar) {
        super(b0Var, dm.s4.D, "FinderLiveTipsBar", null);
        this.f397217d = b0Var;
    }

    public static final java.util.List y0(rl2.v vVar) {
        vVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "getAllData:SELECT * FROM FinderLiveTipsBar");
        android.database.Cursor f17 = vVar.f397217d.f("SELECT * FROM FinderLiveTipsBar", null, 0);
        kotlin.jvm.internal.o.f(f17, "rawQuery(...)");
        while (f17.moveToNext()) {
            dm.s4 s4Var = new dm.s4();
            s4Var.convertFrom(f17);
            linkedList.add(s4Var);
        }
        f17.close();
        return linkedList;
    }

    public int D0(java.lang.String hostRoomId) {
        int i17;
        kotlin.jvm.internal.o.g(hostRoomId, "hostRoomId");
        java.util.Vector vector = f397214g;
        synchronized (vector) {
            java.util.Iterator it = vector.iterator();
            int i18 = 0;
            while (true) {
                i17 = -1;
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((dm.s4) it.next()).field_hostRoomId, hostRoomId)) {
                    break;
                }
                i18++;
            }
            if (!(i18 >= 0)) {
                return 0;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "getLiveIconState " + hostRoomId);
            java.util.Iterator it6 = f397214g.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                dm.s4 s4Var = (dm.s4) it6.next();
                if (kotlin.jvm.internal.o.b(s4Var.field_hostRoomId, hostRoomId) && !s4Var.field_markRead) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
            return i17 >= 0 ? 2 : 1;
        }
    }

    public final void J0(java.lang.String chatRoomId) {
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (!(Di instanceof l75.a1)) {
            Di = null;
        }
        if (Di != null) {
            pm0.v.X(new rl2.u(chatRoomId, Di));
        }
    }

    public final void z0(long j17, boolean z17) {
        java.lang.String str = "SELECT * FROM FinderLiveTipsBar WHERE liveId = '" + j17 + '\'';
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "deleteByLiveId, liveId:" + pm0.v.u(j17) + ", sql:" + str);
        java.lang.String str2 = null;
        android.database.Cursor f17 = this.f397217d.f(str, null, 0);
        kotlin.jvm.internal.o.f(f17, "rawQuery(...)");
        if (f17.moveToFirst()) {
            dm.s4 s4Var = new dm.s4();
            s4Var.convertFrom(f17);
            str2 = s4Var.field_hostRoomId;
        }
        f17.close();
        int delete = this.f397217d.delete("FinderLiveTipsBar", "liveId= ? ", new java.lang.String[]{"" + j17});
        if (delete < 0) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveTipsBarStorage", "deleteByLiveId failed, result:" + delete);
        } else {
            java.util.Vector vector = f397214g;
            synchronized (vector) {
                pm0.v.c0(vector, new rl2.p(j17));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "deleteByLiveId success, liveId::" + pm0.v.u(j17) + ", hostRoomId:" + str2);
        }
        if (str2 != null) {
            if (z17) {
                for (fs.q qVar : ((fs.c) fs.g.f(ps5.f.class)).all()) {
                    if (fs.g.d(fs.g.f266086c, qVar)) {
                        ((yj5.w) ((ps5.f) ((fs.n) qVar.get()))).b(str2);
                    }
                }
            }
            J0(str2);
        }
    }
}
