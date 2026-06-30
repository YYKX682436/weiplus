package f63;

/* loaded from: classes8.dex */
public final class k extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f259860g = {l75.n0.getCreateSQLs(f63.e.f259851t, "GameLifeSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f259861d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f259862e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f259863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l75.k0 db6) {
        super(db6, f63.e.f259851t, "GameLifeSessionInfo", dm.o5.f238937i);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = f63.e.f259851t;
        this.f259861d = db6;
        this.f259862e = new java.util.concurrent.ConcurrentHashMap();
        this.f259863f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final java.lang.String D0(java.lang.String str, java.lang.String str2) {
        return str + '_' + str2;
    }

    public final f63.e y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new f63.e();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f259863f;
        f63.e eVar = (f63.e) concurrentHashMap.get(str);
        if (eVar != null) {
            return eVar;
        }
        android.database.Cursor B = this.f259861d.B("select * , rowid from GameLifeSessionInfo where sessionId = '" + str + "' ", null);
        f63.e eVar2 = new f63.e();
        eVar2.field_sessionId = str;
        if (B != null) {
            if (B.moveToFirst()) {
                eVar2.convertFrom(B);
            }
            B.close();
        }
        if (eVar2.systemRowid > 0) {
            concurrentHashMap.put(str, eVar2);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f259862e;
            java.lang.String field_selfUserName = eVar2.field_selfUserName;
            kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
            java.lang.String field_talker = eVar2.field_talker;
            kotlin.jvm.internal.o.f(field_talker, "field_talker");
            concurrentHashMap2.put(D0(field_selfUserName, field_talker), eVar2);
        }
        return eVar2;
    }

    public final void z0(java.lang.String sessionId, java.lang.String selfUsername, java.lang.String talker, v53.c cVar) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        kotlin.jvm.internal.o.g(talker, "talker");
        f63.e eVar = new f63.e();
        eVar.field_sessionId = sessionId;
        eVar.field_talker = talker;
        eVar.field_selfUserName = selfUsername;
        eVar.field_extInfo = cVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replaceSessionInfo] sessionId=");
        sb6.append(sessionId);
        sb6.append(", talker=");
        sb6.append(talker);
        sb6.append(", selfUsername=");
        sb6.append(eVar.field_selfUserName);
        sb6.append(" extInfo:");
        v53.c cVar2 = eVar.field_extInfo;
        sb6.append(cVar2 != null ? java.lang.Long.valueOf(cVar2.f433331e) : null);
        sb6.append('/');
        v53.c cVar3 = eVar.field_extInfo;
        sb6.append(cVar3 != null ? java.lang.Long.valueOf(cVar3.f433330d) : null);
        com.tencent.mars.xlog.Log.i("GameLife.GameLifeSessionInfoStorage", sb6.toString());
        this.f259863f.put(sessionId, eVar);
        this.f259862e.put(D0(selfUsername, talker), eVar);
        replace(eVar);
    }
}
