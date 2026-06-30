package df2;

/* loaded from: classes3.dex */
public final class u00 extends if2.b implements if2.e, mf2.v {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231487m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f231488n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231489o;

    /* renamed from: p, reason: collision with root package name */
    public if2.d0 f231490p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.yx f231491q;

    /* renamed from: r, reason: collision with root package name */
    public long f231492r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u00(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231487m = "Finder.VisitorDefinitionController";
        this.f231488n = jz5.h.b(df2.r00.f231207d);
    }

    public final void Z6() {
        hn0.r rVar;
        kn0.r c17;
        if (this.f231492r == 0) {
            co0.s u07 = dk2.ef.f233372a.u0();
            if (((u07 == null || (rVar = u07.R1) == null || (c17 = rVar.c()) == null) ? 0 : c17.f309597b) == 5) {
                this.f231492r = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i(this.f231487m, "checkAndStartUltraHDTracking ultraHDPlayBeginTime:" + this.f231492r);
            }
        }
    }

    public final kn0.r a7() {
        java.lang.Object obj;
        java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) business(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        return com.tencent.mm.plugin.finder.live.widget.yx.f120478f.c(obj != null);
    }

    public final void b7(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.W1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void c7() {
        hn0.r rVar;
        kn0.r c17;
        if (this.f231492r > 0) {
            co0.s u07 = dk2.ef.f233372a.u0();
            if (((u07 == null || (rVar = u07.R1) == null || (c17 = rVar.c()) == null) ? 0 : c17.f309597b) != 5) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f231492r;
                com.tencent.mars.xlog.Log.i(this.f231487m, "reportUltraHDWatchDurationIfNeed ultraHDPlayBeginTime:" + this.f231492r + ", duration:" + currentTimeMillis);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Jk(1, currentTimeMillis);
                this.f231492r = 0L;
            }
        }
    }

    public final void d7(java.lang.String str, boolean z17) {
        android.widget.TextView textView;
        java.lang.String string;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.live.widget.yx yxVar = this.f231491q;
        if (yxVar != null) {
            yxVar.a(z17);
        }
        android.view.View view = this.f231489o;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fp8)) == null) {
            return;
        }
        com.tencent.mm.ui.fk.a(textView);
        textView.setTextSize(1, 14.0f);
        kn0.r a76 = a7();
        com.tencent.mars.xlog.Log.i(this.f231487m, str + " videoDefinitionResult:" + a76 + '!');
        if (a76 == null || (string = a76.f309598c) == null) {
            string = textView.getResources().getString(com.tencent.mm.R.string.dx6);
        }
        textView.setText(string);
        android.view.View rootView = textView.getRootView();
        if (rootView == null) {
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        kn0.r a77 = a7();
        if (a77 == null || (str2 = a77.f309598c) == null) {
            str2 = "";
        }
        objArr[0] = str2;
        rootView.setContentDescription(context.getString(com.tencent.mm.R.string.los, objArr));
    }

    @Override // mf2.v
    public void e0() {
        d7("onConnectSucc", true);
        c7();
        Z6();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        if (this.f231492r > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f231492r;
            com.tencent.mars.xlog.Log.i(this.f231487m, "onLiveDeactivate ultraHDPlayBeginTime:" + this.f231492r + ", duration:" + currentTimeMillis);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Jk(2, currentTimeMillis);
            this.f231492r = 0L;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        Z6();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewMount(android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.u00.onViewMount(android.view.ViewGroup):void");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.plugin.finder.live.widget.yx yxVar = this.f231491q;
        if (yxVar != null) {
            yxVar.f120483e = false;
            yxVar.f120482d = null;
            yxVar.f120481c = null;
        }
        this.f231491q = null;
        this.f231489o = null;
        if2.d0 d0Var = this.f231490p;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f231490p = null;
    }

    @Override // mf2.v
    public void s6(int i17, android.os.Bundle bundle) {
        if (i17 == 22) {
            d7("SwitchSucc", true);
            c7();
            Z6();
        } else if (i17 == 23) {
            d7("SwitchFail", false);
        } else if (i17 == 13) {
            Z6();
        }
    }
}
