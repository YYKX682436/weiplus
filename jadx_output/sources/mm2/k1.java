package mm2;

/* loaded from: classes3.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f329190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f329191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(mm2.s1 s1Var, android.content.Intent intent) {
        super(0);
        this.f329190d = s1Var;
        this.f329191e = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.q12 P6;
        r45.z53 z53Var;
        mm2.s1 s1Var = this.f329190d;
        mm2.n0 n0Var = (mm2.n0) s1Var.business(mm2.n0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        boolean O6 = n0Var.O6();
        java.lang.String str = s1Var.f329386f;
        if (O6) {
            com.tencent.mars.xlog.Log.i(str, "[initLiveModeFromCache] active co-live invitation, isInitiator=" + n0Var.P6(e17) + ", auto select CoLive mode");
            r45.q12 q12Var = new r45.q12();
            q12Var.set(0, 5);
            q12Var.set(1, 1);
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329068f).k(q12Var);
            ((mm2.e1) s1Var.business(mm2.e1.class)).n7(q12Var);
        } else {
            if (this.f329191e.getBooleanExtra("KEY_PARAMS_POST_VOICE_ROOM_LIVE", false)) {
                P6 = new r45.q12();
                P6.set(0, 2);
                P6.set(1, 2);
            } else {
                P6 = s1Var.P6();
            }
            com.tencent.mars.xlog.Log.i(str, "lastModeInfo = " + pm0.b0.g(P6));
            if (P6.getInteger(0) == 3) {
                java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_GAME_APPID_STRING_SYNC, "");
                com.tencent.mars.xlog.Log.i(str, "lastModeInfo is game, appId = " + v17);
                r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329071i).getValue();
                if (kotlin.jvm.internal.o.b((n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null) ? null : z53Var.getString(0), v17)) {
                    s1Var.U6(P6);
                } else {
                    s1Var.T6();
                    kotlin.jvm.internal.o.d(v17);
                    s1Var.Q6(P6, v17, null);
                }
            } else {
                java.lang.String v18 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_GAME_SUB_MODE_STRING_SYNC, "");
                yg2.b bVar = s1Var.f329387g;
                if (bVar != null) {
                    kotlinx.coroutines.l.d(bVar, null, null, new mm2.i1(v18, s1Var, null), 3, null);
                }
                s1Var.U6(P6);
            }
        }
        return jz5.f0.f302826a;
    }
}
