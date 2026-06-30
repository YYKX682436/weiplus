package m21;

/* loaded from: classes4.dex */
public class p implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.ek4 f322997a = new r45.ek4();

    @Override // m21.u
    public java.lang.String a() {
        r45.ek4 ek4Var = this.f322997a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (ek4Var != null) {
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(ek4Var.getString(0))) {
                    sb6.append("<finderMegaVideo>");
                    sb6.append("<objectId>");
                    sb6.append(ek4Var.getString(0));
                    sb6.append("</objectId>");
                    sb6.append("<objectNonceId>");
                    sb6.append(ek4Var.getString(7));
                    sb6.append("</objectNonceId>");
                    sb6.append("<nickname>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(ek4Var.getString(2)));
                    sb6.append("</nickname>");
                    sb6.append("<avatar>");
                    sb6.append(com.tencent.mm.sdk.platformtools.aa.a(ek4Var.getString(3)));
                    sb6.append("</avatar>");
                    sb6.append("<desc>");
                    int i17 = 4;
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(ek4Var.getString(4)));
                    sb6.append("</desc>");
                    sb6.append("<username>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(ek4Var.getString(1)));
                    sb6.append("</username>");
                    sb6.append("<mediaCount>");
                    sb6.append(ek4Var.getInteger(5));
                    sb6.append("</mediaCount>");
                    sb6.append("<mediaList>");
                    java.util.Iterator it = ek4Var.getList(6).iterator();
                    while (it.hasNext()) {
                        r45.dk4 dk4Var = (r45.dk4) it.next();
                        java.lang.String a17 = !android.text.TextUtils.isEmpty(dk4Var.getString(i17)) ? com.tencent.mm.sdk.platformtools.aa.a(dk4Var.getString(i17)) : com.tencent.mm.sdk.platformtools.aa.a(dk4Var.getString(1));
                        sb6.append("<media>");
                        sb6.append("<url>");
                        sb6.append(com.tencent.mm.sdk.platformtools.aa.a(dk4Var.getString(0)));
                        sb6.append("</url>");
                        sb6.append("<thumbUrl>");
                        sb6.append(com.tencent.mm.sdk.platformtools.aa.a(dk4Var.getString(1)));
                        sb6.append("</thumbUrl>");
                        sb6.append("<width>");
                        sb6.append(dk4Var.getFloat(2));
                        sb6.append("</width>");
                        sb6.append("<height>");
                        sb6.append(dk4Var.getFloat(3));
                        sb6.append("</height>");
                        sb6.append("<coverUrl>");
                        sb6.append(a17);
                        sb6.append("</coverUrl>");
                        sb6.append("<videoPlayDuration>");
                        sb6.append(dk4Var.getInteger(5));
                        sb6.append("</videoPlayDuration>");
                        sb6.append("</media>");
                        i17 = 4;
                    }
                    sb6.append("</mediaList>");
                    sb6.append("<finderFeed>");
                    sb6.append("<objectId>");
                    sb6.append(ek4Var.getString(8));
                    sb6.append("</objectId>");
                    sb6.append("<objectNonceId>");
                    sb6.append(ek4Var.getString(9));
                    sb6.append("</objectNonceId>");
                    sb6.append("</finderFeed>");
                    sb6.append("</finderMegaVideo>");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    public void b(java.lang.String str, java.util.Map map) {
        r45.ek4 ek4Var = new r45.ek4();
        try {
            java.lang.String str2 = str + ".finderMegaVideo";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".objectId")) {
                    java.lang.String str3 = (java.lang.String) map.get(str2 + ".objectId");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    java.lang.String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    ek4Var.set(0, str3);
                    java.lang.String str5 = (java.lang.String) map.get(str2 + ".objectNonceId");
                    if (str5 == null) {
                        str5 = "";
                    }
                    ek4Var.set(7, str5);
                    java.lang.String str6 = (java.lang.String) map.get(str2 + ".nickname");
                    if (str6 == null) {
                        str6 = "";
                    }
                    ek4Var.set(2, str6);
                    java.lang.String str7 = (java.lang.String) map.get(str2 + ".username");
                    if (str7 == null) {
                        str7 = "";
                    }
                    ek4Var.set(1, str7);
                    java.lang.String str8 = (java.lang.String) map.get(str2 + ".avatar");
                    if (str8 == null) {
                        str8 = "";
                    }
                    ek4Var.set(3, str8);
                    java.lang.String str9 = (java.lang.String) map.get(str2 + ".desc");
                    if (str9 == null) {
                        str9 = "";
                    }
                    ek4Var.set(4, str9);
                    ek4Var.set(5, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str2 + ".mediaCount"), 0)));
                    int i17 = 0;
                    for (int i18 = 5; i17 < ek4Var.getInteger(i18); i18 = 5) {
                        r45.dk4 dk4Var = new r45.dk4();
                        java.lang.String str10 = str2 + ".mediaList.media";
                        if (i17 > 0) {
                            str10 = str10 + i17;
                        }
                        java.lang.String str11 = (java.lang.String) map.get(str10 + ".url");
                        if (str11 == null) {
                            str11 = "";
                        }
                        dk4Var.set(0, str11);
                        java.lang.String str12 = (java.lang.String) map.get(str10 + ".thumbUrl");
                        if (str12 == null) {
                            str12 = "";
                        }
                        dk4Var.set(1, str12);
                        dk4Var.set(2, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str10 + ".width"))));
                        dk4Var.set(3, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str10 + ".height"))));
                        java.lang.String str13 = (java.lang.String) map.get(str10 + ".coverUrl");
                        if (str13 == null) {
                            str13 = "";
                        }
                        dk4Var.set(4, str13);
                        dk4Var.set(5, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str10 + ".videoPlayDuration"), 0)));
                        ek4Var.getList(6).add(dk4Var);
                        i17++;
                    }
                    java.lang.String str14 = str2 + ".finderFeed";
                    java.lang.String str15 = (java.lang.String) map.get(str14 + ".objectId");
                    if (str15 == null) {
                        str15 = "";
                    }
                    ek4Var.set(8, str15);
                    java.lang.String str16 = (java.lang.String) map.get(str14 + ".objectNonceId");
                    if (str16 != null) {
                        str4 = str16;
                    }
                    ek4Var.set(9, str4);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
        }
        this.f322997a = ek4Var;
    }
}
