package t53;

/* loaded from: classes8.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f415731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f415732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f415733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f415735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415736h;

    public c0(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, long j17, java.lang.String str3) {
        this.f415729a = str;
        this.f415730b = str2;
        this.f415731c = num;
        this.f415732d = bool;
        this.f415733e = bool2;
        this.f415734f = i17;
        this.f415735g = j17;
        this.f415736h = str3;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        y53.x xVar = (y53.x) ((u53.y) i95.n0.c(u53.y.class));
        java.lang.String fromUsername = this.f415729a;
        y53.m Di = xVar.Di(fromUsername);
        y53.x xVar2 = (y53.x) ((u53.y) i95.n0.c(u53.y.class));
        java.lang.String toUsername = this.f415730b;
        y53.m Di2 = xVar2.Di(toUsername);
        java.lang.Integer num = this.f415731c;
        java.lang.String str = "";
        if (num != null && num.intValue() == 1) {
            java.lang.Boolean bool = this.f415732d;
            if (bool != null) {
                if (bool.booleanValue()) {
                    java.lang.Boolean bool2 = this.f415733e;
                    if (bool2 != null) {
                        if (bool2.booleanValue()) {
                            str = "1";
                            i17 = 3;
                        } else {
                            str = "0";
                        }
                    }
                }
                i17 = 1;
            }
            i17 = 0;
        } else {
            if (num != null && num.intValue() == 2) {
                i17 = 2;
            }
            i17 = 0;
        }
        long j17 = Di.field_accountType;
        long j18 = Di2.field_accountType;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String sessionId = this.f415736h;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        long j19 = this.f415734f;
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
        gameLifeSessionStruct.f58340d = 4L;
        gameLifeSessionStruct.f58341e = 401L;
        gameLifeSessionStruct.f58342f = j19;
        gameLifeSessionStruct.f58343g = this.f415735g;
        gameLifeSessionStruct.f58344h = 401L;
        gameLifeSessionStruct.f58352p = gameLifeSessionStruct.b("SessionId", sessionId, true);
        gameLifeSessionStruct.f58347k = j17;
        gameLifeSessionStruct.f58348l = gameLifeSessionStruct.b("from_username", fromUsername, true);
        gameLifeSessionStruct.f58349m = j18;
        gameLifeSessionStruct.f58350n = gameLifeSessionStruct.b("to_username", toUsername, true);
        gameLifeSessionStruct.f58346j = gameLifeSessionStruct.b("ActionStatus", str, true);
        if (valueOf != null && valueOf.intValue() != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("role", valueOf.intValue());
            gameLifeSessionStruct.p(java.net.URLEncoder.encode(jSONObject.toString()));
        }
        gameLifeSessionStruct.k();
        return null;
    }
}
