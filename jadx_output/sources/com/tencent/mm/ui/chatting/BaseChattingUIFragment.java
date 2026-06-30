package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public abstract class BaseChattingUIFragment extends com.tencent.mm.ui.MMFragment implements com.tencent.mm.ui.chatting.fb, com.tencent.mm.ui.chatting.gb {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f198149r = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f198150d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f198151e;

    /* renamed from: f, reason: collision with root package name */
    public final yb5.d f198152f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.y4 f198153g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.w3 f198154h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f198155i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198156m;

    /* renamed from: n, reason: collision with root package name */
    public pd5.l f198157n;

    /* renamed from: o, reason: collision with root package name */
    public long f198158o;

    /* renamed from: p, reason: collision with root package name */
    public long f198159p;

    /* renamed from: q, reason: collision with root package name */
    public int f198160q;

    public BaseChattingUIFragment() {
        this.f198152f = new yb5.d(this, this, this);
        this.f198153g = new com.tencent.mm.ui.chatting.component.y4();
        this.f198154h = new com.tencent.mm.ui.chatting.component.w3();
        this.f198155i = false;
        this.f198156m = false;
        this.f198160q = 0;
        V0();
    }

    public abstract com.tencent.mm.ui.zb A0();

    public ke5.f0 B0() {
        return null;
    }

    public abstract com.tencent.mm.pluginsdk.ui.tools.v3 C0();

    public boolean F0() {
        return true;
    }

    public boolean G0() {
        return J0(256) && !J0(128);
    }

    public boolean H0() {
        return J0(1024) && !J0(512);
    }

    public boolean J0(int i17) {
        return (i17 & this.f198160q) == 0;
    }

    public boolean K0() {
        yb5.d dVar = this.f198152f;
        boolean z17 = dVar.f460724s;
        boolean z18 = dVar.f460725t;
        boolean F0 = F0();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "isOnDataSetChangedCalled = %s, isEnterOverTimeCalled = %s, hasLayoutAfterDataSetChanged = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(F0));
        return (z17 && F0) || z18;
    }

    public void L0() {
        p0(128, new com.tencent.mm.ui.chatting.o1(this));
    }

    public void M0() {
        p0(256, new com.tencent.mm.ui.chatting.p1(this));
    }

    public void N0() {
        p0(512, new com.tencent.mm.ui.chatting.e1(this));
    }

    public void P0() {
        p0(1024, new com.tencent.mm.ui.chatting.f1(this));
    }

    public void Q0(android.content.Context context) {
    }

    public void R0() {
    }

    public void T0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "resetEnterChattingAnimFlag() called");
        yb5.d dVar = this.f198152f;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "setOnDataSetChangedCalled:false");
        dVar.f460724s = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "setIsEnterOverTimeCalled:false");
        dVar.f460725t = false;
    }

    public void U0() {
    }

    public void V0() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!bundle.containsKey(getClass().getName())) {
            bundle.putInt(getClass().getName(), Integer.MAX_VALUE);
        }
        setArguments(bundle);
        this.f198157n = new pd5.l();
    }

    public abstract boolean W0();

    @Override // com.tencent.mm.ui.chatting.fb
    public int getFirstVisiblePosition() {
        return C0().getFirstVisiblePosition();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public s75.b getIdentityString() {
        com.tencent.mm.storage.z3 u17 = this.f198152f.u();
        if (u17 == null || ((int) u17.E2) == 0 || com.tencent.mm.sdk.platformtools.t8.K0(u17.d1())) {
            return new s75.b("");
        }
        if (u17.k2()) {
            return new s75.b("_bizContact");
        }
        java.lang.String d17 = u17.d1();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.chatting.g1 g1Var = new com.tencent.mm.ui.chatting.g1(this, d17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        return new s75.b(t0Var.m(g1Var, 0L));
    }

    public void l0() {
        if (this.f198152f.f460714i || isFinishing()) {
            if (J0(8) && !isFinishing() && !H0()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment", "[onPause] is never doResume before doPause! Because while entering ChattingUI, the app back to background.");
                x0();
                M0();
            }
            w0();
        }
    }

    public void m0() {
        yb5.d dVar = this.f198152f;
        if (dVar.f460714i) {
            x0();
            if (l75.d1.f316947c) {
                jx3.f.INSTANCE.d(25984, 401, "", "", "");
                l75.d1.f316948d = true;
                fp.r0.f265232a.f(thisActivity());
            }
            if (this.isCurrentActivity || this.f198155i) {
                M0();
            }
            if (this.isCurrentActivity) {
                dVar.f460710e.l0();
            }
        }
    }

    public void n0() {
        if (this.f198152f.f460714i) {
            p0(4, new com.tencent.mm.ui.chatting.j1(this));
        }
        if (getClass() == com.tencent.mm.ui.chatting.ChattingUIFragment.class) {
            ((com.tencent.mm.feature.performance.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Ai("Chat");
        }
    }

    public void o0() {
        if ((this.f198152f.f460714i || isFinishing()) && !G0()) {
            if (J0(16)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s is never pause when stop coming!", this.f198151e);
                w0();
            }
            p0(32, new com.tencent.mm.ui.chatting.m1(this));
        }
        if (getClass() == com.tencent.mm.ui.chatting.ChattingUIFragment.class) {
            ((com.tencent.mm.feature.performance.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Bi("Chat");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        s0();
        if (this.isCurrentActivity || this.f198155i) {
            L0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "onActivityResult return, requestCode:%d resultCode:%s data is null? %s", objArr);
        yb5.d dVar = this.f198152f;
        if (!dVar.f460714i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment", "[onActivityResult] not foreground, return, requestCode:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        yb5.d dVar2 = (yb5.d) dVar.f460709d.f201966a.get();
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar2 != null ? dVar2.f460717l : null;
        if (baseChattingUIFragment != null) {
            java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.ui.chatting.manager.e.f201965b.get(baseChattingUIFragment);
            j45.g gVar = hashMap != null ? (j45.g) hashMap.remove(java.lang.Integer.valueOf(i17)) : null;
            if (gVar != null) {
                gVar.onActivityResult(i17, i18, intent);
            }
        }
        dVar.f460710e.N(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        this.f198150d = getActivity().getClass().getName() + "@" + hashCode() + " @talker:%s";
        r0(context);
        com.tencent.mm.ui.chatting.component.y4 y4Var = this.f198153g;
        yb5.d dVar = this.f198152f;
        dVar.z(yn.j.class, y4Var);
        dVar.z(yn.k.class, dVar.f460710e);
        com.tencent.mm.ui.chatting.component.w3 w3Var = this.f198154h;
        dVar.z(yn.i.class, w3Var);
        dVar.z(yn.i.class, w3Var);
        for (com.tencent.mm.ui.chatting.component.a3 a3Var : (java.util.List) ((jz5.n) com.tencent.mm.ui.chatting.component.d3.f198922b).getValue()) {
            dVar.z(a3Var.f198603a, com.tencent.mm.ui.chatting.component.d3.b(a3Var.f198604b));
        }
        java.util.ArrayList<java.lang.String> stringArrayList = getStringArrayList("key_intent_chatting_components");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stringArrayList != null) {
            java.util.Iterator<T> it = stringArrayList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(java.lang.Class.forName((java.lang.String) it.next()));
                } catch (java.lang.Exception unused) {
                }
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) com.tencent.mm.ui.chatting.component.d3.a(arrayList)).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.ui.chatting.component.a3 a3Var2 = (com.tencent.mm.ui.chatting.component.a3) it6.next();
            dVar.z(a3Var2.f198603a, com.tencent.mm.ui.chatting.component.d3.b(a3Var2.f198604b));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yb5.d dVar = this.f198152f;
        if (dVar.f460714i) {
            dVar.f460710e.R(configuration);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        android.view.ViewGroup.LayoutParams layoutParams = onCreateView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        onCreateView.setLayoutParams(layoutParams);
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onDestroy] activity:%s isForeground:%s isFinishing:%s", this.f198151e, java.lang.Boolean.valueOf(this.f198152f.f460714i), java.lang.Boolean.valueOf(isFinishing()));
        p0(512, new com.tencent.mm.ui.chatting.h1(this));
        t0();
        P0();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        u0();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onDragBegin() {
        this.f198152f.f460710e.T();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return this.f198152f.f460710e.d0(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onPause] activity:%s isForeground:%s isFinishing:%s isExiting:%s", this.f198151e, java.lang.Boolean.valueOf(this.f198152f.f460714i), java.lang.Boolean.valueOf(isFinishing()), java.lang.Boolean.valueOf(H0()));
        l0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        this.f198152f.f460710e.h0(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onResume] activity:%s isForeground:%s isFinishing:%s", this.f198151e, java.lang.Boolean.valueOf(this.f198152f.f460714i), java.lang.Boolean.valueOf(isFinishing()));
        m0();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStart] activity:%s isForeground:%s isFinishing:%s", this.f198151e, java.lang.Boolean.valueOf(this.f198152f.f460714i), java.lang.Boolean.valueOf(isFinishing()));
        n0();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s isForeground:%s isFinishing:%s isEntering:%s", this.f198151e, java.lang.Boolean.valueOf(this.f198152f.f460714i), java.lang.Boolean.valueOf(isFinishing()), java.lang.Boolean.valueOf(G0()));
        o0();
    }

    public final void p0(int i17, java.lang.Runnable runnable) {
        boolean z17 = false;
        if ((4 != i17 || !J0(2)) && ((8 != i17 || !J0(4)) && ((16 != i17 || !J0(8)) && ((32 != i17 || !J0(4)) && ((64 != i17 || !J0(2)) && (512 != i17 || !J0(256))))))) {
            z17 = true;
        }
        boolean J0 = J0(i17);
        if (!J0 || !z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment", "catch! [check] %s flag:%x isNever:%s isStrict:%s", this.f198151e, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(J0), java.lang.Boolean.valueOf(z17));
            return;
        }
        this.f198160q |= i17;
        if (2 == i17) {
            q0(64);
        } else if (64 == i17) {
            q0(2);
        } else if (4 == i17) {
            q0(32);
        } else if (32 == i17) {
            q0(4);
        } else if (8 == i17) {
            q0(16);
        } else if (16 == i17) {
            q0(8);
        } else if (128 == i17) {
            q0(256);
        } else if (256 == i17) {
            q0(128);
        } else if (512 == i17) {
            q0(1024);
        } else if (1024 == i17) {
            q0(512);
        }
        runnable.run();
    }

    public final void q0(int i17) {
        this.f198160q = (~i17) & this.f198160q;
    }

    public void r0(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[doAttach] activity:%s isPreLoaded:%b", this.f198151e, java.lang.Boolean.valueOf(this.f198155i));
    }

    public void s0() {
        p0(2, new com.tencent.mm.ui.chatting.i1(this));
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        if (this.isCurrentActivity) {
            return false;
        }
        gm0.j1.i();
        if (!zo.e.e(((km0.c) gm0.j1.p().a()).f308989c)) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseChattingUIFragment", "Running on a Chromebook, so we not support swipeback and so on");
        return false;
    }

    public void t0() {
        p0(64, new com.tencent.mm.ui.chatting.n1(this));
    }

    public void u0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[doDetach] activity:%s isPreLoaded:%b", this.f198151e, java.lang.Boolean.valueOf(this.f198155i));
        for (java.util.Map.Entry entry : this.f198152f.f460708c.f201962a.entrySet()) {
            if (entry.getValue() instanceof com.tencent.mm.ui.chatting.component.hg) {
                ((com.tencent.mm.ui.chatting.component.hg) entry.getValue()).I();
            }
        }
    }

    public void w0() {
        p0(16, new com.tencent.mm.ui.chatting.l1(this));
    }

    public void x0() {
        p0(8, new com.tencent.mm.ui.chatting.k1(this));
    }

    public void y0(boolean z17, int i17) {
    }

    public abstract sb5.z z0();

    public BaseChattingUIFragment(boolean z17) {
        super(z17);
        this.f198152f = new yb5.d(this, this, this);
        this.f198153g = new com.tencent.mm.ui.chatting.component.y4();
        this.f198154h = new com.tencent.mm.ui.chatting.component.w3();
        this.f198155i = false;
        this.f198156m = false;
        this.f198160q = 0;
        V0();
    }
}
