package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class b4 extends com.tencent.mm.ui.z9 {
    public static long D = 2000;
    public static final /* synthetic */ int E = 0;
    public final int A;
    public boolean B;
    public final com.tencent.mm.sdk.platformtools.b4 C;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f207465o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f207466p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f207467q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashMap f207468r;

    /* renamed from: s, reason: collision with root package name */
    public final db5.c6 f207469s;

    /* renamed from: t, reason: collision with root package name */
    public final float f207470t;

    /* renamed from: u, reason: collision with root package name */
    public final float f207471u;

    /* renamed from: v, reason: collision with root package name */
    public final float f207472v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f207473w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f207474x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f207475y;

    /* renamed from: z, reason: collision with root package name */
    public final int f207476z;

    public b4(android.content.Context context, java.lang.String str, com.tencent.mm.ui.y9 y9Var) {
        super(context, new com.tencent.mm.storage.l4());
        this.f207467q = new android.content.res.ColorStateList[5];
        this.f207469s = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f207470t = -1.0f;
        this.f207471u = -1.0f;
        this.f207472v = -1.0f;
        this.f207473w = false;
        this.f207474x = false;
        this.f207475y = "";
        this.B = false;
        this.C = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.conversation.x3(this), false);
        this.f212611h = y9Var;
        this.f207465o = str;
        try {
            this.f207466p = r01.q3.cj().d1(str);
        } catch (java.lang.Throwable unused) {
        }
        this.f207468r = new java.util.HashMap();
        this.f207467q[0] = i65.a.e(context, com.tencent.mm.R.color.f479232tk);
        this.f207467q[1] = i65.a.e(context, com.tencent.mm.R.color.f479417yo);
        this.f207467q[3] = i65.a.e(context, com.tencent.mm.R.color.a0c);
        this.f207467q[2] = i65.a.e(context, com.tencent.mm.R.color.f479415ym);
        this.f207467q[2] = i65.a.e(context, com.tencent.mm.R.color.f479415ym);
        this.f207467q[4] = i65.a.e(context, com.tencent.mm.R.color.f479305vl);
        if (i65.a.E(context)) {
            this.A = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479617as);
            this.f207476z = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else if (i65.a.D(context)) {
            this.A = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479616ar);
            this.f207476z = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else {
            this.A = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479615aq);
            this.f207476z = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479619au);
        }
        this.f207470t = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
        this.f207471u = i65.a.h(context, com.tencent.mm.R.dimen.f479853h2);
        this.f207472v = i65.a.h(context, com.tencent.mm.R.dimen.f479930ja);
        ((l75.a1) c01.d9.b().r()).a(this);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) obj;
        if (l4Var == null) {
            l4Var = new com.tencent.mm.storage.l4();
        }
        l4Var.o1("");
        l4Var.p1("");
        l4Var.convertFrom(cursor);
        return l4Var;
    }

    @Override // com.tencent.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
        } else {
            onNotifyChange((java.lang.String) obj, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x049d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r35, android.view.View r36, android.view.ViewGroup r37) {
        /*
            Method dump skipped, instructions count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.b4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public android.database.Cursor j() {
        return super.j();
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.HashMap hashMap;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", java.lang.Boolean.valueOf(this.f207473w), java.lang.Boolean.valueOf(this.f207474x), str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (hashMap = this.f207468r) != null) {
            hashMap.remove(str);
        }
        if (!this.f207473w) {
            this.f207474x = true;
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.C;
        b4Var.e();
        this.B = true;
        if (b4Var.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.y3(this));
        }
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        java.util.AbstractCollection arrayList;
        java.lang.String str = this.f207465o;
        c();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            try {
                r01.m y07 = r01.q3.bj().y0(str);
                r45.ik ikVar = new r45.ik();
                ikVar.parseFrom(y07.field_raw_attrs);
                arrayList = ikVar.f377103e;
            } catch (java.lang.Throwable unused) {
                arrayList = new java.util.ArrayList(0);
            }
            linkedList.addAll(arrayList);
        } catch (java.lang.Throwable unused2) {
        }
        java.lang.String str2 = this.f207466p;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            s(((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, linkedList, str, -1));
        } else {
            linkedList.add(str2);
            s(((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, linkedList, str, -1));
        }
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    public final java.lang.String t(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public java.lang.CharSequence u(com.tencent.mm.storage.l4 l4Var) {
        return l4Var.a1() == 1 ? this.f212608e.getString(com.tencent.mm.R.string.gqx) : l4Var.w0() == com.tencent.wcdb.core.Database.DictDefaultMatchValue ? "" : k35.m1.f(this.f212608e, l4Var.w0(), true, false);
    }

    public int v(com.tencent.mm.storage.l4 l4Var) {
        java.lang.String U0 = l4Var.U0();
        if (U0 == null || U0.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.valueOf(U0).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }
}
