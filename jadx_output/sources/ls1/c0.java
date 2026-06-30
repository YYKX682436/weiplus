package ls1;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f320966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f320967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f320968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f320969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ls1.e0 e0Var, long j17, kotlin.jvm.internal.c0 c0Var, long j18) {
        super(1);
        this.f320966d = e0Var;
        this.f320967e = j17;
        this.f320968f = c0Var;
        this.f320969g = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Collection collection;
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i(this.f320966d.B1(), "onReceivePageData, jsContent evaluateJavascript cb, ret = " + value + ", view " + this.f320966d.f181916a.getRandomStr());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f320966d.f320978d2 = r26.n0.B(value, "ok", false);
        is1.l lVar = is1.l.f294423a;
        ls1.e0 e0Var = this.f320966d;
        lVar.k(e0Var.N1, e0Var.f320978d2);
        ls1.e0 e0Var2 = this.f320966d;
        ax4.a.b(e0Var2.N1.f389300o, e0Var2.f320978d2 ? 130 : 129, 1, true);
        this.f320966d.V.a("onInjectEnd", currentTimeMillis);
        java.util.List g17 = new r26.t(",").g(r26.i0.t(value, "\"", "", false), 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f313996d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (!(strArr.length == 0)) {
            java.lang.String input = strArr[strArr.length - 1];
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9\\.]+");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            if (compile.matcher(input).matches()) {
                this.f320966d.V.a("onWebInjectEnd", (long) java.lang.Double.valueOf(strArr[strArr.length - 1]).doubleValue());
            }
        }
        com.tencent.mars.xlog.Log.i(this.f320966d.B1(), "terry trace 2.1 onReceivePageData ret:" + value + " eval:" + (currentTimeMillis - this.f320967e));
        ls1.e0 e0Var3 = this.f320966d;
        if (e0Var3.f320978d2) {
            e0Var3.I(-112);
        } else {
            e0Var3.I(-113);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new ls1.b0(this.f320966d));
        ax4.a.d(this.f320968f.f310112d ? 126 : 122, currentTimeMillis - this.f320969g);
        return jz5.f0.f302826a;
    }
}
