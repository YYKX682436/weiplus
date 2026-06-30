package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f158812b;

    /* renamed from: c, reason: collision with root package name */
    public int f158813c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158815e;

    /* renamed from: a, reason: collision with root package name */
    public int f158811a = 1;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f158816f = new java.util.LinkedList();

    public static com.tencent.mm.plugin.scanner.model.a a(java.util.Map map, java.lang.String str) {
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".$type"), 0);
        com.tencent.mm.plugin.scanner.model.a aVar = new com.tencent.mm.plugin.scanner.model.a(P);
        aVar.f158781a = P;
        java.lang.String str2 = (java.lang.String) map.get(str + ".statid");
        if (str2 == null) {
            str2 = "";
        }
        aVar.f158794n = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".name");
        if (str3 == null) {
            str3 = "";
        }
        aVar.f158782b = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".desc");
        if (str4 == null) {
            str4 = "";
        }
        aVar.f158783c = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".digest");
        if (str5 == null) {
            str5 = "";
        }
        aVar.f158787g = str5;
        aVar.f158788h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".showtype"), 0);
        java.lang.String str6 = (java.lang.String) map.get(str + ".image");
        if (str6 == null) {
            str6 = "";
        }
        aVar.f158789i = str6;
        java.lang.String str7 = (java.lang.String) map.get(str + ".$key");
        if (str7 == null) {
            str7 = "";
        }
        aVar.f158800t = str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".iconurl");
        if (str8 == null) {
            str8 = "";
        }
        aVar.f158803w = str8;
        if (P == 1) {
            java.lang.String str9 = (java.lang.String) map.get(str + ".link");
            aVar.f158784d = str9 != null ? str9 : "";
            return aVar;
        }
        if (P == 2) {
            java.lang.String str10 = (java.lang.String) map.get(str + ".username");
            if (str10 == null) {
                str10 = "";
            }
            aVar.f158785e = str10;
            java.lang.String str11 = (java.lang.String) map.get(str + ".nickname");
            if (str11 == null) {
                str11 = "";
            }
            aVar.f158786f = str11;
            java.lang.String str12 = (java.lang.String) map.get(str + ".strbeforefollow");
            if (str12 == null) {
                str12 = "";
            }
            aVar.f158798r = str12;
            java.lang.String str13 = (java.lang.String) map.get(str + ".strafterfollow");
            aVar.f158799s = str13 != null ? str13 : "";
            return aVar;
        }
        if (P == 3) {
            java.lang.String str14 = (java.lang.String) map.get(str + ".thumburl");
            if (str14 == null) {
                str14 = "";
            }
            aVar.f158790j = str14;
            java.lang.String str15 = (java.lang.String) map.get(str + ".link");
            aVar.f158784d = str15 != null ? str15 : "";
            return aVar;
        }
        if (P == 4) {
            java.lang.String str16 = (java.lang.String) map.get(str + ".thumburl");
            if (str16 == null) {
                str16 = "";
            }
            aVar.f158790j = str16;
            java.lang.String str17 = (java.lang.String) map.get(str + ".username");
            if (str17 == null) {
                str17 = "";
            }
            aVar.f158785e = str17;
            java.lang.String str18 = (java.lang.String) map.get(str + ".nickname");
            aVar.f158786f = str18 != null ? str18 : "";
            return aVar;
        }
        if (P == 5) {
            java.lang.String str19 = (java.lang.String) map.get(str + ".wifiurl");
            if (str19 == null) {
                str19 = "";
            }
            aVar.f158791k = str19;
            java.lang.String str20 = (java.lang.String) map.get(str + ".wapurl");
            if (str20 == null) {
                str20 = "";
            }
            aVar.f158792l = str20;
            java.lang.String str21 = (java.lang.String) map.get(str + ".weburl");
            aVar.f158793m = str21 != null ? str21 : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158791k) && com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158792l) && com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158793m)) {
                return null;
            }
            return aVar;
        }
        if (P == 6) {
            return aVar;
        }
        if (P == 7) {
            java.lang.String str22 = (java.lang.String) map.get(str + ".thumburl");
            aVar.f158790j = str22 != null ? str22 : "";
            return aVar;
        }
        if (P == 9) {
            java.lang.String str23 = (java.lang.String) map.get(str + ".productid");
            aVar.f158795o = str23 != null ? str23 : "";
            return aVar;
        }
        if (P == 8) {
            java.lang.String str24 = (java.lang.String) map.get(str + ".cardext");
            if (str24 == null) {
                str24 = "";
            }
            aVar.f158796p = str24;
            java.lang.String str25 = (java.lang.String) map.get(str + ".cardid");
            aVar.f158797q = str25 != null ? str25 : "";
            return aVar;
        }
        if (P == 10) {
            java.lang.String str26 = (java.lang.String) map.get(str + ".id");
            aVar.f158795o = str26 != null ? str26 : "";
            return aVar;
        }
        if (P == 12) {
            java.lang.String str27 = (java.lang.String) map.get(str + ".image");
            if (str27 == null) {
                str27 = "";
            }
            aVar.f158790j = str27;
            java.lang.String str28 = (java.lang.String) map.get(str + ".link");
            aVar.f158784d = str28 != null ? str28 : "";
            return aVar;
        }
        if (P != 22) {
            if (P == 21) {
                java.lang.String str29 = (java.lang.String) map.get(str + ".referkey");
                aVar.f158802v = str29 != null ? str29 : "";
                return aVar;
            }
            java.lang.String str30 = (java.lang.String) map.get(str + ".link");
            aVar.f158784d = str30 != null ? str30 : "";
            return aVar;
        }
        java.lang.String str31 = (java.lang.String) map.get(str + ".content");
        if (str31 == null) {
            str31 = "";
        }
        aVar.f158801u = str31;
        java.lang.String str32 = (java.lang.String) map.get(str + ".link");
        if (str32 == null) {
            str32 = "";
        }
        aVar.f158784d = str32;
        java.lang.String str33 = (java.lang.String) map.get(str + ".nickname");
        if (str33 == null) {
            str33 = "";
        }
        aVar.f158786f = str33;
        java.lang.String str34 = (java.lang.String) map.get(str + ".image");
        aVar.f158790j = str34 != null ? str34 : "";
        return aVar;
    }

    public static java.util.LinkedList b(java.util.Map map, java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        boolean z17 = false;
        while (i17 < 1000) {
            com.tencent.mm.plugin.scanner.model.b bVar = new com.tencent.mm.plugin.scanner.model.b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".actionlist");
            sb6.append(i17 > 0 ? java.lang.Integer.valueOf(i17) : "");
            java.lang.String sb7 = sb6.toString();
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(sb7 + ".$type"))) {
                bVar.f158811a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".$type"), 0);
            }
            java.lang.String str2 = (java.lang.String) map.get(sb7 + ".$title");
            if (str2 == null) {
                str2 = "";
            }
            bVar.f158812b = str2;
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".$iconwidth"), 34);
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".$iconheight"), 34);
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".$referkey");
            if (str3 == null) {
                str3 = "";
            }
            bVar.f158814d = str3;
            bVar.f158813c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".$listshowtype"), 0);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int i18 = 0;
            boolean z18 = false;
            while (true) {
                if (i18 < 1000) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(sb7);
                    sb8.append(".action");
                    sb8.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                    java.lang.String sb9 = sb8.toString();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(sb9 + ".$type"))) {
                        com.tencent.mm.plugin.scanner.model.a a17 = a(map, sb9);
                        if (a17 != null) {
                            linkedList2.add(a17);
                            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(a17.f158800t))) {
                                z18 = true;
                            }
                        }
                        i18++;
                        z17 = false;
                    } else {
                        if (z17) {
                            return linkedList;
                        }
                        bVar.f158816f = linkedList2;
                        z17 = true;
                    }
                }
            }
            bVar.f158815e = z18;
            linkedList.add(bVar);
            i17++;
        }
        return linkedList;
    }
}
