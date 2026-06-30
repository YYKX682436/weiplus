package hr3;

/* loaded from: classes11.dex */
public class w6 implements t25.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f284138d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f284139e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f284140f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference f284141g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f284142h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f284143i;

    /* renamed from: m, reason: collision with root package name */
    public cr3.d0 f284144m;

    public w6(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f284138d = mMActivity;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetChatBot", "onAttach");
        this.f284140f = rVar;
        this.f284139e = z3Var;
        if (this.f284144m == null) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f284138d;
            cr3.d0 d0Var = new cr3.d0(mMActivity, z3Var);
            this.f284144m = d0Var;
            mMActivity.addIconOptionMenu(0, com.tencent.mm.R.string.w_, com.tencent.mm.R.raw.icons_outlined_more, d0Var);
        }
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494841da);
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) h0Var.h("contact_profile_header_normal");
        this.f284141g = normalProfileHeaderPreference;
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.S = h0Var;
            normalProfileHeaderPreference.M(z3Var, i17, z17, null);
        }
        this.f284142h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_chatbot_top");
        this.f284143i = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_chatbot_not_disturb");
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = (com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f284140f).h("contact_info_chatbot_intro");
        if (keyValuePreference != null) {
            keyValuePreference.S(Integer.MAX_VALUE);
            keyValuePreference.P = false;
            keyValuePreference.E(8);
            try {
                org.json.JSONArray bj6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).bj(this.f284139e.d1());
                if (bj6 != null && bj6.length() > 0) {
                    keyValuePreference.H(bj6.getJSONObject(0).optString("content"));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetChatBot", "KEY_INTRO parse error");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactWidgetChatBot", e17, "", new java.lang.Object[0]);
            }
        }
        this.f284142h.O(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f284139e.d1()));
        this.f284143i.O(c01.e2.P(this.f284139e));
        ((com.tencent.mm.ui.base.preference.h0) this.f284140f).m("contact_info_chatbot_send_msg", false);
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetChatBot", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1502154324:
                if (str.equals("contact_info_chatbot_send_msg")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1040926223:
                if (str.equals("contact_info_chatbot_not_disturb")) {
                    c17 = 1;
                    break;
                }
                break;
            case -322249549:
                if (str.equals("contact_info_chatbot_top")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", this.f284139e.d1());
                intent.putExtra("finish_direct", true);
                j45.l.u(this.f284138d, ".ui.chatting.ChattingUI", intent, null);
                return true;
            case 1:
                if (this.f284143i.N()) {
                    c01.e2.p0(this.f284139e, true);
                } else {
                    c01.e2.z0(this.f284139e, true);
                }
                return true;
            case 2:
                if (this.f284142h.N()) {
                    c01.e2.t0(this.f284139e.d1(), true, true);
                } else {
                    c01.e2.B0(this.f284139e.d1(), true, true);
                }
                return true;
            default:
                return false;
        }
    }

    public final void a() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f284138d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.l2v);
        if (frameLayout == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetChatBot", "[-] bottomContainer was not found, there must be some issues.");
            return;
        }
        vh0.f2 f2Var = (vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class));
        java.util.List Ai = f2Var.Ai(this.f284139e.d1());
        if (Ai.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetChatBot", "[-] no service agreements found, hide bottom container.");
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        } else {
            frameLayout.removeAllViews();
            if (f2Var.wi(mMActivity, frameLayout, this.f284139e.d1(), Ai)) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.b
    public boolean onBackPress() {
        return false;
    }

    @Override // t25.b
    public boolean onCreate() {
        return false;
    }

    @Override // t25.b
    public boolean onDestroy() {
        return false;
    }

    @Override // t25.a
    public boolean onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetChatBot", "onDetach");
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = this.f284141g;
        if (normalProfileHeaderPreference == null) {
            return true;
        }
        normalProfileHeaderPreference.T();
        return true;
    }

    @Override // t25.b
    public void onPause() {
    }

    @Override // t25.b
    public void onResume() {
        a();
    }
}
