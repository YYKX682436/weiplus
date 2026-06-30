package ww1;

/* loaded from: classes9.dex */
public final class d2 extends ct1.c implements ct1.x {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f450171h = "PayBypMsgSyncHandler";

    public static final boolean q(ww1.d2 d2Var) {
        d2Var.getClass();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_byp_notify, false)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(d2Var.f450171h, "revertBypNotify");
        return false;
    }

    @Override // ct1.c
    public int h() {
        return 11;
    }

    @Override // ct1.c
    public int i() {
        return 11;
    }

    @Override // ct1.c
    public vg3.z4 k() {
        return new ww1.c2(this);
    }

    @Override // ct1.c
    public java.lang.String n(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        com.tencent.mm.autogen.events.BypPayMsgReportEvent bypPayMsgReportEvent = new com.tencent.mm.autogen.events.BypPayMsgReportEvent();
        am.l1 l1Var = bypPayMsgReportEvent.f54021g;
        l1Var.f7208a = 1;
        l1Var.f7211d = 2;
        r45.j4 j4Var = rawBypMsg.f388826d;
        l1Var.f7210c = j4Var.f377568r;
        l1Var.f7214g = x51.j1.g(j4Var != null ? j4Var.f377561h : null);
        r45.j4 j4Var2 = rawBypMsg.f388826d;
        java.lang.String str = "";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(j4Var2 != null ? j4Var2.f377561h : null)) ? "1|" : "";
        r45.j4 j4Var3 = rawBypMsg.f388826d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(j4Var3 != null ? j4Var3.f377558e : null))) {
            str2 = str2 + "2|";
        }
        r45.j4 j4Var4 = rawBypMsg.f388826d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(j4Var4 != null ? j4Var4.f377559f : null))) {
            str2 = str2 + '3';
        }
        l1Var.f7209b = str2;
        bypPayMsgReportEvent.e();
        r45.j4 j4Var5 = rawBypMsg.f388826d;
        java.lang.String str3 = j4Var5 != null ? j4Var5.f377566p : null;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
        java.lang.String str4 = this.f450171h;
        if (K0) {
            com.tencent.mars.xlog.Log.i(str4, "origin msgsource is null");
            str = "<msgsource><byp_sessionId>" + rawBypMsg + ".msg_session_id</byp_sessionId></msgsource>";
        } else {
            com.tencent.mars.xlog.Log.i(str4, "origin msgsource is " + str3);
            if (str3 != null) {
                str = r26.i0.t(str3, "</msgsource>", "<byp_sessionId>" + rawBypMsg + ".msg_session_id</byp_sessionId></msgsource>", false);
            }
        }
        com.tencent.mars.xlog.Log.i(str4, "target msgsource is " + str);
        return str;
    }
}
