package com.tencent.mm.plugin.groupsolitaire.ui;

@db5.a(1024)
/* loaded from: classes5.dex */
public class GroupSolitatireEditUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int U = 0;
    public int A;
    public com.tencent.mm.storage.a3 E;
    public int H;
    public boolean I;
    public android.graphics.Rect P;
    public android.graphics.Rect Q;
    public z63.g R;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f142218d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f142219e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f142220f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f142221g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f142222h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f142223i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f142224m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f142225n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageButton f142226o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f142227p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f142228q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f142229r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f142230s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f142231t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f142232u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f142233v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.GestureDetector f142234w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f142235x;

    /* renamed from: z, reason: collision with root package name */
    public int f142237z;

    /* renamed from: y, reason: collision with root package name */
    public boolean f142236y = false;
    public y63.a B = null;
    public y63.a C = null;
    public java.lang.String D = "";
    public boolean F = false;
    public boolean G = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f142217J = false;
    public boolean K = false;
    public boolean L = false;
    public final java.util.ArrayList M = new java.util.ArrayList();
    public boolean N = false;
    public final android.text.TextWatcher S = new z63.y(this);
    public final android.view.View.OnTouchListener T = new z63.i0(this);

    public static void V6(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        android.util.Pair pair;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj2;
        y63.a aVar;
        java.lang.String str5;
        groupSolitatireEditUI.N = true;
        if (groupSolitatireEditUI.f142236y && (aVar = groupSolitatireEditUI.B) != null && (str5 = aVar.I) != null && !com.tencent.mm.sdk.platformtools.t8.K0(str5.trim())) {
            groupSolitatireEditUI.B.I = groupSolitatireEditUI.getString(com.tencent.mm.R.string.fso) + " " + groupSolitatireEditUI.B.I.trim();
            y63.a aVar2 = groupSolitatireEditUI.B;
            aVar2.field_key = x63.g.o(aVar2);
        }
        y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f(groupSolitatireEditUI.D, groupSolitatireEditUI.B.field_key);
        x63.g.h(f17, groupSolitatireEditUI.D);
        if (groupSolitatireEditUI.F) {
            z17 = f17 != null;
            f17 = x63.g.A(groupSolitatireEditUI.B, f17, c01.z1.r(), 2);
        } else {
            z17 = false;
        }
        y63.a clone = f17 == null ? null : f17.clone();
        y63.a I = x63.g.I(groupSolitatireEditUI.B, f17, c01.z1.r(), true, false);
        if (I.P) {
            x63.g.z(I);
        }
        if (f17 != null && f17.field_active == 0 && I.N.size() > 1) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().b(I, c01.z1.r(), groupSolitatireEditUI.D);
        }
        I.field_lastActiveTime = c01.id.e();
        x63.g.K(I, f17 != null, false);
        int i17 = groupSolitatireEditUI.H;
        if ((i17 == 4 || i17 == 5) || (groupSolitatireEditUI.F && f17 != null)) {
            t63.e eVar = (t63.e) i95.n0.c(t63.e.class);
            java.lang.String str6 = groupSolitatireEditUI.D;
            y63.a aVar3 = groupSolitatireEditUI.B;
            boolean z18 = f17 == null;
            eVar.getClass();
            java.lang.String j17 = x63.g.j(aVar3);
            ot0.q qVar = new ot0.q();
            qVar.f348654f = j17;
            qVar.f348666i = 53;
            qVar.f348721v2 = new android.util.Pair(I.field_key, x63.g.a(j17, I, z17));
            if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).rj(qVar.f348666i, str6)) {
                l15.c cVar = new l15.c();
                cVar.fromXml(ot0.q.u(qVar, null, null));
                qu.c cVar2 = new qu.c(str6, cVar, null);
                cVar2.f366715q = I;
                cVar2.f366716r = z18;
                cVar2.f366717s = 2;
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new qu.b(cVar2));
                pair = new android.util.Pair(-1L, "");
            } else {
                ((ez.w0) ot0.j1.a()).getClass();
                android.util.Pair I2 = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str6, "", null);
                if (!z18 || I2.first == null || I2.second == null) {
                    str = j17;
                    str2 = str6;
                    if (!z18) {
                        ((t63.e) i95.n0.c(t63.e.class)).Ai().i(I, clone, 2);
                    }
                } else {
                    str = j17;
                    ((t63.e) i95.n0.c(t63.e.class)).Ai().a(((java.lang.Long) I2.second).longValue(), I, clone, false, 2);
                    str2 = str6;
                }
                if (I2.first != null && (obj = I2.second) != null) {
                    x63.g.L(((java.lang.Long) obj).longValue(), c01.z1.r(), I, str2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.PluginGroupSolitaire", "sendGroupSolitatire() ret:%s lossOrig:%s", I2, java.lang.Boolean.valueOf(z17));
                java.lang.Object obj3 = I2.second;
                pair = new android.util.Pair(java.lang.Long.valueOf(obj3 != null ? ((java.lang.Long) obj3).longValue() : -1L), str);
            }
        } else {
            t63.e eVar2 = (t63.e) i95.n0.c(t63.e.class);
            java.lang.String str7 = groupSolitatireEditUI.D;
            boolean z19 = groupSolitatireEditUI.F;
            eVar2.getClass();
            java.lang.String j18 = x63.g.j(I);
            ot0.q qVar2 = new ot0.q();
            qVar2.f348654f = j18;
            qVar2.f348666i = 53;
            qVar2.f348721v2 = new android.util.Pair(I.field_key, x63.g.a(j18, I, z17));
            if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).rj(qVar2.f348666i, str7)) {
                l15.c cVar3 = new l15.c();
                cVar3.fromXml(ot0.q.u(qVar2, null, null));
                qu.c cVar4 = new qu.c(str7, cVar3, null);
                cVar4.f366715q = I;
                cVar4.f366716r = z19;
                cVar4.f366717s = 2;
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new qu.b(cVar4));
                pair = new android.util.Pair(-1L, "");
            } else {
                ((ez.w0) ot0.j1.a()).getClass();
                android.util.Pair I3 = com.tencent.mm.pluginsdk.model.app.k0.I(qVar2, "", "", str7, "", null);
                if (!z19 || I3.first == null || I3.second == null) {
                    str3 = str7;
                    str4 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
                    if (!z19) {
                        ((t63.e) i95.n0.c(t63.e.class)).Ai().i(I, clone, 2);
                    }
                } else {
                    str3 = str7;
                    str4 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
                    ((t63.e) i95.n0.c(t63.e.class)).Ai().a(((java.lang.Long) I3.second).longValue(), I, clone, false, 2);
                }
                if (I3.first != null && (obj2 = I3.second) != null) {
                    x63.g.L(((java.lang.Long) obj2).longValue(), c01.z1.r(), I, str3);
                }
                com.tencent.mars.xlog.Log.i(str4, "sendGroupSolitatire() ret:%s", I3);
                java.lang.Object obj4 = I3.second;
                pair = new android.util.Pair(java.lang.Long.valueOf(obj4 != null ? ((java.lang.Long) obj4).longValue() : -1L), j18);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_group_solitatire_content", (java.lang.String) pair.second);
        groupSolitatireEditUI.setResult(-1, intent);
        if (((java.lang.Long) pair.first).longValue() >= 0) {
            if (I.field_msgSvrId == 0) {
                x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
                long longValue = ((java.lang.Long) pair.first).longValue();
                y63.a aVar4 = groupSolitatireEditUI.B;
                int i18 = groupSolitatireEditUI.H;
                int i19 = i18 == 3 || i18 == 4 ? 3 : i18;
                boolean z27 = groupSolitatireEditUI.F;
                Ai.getClass();
                if (longValue >= 0 && aVar4 != null) {
                    x63.n nVar = new x63.n(Ai);
                    nVar.f452259a = aVar4.field_username;
                    nVar.f452260b = i19;
                    nVar.f452262d = aVar4.field_key;
                    if (z27) {
                        nVar.f452261c = 2L;
                    } else {
                        nVar.f452261c = 1L;
                    }
                    Ai.f452268c.put(java.lang.Long.valueOf(longValue), nVar);
                }
            } else {
                x63.p Ai2 = ((t63.e) i95.n0.c(t63.e.class)).Ai();
                int i27 = groupSolitatireEditUI.H;
                if (i27 == 3 || i27 == 4) {
                    i27 = 3;
                }
                Ai2.g(I, i27, 3, groupSolitatireEditUI.F);
            }
        }
        groupSolitatireEditUI.finish();
    }

    public static void W6(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI, boolean z17) {
        android.view.View view = groupSolitatireEditUI.f142233v;
        if (view == null) {
            return;
        }
        groupSolitatireEditUI.A = ((com.tencent.mm.ui.widget.MMEditText) view).getSelectionStart();
        int height = ((android.view.WindowManager) groupSolitatireEditUI.getSystemService("window")).getDefaultDisplay().getHeight();
        groupSolitatireEditUI.f142233v.getGlobalVisibleRect(groupSolitatireEditUI.Q);
        android.graphics.Rect rect = groupSolitatireEditUI.Q;
        if (rect.bottom > height) {
            rect.bottom = height;
        }
        int height2 = ((groupSolitatireEditUI.f142237z + groupSolitatireEditUI.f142228q.getHeight()) - (height - groupSolitatireEditUI.Q.bottom)) + (com.tencent.mm.ui.b4.c(groupSolitatireEditUI) ? com.tencent.mm.ui.bk.j(groupSolitatireEditUI) + 0 : 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) groupSolitatireEditUI.f142232u.getLayoutParams();
        groupSolitatireEditUI.f142228q.getHeight();
        int i17 = groupSolitatireEditUI.Q.bottom;
        if (!z17) {
            layoutParams.height = 0;
            groupSolitatireEditUI.f142232u.setLayoutParams(layoutParams);
            return;
        }
        if (i17 <= height - (groupSolitatireEditUI.f142237z + groupSolitatireEditUI.f142228q.getHeight()) || groupSolitatireEditUI.f142237z == 0) {
            return;
        }
        if (groupSolitatireEditUI.f142227p.isShown()) {
            groupSolitatireEditUI.f142227p.getGlobalVisibleRect(groupSolitatireEditUI.P);
        } else {
            groupSolitatireEditUI.f142224m.getGlobalVisibleRect(groupSolitatireEditUI.P);
        }
        android.graphics.Rect rect2 = groupSolitatireEditUI.P;
        if (rect2.bottom > height) {
            rect2.bottom = height;
        }
        layoutParams.height = (height - rect2.bottom) + height2;
        groupSolitatireEditUI.f142232u.setLayoutParams(layoutParams);
        groupSolitatireEditUI.f142232u.postDelayed(new z63.d0(groupSolitatireEditUI, height2), 100L);
    }

    public final void U6(java.lang.String str) {
        ((com.tencent.mm.ui.widget.MMEditText) this.f142233v).requestFocus();
        this.f142225n.postDelayed(new z63.c0(this), 200L);
        ((com.tencent.mm.ui.widget.MMEditText) this.f142233v).getText().insert(this.A, str + "; ");
    }

    public final void X6(boolean z17) {
        y63.b bVar = new y63.b();
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.biq, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gud)).setText((this.B.N.size() + 1) + "");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) inflate.findViewById(com.tencent.mm.R.id.guc);
        java.lang.CharSequence b76 = b7(c01.z1.r(), false);
        if (!com.tencent.mm.sdk.platformtools.t8.J0(b76)) {
            mMEditText.setText(((java.lang.Object) b76) + " ");
            bVar.f459656e = ((java.lang.Object) b76) + "";
        }
        bVar.f459652a = c01.z1.r();
        y63.a aVar = this.B;
        bVar.f459654c = aVar.K;
        bVar.f459657f = aVar.N.size() + 1;
        mMEditText.setTag(com.tencent.mm.R.id.guj, 3);
        mMEditText.setTag(com.tencent.mm.R.id.guh, bVar);
        mMEditText.requestFocus();
        mMEditText.setFocusable(true);
        mMEditText.setFocusableInTouchMode(true);
        mMEditText.addTextChangedListener(this.S);
        mMEditText.setOnTouchListener(this.T);
        mMEditText.setOnFocusChangeListener(new z63.g0(this, mMEditText));
        mMEditText.setMaxLines(10);
        java.util.HashMap hashMap = this.B.N;
        hashMap.put(java.lang.Integer.valueOf(hashMap.size() + 1), bVar);
        this.f142225n.addView(inflate);
        this.M.add(inflate);
        inflate.post(new z63.u(this));
        g7(z17);
    }

    public void Y6(int i17) {
        android.view.View view = this.f142233v;
        int i18 = 0;
        if (view == null || !(view instanceof com.tencent.mm.ui.widget.MMEditText)) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().d(this.B, i17, 0);
            return;
        }
        int intValue = ((java.lang.Integer) ((com.tencent.mm.ui.widget.MMEditText) view).getTag(com.tencent.mm.R.id.guj)).intValue();
        int i19 = 1;
        if (intValue != 1) {
            i19 = 3;
            if (intValue != 2) {
                if (intValue == 3) {
                    i18 = 4;
                } else if (intValue == 4) {
                    i18 = 2;
                }
                ((t63.e) i95.n0.c(t63.e.class)).Ai().d(this.B, i17, i18);
            }
        }
        i18 = i19;
        ((t63.e) i95.n0.c(t63.e.class)).Ai().d(this.B, i17, i18);
    }

    public final android.util.Pair Z6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z17 = true;
        for (int i17 = 1; i17 <= this.C.N.size(); i17++) {
            y63.b bVar = (y63.b) this.C.N.get(java.lang.Integer.valueOf(i17));
            if (com.tencent.mm.sdk.platformtools.t8.D0(bVar.f459652a, c01.z1.r())) {
                hashSet.add(bVar);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (int i18 = 1; i18 <= this.B.N.size(); i18++) {
            y63.b bVar2 = (y63.b) this.B.N.get(java.lang.Integer.valueOf(i18));
            if (com.tencent.mm.sdk.platformtools.t8.D0(bVar2.f459652a, c01.z1.r()) && !com.tencent.mm.sdk.platformtools.t8.K0(bVar2.f459656e.trim())) {
                arrayList.add(bVar2);
                hashSet2.add(bVar2);
            }
        }
        boolean z18 = false;
        if (hashSet.size() == arrayList.size()) {
            boolean z19 = arrayList.size() != hashSet2.size();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (!hashSet.contains((y63.b) it.next())) {
                    break;
                }
            }
            z18 = z19;
        }
        return new android.util.Pair(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    public final int a7(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        if (this.f142237z == 0) {
            return 10;
        }
        int height = ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
        float height2 = (height - ((this.f142237z + this.f142228q.getHeight()) + com.tencent.mm.ui.zk.a(this, 145))) / mMEditText.getLineHeight();
        if (height2 <= 0.0f) {
            height2 = 10.0f;
        }
        return (int) height2;
    }

    public final java.lang.CharSequence b7(java.lang.String str, boolean z17) {
        java.lang.String z07;
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
            java.lang.String d17 = n17.d1();
            com.tencent.mm.storage.a3 a3Var = this.E;
            z07 = a3Var == null ? null : a3Var.z0(d17);
        } else {
            z07 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = n17.f2();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = n17.d1();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((ke0.e) xVar).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.i(context, z07);
    }

    public final boolean c7() {
        if (this.f142217J) {
            db5.e1.D(this, getString(com.tencent.mm.R.string.fsj), "", getString(com.tencent.mm.R.string.fsi), getString(com.tencent.mm.R.string.fsh), false, new z63.p(this), new z63.q(this), com.tencent.mm.R.color.a2y);
        } else {
            x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
            y63.a aVar = this.B;
            int i17 = this.H;
            if (i17 == 3 || i17 == 4) {
                i17 = 3;
            }
            Ai.g(aVar, i17, 1, this.F);
            finish();
        }
        return true;
    }

    public final void d7() {
        if (this.f142218d.findFocus() == null) {
            return;
        }
        android.view.View findFocus = this.f142218d.findFocus();
        this.f142233v = findFocus;
        this.A = ((com.tencent.mm.ui.widget.MMEditText) findFocus).getSelectionStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f142234w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        super.dispatchTouchEvent(motionEvent);
        return false;
    }

    public final void e7() {
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.ACCESS_FINE_LOCATION", true)) {
                if (!((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                    c71.b.c(this, getResources().getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d()), 30764, true);
                    return;
                } else {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                    return;
                }
            }
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 64, null, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
            if (!a17) {
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
        intent.putExtra("map_view_type", 3);
        j45.l.n(this, ya.b.LOCATION, ".ui.RedirectUI", intent, 4097);
    }

    public final void f7(int i17) {
        if (this.I) {
            this.f142226o.setVisibility(8);
        } else {
            this.f142226o.setVisibility(i17);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "finish() hideVKB() %s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public final void g7(boolean z17) {
        boolean z18;
        int i17 = 1;
        while (true) {
            if (i17 > this.B.N.size()) {
                z18 = false;
                break;
            }
            y63.b bVar = (y63.b) this.B.N.get(java.lang.Integer.valueOf(i17));
            if (bVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f459656e.trim())) {
                z18 = true;
                break;
            }
            i17++;
        }
        if (!this.F) {
            android.util.Pair Z6 = Z6();
            boolean booleanValue = ((java.lang.Boolean) Z6.first).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) Z6.second).booleanValue();
            if (z18 && (booleanValue || booleanValue2)) {
                enableOptionMenu(0, true);
                if (z17) {
                    return;
                }
                this.f142217J = true;
                return;
            }
            enableOptionMenu(0, false);
            if (z17) {
                return;
            }
            this.f142217J = false;
            return;
        }
        if (!z18) {
            enableOptionMenu(0, false);
            if (z17) {
                return;
            }
            this.f142217J = false;
            return;
        }
        enableOptionMenu(0, true);
        if (z17) {
            return;
        }
        y63.a aVar = this.C;
        if (aVar != null && com.tencent.mm.sdk.platformtools.t8.D0(this.B.H, aVar.H) && com.tencent.mm.sdk.platformtools.t8.D0(this.B.I, this.C.I) && com.tencent.mm.sdk.platformtools.t8.D0(this.B.f459651J, this.C.f459651J)) {
            android.util.Pair Z62 = Z6();
            boolean booleanValue3 = ((java.lang.Boolean) Z62.first).booleanValue();
            boolean booleanValue4 = ((java.lang.Boolean) Z62.second).booleanValue();
            if (!booleanValue3 && !booleanValue4) {
                if (z17) {
                    return;
                }
                this.f142217J = false;
                return;
            }
        }
        if (z17) {
            return;
        }
        this.f142217J = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bir;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0512  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((com.tencent.mm.ui.widget.MMEditText) this.f142233v).requestFocus();
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        if (i17 != 4097) {
            if (i17 != 4098) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "REQUEST_CODE_POST_CONTACT");
            z63.g gVar = this.R;
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Kwebmap_locaion");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("kPoiName");
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "REQUEST_CODE_POST_LOC address: %s, poiName：%s", stringExtra, stringExtra2);
        if (stringExtra.contains(getString(com.tencent.mm.R.string.fse))) {
            stringExtra = stringExtra.substring(stringExtra.indexOf(getString(com.tencent.mm.R.string.fse)) + 1);
        }
        U6(stringExtra2 + "(" + stringExtra + ")");
        Y6(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "key_group_solitatire_create"
            r1 = 0
            boolean r7 = r7.getBooleanExtra(r0, r1)
            r6.F = r7
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "key_group_solitatire_key"
            java.lang.String r7 = r7.getStringExtra(r0)
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "key_group_solitatire_chatroom_username"
            java.lang.String r0 = r0.getStringExtra(r2)
            r6.D = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "key_group_solitatire_scene"
            r3 = 3
            int r0 = r0.getIntExtra(r2, r3)
            r6.H = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "KEY_GROUP_SOLITATIRE_READ_ONLY"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            r6.I = r0
            int r0 = r6.H
            r2 = 1
            java.lang.Class<t63.e> r4 = t63.e.class
            if (r0 == r3) goto L64
            r3 = 4
            if (r0 == r3) goto L4f
            r3 = 5
            if (r0 != r3) goto L4d
            goto L4f
        L4d:
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L53
            goto L64
        L53:
            i95.m r0 = i95.n0.c(r4)
            t63.e r0 = (t63.e) r0
            x63.j r0 = r0.wi()
            java.lang.String r3 = r6.D
            y63.a r0 = r0.f(r3, r7)
            goto L87
        L64:
            i95.m r0 = i95.n0.c(r4)
            t63.e r0 = (t63.e) r0
            x63.j r0 = r0.wi()
            java.lang.String r3 = r6.D
            java.util.concurrent.ConcurrentHashMap r0 = r0.f452243d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            java.lang.Object r0 = r0.get(r3)
            y63.a r0 = (y63.a) r0
        L87:
            java.lang.String r3 = "MicroMsg.groupsolitaire.GroupSolitatireEditUI"
            if (r0 != 0) goto L98
            java.lang.String r0 = "initData() key:%s temp == null"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.e(r3, r0, r7)
            r6.finish()
            goto Ldd
        L98:
            y63.a r0 = r0.clone()
            r6.B = r0
            if (r0 != 0) goto Lad
            java.lang.String r0 = "initData() key:%s mGroupSolitatire == null"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.e(r3, r0, r7)
            r6.finish()
            goto Ldd
        Lad:
            i95.m r7 = i95.n0.c(r4)
            t63.e r7 = (t63.e) r7
            x63.j r7 = r7.wi()
            java.lang.String r0 = r6.D
            y63.a r3 = r6.B
            java.lang.String r3 = r3.field_key
            y63.a r7 = r7.f(r0, r3)
            r6.C = r7
            java.lang.Class<rv1.f> r7 = rv1.f.class
            lm0.a r7 = gm0.j1.s(r7)
            rv1.f r7 = (rv1.f) r7
            qv1.a r7 = (qv1.a) r7
            com.tencent.mm.storage.b3 r7 = r7.a()
            java.lang.String r0 = r6.D
            com.tencent.mm.storage.a3 r7 = r7.z0(r0)
            r6.E = r7
            r6.setResult(r1)
            r1 = r2
        Ldd:
            if (r1 != 0) goto Le0
            return
        Le0:
            r6.initView()
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131102740(0x7f060c14, float:1.7817926E38)
            int r7 = r7.getColor(r0)
            r6.setNavigationbarColor(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (this.G) {
            return true;
        }
        c7();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f142235x;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult");
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        if (iArr[0] == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult OK");
            e7();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult failed");
            db5.e1.C(getContext(), getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.hhg), false, new z63.b0(this), null);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f142219e.post(new z63.s(this));
        int i17 = this.H;
        if (i17 != 2) {
            if (!(i17 == 3 || i17 == 4) && i17 != 5) {
                return;
            }
        }
        this.f142225n.postDelayed(new z63.t(this), 200L);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        boolean z18 = this.G;
        if (i17 > 0) {
            this.G = true;
        } else {
            this.G = false;
        }
        if (!z18 && this.G) {
            java.util.Iterator it = this.M.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setTag(null);
            }
        }
        if (i17 != 0) {
            this.f142237z = i17;
        }
        if (this.F) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f142222h;
            mMEditText.setMaxLines(a7(mMEditText));
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f142227p;
            mMEditText2.setMaxLines(a7(mMEditText2));
        }
        android.view.View view = this.f142233v;
        if (view != null) {
            if (this.G) {
                view.postDelayed(new z63.x(this), 100L);
            } else {
                view.post(new z63.w(this));
            }
        }
        if (this.G) {
            if (this.f142228q.getTranslationY() != 0.0f) {
                this.f142228q.setTranslationY(0.0f);
            }
            ofFloat = android.animation.ObjectAnimator.ofFloat(this.f142228q, "translationY", 0.0f, -this.f142237z);
        } else {
            android.widget.LinearLayout linearLayout = this.f142228q;
            ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "translationY", linearLayout.getTranslationY(), 0.0f);
        }
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(new y3.b());
        ofFloat.addListener(new z63.z(this));
        ofFloat.start();
        d7();
        android.view.View view2 = this.f142233v;
        if (view2 == null) {
            return;
        }
        view2.postDelayed(new z63.a0(this), 50L);
    }
}
