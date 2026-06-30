package hr3;

/* loaded from: classes11.dex */
public class bb implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f283425d;

    public bb(hr3.eb ebVar) {
        this.f283425d = ebVar;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        r61.a h17;
        int i17;
        hr3.eb ebVar = this.f283425d;
        if (z17) {
            ebVar.f283520f.M1.d("hide_btn");
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = ebVar.f283520f;
            normalUserFooterPreference.M1.c();
            normalUserFooterPreference.I1 = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NormalUserFooterPreference", "addContact respUsername is empty");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 21);
            }
            if (((int) normalUserFooterPreference.L.E2) == 0) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    normalUserFooterPreference.L.X1(str);
                }
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(normalUserFooterPreference.L);
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).m(normalUserFooterPreference.L.d1());
            }
            com.tencent.mm.storage.z3 z3Var = normalUserFooterPreference.L;
            if (((int) z3Var.E2) <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NormalUserFooterPreference", "addContact : insert contact failed");
            } else {
                if (!z3Var.r2() && normalUserFooterPreference.N == 15 && (h17 = m61.k.wi().h(normalUserFooterPreference.L.d1())) != null) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.String d17 = normalUserFooterPreference.L.d1();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(h17.e()) ? 1 : 0);
                    java.lang.String[] b17 = com.tencent.mm.contact.a.b(normalUserFooterPreference.L);
                    if (b17 == null) {
                        i17 = 0;
                    } else {
                        i17 = 5;
                        if (b17.length < 5) {
                            i17 = b17.length;
                        }
                    }
                    g0Var.d(12040, d17, 3, valueOf, java.lang.Integer.valueOf(i17));
                }
                c01.e2.m0(normalUserFooterPreference.L);
                normalUserFooterPreference.L = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(normalUserFooterPreference.L.d1(), true);
                ebVar.f();
                r61.z1.c(normalUserFooterPreference.L.J0(), 0);
                com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent = new com.tencent.mm.autogen.events.RecoverAccountFriendEvent();
                java.lang.String J0 = normalUserFooterPreference.L.J0();
                am.hq hqVar = recoverAccountFriendEvent.f54666g;
                hqVar.f6862a = J0;
                hqVar.f6863b = 1;
                recoverAccountFriendEvent.e();
            }
        } else if (z18) {
            r21.w.wi().k1(str, 2);
            r61.z1.c(ebVar.f283520f.L.J0(), 1);
            com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent2 = new com.tencent.mm.autogen.events.RecoverAccountFriendEvent();
            java.lang.String J02 = ebVar.f283520f.L.J0();
            am.hq hqVar2 = recoverAccountFriendEvent2.f54666g;
            hqVar2.f6862a = J02;
            hqVar2.f6863b = 1;
            recoverAccountFriendEvent2.e();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NormalUserFooterPreference", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + str);
        }
        if (z17 || z18) {
            android.content.Intent intent = ebVar.f283520f.K1.getIntent();
            int intExtra = intent.getIntExtra("search_kvstat_scene", 0);
            int intExtra2 = intent.getIntExtra("search_kvstat_position", 0);
            if (intExtra <= 0 || intExtra2 <= 0 || com.tencent.mm.plugin.fts.ui.x2.d(6L)) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10991, java.lang.Integer.valueOf(intExtra), 6, java.lang.Integer.valueOf(intExtra2));
        }
    }
}
