package ws2;

/* loaded from: classes3.dex */
public final class o extends ws2.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f449108d;

    /* renamed from: e, reason: collision with root package name */
    public at2.u1 f449109e;

    /* renamed from: f, reason: collision with root package name */
    public zi2.w f449110f;

    /* renamed from: g, reason: collision with root package name */
    public at2.y1 f449111g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f449112h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity context, yz5.p playerGenerator) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(playerGenerator, "playerGenerator");
        this.f449108d = playerGenerator;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0119 A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:75:0x00fc, B:77:0x0102, B:80:0x010d, B:85:0x0119, B:86:0x0122, B:88:0x012e, B:90:0x0140, B:92:0x0143, B:95:0x0146, B:96:0x014a, B:98:0x0150), top: B:74:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122 A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:75:0x00fc, B:77:0x0102, B:80:0x010d, B:85:0x0119, B:86:0x0122, B:88:0x012e, B:90:0x0140, B:92:0x0143, B:95:0x0146, B:96:0x014a, B:98:0x0150), top: B:74:0x00fc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.o.e(boolean, boolean):void");
    }

    public void f() {
        com.tencent.mm.plugin.finder.live.plugin.fa faVar;
        at2.u1 u1Var = this.f449109e;
        if (u1Var != null) {
            u1Var.x1();
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449093c;
        if (k0Var != null && (faVar = (com.tencent.mm.plugin.finder.live.plugin.fa) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.fa.class)) != null) {
            faVar.K0(8);
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = faVar.f112528s;
            if (finderLiveThumbPlayerProxy != null) {
                zl2.r4.f473950a.Q2(finderLiveThumbPlayerProxy);
            }
            faVar.f112526q.setImageDrawable(null);
        }
        je2.y yVar = (je2.y) c(je2.y.class);
        yVar.O6(false);
        if (yVar.f299288m) {
            com.tencent.mars.xlog.Log.i(yVar.N6(), "set lastScreenShareMode:false");
        }
        yVar.f299288m = false;
    }

    public void g(com.tencent.mm.plugin.finder.live.view.k0 baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        gk2.e buContext = baseRouter.getBuContext();
        kotlin.jvm.internal.o.g(buContext, "<set-?>");
        this.f19609a = buContext;
        this.f449093c = baseRouter;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f449092b;
        boolean booleanExtra = appCompatActivity.getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false);
        appCompatActivity.getIntent().removeExtra("LAUNCH_WITH_ANIM");
        if (booleanExtra) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449093c;
            if (k0Var == null) {
                return;
            }
            k0Var.setAlpha(0.0f);
            return;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = this.f449093c;
        if (k0Var2 == null) {
            return;
        }
        k0Var2.setAlpha(1.0f);
    }

    public final void h(int i17, int i18) {
        if (((mm2.c1) c(mm2.c1.class)).S7()) {
            return;
        }
        ((mm2.o4) c(mm2.o4.class)).f329324s.clear();
        ((mm2.o4) c(mm2.o4.class)).f329327v.clear();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449093c;
        if (k0Var != null) {
            qo0.c.a(k0Var, qo0.b.P3, null, 2, null);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = this.f449093c;
        if (k0Var2 != null) {
            com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(k0Var2, new org.json.JSONObject(), new org.json.JSONObject(), new org.json.JSONObject(), false, null, 24, null);
        }
        ws2.k1.t(ws2.k1.f449066r.a(), 3, new org.json.JSONObject(), new org.json.JSONObject(), new org.json.JSONObject(), false, 16, null);
    }

    public final void i(int i17, mn2.g4 data, boolean z17, boolean z18, int i18) {
        dt2.a0 a0Var;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#replay_data#:startPlay url:");
        r45.mb4 mb4Var = data.f330002e;
        sb6.append(mb4Var.getString(0));
        sb6.append(" source:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayBaseUIC", sb6.toString());
        java.lang.String string = mb4Var.getString(0);
        if (string == null || string.length() == 0) {
            zl2.r4.f473950a.f3(this.f449092b, "startPlay but url is empty!");
        }
        at2.u1 u1Var = this.f449109e;
        if (u1Var != null) {
            r45.i72 i72Var = (r45.i72) ((ct2.j) c(ct2.j.class)).P6().getCustom(44);
            java.lang.String string2 = i72Var != null ? i72Var.getString(11) : null;
            if (string2 == null) {
                string2 = "";
            }
            com.tencent.mm.plugin.finder.storage.FeedData feedData = new com.tencent.mm.plugin.finder.storage.FeedData();
            feedData.setPosition(((ct2.j) c(ct2.j.class)).A);
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = ((mm2.e1) c(mm2.e1.class)).f328991u;
            java.lang.String description = finderObjectDesc != null ? finderObjectDesc.getDescription() : null;
            if (description == null) {
                description = "replay-" + feedData.hashCode();
            }
            feedData.setDescription(description);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) c(mm2.c1.class)).f328846n;
            java.lang.String nickname = finderObject != null ? finderObject.getNickname() : null;
            feedData.setNickName(nickname != null ? nickname : "");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindMediaInfo:pos:");
            sb7.append(feedData.getPosition());
            sb7.append(",desc:");
            sb7.append(feedData.getDescription());
            sb7.append(",nickname:");
            sb7.append(feedData.getNickName());
            sb7.append(",player:");
            dt2.a0 a0Var2 = u1Var.f13762q;
            sb7.append(a0Var2 != null ? a0Var2.hashCode() : 0);
            sb7.append(",fromFloat:");
            sb7.append(z18);
            sb7.append(", isPlaying:");
            sb7.append(u1Var.u1());
            sb7.append('!');
            com.tencent.mars.xlog.Log.i("FinderLiveReplayerPlugin", sb7.toString());
            if (!z18 && (a0Var = u1Var.f13762q) != null) {
                a0Var.a(data, string2, z17, feedData);
            }
        }
        at2.u1 u1Var2 = this.f449109e;
        if (u1Var2 != null) {
            u1Var2.v1(java.lang.Integer.valueOf(i17), z18);
        }
    }
}
