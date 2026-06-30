package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes11.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.uic.b f161991a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.uic.b bVar) {
        this.f161991a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        j75.f stateCenter;
        com.tencent.mm.modelbase.f cgiBack = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "GetSafetyInfoRespsonse cgiBack, errType:%s, errCode:%s", java.lang.Integer.valueOf(cgiBack.f70615a), java.lang.Integer.valueOf(cgiBack.f70616b));
        if (cgiBack.f70615a == 0) {
            r45.on3 on3Var = (r45.on3) cgiBack.f70618d;
            if ((on3Var != null ? on3Var.f382377d : null) != null) {
                r45.iu5 iu5Var = on3Var.f382377d;
                boolean z17 = iu5Var.f377342e;
                boolean z18 = iu5Var.f377343f;
                int o17 = c01.z1.o();
                if (z17) {
                    int i18 = 65536 | o17;
                    i17 = z18 ? 131072 | i18 : (-131073) & i18;
                } else {
                    i17 = (-65537) & o17;
                }
                if (i17 != o17) {
                    c01.b9.f37069c.d("last_login_use_voice", i17 + "");
                    gm0.j1.u().c().z(40, i17);
                    com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(this.f161991a.getContext());
                    if (a17 != null && (stateCenter = a17.getStateCenter()) != null) {
                        stateCenter.B3(new r24.b());
                    }
                }
            }
        }
        return cgiBack;
    }
}
