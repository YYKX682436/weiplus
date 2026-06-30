package ub5;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f426232a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f426233b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f426234c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f426235d;

    public j(java.lang.String str, xj.m mVar, java.lang.String str2, java.util.List msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        this.f426232a = msgList;
        jt.c0 c0Var = (jt.c0) i95.n0.c(jt.c0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((ht.w) c0Var).getClass();
        boolean a17 = com.tencent.mm.pluginsdk.model.h4.f189337a.a(context);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f426234c = linkedHashMap;
        this.f426235d = jz5.h.b(new ub5.i(this));
        jz5.l[] lVarArr = new jz5.l[7];
        int i17 = 1;
        lVarArr[0] = new jz5.l("has_forward_yuanbao", java.lang.Integer.valueOf(mVar != null ? 1 : 0));
        lVarArr[1] = new jz5.l("has_install_yuanbao", java.lang.Integer.valueOf(a17 ? 1 : 0));
        lVarArr[2] = new jz5.l("yuanbao_user_state", java.lang.Integer.valueOf(mVar == null ? 0 : mVar.f454760h ? 2 : 1));
        lVarArr[3] = new jz5.l("chat_username", str2 == null ? "" : str2);
        lVarArr[4] = new jz5.l("share_session_id", str == null ? "" : str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            i17 = 0;
        } else if (com.tencent.mm.storage.z3.R4(str2)) {
            i17 = 2;
        } else if (kotlin.jvm.internal.o.b(str2, c01.z1.r())) {
            i17 = 4;
        } else if (kotlin.jvm.internal.o.b(str2, "filehelper")) {
            i17 = 3;
        }
        lVarArr[5] = new jz5.l("enter_source", java.lang.Integer.valueOf(i17));
        lVarArr[6] = new jz5.l("share_type", 4);
        linkedHashMap.putAll(kz5.c1.k(lVarArr));
    }

    public static void a(ub5.j jVar, int i17, java.lang.String str, java.lang.Integer num, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            num = null;
        }
        java.util.Map map = jVar.f426234c;
        map.putAll(kz5.c1.k(new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(jVar.f426232a.size())), new jz5.l("selected_msg_list", (java.lang.String) ((jz5.n) jVar.f426235d).getValue())));
        java.util.HashMap i19 = kz5.c1.i(new jz5.l("click_button_type", java.lang.Integer.valueOf(i17)));
        i19.putAll(map);
        if (str != null) {
            i19.put("share_session_id", str);
        }
        if (num != null) {
            i19.put("share_type", java.lang.Integer.valueOf(num.intValue()));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("multi_select_actionsheet", "view_clk", i19, 35480);
    }

    public final void b(boolean z17) {
        java.util.Map map = this.f426234c;
        map.putAll(kz5.c1.k(new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(this.f426232a.size())), new jz5.l("selected_msg_list", (java.lang.String) ((jz5.n) this.f426235d).getValue())));
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("popup_action_type", java.lang.Integer.valueOf(z17 ? 1 : 0)));
        i17.putAll(map);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_clk", i17, 35480);
    }
}
