package rn;

/* loaded from: classes11.dex */
public class i extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f397606e = {l75.n0.getCreateSQLs(rn.h.f397603v, "GroupTools")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f397607f = {"DROP INDEX IF EXISTS usernameIndex", "CREATE INDEX IF NOT EXISTS GroupTools_usernameIndex ON GroupTools ( chatroomname )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f397608d;

    public i(l75.k0 k0Var) {
        super(k0Var, rn.h.f397603v, "GroupTools", f397607f);
        this.f397608d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean update(rn.h hVar, java.lang.String... strArr) {
        boolean updateNotify = super.updateNotify(hVar, true, strArr);
        if (updateNotify) {
            com.tencent.mm.autogen.events.NotifyGroupToolsEvent notifyGroupToolsEvent = new com.tencent.mm.autogen.events.NotifyGroupToolsEvent();
            notifyGroupToolsEvent.f54546g.f7825a = hVar.field_chatroomname;
            notifyGroupToolsEvent.b(android.os.Looper.getMainLooper());
        }
        return updateNotify;
    }

    public rn.h y0(java.lang.String str) {
        android.database.Cursor E;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (E = this.f397608d.E("GroupTools", rn.h.f397603v.f316954c, "chatroomname=?", new java.lang.String[]{str}, null, null, null)) == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (E.moveToNext()) {
                rn.h hVar = new rn.h();
                hVar.convertFrom(E);
                arrayList.add(hVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (rn.h) arrayList.get(0);
        } finally {
            E.close();
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(rn.h hVar) {
        if (hVar == null) {
            return false;
        }
        return super.insert(hVar);
    }
}
