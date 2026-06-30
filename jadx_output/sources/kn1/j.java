package kn1;

/* loaded from: classes12.dex */
public abstract class j {
    public static java.lang.String a(java.lang.String str) {
        on1.g gVar;
        if (on1.h.f346822c == null) {
            on1.h.f346822c = new on1.h();
        }
        on1.h hVar = on1.h.f346822c;
        if (hVar.f346823b == null) {
            hVar.d();
        }
        java.util.Iterator it = ((java.util.HashMap) hVar.f346823b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (on1.g) it.next();
            java.lang.String str2 = gVar.f346819b;
            if (str2 != null && str2.equals(str)) {
                break;
            }
        }
        if (gVar == null) {
            return null;
        }
        return gVar.f346818a;
    }

    public static java.lang.String b(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, r45.ed edVar) {
        tn1.d e17 = tn1.f.f().e();
        if (e17.f420812o == 0) {
            throw new c01.c();
        }
        com.tencent.mm.storage.emotion.EmojiInfo u17 = e17.f420803f.u1(f9Var.z0());
        if (u17 == null) {
            return null;
        }
        on1.g c17 = on1.h.c(u17.getMd5());
        if (c17 == null) {
            c17 = new on1.g(u17.getMd5(), u17.getMd5(), u17.getMd5(), u17.getMd5());
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            org.xmlpull.v1.XmlSerializer newSerializer = org.xmlpull.v1.XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(stringWriter);
            newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
            newSerializer.startTag(null, "msg");
            newSerializer.startTag(null, "emoji");
            newSerializer.attribute(null, "fromusername", str);
            newSerializer.attribute(null, "tousername", str2);
            newSerializer.attribute(null, "type", u17.field_type + "");
            newSerializer.attribute(null, "idbuffer", u17.u0());
            newSerializer.attribute(null, "md5", c17.f346819b);
            newSerializer.attribute(null, "len", "1024");
            newSerializer.attribute(null, "androidmd5", c17.f346818a);
            newSerializer.attribute(null, "androidlen", "1024");
            newSerializer.attribute(null, "productid", u17.field_groupId);
            java.lang.String str3 = u17.field_cdnUrl;
            if (str3 == null) {
                str3 = "";
            }
            newSerializer.attribute(null, "cdnurl", str3);
            java.lang.String str4 = u17.field_designerID;
            if (str4 == null) {
                str4 = "";
            }
            newSerializer.attribute(null, "designerid", str4);
            java.lang.String str5 = u17.field_thumbUrl;
            if (str5 == null) {
                str5 = "";
            }
            newSerializer.attribute(null, "thumburl", str5);
            java.lang.String str6 = u17.field_encrypturl;
            if (str6 == null) {
                str6 = "";
            }
            newSerializer.attribute(null, "encrypturl", str6);
            java.lang.String str7 = u17.field_aeskey;
            if (str7 == null) {
                str7 = "";
            }
            newSerializer.attribute(null, "aeskey", str7);
            java.lang.String str8 = u17.field_externUrl;
            if (str8 == null) {
                str8 = "";
            }
            newSerializer.attribute(null, "externurl", str8);
            java.lang.String str9 = u17.field_externMd5;
            if (str9 == null) {
                str9 = "";
            }
            newSerializer.attribute(null, "externmd5", str9);
            newSerializer.attribute(null, "width", java.lang.String.valueOf(u17.field_width));
            newSerializer.attribute(null, "height", java.lang.String.valueOf(u17.field_height));
            java.lang.String str10 = u17.field_tpurl;
            if (str10 == null) {
                str10 = "";
            }
            newSerializer.attribute(null, "tpurl", str10);
            java.lang.String str11 = u17.field_tpauthkey;
            if (str11 == null) {
                str11 = "";
            }
            newSerializer.attribute(null, "tpauthkey", str11);
            java.lang.String str12 = u17.field_attachedText;
            if (str12 == null) {
                str12 = "";
            }
            newSerializer.attribute(null, "attachedtext", str12);
            java.lang.String str13 = u17.field_attachTextColor;
            if (str13 == null) {
                str13 = "";
            }
            newSerializer.attribute(null, "attachedtextcolor", str13);
            java.lang.String str14 = u17.field_lensId;
            if (str14 == null) {
                str14 = "";
            }
            newSerializer.attribute(null, "lensid", str14);
            java.lang.String str15 = u17.field_activityid;
            if (str15 == null) {
                str15 = "";
            }
            newSerializer.attribute(null, "activityid", str15);
            newSerializer.endTag(null, "emoji");
            if (u17.k()) {
                newSerializer.startTag(null, "gameext");
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(u17.j(), "gameext", null);
                java.lang.String str16 = (java.lang.String) d17.get(".gameext.$type");
                if (str16 == null) {
                    str16 = "";
                }
                java.lang.String str17 = (java.lang.String) d17.get(".gameext.$content");
                if (str17 == null) {
                    str17 = "";
                }
                if (!str16.equals("") && !str17.equals("")) {
                    newSerializer.attribute(null, "type", str16.concat(""));
                    newSerializer.attribute(null, "content", str17.concat(""));
                    newSerializer.endTag(null, "gameext");
                }
                stringWriter.close();
                return "";
            }
            if (f9Var.j() != null && !android.text.TextUtils.isEmpty(f9Var.j())) {
                r15.b bVar = new r15.b();
                try {
                    bVar.fromXml(f9Var.j());
                    if (bVar.n() != null) {
                        r15.c.a(bVar, newSerializer);
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil.EmojiConvert", th6, "extCommonInfo.fromXml err", new java.lang.Object[0]);
                }
            }
            newSerializer.endTag(null, "msg");
            newSerializer.endDocument();
            stringWriter.flush();
            stringWriter.close();
            java.lang.String stringBuffer = stringWriter.getBuffer().toString();
            try {
                return stringBuffer.substring(stringBuffer.indexOf("<msg>"), stringBuffer.indexOf("</msg>") + 6);
            } catch (java.lang.Exception unused) {
                return "";
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil.EmojiConvert", e18, "", new java.lang.Object[0]);
            return "";
        } catch (java.lang.IllegalArgumentException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil.EmojiConvert", e19, "", new java.lang.Object[0]);
            return "";
        } catch (java.lang.IllegalStateException e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil.EmojiConvert", e27, "", new java.lang.Object[0]);
            return "";
        } catch (org.xmlpull.v1.XmlPullParserException e28) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil.EmojiConvert", e28, "", new java.lang.Object[0]);
            return "";
        }
    }
}
