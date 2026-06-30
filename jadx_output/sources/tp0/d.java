package tp0;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tp0.e f421013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f421014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f421015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tp0.e eVar, lc3.a0 a0Var, int i17) {
        super(0);
        this.f421013d = eVar;
        this.f421014e = a0Var;
        this.f421015f = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if ((r1 instanceof jc3.m) != false) goto L25;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            tp0.e r0 = r8.f421013d
            r0.getClass()
            java.lang.String r1 = "parentId"
            r2 = 0
            lc3.a0 r3 = r8.f421014e
            int r1 = r3.optInt(r1, r2)
            r2 = 0
            if (r1 != 0) goto L2d
            lc3.e r1 = r0.f317890a
            lc3.s r1 = (lc3.s) r1
            if (r1 == 0) goto L27
            java.lang.String r4 = "containerTag"
            java.lang.String r4 = r3.optString(r4)
            java.lang.String r5 = "optString(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            jc3.m r1 = r1.F0(r4)
            goto L28
        L27:
            r1 = r2
        L28:
            boolean r4 = r1 instanceof jc3.m
            if (r4 == 0) goto L65
            goto L66
        L2d:
            lc3.e r4 = r0.f317890a
            lc3.s r4 = (lc3.s) r4
            if (r4 == 0) goto L42
            lc3.r r4 = r4.f317919d
            if (r4 == 0) goto L42
            java.util.concurrent.ConcurrentHashMap r4 = r4.f317917a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            goto L43
        L42:
            r1 = r2
        L43:
            boolean r4 = r1 instanceof jc3.m
            if (r4 == 0) goto L4a
            jc3.m r1 = (jc3.m) r1
            goto L66
        L4a:
            boolean r4 = r1 instanceof jc3.j
            if (r4 == 0) goto L60
            jc3.j r1 = (jc3.j) r1
            android.widget.FrameLayout r1 = r1.getCoverViewHolder()
            java.lang.String r4 = "parentView"
            kotlin.jvm.internal.o.g(r1, r4)
            tp0.m r4 = new tp0.m
            r4.<init>(r1)
            r1 = r4
            goto L66
        L60:
            lc3.z r1 = lc3.v.f317931c
            r0.u(r1)
        L65:
            r1 = r2
        L66:
            jz5.f0 r4 = jz5.f0.f302826a
            java.lang.String r5 = "MicroMsg.BaseCoverViewOperator"
            if (r1 == 0) goto Lae
            r0.w(r3, r1)
            lc3.e r6 = r0.f317890a
            lc3.s r6 = (lc3.s) r6
            if (r6 == 0) goto L86
            lc3.r r6 = r6.f317919d
            if (r6 == 0) goto L86
            java.util.concurrent.ConcurrentHashMap r6 = r6.f317917a
            int r7 = r8.f421015f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            goto L87
        L86:
            r6 = r2
        L87:
            if (r6 != 0) goto L8a
            r6 = r2
        L8a:
            if (r6 == 0) goto L90
            r0.x(r3, r6, r1)
            r2 = r4
        L90:
            if (r2 != 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(context?.getCoverViewManager()?.getView(viewId) as? ViewType) wrong;data:"
            r1.<init>(r2)
            r1.append(r3)
            r2 = 32
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.e(r5, r1)
            lc3.z r1 = lc3.v.f317929a
            r0.u(r1)
        Lad:
            r2 = r4
        Lae:
            if (r2 != 0) goto Lc6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getParentOrContainerDelegate nil,data:"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.e(r5, r1)
            lc3.z r1 = lc3.v.f317930b
            r0.u(r1)
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tp0.d.invoke():java.lang.Object");
    }
}
