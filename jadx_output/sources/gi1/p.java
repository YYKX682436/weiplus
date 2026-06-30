package gi1;

/* loaded from: classes.dex */
public class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f272255e = {l75.n0.getCreateSQLs(dm.y8.f241228t, "OpenVoiceServiceVoipRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f272256d;

    public p(l75.k0 k0Var) {
        super(k0Var, dm.y8.f241228t, "OpenVoiceServiceVoipRecord", dm.y8.f241221m);
        this.f272256d = k0Var;
    }

    public gi1.o y0(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceServiceVoipRecordStorage", "getVoipRecord appId:%s, roomId:%s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        gi1.o oVar = new gi1.o();
        oVar.field_appId = str;
        oVar.field_voipRoomId = str2;
        if (super.get(oVar, new java.lang.String[0])) {
            return oVar;
        }
        return null;
    }
}
