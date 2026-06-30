package kc5;

@j95.b
/* loaded from: classes3.dex */
public final class s extends i95.w implements wg3.i {
    public static /* synthetic */ java.util.Map Bi(kc5.s sVar, java.lang.String str, java.util.List list, java.util.List list2, boolean z17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            list2 = null;
        }
        return sVar.Ai(str, list, list2, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? 0 : i17);
    }

    public final java.util.Map Ai(java.lang.String str, java.util.List list, java.util.List list2, boolean z17, int i17) {
        ic5.h hVar = ic5.h.f290441a;
        int c17 = hVar.c(list);
        java.lang.String Q0 = ((com.tencent.mm.storage.f9) kz5.n0.X(list)).Q0();
        int i18 = g95.e0.i((com.tencent.mm.storage.f9) kz5.n0.X(list)) ? 2 : 1;
        wg3.k d17 = hVar.d(list);
        wg3.k d18 = list2 != null ? hVar.d(list2) : null;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) kz5.n0.X(list);
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        cVar.fromXml(j17);
        r15.b l17 = cVar.l();
        r15.d j18 = l17 != null ? l17.j() : null;
        int count = j18 != null ? j18.getCount() : 0;
        jz5.l[] lVarArr = new jz5.l[11];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(c17));
        lVarArr[1] = new jz5.l("chat_username", Q0);
        lVarArr[2] = new jz5.l("chat_type", java.lang.Integer.valueOf(hVar.a(Q0)));
        java.lang.String str2 = d17.f445730a;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[3] = new jz5.l("collection_id", str2);
        lVarArr[4] = new jz5.l("oper_user_type", java.lang.Integer.valueOf(i18));
        lVarArr[5] = new jz5.l("msg_nolive_pic_cnt", java.lang.Integer.valueOf(d17.f445731b));
        lVarArr[6] = new jz5.l("msg_live_pic_cnt", java.lang.Integer.valueOf(d17.f445733d));
        lVarArr[7] = new jz5.l("msg_video_cnt", java.lang.Integer.valueOf(d17.f445732c));
        lVarArr[8] = new jz5.l("is_news_jump", java.lang.Integer.valueOf(z17 ? 1 : 0));
        lVarArr[9] = new jz5.l("collection_total_msg_cnt", java.lang.Integer.valueOf(count));
        lVarArr[10] = new jz5.l("collection_new_msg_cnt", java.lang.Integer.valueOf(i17));
        java.util.Map l18 = kz5.c1.l(lVarArr);
        if (kotlin.jvm.internal.o.b(str, "view_unexp") && d18 != null) {
            l18.put("msg_video_slide_cnt", java.lang.Integer.valueOf(d18.f445732c));
            l18.put("msg_live_pic_slide_cnt", java.lang.Integer.valueOf(d18.f445733d));
            l18.put("msg_nolive_pic_slide_cnt", java.lang.Integer.valueOf(d18.f445731b));
        }
        return l18;
    }

    public void Di(android.view.View view, yz5.a ifCheckboxSelected, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(ifCheckboxSelected, "ifCheckboxSelected");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "album_merge_select_btn");
        dy1.r ik6 = aVar.ik(view, 40, 37491);
        jz5.l lVar = new jz5.l("chat_username", str);
        int i18 = 1;
        if (!(str == null || r26.n0.N(str))) {
            if (c01.e2.R(str)) {
                i18 = 4;
            } else if (!com.tencent.mm.storage.z3.V4(str)) {
                if (com.tencent.mm.storage.z3.N4(str)) {
                    i18 = 2;
                } else if (com.tencent.mm.storage.z3.m4(str)) {
                    i18 = 3;
                }
            }
            cy1.a aVar2 = (cy1.a) ik6;
            aVar2.gk(view, kz5.c1.k(lVar, new jz5.l("chat_type", java.lang.Integer.valueOf(i18)), new jz5.l("album_page_type", java.lang.Integer.valueOf(i17))));
            aVar2.Ai(view, new kc5.r(ifCheckboxSelected));
        }
        i18 = 0;
        cy1.a aVar22 = (cy1.a) ik6;
        aVar22.gk(view, kz5.c1.k(lVar, new jz5.l("chat_type", java.lang.Integer.valueOf(i18)), new jz5.l("album_page_type", java.lang.Integer.valueOf(i17))));
        aVar22.Ai(view, new kc5.r(ifCheckboxSelected));
    }

    public void Ni(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, int i18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(msgIdTalker.a(), msgIdTalker.f149480d);
        if (k17 == null) {
            return;
        }
        r15.d c17 = ic5.f.f290437c.c(k17);
        int i19 = g95.e0.i(k17) ? 2 : 1;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        ic5.h hVar = ic5.h.f290441a;
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(hVar.b(k17)));
        lVarArr[1] = new jz5.l("oper_user_type", java.lang.Integer.valueOf(i19));
        lVarArr[2] = new jz5.l("chat_username", k17.Q0());
        lVarArr[3] = new jz5.l("chat_type", java.lang.Integer.valueOf(hVar.a(k17.Q0())));
        if (c17 == null || (str = c17.getId()) == null) {
            str = "";
        }
        lVarArr[4] = new jz5.l("collection_id", str);
        lVarArr[5] = new jz5.l("collection_album_msg_unexp_reason", java.lang.Integer.valueOf(i18));
        lVarArr[6] = new jz5.l("collection_total_msg_cnt", java.lang.Integer.valueOf(c17 != null ? c17.getCount() : 0));
        lVarArr[7] = new jz5.l("collection_new_msg_cnt", java.lang.Integer.valueOf(i17));
        lVarArr[8] = new jz5.l("news_tips_type", java.lang.Integer.valueOf(i17 <= 0 ? 1 : 2));
        ((cy1.a) rVar).Ej("collection_album_msg_news_tips_unexp", kz5.c1.k(lVarArr), 37491);
    }

    public final java.util.Map wi(java.util.List list) {
        if (list.isEmpty()) {
            return kz5.q0.f314001d;
        }
        ic5.h hVar = ic5.h.f290441a;
        int c17 = hVar.c(list);
        int i17 = g95.e0.i((com.tencent.mm.storage.f9) kz5.n0.X(list)) ? 2 : 1;
        java.lang.String Q0 = ((com.tencent.mm.storage.f9) kz5.n0.X(list)).Q0();
        wg3.k d17 = hVar.d(list);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(c17));
        lVarArr[1] = new jz5.l("oper_user_type", java.lang.Integer.valueOf(i17));
        lVarArr[2] = new jz5.l("chat_username", Q0);
        lVarArr[3] = new jz5.l("chat_type", java.lang.Integer.valueOf(hVar.a(Q0)));
        java.lang.String str = d17.f445730a;
        if (str == null) {
            str = "";
        }
        lVarArr[4] = new jz5.l("collection_id", str);
        lVarArr[5] = new jz5.l("msg_video_cnt", java.lang.Integer.valueOf(d17.f445732c));
        lVarArr[6] = new jz5.l("msg_live_pic_cnt", java.lang.Integer.valueOf(d17.f445733d));
        lVarArr[7] = new jz5.l("msg_nolive_pic_cnt", java.lang.Integer.valueOf(d17.f445731b));
        return kz5.c1.k(lVarArr);
    }
}
