package k13;

/* loaded from: classes10.dex */
public final class l1 extends k13.g implements i50.r {
    public static final k13.n0 I = new k13.n0(null);

    /* renamed from: J, reason: collision with root package name */
    public static final jz5.g f303234J = jz5.h.b(k13.m0.f303250d);
    public boolean E;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager f303235m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f303236n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f303237o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f303238p;

    /* renamed from: y, reason: collision with root package name */
    public android.media.MediaPlayer f303247y;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f303239q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f303240r = jz5.h.b(k13.f1.f303209d);

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f303241s = jz5.h.b(k13.g1.f303217d);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f303242t = jz5.h.b(new k13.q0(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f303243u = jz5.h.b(new k13.s0(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f303244v = jz5.h.b(new k13.k1(this));

    /* renamed from: w, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f303245w = k13.p0.f303257d;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f303246x = jz5.h.b(new k13.j1(this));

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f303248z = new k13.r0(this);
    public final java.lang.Runnable A = new k13.d1(this);
    public final java.lang.Runnable B = new k13.e1(this);
    public final java.lang.Runnable C = new k13.i1(this);
    public final java.lang.Runnable D = new k13.a1(this);
    public int G = Integer.MAX_VALUE;
    public final k13.t0 H = new k13.t0(this);
    public final java.lang.Runnable F = new k13.l0(this);

    public l1(kotlin.jvm.internal.i iVar) {
    }

    public static final void d(k13.l1 l1Var, java.lang.String str) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        int i17;
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(l1Var.b())) {
            com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "removeMsgItem no permission, return");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = l1Var.f303239q;
        java.util.Iterator it = arrayList2.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (kotlin.jvm.internal.o.b(((i13.c) next).f287275d, str)) {
                arrayList.add(java.lang.Integer.valueOf(i18));
            }
            i18 = i19;
        }
        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "removeMsgItem id=" + str + " delete size = " + arrayList.size());
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            if (intValue < arrayList2.size()) {
                com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager = l1Var.f303235m;
                if ((stackLayoutManager != null && intValue == stackLayoutManager.n()) && (i17 = intValue + 1) < arrayList2.size()) {
                    l1Var.p(i17);
                } else {
                    if (intValue < 0 || intValue >= arrayList2.size()) {
                        return;
                    }
                    java.lang.Object remove = arrayList2.remove(intValue);
                    kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                    ((i13.c) remove).o();
                    if (l1Var.j()) {
                        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "removeMsgItem id=" + str + " list empty, hide");
                        ((ku5.t0) ku5.t0.f312615d).B(new k13.c(l1Var));
                    } else {
                        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "removeMsgItem id=" + str + " remove from recyclerView");
                        androidx.recyclerview.widget.RecyclerView recyclerView = l1Var.f303236n;
                        if (recyclerView != null && (adapter2 = recyclerView.getAdapter()) != null) {
                            adapter2.notifyItemRemoved(intValue);
                        }
                        androidx.recyclerview.widget.RecyclerView recyclerView2 = l1Var.f303236n;
                        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                            adapter.notifyItemRangeChanged(intValue, arrayList2.size() - intValue);
                        }
                    }
                }
            }
        }
    }

    public static final void e(k13.l1 l1Var) {
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) l1Var.f303241s).getValue()).removeCallbacks(l1Var.f303248z);
        l1Var.o(true);
        l1Var.E = false;
        l1Var.G = Integer.MAX_VALUE;
    }

    public void f(i13.c item) {
        kotlin.jvm.internal.o.g(item, "item");
        ((ku5.t0) ku5.t0.f312615d).B(new k13.o0(this, item));
    }

    public final void g(i13.c cVar, boolean z17) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        androidx.recyclerview.widget.f2 adapter3;
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(b())) {
            com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "addMsgItem no permission, return");
            return;
        }
        java.util.ArrayList arrayList = this.f303239q;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((i13.c) it.next()).f287275d, cVar.f287275d)) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "addMsgItem called, id=" + cVar.f287275d);
        java.lang.String str = cVar.f287275d;
        if (i17 == -1) {
            arrayList.add(0, cVar);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f303236n;
            if (recyclerView != null && (adapter3 = recyclerView.getAdapter()) != null) {
                adapter3.notifyItemInserted(0);
            }
            p(0);
            if (cVar.e() || cVar.f()) {
                q(cVar.e(), cVar.f());
            }
            if (z17) {
                cVar.g();
            }
            com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "addMsgItem add new item, id=" + str);
            return;
        }
        if (i17 < 0 || i17 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i17);
        arrayList.add(0, cVar);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f303236n;
        if (recyclerView2 != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            adapter2.notifyItemRemoved(i17);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f303236n;
        if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
            adapter.notifyItemInserted(0);
        }
        p(0);
        if (cVar.e() || cVar.f()) {
            q(cVar.e(), cVar.f());
        }
        if (z17) {
            cVar.p();
        }
        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "addMsgItem update item, id=" + str);
    }

    public final com.tencent.mm.sdk.platformtools.n3 h() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f303240r).getValue();
    }

    public final android.os.PowerManager.WakeLock i() {
        return (android.os.PowerManager.WakeLock) ((jz5.n) this.f303244v).getValue();
    }

    public boolean j() {
        java.util.ArrayList arrayList = this.f303239q;
        if (arrayList.size() <= 1) {
            i13.c cVar = (i13.c) kz5.n0.k0(arrayList);
            if ((cVar != null ? cVar.h() : -1) == -1) {
                return true;
            }
        }
        return false;
    }

    public void k(java.lang.Runnable runnable, long j17, java.lang.Object obj) {
        if (runnable != null) {
            if (obj == null) {
                h().postDelayed(runnable, j17);
            } else {
                h().postAtTime(runnable, obj, android.os.SystemClock.uptimeMillis() + j17);
            }
        }
    }

    public void l(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        ((ku5.t0) ku5.t0.f312615d).B(new k13.b1(this, id6));
    }

    public void m(java.lang.Runnable runnable) {
        if (runnable != null) {
            h().removeCallbacks(runnable);
        }
    }

    public void n(java.lang.Object token) {
        kotlin.jvm.internal.o.g(token, "token");
        h().removeCallbacksAndMessages(token);
    }

    public final void o(boolean z17) {
        android.view.View view = this.f303238p;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "setEnableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "setEnableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r2 == 1) goto L8;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
        /*
            r0 = this;
            r1 = 0
            if (r3 == 0) goto Lb
            int r2 = r3.getAction()
            r3 = 1
            if (r2 != r3) goto Lb
            goto Lc
        Lb:
            r3 = r1
        Lc:
            if (r3 == 0) goto L11
            r0.s()
        L11:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k13.l1.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public void p(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, 0.0f, 0.0f, 0);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f303236n;
        if (recyclerView != null) {
            recyclerView.onTouchEvent(obtain);
        }
        o(false);
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f303241s).getValue()).postDelayed(this.f303248z, 1000L);
        this.E = true;
        this.G = i17;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f303236n;
        if (recyclerView2 != null) {
            recyclerView2.post(new k13.c1(this, i17));
        }
    }

    public final void q(boolean z17, boolean z18) {
        s();
        boolean z19 = com.tencent.mm.app.w.INSTANCE.f53889n;
        ((android.media.AudioManager) ((jz5.n) this.f303242t).getValue()).requestAudioFocus(this.f303245w, 3, 2);
        if (z17) {
            i50.r.a(this, this.D, 1000L, null, 4, null);
            i50.r.a(this, this.A, 7000L, null, 4, null);
        }
        if (z18) {
            i50.r.a(this, this.C, 1000L, null, 4, null);
            i50.r.a(this, this.B, 7000L, null, 4, null);
        }
        if (z17 || z18) {
            i50.r.a(this, this.F, 100L, null, 4, null);
        }
        if (i().isHeld()) {
            android.os.PowerManager.WakeLock i17 = i();
            yj0.a.c(i17, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            i17.release();
            yj0.a.f(i17, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
        android.os.PowerManager.WakeLock i18 = i();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Long.valueOf(u04.d.f423477c));
        yj0.a.d(i18, aVar.b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
        zj0.c.f473285a.set(aVar);
        long longValue = ((java.lang.Long) aVar.a(0)).longValue();
        zj0.c.a();
        i18.acquire(longValue);
        yj0.a.f(i18, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
    }

    public final void r() {
        try {
            m(this.F);
            android.media.MediaPlayer mediaPlayer = this.f303247y;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            android.media.MediaPlayer mediaPlayer2 = this.f303247y;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            if (i().isHeld()) {
                android.os.PowerManager.WakeLock i17 = i();
                yj0.a.c(i17, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopSound", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                i17.release();
                yj0.a.f(i17, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopSound", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
            ((android.media.AudioManager) ((jz5.n) this.f303242t).getValue()).abandonAudioFocus(this.f303245w);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ForceNotify.MsgWindow", e17, "", new java.lang.Object[0]);
        }
    }

    public final void s() {
        m(this.A);
        m(this.D);
        m(this.B);
        m(this.C);
        r();
        t();
    }

    public final void t() {
        try {
            m(this.F);
            ((android.os.Vibrator) ((jz5.n) this.f303246x).getValue()).cancel();
            if (i().isHeld()) {
                android.os.PowerManager.WakeLock i17 = i();
                yj0.a.c(i17, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopVibrate", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                i17.release();
                yj0.a.f(i17, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopVibrate", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ForceNotify.MsgWindow", e17, "", new java.lang.Object[0]);
        }
    }
}
