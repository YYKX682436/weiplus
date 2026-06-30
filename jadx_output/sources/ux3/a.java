package ux3;

/* loaded from: classes10.dex */
public final class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public vx3.i f431874b = new vx3.i();

    @Override // ot0.h
    public ot0.h a() {
        ux3.a aVar = new ux3.a();
        aVar.f431874b = this.f431874b;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        java.lang.String b17;
        kotlin.jvm.internal.o.g(sb6, "sb");
        vx3.i iVar = this.f431874b;
        if (iVar.f441298o == 0) {
            if ((iVar.f441299p.length() == 0) && iVar.f441300q == 0) {
                b17 = "";
                sb6.append(b17);
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<TPMediaInfoDesc>\n<info>");
        dk4.a aVar = iVar.f441284a;
        sb7.append(iVar.b(aVar != null ? vx3.i.D.b(aVar) : null));
        sb7.append("</info>\n<startTime>");
        sb7.append(iVar.b(java.lang.Long.valueOf(iVar.f441285b)));
        sb7.append("</startTime>\n<endTime>");
        sb7.append(iVar.b(java.lang.Long.valueOf(iVar.f441286c)));
        sb7.append("</endTime>\n<hashCode>");
        sb7.append(iVar.b(iVar.f441288e));
        sb7.append("</hashCode>\n<duration>");
        sb7.append(iVar.b(java.lang.Long.valueOf(iVar.f441290g)));
        sb7.append("</duration>\n<shortSongName>");
        sb7.append(iVar.b(iVar.f441292i));
        sb7.append("</shortSongName>\n<songName>");
        sb7.append(iVar.b(iVar.f441291h));
        sb7.append("</songName>\n<singerName>");
        sb7.append(iVar.b(iVar.f441293j));
        sb7.append("</singerName>\n<cover>");
        sb7.append(iVar.b(iVar.f441294k));
        sb7.append("</cover>\n<channelId>");
        sb7.append(iVar.b(iVar.f441295l));
        sb7.append("</channelId>\n<ringtoneSource>");
        sb7.append(iVar.b(iVar.f441296m));
        sb7.append("</ringtoneSource>\n<finderObjectId>");
        sb7.append(iVar.b(java.lang.Long.valueOf(iVar.f441298o)));
        sb7.append("</finderObjectId>\n<finderNonceId>");
        sb7.append(iVar.b(iVar.f441299p));
        sb7.append("</finderNonceId>\n<musicSid>");
        sb7.append(iVar.b(java.lang.Integer.valueOf(iVar.f441300q)));
        sb7.append("</musicSid>\n<unAvailable>");
        sb7.append(iVar.b(java.lang.Boolean.valueOf(iVar.f441297n)));
        sb7.append("</unAvailable>\n<finderAuthorHeadUrl>");
        sb7.append(iVar.b(iVar.f441303t));
        sb7.append("</finderAuthorHeadUrl>\n<finderAuthIconUrl>");
        sb7.append(iVar.b(iVar.f441304u));
        sb7.append("</finderAuthIconUrl>\n<finderAuthProfession>");
        sb7.append(iVar.b(iVar.f441305v));
        sb7.append("</finderAuthProfession>\n<finderAuthProfessionType>");
        sb7.append(iVar.b(java.lang.Integer.valueOf(iVar.f441306w)));
        sb7.append("</finderAuthProfessionType>\n<authProfessionType>");
        sb7.append(iVar.b(java.lang.Integer.valueOf(iVar.f441307x)));
        sb7.append("</authProfessionType>\n<singerFinderUserName>");
        sb7.append(iVar.b(iVar.A));
        sb7.append("</singerFinderUserName>\n<singerBaikeURL>");
        sb7.append(iVar.b(iVar.B));
        sb7.append("</singerBaikeURL>\n<finderUserName>");
        sb7.append(iVar.b(iVar.f441309z));
        sb7.append("</finderUserName>\n<hasBgm>");
        sb7.append(iVar.b(java.lang.Boolean.valueOf(iVar.f441308y)));
        sb7.append("</hasBgm>\n</TPMediaInfoDesc>\n");
        b17 = r26.b0.b(r26.i0.v(sb7.toString(), "\n", "", false, 4, null));
        sb6.append(b17);
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        kotlin.jvm.internal.o.g(values, "values");
        vx3.i iVar = this.f431874b;
        iVar.getClass();
        try {
            java.lang.String concat = ".msg.appmsg".concat(".TPMediaInfoDesc");
            if (!values.isEmpty()) {
                vx3.h hVar = vx3.i.D;
                dk4.a aVar = new dk4.a();
                java.lang.String str = (java.lang.String) values.get(concat + ".info");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "{}";
                }
                iVar.f441284a = hVar.a(aVar, str);
                iVar.f441285b = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) values.get(concat + ".startTime"));
                iVar.f441286c = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) values.get(concat + ".endTime"));
                java.lang.String str2 = (java.lang.String) values.get(concat + ".endTime");
                java.lang.String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                iVar.f441288e = str2;
                iVar.f441290g = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) values.get(concat + ".duration"));
                java.lang.String str4 = (java.lang.String) values.get(concat + ".shortSongName");
                if (str4 == null) {
                    str4 = "";
                }
                iVar.f441292i = str4;
                java.lang.String str5 = (java.lang.String) values.get(concat + ".songName");
                if (str5 == null) {
                    str5 = "";
                }
                iVar.f441291h = str5;
                java.lang.String str6 = (java.lang.String) values.get(concat + ".singerName");
                if (str6 == null) {
                    str6 = "";
                }
                iVar.f441293j = str6;
                java.lang.String str7 = (java.lang.String) values.get(concat + ".cover");
                if (str7 == null) {
                    str7 = "";
                }
                iVar.f441294k = str7;
                java.lang.String str8 = (java.lang.String) values.get(concat + ".channelId");
                if (str8 == null) {
                    str8 = "";
                }
                iVar.f441295l = str8;
                iVar.f441296m = vx3.g.f441277d.a(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".channelId"), 0));
                iVar.f441298o = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) values.get(concat + ".finderObjectId"));
                java.lang.String str9 = (java.lang.String) values.get(concat + ".finderNonceId");
                if (str9 == null) {
                    str9 = "";
                }
                iVar.f441299p = str9;
                iVar.f441300q = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".musicSid"), 0);
                java.lang.String str10 = (java.lang.String) values.get(concat + ".unAvailable");
                if (str10 == null) {
                    str10 = "";
                }
                iVar.f441297n = java.lang.Boolean.parseBoolean(str10);
                java.lang.String str11 = (java.lang.String) values.get(concat + ".finderAuthorHeadUrl");
                if (str11 == null) {
                    str11 = "";
                }
                iVar.f441303t = str11;
                java.lang.String str12 = (java.lang.String) values.get(concat + ".finderAuthIconUrl");
                if (str12 == null) {
                    str12 = "";
                }
                iVar.f441304u = str12;
                java.lang.String str13 = (java.lang.String) values.get(concat + ".finderAuthProfession");
                if (str13 == null) {
                    str13 = "";
                }
                iVar.f441305v = str13;
                iVar.f441306w = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".finderAuthProfessionType"), 0);
                iVar.f441307x = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".authProfessionType"), 0);
                java.lang.String str14 = (java.lang.String) values.get(concat + ".singerFinderUserName");
                if (str14 == null) {
                    str14 = "";
                }
                iVar.A = str14;
                java.lang.String str15 = (java.lang.String) values.get(concat + ".singerBaikeURL");
                if (str15 == null) {
                    str15 = "";
                }
                iVar.B = str15;
                java.lang.String str16 = (java.lang.String) values.get(concat + ".finderUserName");
                if (str16 != null) {
                    str3 = str16;
                }
                iVar.f441309z = str3;
                iVar.f441308y = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) values.get(concat + ".hasBgm"), false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TPMediaInfoDesc", "parse error! %s", e17.getMessage());
        }
    }

    public final vx3.i f() {
        return this.f431874b;
    }
}
