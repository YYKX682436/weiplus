package t41;

/* loaded from: classes11.dex */
public abstract class c {
    public static java.lang.CharSequence a(com.tencent.mm.storage.z3 z3Var, java.lang.CharSequence charSequence) {
        java.lang.String a17 = t41.g.a(z3Var);
        if (a17 == null) {
            return charSequence;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) a17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0j)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static java.lang.CharSequence b(java.lang.String str, java.lang.CharSequence charSequence) {
        if (str == null) {
            return charSequence;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0j)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void c(r45.uz4 uz4Var, int i17, int i18) {
        if (!uz4Var.f387756d.toLowerCase().endsWith("@im.chatroom")) {
            com.tencent.mars.xlog.Log.e("OpenIMChatRoomContactLogic", "updateChatroom: bad room:[" + uz4Var.f387756d + "]");
            return;
        }
        java.lang.String str = uz4Var.f387756d;
        mo.a aVar = new mo.a();
        aVar.f330243h = uz4Var.f387758f.f388729q;
        int i19 = uz4Var.f387759g;
        aVar.f330246n = i19;
        if (i19 != 0) {
            aVar.f330245m = i19;
        }
        am.vk vkVar = new com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent().f54524g;
        vkVar.f8199a = str;
        vkVar.f8200b = aVar.f330245m;
        r45.vy vyVar = new r45.vy();
        r45.wz4 wz4Var = uz4Var.f387760h;
        vyVar.f388657d = wz4Var == null ? 0 : wz4Var.f389601d.size();
        vyVar.f388660g = x51.j1.i(uz4Var.f387756d);
        r45.wz4 wz4Var2 = uz4Var.f387760h;
        vyVar.f388659f = wz4Var2.f389602e;
        vyVar.f388658e = t41.f.a(wz4Var2.f389601d);
        rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String str2 = uz4Var.f387758f.f388719d;
        java.lang.String r17 = c01.z1.r();
        ((c01.w1) eVar).getClass();
        c01.v1.N(str, str2, vyVar, 0, -1, -1, r17, aVar, false, true, 0);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(uz4Var.f387756d);
        if (z07 == null) {
            z07 = new com.tencent.mm.storage.a3();
            z07.field_chatroomname = uz4Var.f387756d;
        }
        if (i17 != -1) {
            z07.field_oldChatroomVersion = i17;
        }
        if (i18 != -1) {
            z07.field_chatroomVersion = i18;
        }
        z07.F0().f330241f = uz4Var.f387758f.f388730r;
        try {
            z07.field_roomdata = z07.F0().toByteArray();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        java.lang.String str3 = uz4Var.f387756d;
        r45.vz4 vz4Var = uz4Var.f387758f;
        com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(vz4Var.f388721f)) {
            com.tencent.mm.modelavatar.r0 n07 = Ni.n0(str3);
            if (n07 == null) {
                n07 = new com.tencent.mm.modelavatar.r0();
                n07.f70529a = str3;
            }
            java.lang.String str4 = vz4Var.f388720e;
            n07.f70533e = str4;
            n07.f70532d = vz4Var.f388721f;
            n07.f70530b = 3;
            n07.f70534f = !com.tencent.mm.sdk.platformtools.t8.K0(str4) ? 1 : 0;
            Ni.y0(n07);
            if (vz4Var.f388722g == 2 && !c01.z1.r().equals(str3)) {
                com.tencent.mm.modelavatar.d1.Ai().p(str3, false);
                com.tencent.mm.modelavatar.d1.Ai().p(str3, true);
                com.tencent.mm.modelavatar.d1.wi().i(str3);
            }
        }
        z07.field_roomowner = vz4Var.f388719d;
        if (z07.field_chatroomnoticePublishTime <= vz4Var.f388728p) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(vz4Var.f388726n)) {
                z07.field_chatroomNoticeNew = 0;
            }
            z07.field_chatroomnotice = vz4Var.f388726n;
            z07.field_chatroomnoticeEditor = vz4Var.f388727o;
            z07.field_chatroomnoticePublishTime = vz4Var.f388728p;
        }
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(z07);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(uz4Var.f387756d, true);
        int type = n17.getType();
        n17.P1(uz4Var.f387764o);
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(r5.f388723h)) & (uz4Var.f387758f != null)) {
            n17.M1(uz4Var.f387758f.f388723h);
        }
        n17.X1(uz4Var.f387756d);
        n17.M2(uz4Var.f387765p);
        n17.setType(uz4Var.f387763n & uz4Var.f387762m);
        n17.M2(uz4Var.f387765p);
        n17.J2(uz4Var.f387761i);
        n17.F2(uz4Var.f387758f.f388731s);
        com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateChatroom done %s, chatroom_business_type:%s ", n17.d1(), java.lang.Long.valueOf(uz4Var.f387758f.f388731s));
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
        if ((n17.getType() & 2048) != 0) {
            if ((type & 2048) != (n17.getType() & 2048)) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(n17.d1());
            }
        } else if ((type & 2048) != (n17.getType() & 2048)) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(n17.d1());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(uz4Var.f387764o)) {
            return;
        }
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).wi(uz4Var.f387764o, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), "", 0);
    }
}
