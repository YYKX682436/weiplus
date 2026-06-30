package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public abstract class o2 extends com.tencent.mm.ui.z9 {
    public static long H = 2000;
    public static final /* synthetic */ int I = 0;
    public java.lang.String A;
    public final com.tencent.mm.ui.conversation.m2 B;
    public final int C;
    public final int D;
    public com.tencent.mm.ui.conversation.k2 E;
    public boolean F;
    public final com.tencent.mm.sdk.platformtools.b4 G;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f207910o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f207911p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f207912q;

    /* renamed from: r, reason: collision with root package name */
    public final db5.c6 f207913r;

    /* renamed from: s, reason: collision with root package name */
    public final float f207914s;

    /* renamed from: t, reason: collision with root package name */
    public final float f207915t;

    /* renamed from: u, reason: collision with root package name */
    public final float f207916u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f207917v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f207918w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f207919x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f207920y;

    /* renamed from: z, reason: collision with root package name */
    public final db5.v8 f207921z;

    public o2(android.content.Context context, com.tencent.mm.ui.y9 y9Var) {
        super(context, new com.tencent.mm.storage.l4());
        android.content.res.ColorStateList[] colorStateListArr = new android.content.res.ColorStateList[5];
        this.f207910o = colorStateListArr;
        this.f207912q = true;
        this.f207913r = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f207914s = -1.0f;
        this.f207915t = -1.0f;
        this.f207916u = -1.0f;
        this.f207918w = false;
        this.f207919x = false;
        this.f207920y = false;
        this.f207921z = new com.tencent.mm.ui.conversation.g2(this);
        this.A = "";
        this.B = new com.tencent.mm.ui.conversation.m2(this);
        this.F = false;
        this.G = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.conversation.h2(this), false);
        this.f212611h = y9Var;
        colorStateListArr[0] = i65.a.e(context, com.tencent.mm.R.color.f479232tk);
        colorStateListArr[1] = i65.a.e(context, com.tencent.mm.R.color.f479482a31);
        colorStateListArr[3] = i65.a.e(context, com.tencent.mm.R.color.a0c);
        colorStateListArr[2] = i65.a.e(context, com.tencent.mm.R.color.f479415ym);
        colorStateListArr[2] = i65.a.e(context, com.tencent.mm.R.color.f479415ym);
        colorStateListArr[4] = i65.a.e(context, com.tencent.mm.R.color.f479305vl);
        this.f207911p = new java.util.HashMap();
        if (i65.a.E(context)) {
            this.D = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479617as);
            this.C = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else if (i65.a.D(context)) {
            this.D = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479616ar);
            this.C = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479618at);
        } else {
            this.D = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479615aq);
            this.C = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479619au);
        }
        this.f207914s = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
        this.f207915t = i65.a.h(context, com.tencent.mm.R.dimen.f479853h2);
        this.f207916u = i65.a.h(context, com.tencent.mm.R.dimen.f479930ja);
        this.f207917v = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_bellring_off, context.getResources().getColor(com.tencent.mm.R.color.f478694eb));
    }

    public final java.lang.String A(com.tencent.mm.storage.l4 l4Var) {
        if (l4Var.Q0() != 0 || !com.tencent.mm.storage.z3.R4(l4Var.h1())) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String z07 = l4Var.z0();
            ((sg3.a) v0Var).getClass();
            return c01.a2.e(z07);
        }
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String z08 = l4Var.z0();
        java.lang.String h17 = l4Var.h1();
        ((sg3.a) v0Var2).getClass();
        return c01.a2.f(z08, h17);
    }

    public java.lang.String B() {
        return "";
    }

    public int C(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0411  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence D(com.tencent.mm.storage.l4 r20, int r21, com.tencent.mm.ui.conversation.m2 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 2727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.o2.D(com.tencent.mm.storage.l4, int, com.tencent.mm.ui.conversation.m2, boolean):java.lang.CharSequence");
    }

    public void E() {
        this.G.d();
        java.util.HashMap hashMap = this.f207911p;
        if (hashMap != null) {
            hashMap.clear();
            this.f207911p = null;
        }
        c();
        this.f212611h = null;
        w();
    }

    public void F() {
        db5.c6 c6Var = this.f207913r;
        if (c6Var != null) {
            c6Var.c();
        }
        this.f207918w = false;
    }

    public void G() {
        java.util.HashMap hashMap;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "dkpno onResume mIsFront:%b  mNeedReCreate:%b mChangedBackground:%b mContactBackground:%b", java.lang.Boolean.valueOf(this.f207918w), java.lang.Boolean.valueOf(this.f207920y), java.lang.Boolean.valueOf(this.f207919x), java.lang.Boolean.FALSE);
        this.f207918w = true;
        android.text.format.Time time = new android.text.format.Time();
        time.setToNow();
        java.lang.String charSequence = k35.s.a("MM/dd", time).toString();
        boolean equals = true ^ this.A.equals(charSequence);
        this.A = charSequence;
        if (equals && (hashMap = this.f207911p) != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.conversation.l2) ((java.util.Map.Entry) it.next()).getValue()).f207828c = null;
            }
        }
        if (this.f207919x) {
            f();
            this.f207919x = false;
        }
    }

    @Override // com.tencent.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
        } else {
            onNotifyChange((java.lang.String) obj, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a3  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instructions count: 2723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.o2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.HashMap hashMap;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", java.lang.Boolean.valueOf(this.f207918w), java.lang.Boolean.valueOf(this.f207919x), str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (hashMap = this.f207911p) != null) {
            hashMap.remove(str);
        }
        if (!this.f207918w) {
            this.f207919x = true;
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.G;
        b4Var.e();
        this.F = true;
        if (b4Var.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.i2(this));
        }
    }

    @Override // com.tencent.mm.ui.z9
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.l4 d(com.tencent.mm.storage.l4 l4Var, android.database.Cursor cursor) {
        if (l4Var == null) {
            l4Var = new com.tencent.mm.storage.l4();
        }
        l4Var.o1("");
        l4Var.p1("");
        l4Var.convertFrom(cursor);
        return l4Var;
    }

    public final java.lang.String u(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public void v(java.lang.String str, com.tencent.mm.ui.conversation.n2 n2Var) {
    }

    public void w() {
    }

    public void x(com.tencent.mm.storage.l4 l4Var, boolean z17, int i17, boolean z18, android.view.View view) {
    }

    public void y(com.tencent.mm.ui.conversation.l2 l2Var, com.tencent.mm.storage.l4 l4Var, com.tencent.mm.ui.conversation.n2 n2Var, android.view.View view) {
        if (!l2Var.f207835j || l4Var.w0() == -1) {
            view.findViewById(com.tencent.mm.R.id.f483943cj0).setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        } else {
            view.findViewById(com.tencent.mm.R.id.f483943cj0).setBackgroundResource(com.tencent.mm.R.drawable.f481305q1);
        }
    }

    public java.lang.CharSequence z(com.tencent.mm.storage.l4 l4Var) {
        if (l4Var.a1() == 1) {
            return this.f212608e.getString(com.tencent.mm.R.string.gqx);
        }
        if (l4Var.w0() == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return "";
        }
        android.content.Context context = this.f212608e;
        long w07 = l4Var.w0();
        yf5.r rVar = yf5.r.f461944a;
        return k35.m1.f(context, w07, true, ((java.lang.Boolean) ((jz5.n) yf5.r.f461946c).getValue()).booleanValue());
    }
}
