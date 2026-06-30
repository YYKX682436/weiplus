package un;

/* loaded from: classes11.dex */
public abstract class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f429273d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f429274e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f429275f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f429276g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f429277h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f429278i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.SharedPreferences.OnSharedPreferenceChangeListener f429279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429274e = jz5.h.b(new un.g(activity));
        this.f429275f = jz5.h.b(new un.e(activity));
        this.f429276g = jz5.h.b(new un.f(this));
        this.f429277h = jz5.h.b(new un.c(this));
        this.f429279m = new un.b(this);
    }

    public void O6(boolean z17) {
        boolean z18 = W6().getBoolean("room_placed_to_the_top", false);
        com.tencent.mars.xlog.Log.i(X6(), "changePlacedTop() called isCurInPlaceTop:%s isNeedModContact:%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.storage.z3 z3Var = this.f429273d;
        if (z3Var != null) {
            if (z18) {
                c01.e2.t0(z3Var.d1(), true, z17);
                if (W6().getBoolean("room_set_to_conv_box", false)) {
                    com.tencent.mars.xlog.Log.i(X6(), "changePlacedTop() unset convBox");
                    Q6(java.lang.Boolean.FALSE, false);
                }
            } else {
                c01.e2.B0(z3Var.d1(), true, z17);
            }
            qn.d dVar = z18 ? qn.d.f364883f : qn.d.f364882e;
            qn.e eVar = qn.e.f364886a;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            eVar.b(d17, dVar, qn.b.f364873e);
            X6();
        }
    }

    public void P6() {
        Q6(null, true);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String U6 = U6();
        ((py.a) iVar).getClass();
        boolean y17 = c01.v1.y(U6);
        com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", U6(), true);
        chatBoxGroupActionStruct.f55599e = y17 ? 1L : 0L;
        chatBoxGroupActionStruct.k();
    }

    public void Q6(java.lang.Boolean bool, boolean z17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i(X6(), "dealSetToConvBox preSetValue:%s isNeedModContact:%s", bool, java.lang.Boolean.valueOf(z17));
        if (bool != null) {
            W6().edit().putBoolean("room_set_to_conv_box", bool.booleanValue()).apply();
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(U6());
        if (p17 == null) {
            p17 = new com.tencent.mm.storage.l4(U6());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(p17);
        }
        com.tencent.mm.storage.a3 R6 = R6();
        if (a7(c01.z1.r(), R6)) {
            if (!W6().getBoolean("room_set_to_conv_box", false)) {
                qy.j jVar = (qy.j) i95.n0.c(qy.j.class);
                java.lang.String U6 = U6();
                boolean z18 = !(this instanceof un.j1);
                xf5.c cVar = (xf5.c) jVar;
                cVar.getClass();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(U6, true);
                if (n17 != null) {
                    if (com.tencent.mm.storage.z3.R4(n17.d1())) {
                        n17.k3(false);
                    } else {
                        n17.W1(n17.c1() & (-129));
                        n17.k3(false);
                    }
                    c01.v1.L(U6, R6, 0, n17, z17, z18);
                    cVar.cj(p17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxConversationService", "setToConvBox isNeedModContact:%s conversation:%s, del from conv box :%s %s", java.lang.Boolean.valueOf(z17), U6, java.lang.Boolean.valueOf(n17.v2()), p17.W0());
                    return;
                }
                return;
            }
            boolean z19 = W6().getBoolean("room_placed_to_the_top", false);
            boolean z27 = z17 && !z19;
            qy.j jVar2 = (qy.j) i95.n0.c(qy.j.class);
            java.lang.String U62 = U6();
            boolean z28 = !(this instanceof un.j1);
            xf5.c cVar2 = (xf5.c) jVar2;
            cVar2.getClass();
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(U62, true);
            if (n18 != null) {
                if (com.tencent.mm.storage.z3.R4(n18.d1())) {
                    n18.k3(true);
                    str = "MicroMsg.ConvBoxConversationService";
                } else {
                    str = "MicroMsg.ConvBoxConversationService";
                    n18.W1(n18.c1() | 128);
                    n18.k3(false);
                }
                n18.setType(n18.getType() & (-2049));
                c01.v1.L(U62, R6, 1, n18, z27, z28);
                cVar2.Zi(p17, false, true);
                com.tencent.mars.xlog.Log.i(str, "conversation:%s , add to conv box :%s %s", U62, java.lang.Boolean.TRUE, p17.W0());
            }
            if (z19) {
                com.tencent.mars.xlog.Log.i(X6(), "dealSetToConvBox() closePlacedTop by set to convbox");
                X6();
                W6().edit().putBoolean("room_placed_to_the_top", false).commit();
                O6(true);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(U6());
                R6();
            }
            boolean z29 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChattingConvBoxGuide()) == 1;
            boolean z37 = W6().getBoolean("is_show_conv_box_guide", false);
            if (z29 || !z37) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                java.lang.String U63 = U6();
                com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
                chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", U63, true);
                chatBoxGroupActionStruct.f55599e = 2L;
                chatBoxGroupActionStruct.k();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
                android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.a2u, null);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.cil);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cim);
                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) inflate.findViewById(com.tencent.mm.R.id.cin);
                mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxChatSwitch()) == 1);
                mMPAGView.k(activity.getAssets(), "conv_box_guide_navigation.pag");
                mMPAGView.setRepeatCount(0);
                mMPAGView.g();
                button.setOnClickListener(new vn.b(k0Var));
                textView.setOnClickListener(new vn.c(k0Var, activity, U63));
                k0Var.f211872n = new vn.d(k0Var, inflate);
                k0Var.f211854d = new vn.e(mMPAGView);
                k0Var.e(true);
                k0Var.v();
                W6().edit().putBoolean("is_show_conv_box_guide", true).apply();
            }
        }
    }

    public com.tencent.mm.storage.a3 R6() {
        return null;
    }

    public abstract boolean S6();

    public abstract boolean T6();

    public abstract java.lang.String U6();

    public final com.tencent.mm.ui.base.preference.r V6() {
        return (com.tencent.mm.ui.base.preference.r) ((jz5.n) this.f429275f).getValue();
    }

    public final android.content.SharedPreferences W6() {
        return (android.content.SharedPreferences) ((jz5.n) this.f429274e).getValue();
    }

    public abstract java.lang.String X6();

    public void Y6(boolean z17) {
        ((com.tencent.mm.ui.base.preference.h0) V6()).m("room_set_to_conv_box", z17);
    }

    public final void Z6() {
        X6();
        if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f429277h).getValue()) != null) {
            com.tencent.mm.storage.z3 z3Var = this.f429273d;
            if (z3Var != null) {
                boolean T6 = T6();
                W6().edit().putBoolean("room_placed_to_the_top", T6).commit();
                com.tencent.mars.xlog.Log.i(X6(), "updatePlaceTop() isContactPlaceTop:%s username:%s", java.lang.Boolean.valueOf(T6), z3Var.d1());
            } else {
                W6().edit().putBoolean("room_placed_to_the_top", false).commit();
                com.tencent.mars.xlog.Log.i(X6(), "updatePlaceTop() to false no contact");
            }
        }
        X6();
        if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f429276g).getValue()) != null) {
            if (this.f429273d == null) {
                W6().edit().putBoolean("room_set_to_conv_box", false).commit();
                return;
            }
            boolean S6 = S6();
            com.tencent.mars.xlog.Log.i(X6(), "updateConvBox() isInConv:%s", java.lang.Boolean.valueOf(S6));
            W6().edit().putBoolean("room_set_to_conv_box", S6).commit();
        }
    }

    public boolean a7(java.lang.String str, com.tencent.mm.storage.a3 a3Var) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str);
    }

    public final void b7(boolean z17) {
        com.tencent.mars.xlog.Log.i(X6(), "reportMuteAndConvBoxExpose isMute:" + z17);
        if (((com.tencent.mm.ui.base.preference.h0) V6()).q("room_set_to_conv_box")) {
            ((ku5.t0) ku5.t0.f312615d).g(new un.d(this));
        }
        if (this.f429278i) {
            return;
        }
        this.f429278i = true;
        com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", U6(), true);
        chatBoxGroupActionStruct.f55599e = 12;
        chatBoxGroupActionStruct.f55600f = z17 ? 1L : 0L;
        chatBoxGroupActionStruct.k();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            W6().registerOnSharedPreferenceChangeListener(this.f429279m);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            W6().unregisterOnSharedPreferenceChangeListener(this.f429279m);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f429278i = false;
    }
}
