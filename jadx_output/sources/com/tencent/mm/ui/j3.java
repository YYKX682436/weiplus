package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.h3 f208991a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.i3 f208992b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f208993c;

    /* renamed from: d, reason: collision with root package name */
    public int f208994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.k3 f208995e;

    public j3(com.tencent.mm.ui.k3 k3Var) {
        this.f208995e = k3Var;
        c();
    }

    public static void a(com.tencent.mm.ui.j3 j3Var) {
        int d17;
        synchronized (j3Var) {
            d17 = j3Var.d();
            j3Var.f208993c.clear();
        }
        if (d17 != 2) {
            j3Var.f208991a.sendEmptyMessage(1);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        e95.h f17 = j3Var.f208995e.f();
        com.tencent.mm.ui.k3 k3Var = j3Var.f208995e;
        com.tencent.mm.ui.f3 h17 = k3Var.h(f17);
        com.tencent.mars.xlog.Log.i(k3Var.f209017d, "newcursor fillCursor last : %d  count %d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(h17.a()));
        com.tencent.mm.ui.h3 h3Var = j3Var.f208991a;
        h3Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = h17;
        obtain.what = 2;
        h3Var.sendMessage(obtain);
    }

    public final void b() {
        com.tencent.mm.ui.i3 i3Var = this.f208992b;
        i3Var.removeMessages(i3Var.f208901d);
        i3Var.removeMessages(i3Var.f208902e);
        com.tencent.mm.ui.h3 h3Var = this.f208991a;
        h3Var.f208772a = true;
        h3Var.removeMessages(1);
        h3Var.removeMessages(2);
        this.f208993c.clear();
        this.f208994d = 0;
    }

    public final void c() {
        this.f208991a = new com.tencent.mm.ui.h3(this, android.os.Looper.getMainLooper());
        if (!(j62.e.g().i("clicfg_cursor_data_adater_work_handler", 0, true, true) == 1)) {
            this.f208992b = new com.tencent.mm.ui.i3(this, gm0.j1.e().a());
            return;
        }
        this.f208992b = new com.tencent.mm.ui.i3(this, this.f208995e.f209017d + "#WorkerHandler");
    }

    public final int d() {
        if (this.f208993c.size() > 1) {
            return 2;
        }
        if (this.f208993c.size() == 1) {
            return ((java.lang.Integer) this.f208993c.get(0)).intValue();
        }
        return 0;
    }
}
