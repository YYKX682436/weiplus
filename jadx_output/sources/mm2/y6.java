package mm2;

/* loaded from: classes3.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f329577a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f329578b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f329579c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f329580d;

    /* renamed from: e, reason: collision with root package name */
    public int f329581e;

    /* renamed from: f, reason: collision with root package name */
    public int f329582f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f329583g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f329584h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f329585i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f329586j;

    /* renamed from: k, reason: collision with root package name */
    public r45.hn1 f329587k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Boolean f329588l;

    /* renamed from: m, reason: collision with root package name */
    public int f329589m;

    /* renamed from: n, reason: collision with root package name */
    public r45.re2 f329590n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f329591o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f329592p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f329593q;

    public y6(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329577a = liveContext;
        this.f329578b = "Finder.LiveWhiteSlice";
        this.f329583g = new java.util.ArrayList();
        this.f329584h = new java.util.ArrayList();
        this.f329585i = new java.util.ArrayList();
        this.f329588l = java.lang.Boolean.FALSE;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.f329589m = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r10) {
        /*
            r9 = this;
            r0 = 1
            boolean r1 = pm0.v.z(r10, r0)
            if (r1 == 0) goto L16
            java.util.List r1 = r9.f329580d
            if (r1 == 0) goto L10
            int r1 = r1.size()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 > 0) goto L16
            r1 = r10 & (-2)
            goto L17
        L16:
            r1 = r10
        L17:
            r2 = 2
            boolean r3 = pm0.v.z(r10, r2)
            java.util.ArrayList r4 = r9.f329583g
            if (r3 == 0) goto L28
            int r3 = r4.size()
            if (r3 > 0) goto L28
            r1 = r10 & (-3)
        L28:
            r3 = 4
            boolean r5 = pm0.v.z(r10, r3)
            java.util.ArrayList r6 = r9.f329584h
            if (r5 == 0) goto L39
            int r5 = r6.size()
            if (r5 > 0) goto L39
            r1 = r10 & (-5)
        L39:
            r5 = 32
            boolean r7 = pm0.v.z(r10, r5)
            java.util.ArrayList r8 = r9.f329585i
            if (r7 == 0) goto L4b
            int r7 = r8.size()
            if (r7 > 0) goto L4b
            r1 = r10 & (-33)
        L4b:
            boolean r0 = pm0.v.z(r10, r0)
            if (r0 != 0) goto L58
            java.util.List r0 = r9.f329580d
            if (r0 == 0) goto L58
            r0.clear()
        L58:
            boolean r0 = pm0.v.z(r10, r2)
            if (r0 != 0) goto L61
            r4.clear()
        L61:
            boolean r0 = pm0.v.z(r10, r3)
            if (r0 != 0) goto L6a
            r6.clear()
        L6a:
            boolean r0 = pm0.v.z(r10, r5)
            if (r0 != 0) goto L73
            r8.clear()
        L73:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkVisibilityMode oriMode:"
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = " finalMode:"
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = r9.f329578b
            com.tencent.mars.xlog.Log.i(r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.y6.a(int):int");
    }

    public final void b() {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        if (this.f329581e == 0) {
            this.f329583g.clear();
            this.f329584h.clear();
            this.f329585i.clear();
            java.util.List list4 = this.f329580d;
            if (list4 != null) {
                list4.clear();
            }
            r45.re2 re2Var = this.f329590n;
            if (re2Var != null && (list3 = re2Var.getList(0)) != null) {
                list3.clear();
            }
            r45.re2 re2Var2 = this.f329590n;
            if (re2Var2 != null && (list2 = re2Var2.getList(2)) != null) {
                list2.clear();
            }
            r45.re2 re2Var3 = this.f329590n;
            if (re2Var3 == null || (list = re2Var3.getList(3)) == null) {
                return;
            }
            list.clear();
        }
    }

    public final void c(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.util.List list = this.f329579c;
        intent.putExtra("KEY_PARAMS_WHITE_LIST", list instanceof java.io.Serializable ? (java.io.Serializable) list : null);
        java.util.List list2 = this.f329580d;
        intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", list2 instanceof java.io.Serializable ? (java.io.Serializable) list2 : null);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM", this.f329583g);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER", this.f329584h);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LABEL_LIST", this.f329585i);
        r45.hn1 hn1Var = this.f329587k;
        intent.putExtra("KEY_PARAMS_LIVE_CHARGE", hn1Var != null ? hn1Var.toByteArray() : null);
        r45.re2 re2Var = this.f329590n;
        intent.putExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST", re2Var != null ? re2Var.toByteArray() : null);
        intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", this.f329581e);
        intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", this.f329582f == 1);
        java.util.LinkedList linkedList = ((mm2.c1) this.f329577a.a(mm2.c1.class)).f328803f4.f309049a;
        if (true ^ linkedList.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.addAll(linkedList);
            intent.putStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST", arrayList);
        }
    }

    public final boolean d() {
        return this.f329587k != null;
    }

    public final boolean e() {
        if (f() || pm0.v.z(this.f329581e, 64) || !this.f329584h.isEmpty() || !this.f329583g.isEmpty() || !this.f329585i.isEmpty()) {
            return false;
        }
        java.util.List list = this.f329580d;
        return list == null || list.isEmpty();
    }

    public final boolean f() {
        return this.f329582f == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    public final void g(android.content.Intent intent) {
        r45.hn1 hn1Var;
        byte[] byteArrayExtra;
        byte[] byteArrayExtra2;
        r45.re2 re2Var = null;
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        this.f329580d = kotlin.jvm.internal.m0.g(serializableExtra) ? (java.util.List) serializableExtra : null;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM") : null;
        if (stringArrayListExtra != null) {
            java.util.ArrayList arrayList = this.f329583g;
            arrayList.clear();
            arrayList.addAll(stringArrayListExtra);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER") : null;
        if (stringArrayListExtra2 != null) {
            java.util.ArrayList arrayList2 = this.f329584h;
            arrayList2.clear();
            arrayList2.addAll(stringArrayListExtra2);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LABEL_LIST") : null;
        if (stringArrayListExtra3 != null) {
            java.util.ArrayList arrayList3 = this.f329585i;
            arrayList3.clear();
            arrayList3.addAll(stringArrayListExtra3);
        }
        if (intent == null || (byteArrayExtra2 = intent.getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE")) == null) {
            hn1Var = null;
        } else {
            hn1Var = new r45.hn1();
            hn1Var.parseFrom(byteArrayExtra2);
        }
        i(hn1Var);
        this.f329588l = intent != null ? java.lang.Boolean.valueOf(intent.getBooleanExtra("KEY_PARAMS_LIVE_CHARGE_VIP_FREE", false)) : null;
        this.f329589m = intent != null ? intent.getIntExtra("KEY_PARAMS_LIVE_CHARGE_FREE_FLAG", 0) : 0;
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST")) != null) {
            re2Var = new r45.re2();
            re2Var.parseFrom(byteArrayExtra);
        }
        j(re2Var);
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_VISIBILITY_MODE", 0) : 0;
        this.f329581e = a(intExtra);
        this.f329582f = intent != null ? intent.getBooleanExtra("KEY_PARAMS_IS_TEST_LIVE", false) : 0;
        b();
        com.tencent.mars.xlog.Log.i(this.f329578b, "anchorChooseMode:" + intExtra);
    }

    public final void h(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f329578b, "set isBussinessVisitor:" + z17 + ",ori value:" + this.f329586j);
        this.f329586j = z17;
    }

    public final void i(r45.hn1 hn1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveChargePost:");
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(aVar.k(hn1Var));
        sb6.append(",ori value:");
        sb6.append(aVar.k(this.f329587k));
        com.tencent.mars.xlog.Log.i(this.f329578b, sb6.toString());
        this.f329587k = hn1Var;
    }

    public final void j(r45.re2 re2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("partWhiteList:");
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(aVar.q(re2Var));
        sb6.append(",ori value:");
        sb6.append(aVar.q(this.f329590n));
        com.tencent.mars.xlog.Log.i(this.f329578b, sb6.toString());
        this.f329590n = re2Var;
    }
}
