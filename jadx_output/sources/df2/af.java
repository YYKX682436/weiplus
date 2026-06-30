package df2;

/* loaded from: classes3.dex */
public final class af extends if2.b implements if2.e {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f229710p;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229711m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.x9 f229712n;

    /* renamed from: o, reason: collision with root package name */
    public long f229713o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229711m = "LiveChooseRoleController";
    }

    public final void Z6(boolean z17, jz5.l lVar, int i17) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        android.app.Dialog dialog;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2;
        android.app.Dialog dialog2;
        if (((mm2.n0) getStore().getLiveRoomData().a(mm2.n0.class)).f329273r) {
            com.tencent.mars.xlog.Log.i(this.f229711m, "chooseRole: skip for coLive invitee anchor, scene=" + i17 + ", isFromInput=" + z17);
            return;
        }
        if (this.f229712n == null) {
            android.content.Context O6 = O6();
            gk2.e liveRoomData = getStore().getLiveRoomData();
            r45.s02 s02Var = new r45.s02();
            s02Var.set(3, java.lang.Integer.valueOf(i17));
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            this.f229712n = new com.tencent.mm.plugin.finder.live.widget.x9(O6, liveRoomData, null, s02Var);
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.x9 x9Var = this.f229712n;
            if (x9Var != null && (y1Var2 = x9Var.B) != null && (dialog2 = y1Var2.f212025d) != null) {
                dialog2.getWindow().setDimAmount(0.0f);
            }
            com.tencent.mm.plugin.finder.live.widget.x9 x9Var2 = this.f229712n;
            if (x9Var2 != null) {
                x9Var2.S = new df2.xe(this);
            }
        } else {
            com.tencent.mm.plugin.finder.live.widget.x9 x9Var3 = this.f229712n;
            if (x9Var3 != null && (y1Var = x9Var3.B) != null && (dialog = y1Var.f212025d) != null) {
                dialog.getWindow().setDimAmount(1.0f);
            }
            com.tencent.mm.plugin.finder.live.widget.x9 x9Var4 = this.f229712n;
            if (x9Var4 != null) {
                x9Var4.S = null;
            }
        }
        com.tencent.mm.plugin.finder.live.widget.x9 x9Var5 = this.f229712n;
        if (x9Var5 != null) {
            x9Var5.T = lVar;
            com.tencent.mm.plugin.finder.live.widget.e0.W(x9Var5, null, false, 0, 7, null);
        }
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.live.widget.x9 x9Var;
        java.lang.String stringExtra;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i(this.f229711m, "requestCode:" + i17 + ",resultCode:" + i18 + ",data:" + intent);
            if (i18 == -1) {
                java.lang.String str3 = "";
                if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                    str = "";
                }
                if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                    str2 = "";
                }
                if (intent != null && (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) != null) {
                    str3 = stringExtra;
                }
                r45.of1 of1Var = new r45.of1();
                of1Var.set(0, str);
                of1Var.set(1, str2);
                of1Var.set(3, str3);
                of1Var.set(2, 2);
                com.tencent.mm.plugin.finder.live.widget.x9 x9Var2 = this.f229712n;
                if ((x9Var2 != null && x9Var2.P()) && (x9Var = this.f229712n) != null) {
                    pm0.v.d0(x9Var.L, new com.tencent.mm.plugin.finder.live.widget.g9(x9Var));
                    x9Var.L.addLast(of1Var);
                    ((com.tencent.mm.plugin.finder.live.widget.j9) ((jz5.n) x9Var.W).getValue()).notifyDataSetChanged();
                }
                java.util.LinkedList a17 = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
                pm0.v.d0(a17, df2.ye.f231858d);
                a17.addLast(of1Var);
                zl2.r4.f473950a.U2(a17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        r45.vw1 vw1Var;
        r45.up1 up1Var;
        super.onLiveStart(hc1Var);
        long j17 = (hc1Var == null || (up1Var = (r45.up1) hc1Var.getCustom(68)) == null) ? 0L : up1Var.getLong(8);
        this.f229713o = j17;
        if (pm0.v.A(j17, 2L)) {
            if (hc1Var != null && (ic1Var = (r45.ic1) hc1Var.getCustom(85)) != null && (vw1Var = (r45.vw1) ic1Var.getCustom(4)) != null) {
                com.tencent.mars.xlog.Log.i(this.f229711m, "self_joinlive_msg_ext_info = " + pm0.b0.g(vw1Var));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.ch1 ch1Var = new r45.ch1();
                ch1Var.set(1, 1000068);
                ch1Var.set(4, new com.tencent.mm.protobuf.g(vw1Var.toByteArray()));
                linkedList.add(new dk2.sc(ch1Var));
                ((mm2.x4) business(mm2.x4.class)).f329530h.addAll(linkedList);
                if (f229710p) {
                    pm0.v.V(1000L, new df2.ze(this));
                }
            }
            f229710p = false;
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f229712n = null;
    }
}
