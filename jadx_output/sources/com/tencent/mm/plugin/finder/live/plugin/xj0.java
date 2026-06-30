package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xj0 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public static long A;
    public static long B;

    /* renamed from: y, reason: collision with root package name */
    public static long f115089y;

    /* renamed from: z, reason: collision with root package name */
    public static long f115090z;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f115091p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f115092q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f115093r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView f115094s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f115095t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f115096u;

    /* renamed from: v, reason: collision with root package name */
    public int f115097v;

    /* renamed from: w, reason: collision with root package name */
    public long f115098w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f115099x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115091p = statusMonitor;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.enq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115092q = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.fkz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f115093r = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.enw);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f115094s = (com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView) findViewById3;
        this.f115096u = "SWITCH_ONLY_AUDIO_MODE_ACTION";
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var, r45.ba4 ba4Var) {
        java.lang.String str;
        java.lang.String string;
        xj0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "[showLiveRoomImg] info = " + pm0.b0.g(ba4Var));
        int integer = ba4Var.getInteger(2);
        str = "";
        if (integer == 0) {
            java.lang.String string2 = ba4Var.getString(0);
            xj0Var.x1(string2 != null ? string2 : "");
            return;
        }
        if (integer != 1) {
            super.K0(0);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "[showLiveRoomImg] unknown img type");
            return;
        }
        r45.gg0 gg0Var = (r45.gg0) ba4Var.getCustom(1);
        if (gg0Var != null && (string = gg0Var.getString(1)) != null) {
            str = string;
        }
        xj0Var.x1(str);
        if (xj0Var.f115095t) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "plugin has unmount, dont new player");
        }
    }

    public final void A1() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        java.lang.String string = (finderObject2 == null || (objectDesc2 = finderObject2.getObjectDesc()) == null || (liveDesc = objectDesc2.getLiveDesc()) == null) ? null : liveDesc.getString(0);
        if ((string == null || string.length() == 0) && ((finderObject = ((mm2.c1) P0(mm2.c1.class)).f328846n) == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (string = finderMedia.getUrl()) == null)) {
            string = "";
        }
        java.lang.String str = string;
        java.lang.String str2 = V0().f309129d.f68542m;
        kotlin.jvm.internal.o.d(str2);
        java.lang.String str3 = str2.length() > 0 ? str2 : null;
        if (str3 == null) {
            str3 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
        }
        ya2.b2 b17 = ((mm2.c1) P0(mm2.c1.class)).Y4 ? ya2.h.f460484a.b(((mm2.c1) P0(mm2.c1.class)).f328852o) : ya2.h.f460484a.b(str3);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.pj0(((mm2.c1) P0(mm2.c1.class)).w7(), this, str, b17 != null ? b17.y0() : "", ""));
        y1(true);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void J0() {
        y1(((mm2.c1) P0(mm2.c1.class)).f8());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    @Override // qo0.a
    public void L0() {
        u1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 162) {
            if (((mm2.c1) P0(mm2.c1.class)).f8()) {
                v1(false);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "link mic close onlyAudioMode");
                return;
            }
            return;
        }
        if (ordinal == 193) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_ONLY_AUDIO_MODE_SWITCH", false) : false;
            v1(z17);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "FINDER_LIVE_VISITOR_ONLY_AUDIO_MODE_SWITCH isVisitorOnlyAudioMode:" + z17);
            return;
        }
        if (ordinal == 194 && this.f115099x) {
            if (this.f365323d.getVisibility() == 0) {
                super.K0(4);
            }
            R0().hideLoadingLayer(true);
            this.f115099x = false;
        }
    }

    @Override // qo0.a
    public void N0() {
        w1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mm.modelbase.r1 r1Var;
        com.tencent.mm.network.s sVar;
        super.O0();
        this.f115095t = true;
        this.f115097v = 0;
        this.f115098w = 0L;
        this.f115099x = false;
        w1();
        gm0.y n17 = gm0.j1.n();
        if (n17 == null || (r1Var = n17.f273288b) == null || (sVar = r1Var.f70764d) == null) {
            return;
        }
        sVar.f1(xn0.i.f455424d);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", this.f115096u) && (obj instanceof java.lang.Boolean)) {
            v1(((java.lang.Boolean) obj).booleanValue());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void u1() {
        if (!((mm2.c1) P0(mm2.c1.class)).f8()) {
            super.K0(4);
        } else {
            A = c01.id.c();
            A1();
        }
    }

    public final void v1(boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isVisitorOnlyAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).I4);
        sb6.append(" liveDesc.cover:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        sb6.append((finderObject == null || (objectDesc2 = finderObject.getObjectDesc()) == null || (liveDesc = objectDesc2.getLiveDesc()) == null) ? null : liveDesc.getString(0));
        sb6.append(" media.url:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        sb6.append((finderObject2 == null || (objectDesc = finderObject2.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? null : finderMedia.getUrl());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", sb6.toString());
        if (z17 == ((mm2.c1) P0(mm2.c1.class)).f8()) {
            return;
        }
        if (x0()) {
            p1(this.f115096u, java.lang.Boolean.valueOf(z17));
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z17) {
            boolean z18 = ((mm2.c1) P0(mm2.c1.class)).V4 != 0;
            boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (z18 || !isConnected) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "anchor pause live:" + z18 + ",networkEnable:" + isConnected + '!');
                db5.t7.b(viewGroup.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
                return;
            }
            dk2.xf W0 = W0();
            if (kotlin.jvm.internal.o.b(W0 != null ? java.lang.Boolean.valueOf(((dk2.r4) W0).t(z17, false)) : null, java.lang.Boolean.TRUE)) {
                M0(qo0.b.f365335c3, null);
            } else {
                db5.t7.b(viewGroup.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
            }
        } else {
            this.f115099x = true;
            dk2.xf W02 = W0();
            if (kotlin.jvm.internal.o.b(W02 != null ? java.lang.Boolean.valueOf(((dk2.r4) W02).t(z17, false)) : null, java.lang.Boolean.TRUE)) {
                M0(qo0.b.f365335c3, null);
            } else {
                db5.t7.b(viewGroup.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
            }
        }
        if (z17) {
            A1();
        } else {
            R0().showProgressWithBlurBg(((mm2.c1) P0(mm2.c1.class)).f328852o);
        }
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) X0(com.tencent.mm.plugin.finder.live.plugin.le0.class);
        if (le0Var != null) {
            le0Var.t1();
        }
        y1(z17);
    }

    public final void w1() {
        if (!((mm2.c1) P0(mm2.c1.class)).f8() || A == 0) {
            return;
        }
        long c17 = c01.id.c() - A;
        B += c17;
        A = 0L;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "in room add Time, inRoom: " + c17 + " total: " + B);
    }

    public final void x1(java.lang.String str) {
        if (r26.i0.y(str, "http", false)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c a17 = g1Var.e().a(new mn2.j0(str));
            com.tencent.mm.plugin.finder.live.plugin.rj0 rj0Var = new com.tencent.mm.plugin.finder.live.plugin.rj0(this);
            a17.getClass();
            a17.f447873d = rj0Var;
            a17.g(g1Var.h(mn2.f1.G));
            a17.f();
            return;
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a18.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        java.io.InputStream D = com.tencent.mm.vfs.w6.D(a18, com.tencent.mm.vfs.a3.f212781a.m(a18, null));
        kotlin.jvm.internal.o.f(D, "openRead(...)");
        android.view.ViewGroup viewGroup = this.f365323d;
        android.graphics.Bitmap P = com.tencent.mm.sdk.platformtools.x.P(D, 0.0f, i65.a.B(viewGroup.getContext()), i65.a.k(viewGroup.getContext()), true);
        this.f115092q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(viewGroup.getContext().getResources(), P));
        ((mm2.c1) P0(mm2.c1.class)).I4 = P;
        super.K0(0);
    }

    public final void y1(boolean z17) {
        com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = this.f115094s;
        if (z17) {
            finderLiveAudioWaveRootView.leftWave.setWaveStart(true, false);
            finderLiveAudioWaveRootView.rightWave.setWaveStart(true, true);
        } else {
            finderLiveAudioWaveRootView.leftWave.setWaveStart(false, false);
            finderLiveAudioWaveRootView.rightWave.setWaveStart(false, true);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.modelbase.r1 r1Var;
        com.tencent.mm.network.s sVar;
        super.z0();
        this.f115097v = 0;
        this.f115098w = 0L;
        this.f115095t = false;
        android.widget.TextView titleTxt = this.f115094s.getTitleTxt();
        android.view.ViewGroup viewGroup = this.f365323d;
        titleTxt.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e2c));
        android.widget.TextView textView = this.f115093r;
        com.tencent.mm.ui.fk.a(textView);
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.sj0(this));
        u1();
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.tj0(this));
        gm0.y n17 = gm0.j1.n();
        if (n17 == null || (r1Var = n17.f273288b) == null || (sVar = r1Var.f70764d) == null) {
            return;
        }
        sVar.h1(xn0.i.f455424d);
    }

    public final void z1() {
        if (!((mm2.c1) P0(mm2.c1.class)).N4 || ((mm2.c1) P0(mm2.c1.class)).f8()) {
            return;
        }
        ((mm2.c1) P0(mm2.c1.class)).N4 = false;
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(this.f365323d.getContext());
        e3Var.f(com.tencent.mm.R.layout.awi);
        android.view.View view = e3Var.f131959f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i4m);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        view.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.uj0(e3Var));
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i4l);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.vj0(this, e3Var));
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i4n);
        kotlin.jvm.internal.o.d(textView3);
        com.tencent.mm.ui.fk.a(textView3);
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.wj0(this, e3Var));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.X1;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "3");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        e3Var.i();
    }
}
