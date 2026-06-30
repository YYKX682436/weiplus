package ef4;

/* loaded from: classes4.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public final r45.lf6 a(java.lang.String xml) {
        java.lang.String str;
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
        kotlin.jvm.internal.o.g(xml, "xml");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(xml, "StoryObject", null);
        if (d17 == null) {
            return null;
        }
        r45.lf6 lf6Var = new r45.lf6();
        r45.oe6 oe6Var = new r45.oe6();
        r45.tl5 tl5Var = new r45.tl5();
        tl5Var.f386553e = 0.0f;
        tl5Var.f386552d = 0.0f;
        lf6Var.f379431g = tl5Var;
        lf6Var.f379432h = oe6Var;
        lf6Var.f379428d = "";
        lf6Var.f379430f = 0;
        java.lang.String str12 = (java.lang.String) d17.get(".StoryObject.id");
        if (str12 == null) {
            str12 = "";
        }
        lf6Var.f379428d = str12;
        java.lang.String str13 = (java.lang.String) d17.get(".StoryObject.username");
        if (str13 == null) {
            str13 = "";
        }
        lf6Var.f379429e = str13;
        lf6Var.f379430f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".StoryObject.createTime"), 0);
        lf6Var.f379435n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".StoryObject.scope"), 0);
        r45.tl5 tl5Var2 = new r45.tl5();
        tl5Var2.f386552d = 0.0f;
        tl5Var2.f386553e = 0.0f;
        tl5Var2.f386554f = "";
        tl5Var2.f386560o = 0;
        tl5Var2.f386557i = "";
        tl5Var2.f386558m = 0;
        tl5Var2.f386556h = "";
        tl5Var2.f386555g = "";
        tl5Var2.f386561p = 1;
        tl5Var2.f386566u = "";
        tl5Var2.f386567v = "";
        lf6Var.f379431g = tl5Var2;
        if (lf6Var.f379432h == null) {
            lf6Var.f379432h = new r45.oe6();
        }
        r45.oe6 oe6Var2 = lf6Var.f379432h;
        java.lang.String str14 = (java.lang.String) d17.get("contTitle");
        if (str14 == null) {
            str14 = "";
        }
        oe6Var2.f382204d = str14;
        int i17 = 0;
        while (true) {
            if (i17 != 0) {
                str = ".StoryObject.ContentObject.mediaList.media" + i17 + ".id";
                str2 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".type";
                str3 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".url";
                str4 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".url.$videomd5";
                str5 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".thumb";
                str6 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".url.$type";
                str7 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".thumb.$type";
                str8 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".subType";
                str9 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".userData";
                str10 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".url.$md5";
                str11 = ".StoryObject.ContentObject.mediaList.media" + i17 + ".duration";
            } else {
                str = ".StoryObject.ContentObject.mediaList.media.id";
                str2 = ".StoryObject.ContentObject.mediaList.media.type";
                str3 = ".StoryObject.ContentObject.mediaList.media.url";
                str4 = ".StoryObject.ContentObject.mediaList.media.url.$videomd5";
                str5 = ".StoryObject.ContentObject.mediaList.media.thumb";
                str6 = ".StoryObject.ContentObject.mediaList.media.url.$type";
                str7 = ".StoryObject.ContentObject.mediaList.media.thumb.$type";
                str8 = ".StoryObject.ContentObject.mediaList.media.subType";
                str9 = ".StoryObject.ContentObject.mediaList.media.userData";
                str10 = ".StoryObject.ContentObject.mediaList.media.url.$md5";
                str11 = ".StoryObject.ContentObject.mediaList.media.duration";
            }
            java.lang.String str15 = (java.lang.String) d17.get(str);
            java.lang.String str16 = (java.lang.String) d17.get(str2);
            if (str16 == null) {
                str16 = "";
            }
            java.lang.String str17 = (java.lang.String) d17.get(str3);
            if (str17 == null) {
                str17 = "";
            }
            java.lang.String str18 = (java.lang.String) d17.get(str5);
            if (str18 == null) {
                str18 = "";
            }
            java.lang.String str19 = (java.lang.String) d17.get(str4);
            if (str19 == null) {
                str19 = "";
            }
            java.lang.String str20 = (java.lang.String) d17.get(str6);
            if (str20 == null) {
                str20 = "";
            }
            java.lang.String str21 = (java.lang.String) d17.get(str7);
            if (str21 == null) {
                str21 = "";
            }
            java.lang.String str22 = (java.lang.String) d17.get(str8);
            if (str22 == null) {
                str22 = "";
            }
            java.lang.String str23 = (java.lang.String) d17.get(str10);
            if (str23 == null) {
                str23 = "";
            }
            java.lang.String str24 = (java.lang.String) d17.get(str11);
            if (str24 == null) {
                str24 = "";
            }
            if (str15 == null) {
                return lf6Var;
            }
            r45.xe6 xe6Var = new r45.xe6();
            xe6Var.f390021d = str15;
            xe6Var.f390022e = com.tencent.mm.sdk.platformtools.t8.P(str16, 0);
            xe6Var.f390023f = str17;
            xe6Var.f390024g = com.tencent.mm.sdk.platformtools.t8.P(str20, 0);
            xe6Var.f390025h = str18;
            xe6Var.f390026i = com.tencent.mm.sdk.platformtools.t8.P(str21, 0);
            xe6Var.f390027m = com.tencent.mm.sdk.platformtools.t8.P(str22, 0);
            xe6Var.f390028n = str23;
            xe6Var.f390029o = str19;
            xe6Var.f390040z = com.tencent.mm.sdk.platformtools.t8.L(str24, 0.0f);
            lf6Var.f379432h.f382205e.add(xe6Var);
            i17++;
        }
    }
}
