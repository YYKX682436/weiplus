package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class k3 extends android.widget.BaseAdapter {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f209016u = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.f3 f209019f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f209020g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f209021h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.d3 f209022i;

    /* renamed from: q, reason: collision with root package name */
    public int f209027q;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f209029s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.j3 f209030t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f209017d = "MicroMsg.CursorDataAdapter";

    /* renamed from: e, reason: collision with root package name */
    public boolean f209018e = true;

    /* renamed from: m, reason: collision with root package name */
    public final int f209023m = 1000;

    /* renamed from: n, reason: collision with root package name */
    public final int f209024n = 3000;

    /* renamed from: o, reason: collision with root package name */
    public boolean f209025o = true;

    /* renamed from: p, reason: collision with root package name */
    public int f209026p = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f209028r = 0;

    public k3(boolean z17, android.content.Context context, int i17) {
        this.f209021h = context;
        this.f209029s = z17;
        this.f209027q = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CursorDataAdapter", "newCursor setPageSize %d", java.lang.Integer.valueOf(i17));
    }

    public final void a(java.lang.String str, boolean z17) {
        if (this.f209026p == 0) {
            return;
        }
        boolean z18 = this.f209025o;
        if (z18 || z17) {
            if (!z17) {
                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor cache needRefresh : needRefreshInfront :%b from : %s", java.lang.Boolean.valueOf(z18), str);
            }
            o(false, true);
        }
    }

    public final void c() {
        boolean z17;
        if (this.f209029s) {
            int i17 = this.f209019f.f250438a.y() ? 1 : 2;
            int i18 = this.f209028r;
            if (i17 != i18 && i18 != 0) {
                com.tencent.mm.ui.j3 j3Var = this.f209030t;
                if (j3Var != null) {
                    synchronized (j3Var) {
                        z17 = j3Var.f208994d != 0;
                    }
                    if (z17) {
                        m(h(f()), true, false);
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor change update stats  %d ", java.lang.Integer.valueOf(i17));
            }
            this.f209028r = i17;
        }
    }

    public void d(boolean z17) {
        com.tencent.mm.ui.j3 j3Var;
        com.tencent.mm.ui.f3 f3Var = this.f209019f;
        if (f3Var != null) {
            f3Var.f250438a.close();
            f3Var.f250438a = null;
            this.f209019f = null;
        }
        if (z17 && (j3Var = this.f209030t) != null) {
            synchronized (j3Var) {
                com.tencent.mars.xlog.Log.i(j3Var.f208995e.f209017d, "newcursor quit ");
                j3Var.b();
            }
            this.f209030t = null;
            java.util.HashMap hashMap = this.f209020g;
            if (hashMap != null) {
                hashMap.clear();
                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor closeCursor,clear events");
            }
        }
        this.f209026p = 0;
        this.f209028r = 0;
    }

    public abstract e95.h f();

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f209019f == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            q(f());
            com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor createCursor last : %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        a("getcount", false);
        com.tencent.mm.ui.f3 f3Var = this.f209019f;
        if (f3Var != null) {
            return f3Var.a();
        }
        com.tencent.mars.xlog.Log.w(this.f209017d, "[getCount] is zero!");
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    public abstract com.tencent.mm.ui.f3 h(e95.h hVar);

    public int j() {
        java.util.HashMap hashMap = this.f209020g;
        if (hashMap == null || hashMap.size() == 0) {
            return 0;
        }
        return this.f209020g.containsKey(null) ? 2 : 1;
    }

    public int k(int i17) {
        e95.h hVar;
        com.tencent.mm.ui.f3 f3Var = this.f209019f;
        if (f3Var == null || (hVar = f3Var.f250438a) == null) {
            return 0;
        }
        if (hVar instanceof e95.j) {
            return ((e95.j) hVar).f250423f[i17].getCount();
        }
        throw new java.lang.RuntimeException("the cursor is not instanceof MergeHeapCursor ,please call getCount() instead ");
    }

    public final void l() {
        java.util.HashMap hashMap;
        com.tencent.mm.ui.f3 f3Var = this.f209019f;
        if (f3Var == null || f3Var.f250438a.isClosed() || !((hashMap = this.f209020g) == null || hashMap.size() == 0)) {
            r(new com.tencent.mm.ui.y2(this));
        } else {
            com.tencent.mars.xlog.Log.i(this.f209017d, "events size is 0  ");
        }
    }

    public final void m(com.tencent.mm.ui.f3 f3Var, boolean z17, boolean z18) {
        boolean z19;
        if (z17) {
            com.tencent.mm.ui.j3 j3Var = this.f209030t;
            if (j3Var != null) {
                synchronized (j3Var) {
                    z19 = j3Var.f208994d != 0;
                }
                if (z19) {
                    com.tencent.mm.ui.j3 j3Var2 = this.f209030t;
                    synchronized (j3Var2) {
                        com.tencent.mars.xlog.Log.i(j3Var2.f208995e.f209017d, "newcursor resetQueue ");
                        j3Var2.b();
                        j3Var2.c();
                    }
                }
            }
            java.util.HashMap hashMap = this.f209020g;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
        if (z18 && f3Var != null && !f3Var.f250439b) {
            r(new com.tencent.mm.ui.z2(this, f3Var));
        } else if (f3Var != null && f3Var.f250439b && z18) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.c3(this, f3Var));
        } else {
            p(f3Var);
        }
    }

    public void n(java.lang.Object obj, int i17) {
        boolean z17;
        if (this.f209019f == null) {
            return;
        }
        if (this.f209020g == null) {
            this.f209020g = new java.util.HashMap();
        }
        boolean containsKey = this.f209020g.containsKey(null);
        if (i17 == 5 || !this.f209029s || i17 == 1) {
            if (i17 != 5) {
                this.f209020g.clear();
                this.f209020g.put(null, null);
            } else if (!containsKey) {
                this.f209020g.put(obj, new com.tencent.mm.ui.e3(obj, i17, null));
            }
            com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor syncHandle is true ,changeType is %d  ", java.lang.Integer.valueOf(i17));
            z17 = true;
        } else {
            if (containsKey) {
                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor need reset ,return ");
                return;
            }
            if (this.f209028r != 1) {
                this.f209020g.clear();
                this.f209020g.put(null, null);
            } else if (this.f209019f.f250438a.n0(obj) || i17 == 2) {
                java.util.HashMap hashMap = this.f209020g;
                com.tencent.mm.ui.e3 e3Var = new com.tencent.mm.ui.e3(obj, i17, null);
                if (e3Var.f208362b == 2 && this.f209019f.f250438a.n0(obj)) {
                    e3Var.f208362b = 3;
                }
                com.tencent.mm.ui.e3 e3Var2 = (com.tencent.mm.ui.e3) hashMap.get(obj);
                if (e3Var2 != null) {
                    hashMap.remove(e3Var2);
                    int i18 = e3Var.f208362b;
                    if (i18 == 2) {
                        int i19 = e3Var2.f208362b;
                        if (i19 == 2) {
                            com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor processEvent last insert, now insert, impossible");
                            e3Var.f208362b = 2;
                        } else if (i19 != 5) {
                            com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor processEvent last update, now insert, impossible");
                            e3Var.f208362b = 2;
                        } else {
                            e3Var.f208362b = 3;
                        }
                    } else if (i18 != 5) {
                        int i27 = e3Var2.f208362b;
                        if (i27 == 2) {
                            e3Var.f208362b = 2;
                        } else if (i27 != 5) {
                            e3Var.f208362b = 3;
                        } else {
                            com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor processEvent last delete, now update, impossible");
                            e3Var.f208362b = 3;
                        }
                    } else {
                        int i28 = e3Var2.f208362b;
                        if (i28 != 2) {
                            if (i28 != 5) {
                                e3Var.f208362b = 5;
                            } else {
                                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor processEvent last delete, now delete, impossible");
                                e3Var.f208362b = 5;
                            }
                        }
                        com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor add event events size %d", java.lang.Integer.valueOf(this.f209020g.size()));
                    }
                    hashMap.put(obj, e3Var);
                } else {
                    hashMap.put(obj, e3Var);
                }
                if (!this.f209019f.f250438a.I0(hashMap.size())) {
                    com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor events size exceed limit :size is :  %d", java.lang.Integer.valueOf(hashMap.size()));
                    hashMap.clear();
                    hashMap.put(null, null);
                }
                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor add event events size %d", java.lang.Integer.valueOf(this.f209020g.size()));
            } else {
                com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor event pass ");
            }
            z17 = false;
        }
        int j17 = j();
        this.f209026p = j17;
        java.lang.String str = this.f209017d;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(j17);
        objArr[1] = java.lang.Boolean.valueOf(this.f209028r == 1);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i(str, "newcursor refreshStatus: %d ,hasLoadedAllDataStatus %b changeType :%d ", objArr);
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor event is refresh sync ");
            o(true, true);
        } else if (this.f209018e && this.f209025o) {
            o(false, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r2 == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.k3.o(boolean, boolean):void");
    }

    public final void p(com.tencent.mm.ui.f3 f3Var) {
        d(false);
        this.f209019f = f3Var;
        f3Var.a();
        c();
    }

    public void q(e95.h hVar) {
        d(true);
        com.tencent.mm.ui.f3 f3Var = this.f209019f;
        if (f3Var == null || f3Var.f250438a != hVar) {
            if (f3Var != null && !f3Var.f250438a.isClosed()) {
                com.tencent.mm.ui.f3 f3Var2 = this.f209019f;
                f3Var2.f250438a.close();
                f3Var2.f250438a = null;
                this.f209019f = null;
            }
            com.tencent.mm.ui.f3 h17 = h(hVar);
            this.f209019f = h17;
            h17.a();
            c();
            notifyDataSetChanged();
        }
    }

    public final void r(com.tencent.mm.ui.g3 g3Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.d3 d3Var = this.f209022i;
        if (d3Var != null) {
            d3Var.a(this);
        }
        if (g3Var != null) {
            g3Var.a();
        }
        notifyDataSetChanged();
        com.tencent.mm.ui.d3 d3Var2 = this.f209022i;
        if (d3Var2 != null) {
            d3Var2.b(this);
        }
        com.tencent.mm.ui.j3 j3Var = this.f209030t;
        if (j3Var != null) {
            synchronized (j3Var) {
                com.tencent.mm.ui.i3 i3Var = j3Var.f208992b;
                int i17 = com.tencent.mm.ui.i3.f208897g;
                i3Var.getClass();
                i3Var.f208898a = java.lang.System.currentTimeMillis();
            }
        }
        com.tencent.mars.xlog.Log.i(this.f209017d, "newcursor update callback last :%d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
