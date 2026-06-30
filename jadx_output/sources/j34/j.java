package j34;

/* loaded from: classes9.dex */
public abstract class j {
    public static java.lang.String a(j34.i iVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("<tv>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_id)) {
            sb6.append("<id>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_id) + "</id>");
        }
        sb6.append("<title>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_title) + "</title>");
        sb6.append("<subtitle>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_subtitle) + "</subtitle>");
        sb6.append("<topic>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_topic) + "</topic>");
        sb6.append("<thumburl>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_thumburl) + "</thumburl>");
        sb6.append("<shareurl>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_shareurl) + "</shareurl>");
        if (com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_playstatid)) {
            sb6.append("<playurl>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_playurl) + "</playurl>");
        } else {
            sb6.append("<playurl statid=\"" + iVar.field_playstatid + "\">" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_playurl) + "</playurl>");
        }
        sb6.append("<source>" + com.tencent.mm.sdk.platformtools.t8.p(iVar.field_source) + "</source>");
        sb6.append("</tv>");
        return sb6.toString();
    }

    public static j34.i b(java.lang.String str) {
        java.util.Map d17;
        j34.f a17;
        if (str == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "tv", null)) == null) {
            return null;
        }
        j34.i iVar = new j34.i();
        java.lang.String str2 = (java.lang.String) d17.get(".tv.id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        iVar.field_id = str2;
        java.lang.String str3 = (java.lang.String) d17.get(".tv.topic");
        if (str3 == null) {
            str3 = "";
        }
        iVar.field_topic = str3;
        java.lang.String str4 = (java.lang.String) d17.get(".tv.title");
        if (str4 == null) {
            str4 = "";
        }
        iVar.field_title = str4;
        java.lang.String str5 = (java.lang.String) d17.get(".tv.subtitle");
        if (str5 == null) {
            str5 = "";
        }
        iVar.field_subtitle = str5;
        java.lang.String str6 = (java.lang.String) d17.get(".tv.thumburl");
        if (str6 == null) {
            str6 = "";
        }
        iVar.field_thumburl = str6;
        java.lang.String str7 = (java.lang.String) d17.get(".tv.shareurl");
        if (str7 == null) {
            str7 = "";
        }
        iVar.field_shareurl = str7;
        java.lang.String str8 = (java.lang.String) d17.get(".tv.playurl");
        if (str8 == null) {
            str8 = "";
        }
        iVar.field_playurl = str8;
        java.lang.String str9 = (java.lang.String) d17.get(".tv.playurl$statid");
        if (str9 == null) {
            str9 = "";
        }
        iVar.field_playstatid = str9;
        java.lang.String str10 = (java.lang.String) d17.get(".tv.source");
        if (str10 == null) {
            str10 = "";
        }
        iVar.field_source = str10;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean z18 = false;
        int i17 = 0;
        while (i17 < 1000) {
            j34.g gVar = new j34.g();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".tv.actionlist");
            sb6.append(i17 > 0 ? java.lang.Integer.valueOf(i17) : "");
            java.lang.String sb7 = sb6.toString();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            boolean z19 = z18;
            int i18 = 0;
            while (i18 < 1000) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(sb7);
                sb8.append(".action");
                sb8.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                java.lang.String sb9 = sb8.toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(sb9 + ".type"))) {
                    try {
                        int intValue = java.lang.Integer.valueOf((java.lang.String) d17.get(sb9 + ".type")).intValue();
                        if (intValue == 2) {
                            a17 = new j34.f(intValue);
                            java.lang.String str11 = (java.lang.String) d17.get(sb9 + ".comment.id");
                            if (str11 == null) {
                                str11 = "";
                            }
                            a17.f297487d = str11;
                            java.lang.String str12 = (java.lang.String) d17.get(sb9 + ".comment.title");
                            if (str12 == null) {
                                str12 = "";
                            }
                            a17.f297485b = str12;
                        } else {
                            a17 = intValue == 3 ? j34.g.a(d17, intValue, sb9) : intValue == 4 ? j34.g.a(d17, intValue, sb9) : intValue == 5 ? j34.g.a(d17, intValue, sb9) : intValue == 6 ? j34.g.a(d17, intValue, sb9) : null;
                        }
                        if (a17 != null) {
                            linkedList2.add(a17);
                        }
                        i18++;
                        z19 = false;
                    } catch (java.lang.Exception e17) {
                        e17.getMessage();
                        if (z19) {
                            break;
                        }
                        gVar.f297491a = linkedList2;
                    }
                } else {
                    if (z19) {
                        break;
                    }
                    gVar.f297491a = linkedList2;
                    z18 = true;
                    linkedList.add(gVar);
                    i17++;
                }
            }
            z18 = z19;
            linkedList.add(gVar);
            i17++;
        }
        iVar.f297494a = linkedList;
        iVar.field_xml = str;
        return iVar;
    }

    public static java.lang.String c(android.content.Context context, j34.i iVar) {
        ot0.q qVar = new ot0.q();
        qVar.f348654f = iVar.field_title;
        if (com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_topic)) {
            qVar.f348658g = iVar.field_subtitle;
        } else {
            qVar.f348658g = iVar.field_topic;
        }
        qVar.f348666i = 20;
        qVar.f348674k = iVar.field_shareurl;
        qVar.f348662h = "";
        if (h34.z.e()) {
            qVar.H = context.getString(com.tencent.mm.R.string.f492933ib3);
            qVar.f348646d = "wxaf060266bfa9a35c";
        }
        qVar.f348734z = iVar.field_thumburl;
        qVar.f348659g0 = a(iVar);
        return ot0.q.u(qVar, null, null);
    }
}
