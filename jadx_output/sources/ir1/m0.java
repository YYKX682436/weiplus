package ir1;

/* loaded from: classes11.dex */
public final class m0 {
    public m0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, com.tencent.pigeon.biz.BizInteractiveUserInfo userInfo, java.lang.String biz, int i17) {
        java.lang.String identityName;
        java.lang.String identityName2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        kotlin.jvm.internal.o.g(biz, "biz");
        java.lang.String identityName3 = userInfo.getIdentityName();
        boolean z17 = true;
        if (identityName3 == null || identityName3.length() == 0) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 0);
        java.lang.Long identityType = userInfo.getIdentityType();
        int longValue = identityType != null ? (int) identityType.longValue() : 0;
        if (longValue == 0) {
            java.lang.String identityName4 = userInfo.getIdentityName();
            kotlin.jvm.internal.o.d(identityName4);
            identityName = jr1.j.b(identityName4, i17);
        } else {
            identityName = userInfo.getIdentityName();
        }
        hr1.a Ai = ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).Ai(identityName, i17, longValue);
        if (Ai == null) {
            Ai = new hr1.a();
        }
        java.lang.String nickname = userInfo.getNickname();
        if (nickname != null) {
            Ai.field_nickname = nickname;
        }
        java.lang.String headImgUrl = userInfo.getHeadImgUrl();
        if (headImgUrl != null) {
            Ai.field_headImgUrl = headImgUrl;
        }
        java.lang.String identityName5 = userInfo.getIdentityName();
        if (identityName5 != null) {
            Ai.field_identityName = identityName5;
        }
        java.lang.Long identityType2 = userInfo.getIdentityType();
        if (identityType2 != null) {
            Ai.field_identityType = (int) identityType2.longValue();
        }
        java.lang.Long serviceType = userInfo.getServiceType();
        if (serviceType != null) {
            Ai.field_serviceType = (int) serviceType.longValue();
        }
        java.lang.String str = Ai.field_openid;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17 && (identityName2 = userInfo.getIdentityName()) != null) {
            Ai.field_openid = jr1.j.a(identityName2);
        }
        if (i17 == 5) {
            yq1.u0.Ui().z0(Ai);
        } else {
            yq1.u0.Bi().z0(Ai);
        }
        ir1.i1 i1Var = new ir1.i1(context, z2Var, biz, i17);
        i1Var.P = Ai;
        pm0.v.X(new ir1.h1(i1Var));
        z2Var.k(i1Var, 0, 0);
        z2Var.C();
        ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).Bi(i17, Ai, biz, new ir1.k0(i1Var));
    }

    public final void b(android.content.Context context, java.lang.String openId, int i17) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(openId, "openId");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 0);
        hr1.a y07 = i17 == 5 ? yq1.u0.Ui().y0(jr1.j.c(openId)) : yq1.u0.Bi().y0(jr1.j.a(openId));
        ir1.i1 i1Var = new ir1.i1(context, z2Var, "", i17);
        i1Var.P = y07;
        pm0.v.X(new ir1.h1(i1Var));
        z2Var.k(i1Var, 0, 0);
        z2Var.C();
        zq1.u uVar = (zq1.u) i95.n0.c(zq1.u.class);
        kotlin.jvm.internal.o.d(y07);
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        ((br1.m) uVar).Bi(i17, y07, c17, new ir1.l0(i1Var));
    }
}
