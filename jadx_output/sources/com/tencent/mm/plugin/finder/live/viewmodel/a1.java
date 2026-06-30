package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a1 extends com.tencent.mm.ui.component.UIComponent {
    public boolean A;
    public com.tencent.mm.ui.widget.MMEditText B;
    public boolean C;
    public com.tencent.mm.plugin.finder.assist.d9 D;
    public tn0.w0 E;
    public boolean F;
    public boolean G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116871d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f116872e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f116873f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f116874g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f116875h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f116876i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f116877m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.i2 f116878n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.j2 f116879o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.lk f116880p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.ik f116881q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f116882r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f116883s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f116884t;

    /* renamed from: u, reason: collision with root package name */
    public int f116885u;

    /* renamed from: v, reason: collision with root package name */
    public r45.n73 f116886v;

    /* renamed from: w, reason: collision with root package name */
    public r45.z53 f116887w;

    /* renamed from: x, reason: collision with root package name */
    public r45.xl6 f116888x;

    /* renamed from: y, reason: collision with root package name */
    public int f116889y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f116890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116871d = "Finder.FinderGameLivePostUIC";
        this.f116882r = "";
        this.f116883s = "";
        this.f116884t = "";
    }

    public final void O6(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia, boolean z17) {
        if (!W6()) {
            if (this.E == null) {
                dk2.ef efVar = dk2.ef.f233372a;
                gk2.e eVar = dk2.ef.I;
                if (eVar == null) {
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    eVar = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
                }
                gk2.e eVar2 = eVar;
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
                if (liveRoomControllerStore == null) {
                    androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    liveRoomControllerStore = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117431f;
                }
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2 = liveRoomControllerStore;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var == null) {
                    androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                    kotlin.jvm.internal.o.g(activity3, "activity");
                    k0Var = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6();
                }
                dk2.ef.h(efVar, eVar2, liveRoomControllerStore2, k0Var, 0, null, 16, null);
                return;
            }
            return;
        }
        dk2.ef efVar2 = dk2.ef.f233372a;
        gk2.e eVar3 = dk2.ef.I;
        if (eVar3 == null) {
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            eVar3 = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity4).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
        }
        gk2.e eVar4 = eVar3;
        Z6((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar4.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class));
        if (z17) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
            java.lang.String stringExtra = getIntent().getStringExtra("DESC");
            if (stringExtra == null) {
                stringExtra = "";
            }
            finderObjectDesc.setDescription(stringExtra);
            finderObjectDesc.setMediaType(9);
            finderObjectDesc.setExtReading(new r45.o21());
            r45.uo1 uo1Var = new r45.uo1();
            java.lang.String coverUrl = finderMedia != null ? finderMedia.getCoverUrl() : null;
            if (coverUrl == null) {
                coverUrl = "";
            }
            java.lang.String cover_url_token = finderMedia != null ? finderMedia.getCover_url_token() : null;
            uo1Var.set(0, coverUrl.concat(cover_url_token != null ? cover_url_token : ""));
            finderObjectDesc.setLiveDesc(uo1Var);
            finderObjectDesc.getMedia().add(finderMedia);
            ((mm2.c1) eVar4.a(mm2.c1.class)).Y4 = true;
            ((mm2.c1) eVar4.a(mm2.c1.class)).f328783b5 = this.f116884t;
            ((mm2.c1) eVar4.a(mm2.c1.class)).f328788c5 = this.f116889y;
            ((mm2.c1) eVar4.a(mm2.c1.class)).V1 = finderObjectDesc.getDescription();
            ((mm2.e1) eVar4.a(mm2.e1.class)).f328991u = finderObjectDesc;
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore3 = dk2.ef.f233371J;
        if (liveRoomControllerStore3 == null) {
            androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
            kotlin.jvm.internal.o.g(activity5, "activity");
            liveRoomControllerStore3 = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity5).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117431f;
        }
        dk2.ef.h(efVar2, eVar4, liveRoomControllerStore3, null, 1, null, 20, null);
    }

    public final void P6() {
        androidx.lifecycle.j0 j0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.z53 z53Var = this.f116887w;
        java.lang.String str = null;
        r45.t63 t63Var = z53Var != null ? (r45.t63) z53Var.getCustom(11) : null;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var == null || (j0Var = c1Var.f328833k6) == null) {
            return;
        }
        if (t63Var != null && (list = t63Var.getList(0)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z17 = true;
                int integer = ((r45.u24) obj).getInteger(1);
                r45.z53 z53Var2 = this.f116887w;
                if (integer != (z53Var2 != null ? z53Var2.getInteger(12) : 0)) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            r45.u24 u24Var = (r45.u24) obj;
            if (u24Var != null) {
                str = u24Var.getString(0);
            }
        }
        j0Var.postValue(str);
    }

    public final void Q6() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f116882r);
        java.lang.String str = this.f116871d;
        if (K0) {
            r45.z53 z53Var = this.f116887w;
            java.lang.String string = z53Var != null ? z53Var.getString(9) : null;
            if (string == null) {
                string = "";
            }
            this.f116882r = string;
            com.tencent.mars.xlog.Log.i(str, "configCoverUrlAndAppInfo, coverUrl is empty, default:" + this.f116882r);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f116884t;
        r45.z53 z53Var2 = this.f116887w;
        ((kt.c) i0Var).Ri(str2, z53Var2 != null ? z53Var2.getString(4) : null, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("configCoverUrlAndAppInfo game:");
        sb6.append(this.f116884t);
        sb6.append(", ");
        r45.z53 z53Var3 = this.f116887w;
        sb6.append(z53Var3 != null ? z53Var3.getString(1) : null);
        sb6.append(", ");
        sb6.append(this.f116885u);
        sb6.append(", ");
        sb6.append(this.f116883s);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    public final void R6(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia) {
        U6().setEnabled(false);
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 4);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            x2Var.d(gVar2);
        }
        java.lang.String str = this.f116871d;
        if (finderMedia == null) {
            db5.t7.makeText(getContext(), com.tencent.mm.R.string.dgn, 0).show();
            com.tencent.mars.xlog.Log.i(str, "continuePost: media is null!");
            U6().setEnabled(true);
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.lk T6 = T6();
        ae2.in.f3688a.B0(T6.f118944d);
        if (T6.f118948h) {
            if (T6.f118944d == 1) {
                com.tencent.mm.plugin.finder.live.widget.lk.f118940j.add(T6.f118949i);
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        gk2.e eVar = ((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
        ((mm2.c1) eVar.a(mm2.c1.class)).Z9(((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
        if (!W6()) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            kotlinx.coroutines.l.d(((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().checkActiveAndGet(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.d0(eVar, this, finderMedia, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "startMiniGameLive: appid = " + this.f116884t + ", version_type = " + this.f116889y);
        if (this.D == null) {
            this.D = com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.f9y), 0L, new com.tencent.mm.plugin.finder.live.viewmodel.r0(this), 4, null);
        }
        com.tencent.mm.plugin.finder.assist.d9 d9Var = this.D;
        if (d9Var != null) {
            d9Var.a();
        }
        com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.p8.c(p8Var, com.tencent.mm.plugin.finder.assist.t8.f102573s.f102540b, null, true, false, 10, null);
        com.tencent.mm.plugin.finder.assist.p8.c(p8Var, com.tencent.mm.plugin.finder.assist.t8.f102574t.f102540b, null, false, false, 14, null);
        com.tencent.mm.plugin.finder.assist.u8.f102600b = c01.id.a();
        O6(finderMedia, true);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI finderGameLiveBaseUI = activity2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI) activity2 : null;
        if (finderGameLiveBaseUI != null) {
            com.tencent.mm.plugin.finder.assist.FinderGameEventListener finderGameEventListener = finderGameLiveBaseUI.f109281v;
            if (finderGameEventListener == null) {
                kotlin.jvm.internal.o.o("gameEventListener");
                throw null;
            }
            finderGameEventListener.dead();
        }
        com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
        am.hb hbVar = finderGamePostEvent.f54277g;
        hbVar.f6829a = true;
        hbVar.f6830b = true;
        finderGamePostEvent.e();
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI finderGameLiveBaseUI2 = activity3 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI) activity3 : null;
        if (finderGameLiveBaseUI2 != null) {
            com.tencent.mm.plugin.finder.assist.FinderGameEventListener finderGameEventListener2 = finderGameLiveBaseUI2.f109281v;
            if (finderGameEventListener2 == null) {
                kotlin.jvm.internal.o.o("gameEventListener");
                throw null;
            }
            finderGameEventListener2.alive();
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar2 = dk2.ef.I;
        if (eVar2 != null) {
            efVar.p0(eVar2, true, qo0.b.J1, null, ((mm2.e1) eVar2.a(mm2.e1.class)).f328988r.getLong(0));
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        kotlinx.coroutines.l.d(((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().checkActiveAndGet(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.t0(this, null), 3, null);
    }

    public final com.tencent.mm.plugin.finder.live.widget.i2 S6() {
        com.tencent.mm.plugin.finder.live.widget.i2 i2Var = this.f116878n;
        if (i2Var != null) {
            return i2Var;
        }
        kotlin.jvm.internal.o.o("coverWidget");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.live.widget.lk T6() {
        com.tencent.mm.plugin.finder.live.widget.lk lkVar = this.f116880p;
        if (lkVar != null) {
            return lkVar;
        }
        kotlin.jvm.internal.o.o("licenseWidget");
        throw null;
    }

    public final android.view.View U6() {
        android.view.View view = this.f116877m;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("postBtn");
        throw null;
    }

    public final void V6(r45.m01 m01Var) {
        com.tencent.mars.xlog.Log.i(this.f116871d, "warn_page = " + pm0.b0.g(m01Var));
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.a6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.a6.class)).O6(m01Var, new com.tencent.mm.plugin.finder.live.viewmodel.g0(this, m01Var));
    }

    public final boolean W6() {
        r45.z53 z53Var = this.f116887w;
        return z53Var != null && z53Var.getInteger(13) == 1;
    }

    public final void X6(boolean z17, int i17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SUCC", z17);
        intent.putExtra("TITLE", getResources().getString(i17));
        intent.putExtra("DESC", str);
        intent.putExtra("IS_MINI_GAME", W6());
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Aj(getContext(), intent);
    }

    public final void Y6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gk2.e eVar = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
        kotlinx.coroutines.r2 r2Var = ((mm2.c1) eVar.a(mm2.c1.class)).F5;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.c1) eVar.a(mm2.c1.class)).G5;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((kotlinx.coroutines.flow.h3) j2Var).k(bool);
        com.tencent.mm.sdk.platformtools.Log.c(this.f116871d, "isReadyPluginCountDownOk resetData", new java.lang.Object[0]);
        ((kotlinx.coroutines.flow.h3) ((mm2.c1) eVar.a(mm2.c1.class)).E5).k(new jz5.l(bool, null));
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        kotlinx.coroutines.z0.e(((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().getSecurityDataScope(), null, 1, null);
    }

    public final void Z6(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice liveAnchorSlice) {
        int intExtra = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        if (liveAnchorSlice != null) {
            liveAnchorSlice.f117047h = intExtra;
        }
        long longExtra = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        if (liveAnchorSlice == null) {
            return;
        }
        liveAnchorSlice.f117048i = longExtra;
    }

    public final void a7() {
        boolean z17;
        r45.z53 z53Var;
        java.lang.String str = this.f116871d;
        com.tencent.mars.xlog.Log.i(str, "startPost");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startPost: click too fast!");
            return;
        }
        if (!(T6().f118944d == 1)) {
            com.tencent.mars.xlog.Log.i(str, "startPost: license not ready!");
            com.tencent.mm.plugin.finder.live.widget.ik ikVar = this.f116881q;
            if (ikVar == null) {
                kotlin.jvm.internal.o.o("licensePanelWidget");
                throw null;
            }
            ikVar.f118679b.setVisibility(0);
            ikVar.f118681d.f();
            return;
        }
        if (!W6() && (z53Var = this.f116887w) != null) {
            java.lang.String string = z53Var.getString(4);
            if (!(string == null || string.length() == 0) && this.f116885u == 0) {
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                android.app.Activity context = getContext();
                java.lang.String string2 = z53Var.getString(4);
                if (string2 == null) {
                    string2 = "";
                }
                c0Var.f310112d = b3Var.b(context, string2);
                ae2.b2 b2Var = ae2.b2.f3461a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3479m).getValue()).r()).intValue() == 3) {
                    c0Var.f310112d = false;
                }
                com.tencent.mars.xlog.Log.i(str, "game installed: " + c0Var.f310112d + ", packagename:" + z53Var.getString(4));
                if (!c0Var.f310112d) {
                    if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
                        com.tencent.mm.plugin.finder.assist.x2.f102672a.b(7);
                    }
                    db5.e1.A(getContext(), getContext().getString(com.tencent.mm.R.string.f3_, z53Var.getString(1)), "", getContext().getString(com.tencent.mm.R.string.f490507x1), getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.finder.live.viewmodel.u0(this, c0Var, z53Var), new com.tencent.mm.plugin.finder.live.viewmodel.v0(this));
                    return;
                }
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).getClass();
        Y6();
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        kotlinx.coroutines.l.b(((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().checkActiveAndGet(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.viewmodel.y0(this, null), 2, null);
        com.tencent.mm.plugin.finder.live.widget.i2 S6 = S6();
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(S6.f118621i) && com.tencent.mm.vfs.w6.j(S6.f118621i))) {
            com.tencent.mars.xlog.Log.i(str, "choose default cover:" + S6().f118622m);
            R6(S6().f118623n);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "choose live cover:" + S6().f118621i);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.x(S6().f118621i, xy2.c.e(getContext()), new com.tencent.mm.plugin.finder.live.viewmodel.z0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ajt;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        android.net.Uri data2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult,requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode:");
        sb6.append(i18);
        sb6.append(",face verify result:");
        java.lang.String str = null;
        sb6.append(intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        com.tencent.mars.xlog.Log.i(this.f116871d, sb6.toString());
        super.onActivityResult(i17, i18, intent);
        if (i17 == 10000) {
            if (i18 == -1) {
                if (intent != null && intent.getIntExtra("FACE_VERIFY_RESULT", 0) == 1) {
                    r6 = true;
                }
                if (r6) {
                    a7();
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.i2 S6 = S6();
        if (i17 != 10010 && i17 != 10011) {
            if (i17 != 100112) {
                return;
            }
            if (i18 == -1) {
                kotlinx.coroutines.l.d(S6.f118620h, null, null, new com.tencent.mm.plugin.finder.live.widget.c2(intent, S6, null), 3, null);
                return;
            } else {
                S6.f118626q.b(i18);
                return;
            }
        }
        if (i18 != -1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328222e);
            S6.a(i17 == 10011 ? ml2.x3.f328226i : ml2.x3.f328227m);
            return;
        }
        java.lang.String path = (intent == null || (data2 = intent.getData()) == null) ? null : data2.getPath();
        if (intent != null && (data = intent.getData()) != null) {
            str = data.getPath();
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.app.Activity activity = S6.f118616d;
        if (K0) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            java.lang.String str2 = com.tencent.mm.plugin.finder.assist.e9.f102143l;
            ((ub0.r) oVar).getClass();
            path = com.tencent.mm.pluginsdk.ui.tools.l7.b(activity, intent, str2);
        }
        java.lang.String str3 = path;
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLivePostCoverWidget", "filePath[" + str3 + "] " + intent);
        if (str3 == null || str3.length() == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328222e);
        } else {
            com.tencent.mm.plugin.finder.assist.x1.a(S6.f118626q, str3, com.tencent.mm.plugin.finder.assist.x1.f102664h.a(), 0.75f, activity.getResources().getColor(com.tencent.mm.R.color.a3c), true, false, 32, null);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(i17 == 10011 ? ml2.x3.f328228n : ml2.x3.f328229o);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        boolean z17;
        com.tencent.mm.plugin.finder.live.widget.ik ikVar = this.f116881q;
        if (ikVar == null) {
            kotlin.jvm.internal.o.o("licensePanelWidget");
            throw null;
        }
        boolean z18 = false;
        if (ikVar.f118679b.getVisibility() == 0) {
            ikVar.a();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return true;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = (com.tencent.mm.plugin.finder.live.plugin.c6) ((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().getPlugin(com.tencent.mm.plugin.finder.live.plugin.c6.class);
        if (c6Var != null && c6Var.B0()) {
            z18 = true;
        }
        if (z18) {
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00aa  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.a1.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).P6();
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.k2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.live.viewmodel.k2.class)).f117184o = new com.tencent.mm.plugin.finder.live.viewmodel.y(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (!this.F) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (this.E == null || this.C) {
                dk2.ef.S(dk2.ef.f233372a, "game", false, false, null, false, 30, null);
            } else {
                dk2.ef efVar = dk2.ef.f233372a;
                if (dk2.ef.f233378d instanceof sn0.b) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreSecondaryDevice", "releaseInstance");
                    sn0.b bVar = sn0.b.f409964e2;
                    if (bVar != null) {
                        bVar.m0();
                    }
                    sn0.b.f409964e2 = null;
                }
                dk2.ef.f233378d = this.E;
            }
        }
        if (this.G) {
            dk2.ef efVar2 = dk2.ef.f233372a;
            efVar2.b0(null);
            gk2.e.f272471n = null;
            com.tencent.mars.xlog.Log.i("LivingBuContext", "LivingBuContext set value " + ((java.lang.Object) null) + " ");
            efVar2.a0(null);
        }
        Y6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.finder.live.widget.j2 j2Var = this.f116879o;
        if (j2Var == null) {
            kotlin.jvm.internal.o.o("taskWidget");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView = j2Var.f118716a;
        finderLiveTaskBannerView.f117682p = false;
        finderLiveTaskBannerView.f117684r.removeMessages(finderLiveTaskBannerView.f117679m);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.live.widget.j2 j2Var = this.f116879o;
        java.lang.Object obj = null;
        if (j2Var == null) {
            kotlin.jvm.internal.o.o("taskWidget");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView = j2Var.f118716a;
        finderLiveTaskBannerView.f117682p = true;
        finderLiveTaskBannerView.c();
        if (this.C) {
            com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
            finderGamePostEvent.f54277g.f6829a = true;
            finderGamePostEvent.e();
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gk2.e eVar = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
        if (eVar != null) {
            java.util.Iterator it = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233877f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((dk2.vg) next).f234255b == 2) {
                    obj = next;
                    break;
                }
            }
            if (((dk2.vg) obj) != null) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                pf5.z zVar = pf5.z.f353948a;
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        java.lang.Object obj;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gk2.e eVar = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
        if (eVar != null) {
            if (!((mm2.c1) eVar.a(mm2.c1.class)).f328914x5) {
                if (zl2.r4.f473950a.L(eVar)) {
                    long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                    byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f328985o;
                    java.lang.String e17 = xy2.c.e(getContext());
                    long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
                    r45.xl1 f17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f();
                    new ek2.p1(j17, bArr, e17, j18, f17, 0, new xl2.a(j17, bArr, e17, j18, f17)).l();
                }
                ((mm2.c1) eVar.a(mm2.c1.class)).f328914x5 = true;
            }
            if (this.F) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            java.util.Iterator it = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f233877f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((dk2.vg) obj).f234255b == 1) {
                        break;
                    }
                }
            }
            if (((dk2.vg) obj) != null) {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
            }
        }
    }
}
