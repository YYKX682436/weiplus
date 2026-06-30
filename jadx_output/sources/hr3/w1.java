package hr3;

/* loaded from: classes5.dex */
public final class w1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public iy1.c f284129d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f284130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f284129d = iy1.c.WeChatNotesandTabsPage;
        this.f284130e = jz5.h.b(new hr3.v1(activity));
    }

    public final void O6() {
        int i17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        gc0.e1 e1Var = ((gc0.p2) zVar.a(activity).a(gc0.p2.class)).f270248m;
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", e1Var.f270145d ? "friend_verificate_finish" : "notesand_tabs_finish");
        lVarArr[1] = new jz5.l("add_username", (java.lang.String) ((jz5.n) e1Var.f270144c).getValue());
        int i18 = 2;
        lVarArr[2] = new jz5.l("note_sid", (java.lang.String) ((jz5.n) e1Var.f270143b).getValue());
        java.lang.String chooseData = e1Var.f270149h;
        java.util.List finishData = e1Var.f270155n;
        kotlin.jvm.internal.o.g(chooseData, "chooseData");
        if (java.lang.Boolean.valueOf(!r26.n0.N(chooseData)).booleanValue()) {
            kotlin.jvm.internal.o.g(finishData, "finishData");
            i17 = java.lang.Boolean.valueOf(((java.util.ArrayList) finishData).contains(chooseData)).booleanValue() ? 1 : 2;
        } else {
            i17 = 0;
        }
        lVarArr[3] = new jz5.l("is_reedit_photo", java.lang.Integer.valueOf(i17));
        java.util.List chooseData2 = e1Var.f270148g;
        java.util.List list = e1Var.f270154m;
        gc0.a1 a1Var = gc0.a1.f270088d;
        kotlin.jvm.internal.o.g(chooseData2, "chooseData");
        lVarArr[4] = new jz5.l("is_reedit_phone", java.lang.Integer.valueOf(java.lang.Boolean.valueOf(((java.util.ArrayList) chooseData2).isEmpty() ^ true).booleanValue() ? ((java.lang.Boolean) a1Var.invoke(list, chooseData2)).booleanValue() ? 1 : 2 : 0));
        java.util.List chooseData3 = e1Var.f270147f;
        java.lang.String str = e1Var.f270153l;
        gc0.b1 b1Var = gc0.b1.f270101d;
        kotlin.jvm.internal.o.g(chooseData3, "chooseData");
        if (!java.lang.Boolean.valueOf(!((java.util.ArrayList) chooseData3).isEmpty()).booleanValue()) {
            i18 = 0;
        } else if (((java.lang.Boolean) b1Var.invoke(str, chooseData3)).booleanValue()) {
            i18 = 1;
        }
        lVarArr[5] = new jz5.l("is_reedit_note", java.lang.Integer.valueOf(i18));
        lVarArr[6] = new jz5.l("is_note_set_origin_nickname", java.lang.Integer.valueOf(e1Var.f270151j ? 1 : 0));
        lVarArr[7] = new jz5.l("default_note_type", java.lang.Integer.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname()) == 1 ? 1 : 0));
        lVarArr[8] = new jz5.l("note_input_has_clk", java.lang.Integer.valueOf(e1Var.f270150i ? 1 : 0));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        l17.putAll(e1Var.f270146e);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        j93.n nVar = (j93.n) zVar.a(activity2).a(j93.n.class);
        java.util.Map l18 = kz5.c1.l(new jz5.l("main_tag_adopt_cnt", java.lang.String.valueOf(nVar.f298447m)), new jz5.l("list_tag_adopt_cnt", java.lang.String.valueOf(nVar.f298448n)), new jz5.l("main_tag_select_cnt", java.lang.String.valueOf(nVar.f298451q.size())));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(l17);
        linkedHashMap.putAll(l18);
        int ordinal = this.f284129d.ordinal();
        linkedHashMap.put("view_id", ordinal != 196 ? ordinal != 197 ? ordinal != 202 ? "" : "friend_apply_send" : "notesand_tabs_finish" : "friend_verificate_finish");
        pm0.v.K(null, new hr3.u1(linkedHashMap));
    }

    public final void P6(iy1.c id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f284129d = id6;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactModInfoReportUIC", "set currentPageId: " + id6);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        int intExtra = getIntent().getIntExtra("Contact_Scene", 9);
        int i17 = 3;
        if (intExtra == 3) {
            i17 = 4;
        } else if (intExtra == 30) {
            i17 = 2;
        } else if (intExtra == 14) {
            i17 = 1;
        } else if (intExtra != 15) {
            i17 = intExtra != 17 ? intExtra != 18 ? 0 : 6 : 5;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.ak(getActivity(), this.f284129d);
            aVar.dk(getActivity(), this.f284129d.name());
            aVar.ik(getActivity(), 4, 33926);
            aVar.Ai(getActivity(), new hr3.s1(this, stringExtra, i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactModInfoReportUIC", "generate page=" + this.f284129d + " note_sid: " + ((java.lang.String) ((jz5.n) this.f284130e).getValue()) + " username: " + stringExtra + ", addScene: " + i17);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cd8);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.Mj(linearLayout);
        aVar2.pk(linearLayout, "contact_add_tag");
        aVar2.Ai(linearLayout, new hr3.t1(this, stringExtra));
        aVar2.ik(linearLayout, 8, 33926);
    }
}
