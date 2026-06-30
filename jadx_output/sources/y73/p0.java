package y73;

/* loaded from: classes11.dex */
public class p0 implements q25.a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        char c17;
        if (strArr.length < 2) {
            return false;
        }
        java.lang.String str2 = strArr[1];
        java.lang.String str3 = "";
        if (z65.c.a()) {
            str2.getClass();
            switch (str2.hashCode()) {
                case -838846263:
                    if (str2.equals("update")) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -309518737:
                    if (str2.equals("process")) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 3477:
                    if (str2.equals("mb")) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 3510:
                    if (str2.equals("nd")) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 3083269:
                    if (str2.equals("diff")) {
                        c17 = 4;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 3089570:
                    if (str2.equals("down")) {
                        c17 = 5;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 3529469:
                    if (str2.equals("show")) {
                        c17 = 6;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c17 = 7;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 2067292548:
                    if (str2.equals("showall")) {
                        c17 = '\b';
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            switch (c17) {
                case 0:
                    new java.util.LinkedList();
                    java.util.LinkedList c18 = z73.h.c();
                    java.util.Iterator it = c18.iterator();
                    while (it.hasNext()) {
                        java.lang.String str4 = ((r45.e35) it.next()).f372968d;
                    }
                    gm0.j1.d().g(new z73.g("tinker_id_2468c5efe7670b901f7738f7a699d3843acc3651_arm64-v8a", "", c18, true));
                    return true;
                case 1:
                    r45.j35 j35Var = new r45.j35();
                    j35Var.f377539m = 1000;
                    j35Var.f377536g = 3;
                    j35Var.f377537h = 2;
                    j35Var.f377534e = 2;
                    j35Var.f377533d = "android_tinker_id_123123131231231";
                    r45.bs5 bs5Var = new r45.bs5();
                    bs5Var.f371025d = "3ba62fdbd98df2bdf5da7d726010d867";
                    bs5Var.f371032n = 33338711;
                    bs5Var.f371027f = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxx) + "/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
                    j35Var.f377538i = bs5Var;
                    r45.h35 h35Var = new r45.h35();
                    h35Var.f375806d = "clientVersion";
                    h35Var.f375807e = "0x26060510";
                    java.util.LinkedList linkedList = j35Var.f377540n;
                    linkedList.add(h35Var);
                    r45.h35 h35Var2 = new r45.h35();
                    h35Var2.f375806d = "alphaTitle";
                    h35Var2.f375807e = "叫你更新你就更新";
                    linkedList.add(h35Var2);
                    r45.h35 h35Var3 = new r45.h35();
                    h35Var3.f375806d = "alphaContent";
                    h35Var3.f375807e = "这个包可以抢到的红包最大，抢红包速度最快。";
                    linkedList.add(h35Var3);
                    r45.h35 h35Var4 = new r45.h35();
                    h35Var4.f375806d = "alphaUrl";
                    h35Var4.f375807e = "www.qq.com";
                    linkedList.add(h35Var4);
                    new y73.d0(new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var)).j(true);
                    return true;
                case 2:
                    java.lang.String str5 = (strArr.length < 3 || com.tencent.mm.sdk.platformtools.t8.K0(strArr[2])) ? "default" : strArr[2];
                    if (strArr.length >= 4 && !com.tencent.mm.sdk.platformtools.t8.K0(strArr[3])) {
                        str3 = strArr[3];
                    }
                    gm0.j1.d().g(new z73.c("magicemo", str5, str3, true, new y73.n0(this)));
                    return true;
                case 3:
                    if (strArr.length >= 6) {
                        java.lang.String str6 = strArr[2];
                        java.lang.String str7 = strArr[3];
                        java.lang.String str8 = strArr[4];
                        com.tencent.mm.sdk.platformtools.t8.E1(strArr[5]);
                    }
                    return true;
                case 4:
                    gm0.j1.e().j(new y73.o0(this, strArr));
                    return true;
                case 5:
                    r45.j35 j35Var2 = new r45.j35();
                    j35Var2.f377539m = 1000;
                    j35Var2.f377536g = 2;
                    j35Var2.f377537h = 2;
                    j35Var2.f377534e = 2;
                    j35Var2.f377533d = "android_tinker_id_123123131231231";
                    r45.bs5 bs5Var2 = new r45.bs5();
                    bs5Var2.f371025d = "c3282ad2467fad9561227bc9b5b6712c";
                    bs5Var2.f371032n = 118617;
                    bs5Var2.f371027f = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxx) + "/weixin/checkresupdate/0x2605136d.3144f5.0x26051334.bf52fb_1510754399.apk";
                    j35Var2.f377536g = 3;
                    bs5Var2.f371025d = "3ba62fdbd98df2bdf5da7d726010d867";
                    bs5Var2.f371032n = 33338711;
                    bs5Var2.f371027f = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxx) + "/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
                    j35Var2.f377538i = bs5Var2;
                    new y73.d0(new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var2)).j(false);
                    return true;
                case 6:
                    y73.u0.a(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdx), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdx), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g1e), new y73.m0(this), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493416k33), null);
                    return true;
                case 7:
                    com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", "").apply();
                    c83.e.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    return true;
                case '\b':
                    java.util.List<oq1.a> Ai = ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Ai();
                    if (!Ai.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.TinkerBootsCommand", "start day active keys");
                        for (oq1.a aVar : Ai) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerBootsCommand", "key:%s active:%d", java.lang.Integer.toHexString(aVar.field_key), java.lang.Integer.valueOf(aVar.field_dau));
                        }
                    }
                    return true;
            }
        }
        str2.getClass();
        if (!str2.equals("check")) {
            return false;
        }
        try {
            fy5.a.d().a(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.TinkerBootsCommand", e17, "", new java.lang.Object[0]);
        }
        return true;
    }
}
