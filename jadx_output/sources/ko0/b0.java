package ko0;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ko0.b0 f309820d = new ko0.b0();

    public b0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("LiveFilterUtil_v2_kv");
        ko0.c0 c0Var = ko0.c0.f309825a;
        kotlin.jvm.internal.o.d(M);
        if (!M.getBoolean(gm0.j1.b().h() + "_upgrade_done", false)) {
            M.putBoolean(gm0.j1.b().h() + "_upgrade_done", true);
            rl2.e eVar = (rl2.e) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).f66998v).getValue();
            eVar.getClass();
            ce2.m mVar = new ce2.m();
            r45.n84 n84Var = new r45.n84();
            android.database.Cursor f17 = eVar.f397192e.f(eVar.f397193f + " where FinderLiveConfig.key=\"KEY_FILTER_CONFIG\"", null, 2);
            if (f17.moveToFirst()) {
                mVar.convertFrom(f17);
                byte[] bArr = mVar.field_value;
                if (bArr != null) {
                    try {
                        n84Var.parseFrom(bArr);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                f17.close();
            } else {
                f17.close();
                n84Var = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#upgradeFromDB key=");
            sb6.append(n84Var != null ? java.lang.Integer.valueOf(n84Var.getInteger(0)) : null);
            sb6.append(" value={");
            sb6.append(n84Var != null ? java.lang.Integer.valueOf(n84Var.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.i("LiveCore.LiveFilterUtil", sb6.toString());
            if (n84Var != null) {
                int integer = n84Var.getInteger(0);
                r45.n84 n84Var2 = integer >= 0 && integer < 10 ? n84Var : null;
                if (n84Var2 != null) {
                    switch (n84Var2.getInteger(0)) {
                        case 1:
                            str = "white_skin";
                            break;
                        case 2:
                            str = "vitality";
                            break;
                        case 3:
                            str = "matte";
                            break;
                        case 4:
                            str = "clear";
                            break;
                        case 5:
                            str = "sunset";
                            break;
                        case 6:
                            str = "profound";
                            break;
                        case 7:
                            str = "autumn";
                            break;
                        case 8:
                            str = "delicious_food";
                            break;
                        case 9:
                            str = "blues";
                            break;
                        default:
                            str = ya.b.ORIGIN;
                            break;
                    }
                    ko0.c0 c0Var2 = ko0.c0.f309825a;
                    c0Var2.f(str);
                    c0Var2.g(str, n84Var2.getInteger(1) / 100.0d);
                }
            }
        }
        return M;
    }
}
