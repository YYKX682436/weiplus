package wa4;

/* loaded from: classes4.dex */
public abstract class b {
    public static r45.lj4 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillContentMediaSize", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        java.lang.String str2 = str + ".size.$width";
        java.lang.String str3 = str + ".size.$height";
        java.lang.String str4 = (java.lang.String) map.get(str2);
        java.lang.String str5 = (java.lang.String) map.get(str3);
        java.lang.String str6 = (java.lang.String) map.get(str + ".size.$totalSize");
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f379521e = 0.0f;
        lj4Var.f379520d = 0.0f;
        lj4Var.f379522f = 0.0f;
        if (str4 != null) {
            lj4Var.f379520d = b(str4);
        }
        if (str5 != null) {
            lj4Var.f379521e = b(str5);
        }
        if (str6 != null) {
            lj4Var.f379522f = b(str6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillContentMediaSize", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return lj4Var;
    }

    public static float b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserFloat", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        float f17 = 0.0f;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            return 0.0f;
        }
        try {
            f17 = com.tencent.mm.sdk.platformtools.t8.L(str, 0.0f);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumBgHelper", "parseFloat error ".concat(str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return f17;
    }

    public static r45.c7 c(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String sb6;
        java.lang.String str14;
        int i17;
        r45.c7 c7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserFromXml", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "albumList", null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNewAlbumBG", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        r45.c7 c7Var2 = new r45.c7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNewAlbumBG", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        if (d17 != null) {
            c7Var2.f371342f = e((java.lang.String) d17.get(".albumList.$lang"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAuthor", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            r45.za zaVar = new r45.za();
            zaVar.f391841d = e((java.lang.String) d17.get(".albumList.album.author.name"));
            zaVar.f391842e = e((java.lang.String) d17.get(".albumList.album.author.title"));
            zaVar.f391844g = e((java.lang.String) d17.get(".albumList.album.author.description"));
            zaVar.f391843f = e((java.lang.String) d17.get(".albumList.album.author.quote"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAuthorIcon", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            r45.ab abVar = new r45.ab();
            r45.lj4 a17 = a(d17, ".albumList.album.author.icon.media");
            java.lang.String str15 = (java.lang.String) d17.get(".albumList.album.author.icon.media.id");
            java.lang.String str16 = (java.lang.String) d17.get(".albumList.album.author.icon.media.type");
            java.lang.String str17 = (java.lang.String) d17.get(".albumList.album.author.icon.media.title");
            java.lang.String str18 = (java.lang.String) d17.get(".albumList.album.author.icon.media.desc");
            java.lang.String str19 = (java.lang.String) d17.get(".albumList.album.author.icon.media.url");
            java.lang.String str20 = (java.lang.String) d17.get(".albumList.album.author.icon.media.private");
            java.lang.String str21 = (java.lang.String) d17.get(".albumList.album.author.icon.media.thumb");
            str2 = "parserFromXml";
            java.lang.String str22 = (java.lang.String) d17.get(".albumList.album.author.icon.media.url.$type");
            java.lang.String str23 = (java.lang.String) d17.get(".albumList.album.author.icon.media.thumb.$type");
            java.util.Map map = d17;
            r45.jj4 jj4Var = new r45.jj4();
            jj4Var.f377855d = e(str15);
            jj4Var.f377856e = d(str16);
            jj4Var.f377864o = e(str17);
            jj4Var.f377857f = e(str18);
            jj4Var.f377858g = e(str19);
            jj4Var.f377859h = d(str22);
            jj4Var.f377860i = e(str21);
            jj4Var.f377862m = d(str23);
            jj4Var.f377863n = d(str20);
            jj4Var.f377865p = a17;
            abVar.f369879d = jj4Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAuthorIcon", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            zaVar.f391845h = abVar;
            c7Var2.f371340d = zaVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAuthor", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            java.lang.String str24 = "fillGroupList";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillGroupList", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            int i18 = 0;
            while (true) {
                r45.zt3 zt3Var = new r45.zt3();
                if (i18 == 0) {
                    str3 = ".albumList.album.groupList.group.name";
                    str4 = ".albumList.album.groupList.group.mediaList";
                } else {
                    str3 = ".albumList.album.groupList.group" + i18 + ".name";
                    str4 = ".albumList.album.groupList.group" + i18 + ".mediaList";
                }
                java.util.Map map2 = map;
                java.lang.String str25 = (java.lang.String) map2.get(str3);
                if (str25 == null) {
                    break;
                }
                zt3Var.f392365d = e(str25);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillMediaList", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int i19 = 0;
                while (true) {
                    if (i19 != 0) {
                        str6 = str4 + ".media" + i19 + ".id";
                        str7 = str4 + ".media" + i19 + ".type";
                        str8 = str4 + ".media" + i19 + ".title";
                        str9 = str4 + ".media" + i19 + ".desc";
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(str4);
                        sb7.append(".media");
                        sb7.append(i19);
                        str5 = str24;
                        sb7.append(".url");
                        java.lang.String sb8 = sb7.toString();
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(str4);
                        sb9.append(".media");
                        sb9.append(i19);
                        str10 = sb8;
                        sb9.append(".thumb");
                        java.lang.String sb10 = sb9.toString();
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                        sb11.append(str4);
                        sb11.append(".media");
                        sb11.append(i19);
                        str11 = sb10;
                        sb11.append(".url.$type");
                        java.lang.String sb12 = sb11.toString();
                        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                        sb13.append(str4);
                        sb13.append(".media");
                        sb13.append(i19);
                        str12 = sb12;
                        sb13.append(".thumb.$type");
                        java.lang.String sb14 = sb13.toString();
                        java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                        sb15.append(str4);
                        sb15.append(".media");
                        sb15.append(i19);
                        str13 = sb14;
                        sb15.append(".private");
                        sb6 = sb15.toString();
                        str14 = str4 + ".media" + i19;
                    } else {
                        str5 = str24;
                        str6 = str4 + ".media.id";
                        str7 = str4 + ".media.type";
                        str8 = str4 + ".media.title";
                        str9 = str4 + ".media.desc";
                        java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                        sb16.append(str4);
                        str10 = str4 + ".media.url";
                        sb16.append(".media.thumb");
                        java.lang.String sb17 = sb16.toString();
                        java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                        sb18.append(str4);
                        str11 = sb17;
                        sb18.append(".media.url.$type");
                        java.lang.String sb19 = sb18.toString();
                        java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                        sb20.append(str4);
                        str12 = sb19;
                        sb20.append(".media.thumb.$type");
                        java.lang.String sb21 = sb20.toString();
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                        sb22.append(str4);
                        str13 = sb21;
                        sb22.append(".media.private");
                        sb6 = sb22.toString();
                        str14 = str4 + ".media";
                    }
                    java.lang.String str26 = str14;
                    java.lang.String str27 = sb6;
                    java.lang.String str28 = str11;
                    i17 = i18;
                    java.lang.String str29 = str7;
                    java.lang.String str30 = str10;
                    java.lang.String str31 = str4;
                    java.lang.String str32 = str6;
                    java.lang.String str33 = str13;
                    java.lang.String str34 = str8;
                    java.lang.String str35 = str9;
                    java.lang.String str36 = str12;
                    c7Var = c7Var2;
                    if (str32 != null && str29 != null) {
                        r45.lj4 a18 = a(map2, str26);
                        java.lang.String str37 = (java.lang.String) map2.get(str32);
                        java.lang.String str38 = (java.lang.String) map2.get(str29);
                        java.lang.String str39 = (java.lang.String) map2.get(str34);
                        java.lang.String str40 = (java.lang.String) map2.get(str35);
                        java.lang.String str41 = (java.lang.String) map2.get(str30);
                        java.lang.String str42 = (java.lang.String) map2.get(str27);
                        java.lang.String str43 = (java.lang.String) map2.get(str28);
                        java.lang.String str44 = (java.lang.String) map2.get(str36);
                        java.lang.String str45 = (java.lang.String) map2.get(str33);
                        if (str37 != null && str38 != null) {
                            java.util.Map map3 = map2;
                            r45.jj4 jj4Var2 = new r45.jj4();
                            jj4Var2.f377855d = e(str37);
                            jj4Var2.f377856e = d(str38);
                            jj4Var2.f377864o = e(str39);
                            jj4Var2.f377857f = e(str40);
                            jj4Var2.f377858g = e(str41);
                            jj4Var2.f377859h = d(str44);
                            jj4Var2.f377860i = e(str43);
                            jj4Var2.f377862m = d(str45);
                            jj4Var2.f377863n = d(str42);
                            jj4Var2.f377865p = a18;
                            linkedList.add(jj4Var2);
                            i19++;
                            str24 = str5;
                            str4 = str31;
                            i18 = i17;
                            c7Var2 = c7Var;
                            map2 = map3;
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillMediaList", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
                zt3Var.f392366e = linkedList;
                c7Var.f371341e.add(zt3Var);
                i18 = i17 + 1;
                c7Var2 = c7Var;
                str24 = str5;
                map = map2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str24, "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        } else {
            str2 = "parserFromXml";
        }
        r45.c7 c7Var3 = c7Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return c7Var3;
    }

    public static int d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserInt", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        int i17 = 0;
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumBgHelper", "parserInt error " + str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserInt", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return i17;
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserString", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return str;
    }
}
