package yk5;

/* loaded from: classes11.dex */
public class u extends com.tencent.mm.ui.z9 implements com.tencent.mm.modelbase.u0 {
    public bb5.e A;
    public boolean B;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String[] f462905o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462906p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462907q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f462908r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f462909s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f462910t;

    /* renamed from: u, reason: collision with root package name */
    public final android.content.Context f462911u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f462912v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f462913w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f462914x;

    /* renamed from: y, reason: collision with root package name */
    public final int f462915y;

    /* renamed from: z, reason: collision with root package name */
    public bb5.g f462916z;

    public u(android.content.Context context, int i17) {
        super(context, new com.tencent.mm.storage.z3());
        this.f462908r = false;
        this.f462909s = null;
        this.f462910t = new java.util.LinkedList();
        this.f462912v = null;
        this.f462913w = true;
        this.f462914x = false;
        this.f462915y = 1;
        this.f462916z = new bb5.g(15, new yk5.l(this));
        this.A = null;
        this.B = false;
        this.f462911u = context;
        this.f462915y = i17;
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        this.f462909s = z3Var;
        z3Var.X1("_find_more_public_contact_");
        this.f462909s.U2();
        this.f462907q = "@micromsg.with.all.biz.qq.com";
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
        com.tencent.mm.storage.z3 L = ((com.tencent.mm.storage.k4) q17).L(cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME)));
        if (L != null) {
            return L;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(cursor);
        ((com.tencent.mm.storage.k4) c01.d9.b().q()).s0(z3Var, false);
        return z3Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (this.f462915y == 2) {
            return 2;
        }
        return v(i17) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yk5.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        if (!v(i17)) {
            return true;
        }
        java.util.LinkedList linkedList = this.f462910t;
        return !(linkedList == null || linkedList.size() == 0) || this.f462913w;
    }

    @Override // com.tencent.mm.ui.z9
    public int m() {
        if (this.f462908r) {
            return (this.f462909s.u2() ? 0 : this.f462910t.size()) + 1;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        x(new yk5.q(this, false));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 106) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SearchResultAdapter", "error type");
            return;
        }
        this.B = false;
        if (com.tencent.mm.ui.pc.a(this.f462911u, i17, i18, str, 7)) {
            this.f462913w = false;
            return;
        }
        if (i17 == 4 && i18 == -4) {
            x(new yk5.s(this));
        } else if (i17 == 0 && i18 == 0) {
            x(new yk5.j(this, m1Var));
        } else {
            x(new yk5.i(this));
        }
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        x(new yk5.q(this, false));
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.z3 getItem(int i17) {
        return p(i17) ? (com.tencent.mm.storage.z3) this.f212607d : (com.tencent.mm.storage.z3) super.getItem(i17);
    }

    public r45.gw5 u(int i17) {
        try {
            this.f462910t.size();
            l();
            return (r45.gw5) this.f462910t.get((i17 - l()) - 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SearchResultAdapter", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public boolean v(int i17) {
        int l17;
        return this.f462908r && i17 == (l17 = l()) && i17 < l17 + m();
    }

    public boolean w(java.lang.String str) {
        java.util.List list = this.f462912v;
        if (list == null || str == null) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public final void x(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new yk5.k(this, runnable));
        } else {
            runnable.run();
            notifyDataSetChanged();
        }
    }

    public void y(boolean z17) {
        this.f462914x = z17;
        if (z17) {
            this.f462909s.U2();
        }
    }
}
