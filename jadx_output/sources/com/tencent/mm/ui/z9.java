package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class z9 extends android.widget.BaseAdapter implements l75.q0, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f212607d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f212608e;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.y9 f212611h;

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f212609f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f212610g = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f212613m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f212614n = new com.tencent.mm.ui.x9(this);

    /* renamed from: i, reason: collision with root package name */
    public int f212612i = -1;

    public z9(android.content.Context context, java.lang.Object obj) {
        this.f212607d = obj;
        this.f212608e = context;
    }

    public void c() {
        java.util.Map map = this.f212610g;
        if (map != null) {
            map.clear();
        }
        android.database.Cursor cursor = this.f212609f;
        if (cursor != null) {
            cursor.close();
        }
        this.f212612i = -1;
    }

    public abstract java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor);

    public final void f() {
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.a(this);
        }
        c();
        q();
        com.tencent.mm.ui.y9 y9Var2 = this.f212611h;
        if (y9Var2 != null) {
            y9Var2.b(this);
        }
    }

    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        onNotifyChange((java.lang.String) obj, null);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f212612i < 0) {
            this.f212612i = j().getCount();
        }
        return this.f212612i + m();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (p(i17)) {
            return n();
        }
        java.util.Map map = this.f212610g;
        if (map != null) {
            java.lang.Object obj = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (obj != null) {
                return obj;
            }
        }
        if (i17 < 0 || !j().moveToPosition(i17)) {
            return null;
        }
        if (this.f212610g == null) {
            return d(this.f212607d, j());
        }
        java.lang.Object d17 = d(null, j());
        ((java.util.HashMap) this.f212610g).put(java.lang.Integer.valueOf(i17), d17);
        return d17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    public void h(java.lang.Object obj) {
        notifyDataSetChanged();
    }

    public android.database.Cursor j() {
        android.database.Cursor cursor = this.f212609f;
        if (cursor == null || cursor.isClosed()) {
            o();
            iz5.a.d(null, this.f212609f);
        }
        return this.f212609f;
    }

    public java.lang.Object k(int i17, java.lang.Object obj) {
        if (p(i17)) {
            return n();
        }
        if (i17 < 0 || !j().moveToPosition(i17)) {
            return null;
        }
        return d(obj, j());
    }

    public int l() {
        if (this.f212612i < 0) {
            this.f212612i = j().getCount();
        }
        return this.f212612i;
    }

    public int m() {
        return 0;
    }

    public java.lang.Object n() {
        return this.f212607d;
    }

    public abstract void o();

    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        f();
    }

    public boolean p(int i17) {
        int i18 = this.f212612i;
        return i17 >= i18 && i17 < i18 + m();
    }

    public abstract void q();

    public void r(boolean z17) {
        if (z17) {
            if (this.f212610g == null) {
                this.f212610g = new java.util.HashMap();
            }
        } else {
            java.util.Map map = this.f212610g;
            if (map != null) {
                map.clear();
                this.f212610g = null;
            }
        }
    }

    public void s(android.database.Cursor cursor) {
        this.f212609f = cursor;
        this.f212612i = -1;
    }
}
