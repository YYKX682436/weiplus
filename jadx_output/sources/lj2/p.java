package lj2;

/* loaded from: classes10.dex */
public class p implements ai2.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f318908a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f318909b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f318910c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f318911d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f318912e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f318913f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f318914g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f318915h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f318916i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.r2 f318917j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f318918k;

    public p(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f318908a = root;
        this.f318909b = "MultiBattleResultBarWidget_" + hashCode();
        this.f318910c = "finder_live_pk_result_win.pag";
        this.f318911d = "finder_live_pk_result_win_en.pag";
        this.f318912e = "finder_live_pk_result_win_streak.pag";
        this.f318913f = "finder_live_pk_result_win_streak_en.pag";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.eoi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f318914g = (com.tencent.mm.view.MMPAGView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.eog);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f318915h = textView;
        this.f318918k = kotlinx.coroutines.z0.b();
        textView.setTextSize(1, 24.0f);
        zl2.r4.f473950a.b3(textView);
    }

    public final void a(java.lang.String userName, java.lang.String userId) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(userId, "userId");
        this.f318916i = userId;
        com.tencent.mars.xlog.Log.i(this.f318909b, "onBind userName: " + userName + " userId: " + userId);
        reset();
    }

    @Override // ai2.a
    public android.view.View h() {
        return this.f318908a;
    }

    @Override // ai2.a
    public void i(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f318909b, "battleStart withAnim:" + z17);
        this.f318914g.setVisibility(8);
        this.f318915h.setVisibility(8);
    }

    @Override // ai2.a
    public void j(boolean z17, dk2.u4 u4Var) {
        km2.k kVar;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mars.xlog.Log.i(this.f318909b, "battleEnd bindCurrentUserSdkId: " + this.f318916i + " curBattle:" + u4Var);
        jz5.f0 f0Var = null;
        if (u4Var != null) {
            java.util.List list = u4Var.f234163j;
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    if (((r45.r22) obj3).getInteger(2) == 1) {
                        arrayList.add(obj3);
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.LinkedList list2 = ((r45.r22) it.next()).getList(0);
                kotlin.jvm.internal.o.f(list2, "getMembers(...)");
                synchronized (list2) {
                    java.util.Iterator it6 = list2.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(1), this.f318916i)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                }
                r45.wk6 wk6Var = (r45.wk6) obj;
                if (wk6Var != null) {
                    java.util.List list3 = u4Var.f234159f;
                    synchronized (list3) {
                        java.util.Iterator it7 = list3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj2 = it7.next();
                                if (kotlin.jvm.internal.o.b(((km2.k) obj2).f309114a, wk6Var.getString(0))) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                    }
                    kVar = (km2.k) obj2;
                    if (kVar != null) {
                        break;
                    }
                }
            }
        }
        kVar = null;
        if (kVar != null) {
            int i17 = kVar.f309117d;
            java.lang.String str = i17 > 1 ? com.tencent.mm.sdk.platformtools.m2.j() ? this.f318912e : this.f318913f : com.tencent.mm.sdk.platformtools.m2.j() ? this.f318910c : this.f318911d;
            com.tencent.mars.xlog.Log.i(this.f318909b, "battleEnd pagRes:" + str + ", winningStreakCount:" + i17);
            this.f318915h.setVisibility(8);
            this.f318908a.setVisibility(0);
            if (!(str == null || str.length() == 0)) {
                ym5.l2 l2Var = ym5.l2.f463424a;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                this.f318914g.o(ae2.in.f3688a.a(ym5.f6.Q));
                kotlinx.coroutines.r2 r2Var = this.f318917j;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                this.f318917j = kotlinx.coroutines.l.d(this.f318918k, null, null, new lj2.o(str, this, null), 3, null);
                this.f318914g.setVisibility(0);
                if (i17 > 1) {
                    this.f318915h.setVisibility(0);
                    this.f318915h.setText("x" + i17);
                    this.f318915h.setAlpha(0.0f);
                    this.f318915h.animate().alpha(1.0f).setListener(null).setDuration(500L).setInterpolator(new android.view.animation.AccelerateInterpolator()).setStartDelay(500L).start();
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f318914g.setVisibility(8);
            this.f318915h.setVisibility(8);
        }
    }

    @Override // ai2.a
    public void reset() {
        com.tencent.mars.xlog.Log.i(this.f318909b, "reset");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f318914g;
        mMPAGView.n();
        mMPAGView.setVisibility(8);
        this.f318915h.setVisibility(8);
        this.f318908a.setVisibility(8);
        kotlinx.coroutines.r2 r2Var = this.f318917j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f318917j = null;
    }
}
