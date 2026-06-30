package t81;

/* loaded from: classes4.dex */
public class j extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f416363d = {l75.n0.getCreateSQLs(t81.i.f416362t, "WxaAttrVersionServerNotifyRecord")};

    public j(l75.k0 k0Var) {
        super(k0Var, t81.i.f416362t, "WxaAttrVersionServerNotifyRecord", dm.uc.f240414i);
    }

    public t81.i y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        t81.i iVar = new t81.i();
        iVar.field_username = str;
        if (get(iVar, new java.lang.String[0])) {
            return iVar;
        }
        return null;
    }
}
