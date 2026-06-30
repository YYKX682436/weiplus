package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class l6 implements com.tencent.mm.plugin.ipcall.l, j83.a {
    public long A;

    /* renamed from: a, reason: collision with root package name */
    public android.widget.EditText f142902a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f142903b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f142904c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f142905d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f142906e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton f142907f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton f142908g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton f142909h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageButton f142910i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.DialPad f142911j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f142912k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f142913l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f142914m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142915n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142916o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f142918q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f142919r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f142920s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f142921t;

    /* renamed from: u, reason: collision with root package name */
    public int f142922u;

    /* renamed from: v, reason: collision with root package name */
    public int f142923v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI f142924w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f142925x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.j f142926y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.k6 f142927z;

    /* renamed from: p, reason: collision with root package name */
    public int f142917p = -1;
    public long B = -1;
    public boolean C = false;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;

    public l6(com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI) {
        this.f142924w = iPCallTalkUI;
        com.tencent.mm.plugin.ipcall.j jVar = com.tencent.mm.plugin.ipcall.model.r.Bi().f142508i;
        this.f142926y = jVar;
        jVar.f142444d = this;
    }

    public final void a() {
        com.tencent.mm.plugin.ipcall.model.r.Di().f317099e = this.f142924w;
        l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
        l83.l lVar = Di.f317095a;
        lVar.f317117h = Di;
        com.tencent.mm.sdk.platformtools.SensorController sensorController = lVar.f317113d;
        if (!sensorController.f192433h) {
            sensorController.b(lVar);
            if (lVar.f317114e.a(new l83.i(lVar))) {
                lVar.f317115f = 0L;
            } else {
                lVar.f317115f = -1L;
            }
        }
        j83.b bVar = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b;
        if (bVar != null) {
            bVar.f298160k = this;
        }
        com.tencent.mm.plugin.ipcall.model.r.Di().f317098d = this;
        com.tencent.mm.plugin.ipcall.model.r.Bi().f142508i.a(false);
    }

    public void b() {
        android.widget.TextView textView = this.f142912k;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.View view = this.f142913l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "dismissNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "dismissNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void c() {
        this.f142902a.setKeyListener(null);
        this.f142902a.setHorizontallyScrolling(true);
        this.f142911j.setVisibility(4);
        this.f142911j.setTalkUIMode(true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142921t)) {
            h(this.f142921t);
        }
        if (fp.h.c(16)) {
            this.f142902a.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            this.f142903b.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142918q)) {
            this.f142925x = t83.c.d(this.f142924w, this.f142918q, true);
        }
        if (this.f142925x == null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f142916o)) {
            com.tencent.mm.sdk.platformtools.c5 c5Var = t83.c.f416411a;
            com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent checkCanSyncAddrBookEvent = new com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent();
            checkCanSyncAddrBookEvent.e();
            if (checkCanSyncAddrBookEvent.f54047g.f7219a) {
                com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = this.f142924w;
                java.lang.String str = this.f142916o;
                java.lang.String e17 = t83.c.e(iPCallTalkUI, str);
                android.graphics.Bitmap d17 = com.tencent.mm.sdk.platformtools.t8.K0(e17) ? null : t83.c.d(iPCallTalkUI, e17, true);
                if (d17 == null) {
                    com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent checkCanSyncAddrBookEvent2 = new com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent();
                    checkCanSyncAddrBookEvent2.e();
                    if (checkCanSyncAddrBookEvent2.f54047g.f7219a) {
                        java.lang.String j17 = t83.c.j(str);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                            d17 = ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).Vi(j17, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mapsdk.internal.km.f50100e, 4);
                        }
                    }
                }
                this.f142925x = d17;
            }
        }
        if (this.f142925x == null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f142920s)) {
            this.f142925x = ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).Vi(this.f142920s, 480, 480, 4);
        }
        if (this.f142925x == null) {
            this.f142905d.setVisibility(0);
            this.f142906e.setVisibility(8);
        }
        if (this.f142925x != null) {
            this.f142905d.setVisibility(8);
            this.f142906e.setVisibility(0);
            this.f142906e.setImageBitmap(this.f142925x);
        }
        this.f142914m.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.f6(this));
        this.f142909h.setClickCallback(new com.tencent.mm.plugin.ipcall.ui.g6(this));
        this.f142907f.setClickCallback(new com.tencent.mm.plugin.ipcall.ui.h6(this));
        this.f142908g.setClickCallback(new com.tencent.mm.plugin.ipcall.ui.i6(this));
        this.f142910i.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.j6(this));
        this.f142911j.setDialButtonClickListener(new com.tencent.mm.plugin.ipcall.ui.y5(this));
    }

    public void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "onBluetoothPlugStateChange, isPlugged: %b", java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
            if (!z17) {
                l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
                j83.b Ai = com.tencent.mm.plugin.ipcall.model.r.Ai();
                Di.b(Ai != null ? Ai.f298166q : false);
                this.f142909h.setEnable(true);
                com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton iPCallFuncButton = this.f142909h;
                j83.b Ai2 = com.tencent.mm.plugin.ipcall.model.r.Ai();
                iPCallFuncButton.setChecked(Ai2 != null ? Ai2.f298166q : false);
                return;
            }
            boolean a17 = this.f142909h.a();
            j83.b Ai3 = com.tencent.mm.plugin.ipcall.model.r.Ai();
            if (Ai3 != null) {
                Ai3.f298166q = a17;
            }
            com.tencent.mm.plugin.ipcall.model.r.Di().b(false);
            this.f142909h.setEnable(false);
            j83.b Ai4 = com.tencent.mm.plugin.ipcall.model.r.Ai();
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "mBluetoothResumeSpeaker:%s", java.lang.Boolean.valueOf(Ai4 != null ? Ai4.f298166q : false));
        }
    }

    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "onHeadsetPlugStateChange, isPlugged: %b", java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
            if (!z17) {
                l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
                j83.b Ai = com.tencent.mm.plugin.ipcall.model.r.Ai();
                Di.b(Ai != null ? Ai.f298165p : false);
                this.f142909h.setEnable(true);
                com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton iPCallFuncButton = this.f142909h;
                j83.b Ai2 = com.tencent.mm.plugin.ipcall.model.r.Ai();
                iPCallFuncButton.setChecked(Ai2 != null ? Ai2.f298165p : false);
                return;
            }
            boolean a17 = this.f142909h.a();
            j83.b Ai3 = com.tencent.mm.plugin.ipcall.model.r.Ai();
            if (Ai3 != null) {
                Ai3.f298165p = a17;
            }
            com.tencent.mm.plugin.ipcall.model.r.Di().b(false);
            this.f142909h.setEnable(false);
            j83.b Ai4 = com.tencent.mm.plugin.ipcall.model.r.Ai();
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "mHeadsetResumeSpeaker:%s", java.lang.Boolean.valueOf(Ai4 != null ? Ai4.f298165p : false));
        }
    }

    public void f() {
        if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
            boolean a17 = this.f142909h.a();
            j83.b Ai = com.tencent.mm.plugin.ipcall.model.r.Ai();
            if (Ai != null) {
                Ai.f298165p = a17;
            }
            boolean a18 = this.f142909h.a();
            j83.b Ai2 = com.tencent.mm.plugin.ipcall.model.r.Ai();
            if (Ai2 != null) {
                Ai2.f298166q = a18;
            }
            com.tencent.mm.plugin.ipcall.model.r.Di().b(this.f142909h.a());
        }
        if (com.tencent.mm.plugin.ipcall.model.r.bj().f142482a == 5) {
            com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298162m.b(this.f142907f.a());
        }
    }

    public void g(int i17) {
        java.lang.String str;
        if (i17 != 3) {
            if (i17 == 5) {
                this.f142904c.setText(java.lang.String.format("%02d:%02d", java.lang.Long.valueOf(this.A / 60), java.lang.Long.valueOf(this.A % 60)));
                return;
            } else {
                if (i17 != 10) {
                    return;
                }
                this.f142904c.setText(com.tencent.mm.R.string.g4y);
                return;
            }
        }
        int i18 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304917t;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if ((i18 & 1) > 0 && (i18 & 2) <= 0) {
            str = context.getString(com.tencent.mm.R.string.g6h) + " ";
        } else if ((i18 & 8) > 0) {
            str = context.getString(com.tencent.mm.R.string.g6i) + " ";
        } else {
            str = "";
        }
        int i19 = this.f142917p;
        if (i19 == -1) {
            this.f142904c.setText(str + this.f142924w.getString(com.tencent.mm.R.string.g4v));
            return;
        }
        java.lang.String n17 = t83.c.n(i19);
        this.f142904c.setText(str + this.f142924w.getString(com.tencent.mm.R.string.g4w, n17));
    }

    public final void h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142915n)) {
            i(t83.c.c(str), "");
        } else {
            i(this.f142915n, t83.c.c(str));
        }
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        this.f142902a.setText(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f142902a.setSelection(r2.getText().length() - 1);
        }
        this.f142903b.setText(str2);
    }

    public final void j(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        java.lang.String str4;
        b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                str4 = str3;
                if (2 != i17 && str2 != null) {
                    this.f142904c.setText(str2);
                    return;
                } else {
                    if (1 == i17 || str2 == null) {
                    }
                    com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = this.f142924w;
                    db5.e1.E(iPCallTalkUI, str2, str4, iPCallTalkUI.getString(com.tencent.mm.R.string.g3i), false, new com.tencent.mm.plugin.ipcall.ui.e6(this));
                    return;
                }
            }
            str = this.f142924w.getString(com.tencent.mm.R.string.g3h);
        }
        str4 = str;
        if (2 != i17) {
        }
        if (1 == i17) {
        }
    }

    public final void k(int i17) {
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(42);
        com.tencent.mm.plugin.ipcall.ui.k6 k6Var = this.f142927z;
        if (k6Var != null) {
            com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = (com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI) k6Var;
            if (this.D) {
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.ipcall.ui.i5(iPCallTalkUI), 3000L);
            }
        }
    }
}
