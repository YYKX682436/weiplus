package rb5;

/* loaded from: classes11.dex */
public class l implements wn.t, al5.z2 {
    public android.graphics.Bitmap C;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f393880d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.app.b f393881e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChattingUIFragment f393882f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.ChattingUIProxy f393883g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f393884h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.TestTimeForChatting f393885i;

    /* renamed from: m, reason: collision with root package name */
    public int f393886m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f393888o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f393889p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f393890q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f393891r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f393892s;

    /* renamed from: w, reason: collision with root package name */
    public wn.r f393896w;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Class f393899z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f393887n = false;

    /* renamed from: t, reason: collision with root package name */
    public rb5.k f393893t = rb5.k.ACTIVITY_CREATE;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f393894u = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f393895v = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public int f393897x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f393898y = false;
    public final java.lang.Runnable A = new rb5.c(this);
    public final db5.x8 B = new rb5.f(this);

    public l(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f393880d = mMActivity;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = new com.tencent.mm.ui.chatting.ChattingUIFragment();
        this.f393882f = chattingUIFragment;
        this.f393883g = new com.tencent.mm.ui.chatting.ChattingUIProxy(mMActivity, chattingUIFragment);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(rb5.l r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb5.l.a(rb5.l, boolean):void");
    }

    public void b() {
        this.f393887n = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = this.f393885i;
        objArr[0] = java.lang.Boolean.valueOf(testTimeForChatting != null && testTimeForChatting.isShown());
        com.tencent.mars.xlog.Log.i("ChattingCompat", "try closeChatting, isShown:%b", objArr);
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f393882f;
        if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
            al5.a3.c(this);
        }
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2 = this.f393885i;
        if (testTimeForChatting2 == null || testTimeForChatting2.getVisibility() == 8 || this.f393882f == null) {
            return;
        }
        java.util.Iterator it = this.f393895v.iterator();
        while (it.hasNext()) {
            if (!((wn.q) it.next()).c3()) {
                it.remove();
            }
        }
        this.f393885i.setVisibility(8);
        android.widget.ImageView imageView = (android.widget.ImageView) d().getDecorView().findViewById(com.tencent.mm.R.id.l3_);
        if (imageView != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            com.tencent.mars.xlog.Log.i("ChattingCompat", "[closeChatting] prepareView GONE");
            if (imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "closeChatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "closeChatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        java.lang.Class cls = this.f393899z;
        if (cls != null && this.f393882f.f198152f.f460708c.f201962a.containsKey(cls)) {
            yn.e eVar = (yn.e) this.f393882f.f198152f.f460708c.f201962a.get(this.f393899z);
            if (eVar != null && (eVar instanceof com.tencent.mm.ui.chatting.component.hg)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((com.tencent.mm.ui.chatting.component.hg) eVar).I();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingComponentManager", "[unInstall] listener:%s cost:%sms", eVar.getClass().getName(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            this.f393899z = null;
        }
        com.tencent.mm.ui.chatting.ChattingUIProxy chattingUIProxy = this.f393883g;
        chattingUIProxy.onExitBegin();
        chattingUIProxy.onExitEnd();
        this.f393885i.setVisibility(8);
        onSwipe(1.0f);
        m();
        this.f393880d.getController().G0(this.f393897x);
    }

    public boolean c(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            this.f393894u.removeCallbacks(this.A);
        }
        if (this.f393888o) {
            return true;
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f393882f;
        return chattingUIFragment != null && chattingUIFragment.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final android.view.Window d() {
        return this.f393880d.getWindow();
    }

    public void e() {
        this.f393880d.initNavigationSwipeBack();
    }

    public boolean f(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        if ((i17 != 2001 && i17 != 30763 && i17 != 226 && i17 != 30762 && i17 != 1111) || (chattingUIFragment = this.f393882f) == null) {
            return false;
        }
        chattingUIFragment.onActivityResult(i17, i18, intent);
        return true;
    }

    @Override // al5.z2
    public boolean forceRemoveNoMatchOnPath() {
        return false;
    }

    public void g() {
        d().setBackgroundDrawableResource(com.tencent.mm.R.color.f478553an);
        this.f393881e = al5.p0.N(this.f393880d.getSupportActionBar());
        e();
        if (this.f393898y) {
            android.os.Looper.myQueue().addIdleHandler(new rb5.b(this));
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f393882f;
        if (chattingUIFragment == null || !chattingUIFragment.f198152f.f460714i) {
            com.tencent.mars.xlog.Log.w("ChattingCompat", "[initActionBar] isChattingForeground False!");
            android.view.View inflate = com.tencent.mm.ui.id.b(this.f393880d).inflate(com.tencent.mm.R.layout.b_, (android.view.ViewGroup) null);
            com.tencent.mm.ui.j jVar = new com.tencent.mm.ui.j(inflate);
            this.f393881e.I(new android.graphics.drawable.ColorDrawable(this.f393880d.getResources().getColor(android.R.color.transparent)));
            this.f393881e.F(false);
            this.f393881e.B(false);
            this.f393881e.E(false);
            this.f393881e.D(true);
            this.f393881e.y(inflate);
            this.f393880d.getController().H = jVar.f208971d;
            jVar.c(new rb5.h(this));
        } else {
            com.tencent.mars.xlog.Log.w("ChattingCompat", "[initActionBar] isChattingForeground True!");
        }
        this.f393881e.L();
        o25.n1.c(this.f393880d);
    }

    public void h() {
        d().setFormat(-2);
        o25.n1.f(this.f393880d);
        this.f393880d.customfixStatusbar(true);
    }

    public void i() {
        android.graphics.Bitmap bitmap = this.C;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("ChattingCompat", "bitmap recycle %s", this.C.toString());
            this.C.recycle();
        }
        this.f393889p = false;
        this.f393895v.clear();
        this.f393894u.removeCallbacksAndMessages(null);
        this.f393880d = null;
        this.f393882f = null;
        this.f393885i = null;
        this.f393884h = null;
    }

    public void j() {
        this.f393893t = rb5.k.ACTIVITY_RESUME;
        onSwipe(1.0f);
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f393882f;
        if ((chattingUIFragment != null && chattingUIFragment.f198152f.f460714i) || !this.f393889p) {
            return;
        }
        java.lang.String str = this.f393890q;
        android.os.Bundle bundle = this.f393892s;
        this.f393890q = str;
        this.f393892s = bundle;
        this.f393889p = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f393894u;
        java.lang.Runnable runnable = this.A;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }

    public final void k(boolean z17, int i17) {
        if (db5.f.g() && ep.a.a()) {
            android.view.View findViewById = this.f393880d.findViewById(com.tencent.mm.R.id.huh);
            if (findViewById == null) {
                com.tencent.mars.xlog.Log.e("ChattingCompat", "[onSettle] null == container");
                return;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) this.f393880d.findViewById(com.tencent.mm.R.id.l3_);
            if (imageView != null && imageView.getVisibility() == 8 && imageView.getDrawable() != null) {
                imageView.setVisibility(0);
                com.tencent.mars.xlog.Log.i("ChattingCompat", "[onSettle] prepareView VISIBLE");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView == null || imageView.getVisibility() != 0) {
                if (z17) {
                    com.tencent.mm.ui.tools.l5.a(findViewById, i17 > 0 ? 130L : 230L, 0.0f, 0.0f, null);
                    return;
                } else {
                    com.tencent.mm.ui.tools.l5.a(findViewById, i17 > 0 ? 130L : 230L, (findViewById.getWidth() * (-1)) / 2.5f, 0.0f, null);
                    return;
                }
            }
            if (z17) {
                com.tencent.mm.ui.tools.l5.a(imageView, i17 > 0 ? 130L : 230L, 0.0f, 0.0f, null);
            } else {
                com.tencent.mm.ui.tools.l5.a(imageView, i17 > 0 ? 130L : 230L, (imageView.getWidth() * (-1)) / 2.5f, 0.0f, null);
            }
        }
    }

    public void l(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, wn.q qVar) {
        if (qVar != null) {
            this.f393895v.add(qVar);
        }
        this.f393890q = str;
        this.f393891r = str2;
        this.f393892s = bundle;
        this.f393889p = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f393894u;
        java.lang.Runnable runnable = this.A;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }

    public final void m() {
        if (db5.f.g() && ep.a.a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f393882f == null);
            com.tencent.mars.xlog.Log.i("ChattingCompat", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f393882f;
            if (chattingUIFragment != null) {
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = chattingUIFragment.getSwipeBackLayout();
                swipeBackLayout.f211441v = false;
                swipeBackLayout.F = false;
            }
        }
    }

    @Override // al5.z2
    public void onSettle(boolean z17, int i17, boolean z18) {
        if (z18) {
            k(z17, i17);
        }
    }

    @Override // al5.z2
    public void onSwipe(float f17) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        android.widget.ImageView imageView;
        android.view.ViewGroup viewGroup;
        if (db5.f.g() && ep.a.a() && (chattingUIFragment = this.f393882f) != null) {
            if (f17 == 0.0f && !this.f393887n) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) d().getDecorView().findViewById(com.tencent.mm.R.id.l3_);
                if (imageView2 != null && (viewGroup = (android.view.ViewGroup) imageView2.getTag()) != null) {
                    com.tencent.mars.xlog.Log.i("ChattingCompat", "[onSwipe] prepareView GONE");
                    viewGroup.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView2.setImageDrawable(null);
                }
                android.view.animation.Animation animation = this.f393884h;
                if (animation != null) {
                    animation.cancel();
                }
            } else if (f17 == 1.0f && !this.f393887n && chattingUIFragment.isSupportNavigationSwipeBack() && (imageView = (android.widget.ImageView) d().getDecorView().findViewById(com.tencent.mm.R.id.l3_)) != null && imageView.getVisibility() == 0 && imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i("ChattingCompat", "[onSwipe] prepareView GONE");
                imageView.setVisibility(8);
            }
            if (rb5.k.ACTIVITY_RESUME != this.f393893t && java.lang.Float.compare(1.0f, f17) > 0) {
                com.tencent.mars.xlog.Log.i("ChattingCompat", "[onSwipe] return! consumedSuperCall:%s", java.lang.Float.valueOf(f17));
                return;
            }
            android.view.View findViewById = this.f393880d.findViewById(com.tencent.mm.R.id.huh);
            android.widget.ImageView imageView3 = (android.widget.ImageView) this.f393880d.findViewById(com.tencent.mm.R.id.l3_);
            if (imageView3 != null && imageView3.getVisibility() == 8 && imageView3.getDrawable() != null && !this.f393887n && f17 != 1.0f && f17 != 0.0f) {
                imageView3.setVisibility(0);
                com.tencent.mars.xlog.Log.i("ChattingCompat", "[onSwipe] !1 && !0 prepareView VISIBLE");
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (java.lang.Float.compare(1.0f, f17) <= 0) {
                com.tencent.mm.ui.tools.l5.c(findViewById, 0.0f, 0.0f);
                if (imageView3 == null || imageView3.getDrawable() == null) {
                    return;
                }
                com.tencent.mm.ui.tools.l5.c(imageView3, 0.0f, 0.0f);
                return;
            }
            if (imageView3 == null || imageView3.getDrawable() == null) {
                com.tencent.mm.ui.tools.l5.c(findViewById, (findViewById.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            } else {
                com.tencent.mm.ui.tools.l5.c(imageView3, (imageView3.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            }
        }
    }
}
