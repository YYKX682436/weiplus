package yb5;

/* loaded from: classes9.dex */
public final class d implements yn.f {
    public static final com.tencent.mm.sdk.platformtools.n3 A = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f460706a = new yb5.o();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o3 f460707b = new yb5.p();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.manager.c f460708c = new com.tencent.mm.ui.chatting.manager.c(this);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.manager.e f460709d = new com.tencent.mm.ui.chatting.manager.e(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.g7 f460710e = new com.tencent.mm.ui.chatting.component.g7();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f460711f;

    /* renamed from: g, reason: collision with root package name */
    public final yb5.t f460712g;

    /* renamed from: h, reason: collision with root package name */
    public final yb5.k f460713h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f460714i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f460715j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f460716k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.BaseChattingUIFragment f460717l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.fb f460718m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gb f460719n;

    /* renamed from: o, reason: collision with root package name */
    public int f460720o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f460721p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460722q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f460723r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f460724s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f460725t;

    /* renamed from: u, reason: collision with root package name */
    public final yb5.l f460726u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f460727v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f460728w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f460729x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f460730y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f460731z;

    public d(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment, com.tencent.mm.ui.chatting.fb fbVar, com.tencent.mm.ui.chatting.gb gbVar) {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChattingContextCheck()) == 1;
        this.f460711f = z17;
        this.f460712g = z17 ? yb5.f.f460733a : yb5.s.f460747a;
        this.f460713h = new yb5.k(this);
        this.f460714i = false;
        this.f460721p = false;
        this.f460724s = true;
        this.f460725t = false;
        this.f460726u = new yb5.l();
        this.f460727v = true;
        this.f460728w = false;
        this.f460729x = false;
        this.f460730y = false;
        this.f460731z = new java.util.concurrent.ConcurrentLinkedQueue();
        new yb5.c(this);
        this.f460717l = baseChattingUIFragment;
        this.f460718m = fbVar;
        this.f460719n = gbVar;
    }

    public boolean A() {
        return com.tencent.mm.storage.z3.z3(x());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if ((r0 instanceof com.tencent.mm.pluginsdk.ui.tools.z3 ? ((com.tencent.mm.pluginsdk.ui.tools.z3) r0).getHasControlMoveDown() : false) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B() {
        /*
            r4 = this;
            int r0 = com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView.f191436i
            com.tencent.mm.ui.chatting.fb r0 = r4.f460718m
            com.tencent.mm.ui.chatting.ChattingUIFragment r0 = (com.tencent.mm.ui.chatting.ChattingUIFragment) r0
            com.tencent.mm.pluginsdk.ui.tools.v3 r0 = r0.f198269t
            r1 = 0
            if (r0 != 0) goto Lc
            goto L3c
        Lc:
            int r2 = com.tencent.mm.pluginsdk.ui.tools.f7.a(r0)
            r3 = 1
            if (r2 != 0) goto L15
            r2 = r3
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L23
            boolean r2 = r0 instanceof com.tencent.mm.pluginsdk.ui.tools.z3
            if (r2 == 0) goto L32
            r2 = r0
            com.tencent.mm.pluginsdk.ui.tools.z3 r2 = (com.tencent.mm.pluginsdk.ui.tools.z3) r2
            r2.setHasControlMoveDown(r1)
            goto L32
        L23:
            boolean r2 = r0 instanceof com.tencent.mm.pluginsdk.ui.tools.z3
            if (r2 == 0) goto L2f
            r2 = r0
            com.tencent.mm.pluginsdk.ui.tools.z3 r2 = (com.tencent.mm.pluginsdk.ui.tools.z3) r2
            boolean r2 = r2.getF191437e()
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 != 0) goto L33
        L32:
            r1 = r3
        L33:
            boolean r2 = r0 instanceof com.tencent.mm.pluginsdk.ui.tools.z3
            if (r2 == 0) goto L3c
            com.tencent.mm.pluginsdk.ui.tools.z3 r0 = (com.tencent.mm.pluginsdk.ui.tools.z3) r0
            r0.getF191437e()
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.d.B():boolean");
    }

    public boolean C() {
        java.lang.String x17 = x();
        return com.tencent.mm.storage.z3.R4(x17) || com.tencent.mm.storage.z3.q4(x17);
    }

    public boolean D() {
        this.f460712g.a("isGroupChat");
        return com.tencent.mm.storage.z3.R4(x()) || com.tencent.mm.storage.z3.q4(x()) || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f460708c.a(sb5.f.class))).f198754s;
    }

    public boolean E() {
        return ((java.lang.Boolean) ((jz5.n) this.f460713h.f460739c).getValue()).booleanValue();
    }

    public boolean F() {
        return !(u().k2() || com.tencent.mm.storage.z3.y4(x()) || com.tencent.mm.storage.z3.G4(x())) || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f460708c.a(sb5.f.class))).f198753r;
    }

    public boolean G() {
        java.lang.String x17 = x();
        return com.tencent.mm.storage.z3.H3(x17) || com.tencent.mm.storage.z3.s4(x17) || com.tencent.mm.storage.z3.G4(x17) || com.tencent.mm.storage.z3.e4(x17);
    }

    public boolean H() {
        if (!this.f460717l.getBooleanExtra("Chat_Readonly", false).booleanValue()) {
            java.lang.String x17 = x();
            if ((android.text.TextUtils.isEmpty(x17) || x17.contains(",")) ? false : true) {
                return false;
            }
        }
        return true;
    }

    public boolean I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[isShowDialog]");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).f198270u;
        return u3Var != null && u3Var.isShowing();
    }

    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[notifyDataSetChange]");
        sb5.z zVar = ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).f198268s;
        if (zVar == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.adapter.k) zVar).h(null);
    }

    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[scrollToLast]0");
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m;
        chattingUIFragment.getClass();
        chattingUIFragment.f1(false, android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), true);
    }

    public void L(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[scrollToLast]1 force:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m;
        chattingUIFragment.getClass();
        chattingUIFragment.f1(z17, android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), true);
    }

    public void M(boolean z17, boolean z18, boolean z19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[scrollToLast]3 force:%b", java.lang.Boolean.valueOf(z17));
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).f1(z17, z18, z19);
    }

    public void N(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[scrollToLastImmediately]");
        M(z17, android.os.Looper.getMainLooper() != android.os.Looper.myLooper(), false);
    }

    public void O(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[scrollToPosition] position:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m;
        yb5.d dVar = chattingUIFragment.f198152f;
        (dVar.f460711f ? dVar.f460707b : A).removeCallbacks(chattingUIFragment.f198275z);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[scrollToPosition] scroll to pos:%d", java.lang.Integer.valueOf(i17));
        chattingUIFragment.B.getListView().smoothScrollToPositionFromTop(i17 + chattingUIFragment.f198269t.getHeaderViewsCount(), 0, 0);
    }

    public void P(boolean z17) {
        ke5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "trace setFocused, isFocused %s, isSwitchMenu %s, needUpdateUI %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f460729x), java.lang.Boolean.valueOf(this.f460728w));
        if (this.f460729x) {
            return;
        }
        this.f460727v = z17;
        if (z17 && this.f460728w) {
            this.f460728w = false;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f460731z;
            com.tencent.mm.ui.chatting.fb fbVar = this.f460718m;
            if (fbVar != null) {
                java.util.LinkedList<hd5.n> linkedList = new java.util.LinkedList();
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                hd5.n nVar = null;
                while (it.hasNext()) {
                    hd5.n nVar2 = (hd5.n) it.next();
                    if (nVar2 != nVar) {
                        linkedList.add(nVar2);
                        nVar = nVar2;
                    }
                }
                for (hd5.n nVar3 : linkedList) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[setFocused] replay action=%s", nVar3);
                    sb5.z zVar = ((com.tencent.mm.ui.chatting.ChattingUIFragment) fbVar).f198268s;
                    if (zVar != null && (f0Var = ((com.tencent.mm.ui.chatting.adapter.k) zVar).Z) != null) {
                        f0Var.b(nVar3, false);
                    }
                }
            }
            concurrentLinkedQueue.clear();
        }
    }

    public void Q(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[setKeepScreenOn] force:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).f198269t;
        if (v3Var != null) {
            v3Var.setKeepScreenOn(z17);
        }
    }

    public void R(int i17) {
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).f198269t.setVisibility(i17);
        if (com.tencent.mars.xlog.Log.getLogLevel() == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setListViewVisibility] visibility:");
            sb6.append(i17);
            sb6.append(" stack:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", sb6.toString());
        }
    }

    public void S(com.tencent.mm.storage.z3 z3Var, java.lang.String str) {
        this.f460706a.removeCallbacksAndMessages(null);
        this.f460715j = z3Var;
        if (str != null && !str.isEmpty()) {
            java.lang.String d17 = z3Var.d1();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "Override session id %s %s, %s", d17, str, new com.tencent.mm.sdk.platformtools.z3());
            this.f460722q = str;
            return;
        }
        java.lang.String a17 = com.tencent.mm.ui.l2.a(z3Var.d1());
        java.lang.String d18 = z3Var.d1();
        java.lang.String str2 = this.f460722q;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "Generate session id %s %s -> %s, %s", d18, str2, a17, new com.tencent.mm.sdk.platformtools.z3());
        this.f460722q = a17;
    }

    public void T(int i17, boolean z17, boolean z18, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[setSelection] pos:%s isSmooth:%s isIdleVisible:%s topOffset:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i18));
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m;
        yb5.d dVar = chattingUIFragment.f198152f;
        (dVar.f460711f ? dVar.f460707b : A).removeCallbacks(chattingUIFragment.f198275z);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[setSelection] pos:%d isSmooth:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        chattingUIFragment.f198269t.f().setTag(com.tencent.mm.R.id.bke, java.lang.Boolean.FALSE);
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = chattingUIFragment.f198269t;
        if (v3Var == null) {
            return;
        }
        if ((v3Var.getFirstVisiblePosition() < i17 && i17 < v3Var.getLastVisiblePosition()) && z18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ScrollController", "setSelection position %s smooth %s topOffset:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        v3Var.setItemChecked(i17, true);
        if (!z17 || com.tencent.mm.pluginsdk.ui.tools.f7.c(v3Var, i17)) {
            v3Var.setSelectionFromTop(i17, i18);
        } else {
            v3Var.smoothScrollToPositionFromTop(i17, i18, 200);
        }
    }

    public void U(int i17, int i18, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[setSelectionFromTop] pos:%s offset:%s isSmooth:%s isIdleVisible:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m;
        yb5.d dVar = chattingUIFragment.f198152f;
        (dVar.f460711f ? dVar.f460707b : A).removeCallbacks(chattingUIFragment.f198275z);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[setSelectionFromTop] pos:%d offset:%s isSmooth:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        if (!dVar.f460721p) {
            com.tencent.mm.pluginsdk.ui.tools.f7.b(chattingUIFragment.f198269t, i17, i18, z17, z18);
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = chattingUIFragment.f198269t;
        if (v3Var == null) {
            return;
        }
        if (v3Var.getFirstVisiblePosition() < i17 && i17 < v3Var.getLastVisiblePosition()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromToInnerSearch position %s smooth %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        v3Var.setItemChecked(i17, true);
        if (!fp.h.b(11) || com.tencent.mm.pluginsdk.ui.tools.f7.c(v3Var, i17)) {
            v3Var.setSelectionFromTop(i17, i18);
        } else {
            v3Var.smoothScrollToPositionFromTop(i17, i18, 200);
        }
    }

    public void V(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "trace setSwitchMenu, isSwitchMenu %s", java.lang.Boolean.valueOf(z17));
        this.f460729x = z17;
    }

    public void W(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[showDialog]");
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m;
        chattingUIFragment.a1();
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        chattingUIFragment.f198270u = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
    }

    public void X(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d show:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        this.f460718m.showOptionMenu(i17, z17);
    }

    public void Y(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[showOptionMenu] show:%s", java.lang.Boolean.valueOf(z17));
        this.f460718m.showOptionMenu(z17);
    }

    public void Z(int i17, int i18, java.lang.String content, long j17) {
        yj5.a aVar;
        java.util.Iterator it = ((vb5.l) ((vb5.m) this.f460708c.a(vb5.m.class))).f434859h.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            } else {
                aVar = (yj5.a) it.next();
                if (kotlin.jvm.internal.o.b(aVar.getClass(), yj5.a0.class)) {
                    break;
                }
            }
        }
        yj5.a0 a0Var = (yj5.a0) aVar;
        a0Var.getClass();
        kotlin.jvm.internal.o.g(content, "content");
        a0Var.f462704f = new xj5.l(i17, i18, content, c01.id.c() + j17);
        a0Var.o0();
    }

    public yn.e a(java.lang.Class cls) {
        return this.f460708c.a(cls);
    }

    public void a0(android.content.Intent intent) {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f460717l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/context/ChattingContext", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/context/ChattingContext", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[dismissDialog]");
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).a1();
    }

    public void b0() {
        this.f460712g.b();
    }

    public android.view.View c(int i17) {
        return this.f460717l.findViewById(i17);
    }

    public boolean d() {
        return this.f460717l.W0();
    }

    public com.tencent.mm.ui.ga e() {
        return this.f460717l.getController();
    }

    public android.view.View f(int i17) {
        return ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) this.f460718m).C0().getChildAt(i17);
    }

    public android.app.Activity g() {
        return this.f460717l.getContext();
    }

    public ke5.f0 h() {
        return this.f460717l.B0();
    }

    public com.tencent.mm.sdk.coroutines.LifecycleScope i() {
        return ((sb5.f0) this.f460708c.a(sb5.f0.class)).A();
    }

    public int j() {
        return this.f460718m.getFirstVisiblePosition();
    }

    public int k() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f460717l;
        int intExtra = baseChattingUIFragment.getIntExtra("chat_from_scene", 0);
        if (intExtra != 0) {
            return intExtra;
        }
        int intExtra2 = baseChattingUIFragment.getIntExtra("specific_chat_from_scene", 0);
        if (intExtra2 == 7) {
            return 13;
        }
        return intExtra2;
    }

    public com.tencent.mm.ui.chatting.db l() {
        if (g() instanceof com.tencent.mm.ui.chatting.ChattingUI) {
            return (com.tencent.mm.ui.chatting.db) ((com.tencent.mm.ui.chatting.q8) ((com.tencent.mm.ui.chatting.ChattingUI) g()).f198262s).get();
        }
        return null;
    }

    public int m() {
        return ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) this.f460718m).C0().getHeaderViewsCount();
    }

    public android.content.Intent n() {
        return this.f460717l.getIntent();
    }

    public int o() {
        return ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) this.f460718m).C0().getLastVisiblePosition();
    }

    public com.tencent.mm.pluginsdk.ui.tools.v3 p() {
        return ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f460718m).f198269t;
    }

    public com.tencent.mm.sdk.platformtools.n3 q() {
        return this.f460711f ? this.f460706a : A;
    }

    public java.lang.String r() {
        java.lang.String str = this.f460723r;
        return str != null ? str : "";
    }

    public android.content.res.Resources s() {
        return this.f460717l.getMMResources();
    }

    public java.lang.String t() {
        if (this.f460716k == null) {
            this.f460716k = c01.z1.r();
            this.f460716k = com.tencent.mm.storage.z3.H3(x()) ? com.tencent.mm.storage.z3.Y4(this.f460716k) : this.f460716k;
        }
        return this.f460716k;
    }

    public com.tencent.mm.storage.z3 u() {
        this.f460712g.a("getTalker");
        return this.f460715j;
    }

    public yb5.q v() {
        return new yb5.q(x(), w(), u(), D(), A());
    }

    public java.lang.String w() {
        this.f460712g.a("getTalkerNickName");
        java.lang.String E0 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f460708c.a(sb5.f.class))).E0();
        java.lang.String P0 = u().P0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return E0 == null ? P0 : E0;
    }

    public java.lang.String x() {
        if (u() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingContext", "getTalker returns null.");
            return "";
        }
        java.lang.String d17 = u().d1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return d17 == null ? "" : d17;
    }

    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[hideVKB]");
        this.f460718m.hideVKB();
    }

    public void z(java.lang.Class cls, yn.e eVar) {
        com.tencent.mm.ui.chatting.manager.c cVar = this.f460708c;
        if (cVar.f201962a.put(cls, eVar) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingComponentManager", "[register] %s has register", cls);
        }
        boolean z17 = eVar instanceof com.tencent.mm.ui.chatting.component.hg;
        yb5.d dVar = cVar.f201963b;
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((com.tencent.mm.ui.chatting.component.hg) eVar).L(dVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingComponentManager", "[install] listener:%s cost:%sms", eVar.getClass().getName(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        if (eVar instanceof yn.m) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            ((yn.m) eVar).n(dVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingComponentManager", "[install] outlistener:%s cost:%sms", eVar.getClass().getName(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }
    }
}
