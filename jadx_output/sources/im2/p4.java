package im2;

/* loaded from: classes2.dex */
public final class p4 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0, zy2.m8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292487d;

    /* renamed from: e, reason: collision with root package name */
    public final int f292488e;

    /* renamed from: f, reason: collision with root package name */
    public final int f292489f;

    /* renamed from: g, reason: collision with root package name */
    public final int f292490g;

    /* renamed from: h, reason: collision with root package name */
    public final int f292491h;

    /* renamed from: i, reason: collision with root package name */
    public r45.lk2 f292492i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f292493m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.r f292494n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f292495o;

    /* renamed from: p, reason: collision with root package name */
    public zy2.l8 f292496p;

    /* renamed from: q, reason: collision with root package name */
    public final yl2.g1 f292497q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.f1 f292498r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Intent f292499s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f292487d = "FinderLivePostUIC";
        this.f292488e = 10001;
        this.f292489f = 10002;
        this.f292490g = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
        this.f292491h = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
        this.f292493m = "";
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f292497q = new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) activity2, 0, 0L, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(im2.p4 r38, int r39, int r40, yl2.k r41) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.p4.O6(im2.p4, int, int, yl2.k):void");
    }

    public static final void P6(im2.p4 p4Var) {
        kotlinx.coroutines.f1 f1Var = p4Var.f292498r;
        if (f1Var != null) {
            kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        }
        p4Var.f292498r = kotlinx.coroutines.l.b(p4Var.getMainScope(), null, null, new im2.o4(p4Var, null), 3, null);
    }

    public final boolean Q6(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_router_to_profile", false);
        intent.putExtra("key_create_scene", 3);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).qj(getContext(), getIntent());
        return false;
    }

    public void R6(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f292487d, "FinderLive.entrance,live btn click ignoreSheet=true");
        this.f292499s = intent;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(getActivity())) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
            u1Var.g(getActivity().getResources().getString(com.tencent.mm.R.string.dls));
            u1Var.n(getActivity().getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.l(im2.n4.f292456a);
            u1Var.q(false);
            return;
        }
        if (Q6(xy2.c.e(getContext()))) {
            m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
            if (I1 != null && I1.v0()) {
                zl2.q4.f473933a.Q();
            } else {
                pf5.e.launchUI$default(this, null, null, new im2.m4(this, intent != null ? intent.getIntExtra("POST_BTN_CLICK_SCENE_KEY", 0) : 0, null), 3, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S6(r45.lk2 r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L47
            r1 = 20
            java.util.LinkedList r1 = r6.getList(r1)
            if (r1 == 0) goto L47
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r3 = r2
            r45.ac5 r3 = (r45.ac5) r3
            r4 = 1
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r4)
            com.tencent.mm.protocal.protobuf.FinderContact r3 = (com.tencent.mm.protocal.protobuf.FinderContact) r3
            if (r3 == 0) goto L2a
            java.lang.String r3 = r3.getUsername()
            goto L2b
        L2a:
            r3 = r0
        L2b:
            android.app.Activity r4 = r5.getContext()
            java.lang.String r4 = xy2.c.e(r4)
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            if (r3 == 0) goto Lf
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r45.ac5 r2 = (r45.ac5) r2
            if (r2 == 0) goto L47
            r1 = 5
            com.tencent.mm.protobuf.f r1 = r2.getCustom(r1)
            r45.c33 r1 = (r45.c33) r1
            goto L48
        L47:
            r1 = r0
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setPrepareResp wxaShopInfo appId:"
            r2.<init>(r3)
            if (r1 == 0) goto L56
            r0 = 0
            java.lang.String r0 = r1.getString(r0)
        L56:
            r2.append(r0)
            r0 = 44
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = r5.f292487d
            com.tencent.mars.xlog.Log.i(r1, r0)
            r5.f292492i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.p4.S6(r45.lk2):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        gm0.j1.d().a(6653, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i(this.f292487d, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        yz5.r rVar = this.f292494n;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var instanceof db2.f5 ? (db2.f5) m1Var : null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(6653, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f292487d = "FinderLivePostUIC";
        this.f292488e = 10001;
        this.f292489f = 10002;
        this.f292490g = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
        this.f292491h = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
        this.f292493m = "";
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f292497q = new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) activity, 0, 0L, 6, null);
    }
}
