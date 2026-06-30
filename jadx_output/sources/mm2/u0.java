package mm2;

/* loaded from: classes3.dex */
public final class u0 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.i60 f329443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f329444g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f329445h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329446i;

    /* renamed from: m, reason: collision with root package name */
    public int f329447m;

    /* renamed from: n, reason: collision with root package name */
    public r45.o92 f329448n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f329449o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f329450p;

    /* renamed from: q, reason: collision with root package name */
    public long f329451q;

    /* renamed from: r, reason: collision with root package name */
    public r45.n92 f329452r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f329453s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329446i = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329449o = new java.util.ArrayList();
    }

    public static final void N6(mm2.u0 u0Var, yz5.q qVar) {
        java.util.LinkedList list;
        java.lang.Integer num;
        java.util.LinkedList list2;
        java.lang.String str;
        r45.o92 o92Var;
        java.util.LinkedList list3;
        java.lang.String str2;
        java.util.LinkedList list4;
        java.util.LinkedList list5;
        java.util.LinkedList list6;
        r45.o92 o92Var2 = u0Var.f329448n;
        int size = (o92Var2 == null || (list6 = o92Var2.getList(0)) == null) ? 0 : list6.size();
        r45.o92 o92Var3 = u0Var.f329448n;
        int size2 = (o92Var3 == null || (list5 = o92Var3.getList(3)) == null) ? 0 : list5.size();
        r45.o92 o92Var4 = u0Var.f329448n;
        int min = java.lang.Math.min(size, java.lang.Math.min(size2, (o92Var4 == null || (list4 = o92Var4.getList(4)) == null) ? 0 : list4.size()));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (int i17 = 0; i17 < min; i17++) {
            r45.o92 o92Var5 = u0Var.f329448n;
            if (o92Var5 != null && (list = o92Var5.getList(3)) != null && (num = (java.lang.Integer) list.get(i17)) != null) {
                int intValue = num.intValue();
                r45.o92 o92Var6 = u0Var.f329448n;
                if (o92Var6 != null && (list2 = o92Var6.getList(0)) != null && (str = (java.lang.String) list2.get(i17)) != null && (o92Var = u0Var.f329448n) != null && (list3 = o92Var.getList(4)) != null && (str2 = (java.lang.String) list3.get(i17)) != null && !((java.lang.Boolean) qVar.invoke(java.lang.Integer.valueOf(intValue), str, str2)).booleanValue()) {
                    linkedList.add(str);
                    linkedList2.add(java.lang.Integer.valueOf(intValue));
                    linkedList3.add(str2);
                }
            }
        }
        r45.o92 o92Var7 = new r45.o92();
        o92Var7.set(0, linkedList);
        o92Var7.set(3, linkedList2);
        o92Var7.set(4, linkedList3);
        r45.o92 o92Var8 = u0Var.f329448n;
        o92Var7.set(1, java.lang.Integer.valueOf(o92Var8 != null ? o92Var8.getInteger(1) : 0));
        r45.o92 o92Var9 = u0Var.f329448n;
        o92Var7.set(2, o92Var9 != null ? o92Var9.getString(2) : null);
        u0Var.T6(o92Var7, false);
    }

    public final void O6(int i17, java.lang.String wording, java.lang.String str) {
        kotlin.jvm.internal.o.g(wording, "wording");
        com.tencent.mars.xlog.Log.i("LiveCommentSlice", "onUserPostFastComment, type:" + i17 + ", wording:" + wording + ", id:" + str);
        if (i17 == 4) {
            kotlinx.coroutines.r2 r2Var = this.f329450p;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f329450p = null;
            pm0.v.X(new mm2.p0(this));
            return;
        }
        if (i17 == 5) {
            if (str != null) {
                pm0.v.X(new mm2.r0(this, str));
                this.f329453s = wording;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P6(r45.o92 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.u0.P6(r45.o92, boolean):void");
    }

    public final void Q6(boolean z17) {
        this.f329444g = z17;
    }

    public final void R6(r45.i60 i60Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setHintWording: hintword: ");
        sb6.append(i60Var != null ? i60Var.getString(0) : null);
        sb6.append(" changed_hint_word: ");
        sb6.append(i60Var != null ? i60Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("LiveCommentSlice", sb6.toString());
        this.f329443f = i60Var;
    }

    public final void S6(r45.n92 n92Var) {
        this.f329452r = n92Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new fastCommentCfg: ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.getInteger(0)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.getInteger(1)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Boolean.valueOf(n92Var.getBoolean(2)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Boolean.valueOf(n92Var.getBoolean(3)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.getInteger(4)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.getInteger(5)) : null);
        com.tencent.mars.xlog.Log.i("LiveCommentSlice", sb6.toString());
    }

    public final void T6(r45.o92 o92Var, boolean z17) {
        pm0.v.X(new mm2.s0(this, o92Var));
        r45.n92 n92Var = this.f329452r;
        int integer = n92Var != null ? n92Var.getInteger(4) : 0;
        if (!z17 || integer <= 0) {
            return;
        }
        this.f329450p = kotlinx.coroutines.l.d(this.f328963d.f272475i, null, null, new mm2.t0(integer, this, null), 3, null);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f329448n = null;
        this.f329452r = null;
        kotlinx.coroutines.r2 r2Var = this.f329450p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f329450p = null;
        this.f329451q = 0L;
        this.f329447m = 0;
    }
}
