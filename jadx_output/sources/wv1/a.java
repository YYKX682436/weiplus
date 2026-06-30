package wv1;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.choosemsgfile.logic.ui.w f449929a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f449930b;

    /* renamed from: c, reason: collision with root package name */
    public long f449931c;

    /* renamed from: d, reason: collision with root package name */
    public long f449932d;

    /* renamed from: e, reason: collision with root package name */
    public int f449933e = 0;

    public a(com.tencent.mm.plugin.choosemsgfile.logic.ui.w wVar) {
        this.f449929a = wVar;
    }

    public xv1.b a() {
        return ((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) this.f449929a).f95523d.f6();
    }

    public android.content.Context b() {
        return ((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) this.f449929a).f95523d.getContext();
    }

    public java.lang.String c() {
        return "";
    }

    public java.lang.String d() {
        return "";
    }

    public long e() {
        return 0L;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var = this.f449930b;
        return (f9Var == null || !(obj instanceof com.tencent.mm.storage.f9) || obj == null) ? super.equals(obj) : f9Var.getMsgId() == ((com.tencent.mm.storage.f9) obj).getMsgId();
    }

    public long f() {
        return this.f449930b.getMsgId();
    }

    public long g() {
        return this.f449930b.getCreateTime();
    }

    public abstract int h();

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            r5 = this;
            com.tencent.mm.plugin.choosemsgfile.logic.ui.w r0 = r5.f449929a
            com.tencent.mm.plugin.choosemsgfile.logic.ui.a r0 = (com.tencent.mm.plugin.choosemsgfile.logic.ui.a) r0
            com.tencent.mm.plugin.choosemsgfile.ui.f0 r1 = r0.f95523d
            xv1.b r1 = r1.f6()
            java.util.Map r2 = r1.f457388b
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L18
            java.lang.String r1 = "MicroMsg.ChooseMsgFileHelper"
            java.lang.String r2 = "isInvalid() msgIdToMsgFile is null, return"
            com.tencent.mars.xlog.Log.e(r1, r2)
            goto L24
        L18:
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            int r2 = r2.size()
            int r1 = r1.f457387a
            if (r2 < r1) goto L24
            r1 = r3
            goto L25
        L24:
            r1 = r4
        L25:
            if (r1 == 0) goto L47
            com.tencent.mm.plugin.choosemsgfile.ui.f0 r0 = r0.f95523d
            xv1.b r0 = r0.f6()
            com.tencent.mm.storage.f9 r1 = r5.f449930b
            long r1 = r1.getMsgId()
            java.util.Map r0 = r0.f457388b
            if (r0 != 0) goto L39
            r0 = r4
            goto L43
        L39:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
        L43:
            if (r0 == 0) goto L46
            goto L47
        L46:
            r3 = r4
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wv1.a.i():boolean");
    }

    public abstract void j(androidx.recyclerview.widget.k3 k3Var, int i17, wv1.a aVar);

    public void k(android.view.View view, wv1.a aVar) {
    }

    public void l(androidx.recyclerview.widget.k3 k3Var) {
    }

    public java.lang.String toString() {
        return "MsgItem{msgInfo=" + this.f449930b.getMsgId() + '}';
    }

    public a(com.tencent.mm.plugin.choosemsgfile.logic.ui.w wVar, com.tencent.mm.storage.f9 f9Var) {
        this.f449929a = wVar;
        this.f449930b = f9Var;
    }
}
