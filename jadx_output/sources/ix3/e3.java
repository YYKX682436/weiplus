package ix3;

/* loaded from: classes.dex */
public final class e3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f295394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dp5 f295395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex3.e f295396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f295397g;

    public e3(java.util.LinkedList linkedList, r45.dp5 dp5Var, ix3.j3 j3Var, ex3.e eVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f295394d = linkedList;
        this.f295395e = dp5Var;
        this.f295396f = eVar;
        this.f295397g = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r7.getInteger(0) == 1) goto L15;
     */
    @Override // db5.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateMMMenu(db5.g4 r10) {
        /*
            r9 = this;
            java.util.LinkedList r0 = r9.f295394d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L7b
            java.lang.String r3 = (java.lang.String) r3
            r5 = 6
            r45.dp5 r6 = r9.f295395e
            java.util.LinkedList r5 = r6.getList(r5)
            java.lang.String r6 = "getValueAlias(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            java.lang.Object r5 = kz5.n0.a0(r5, r2)
            java.lang.String r5 = (java.lang.String) r5
            ex3.e r6 = r9.f295396f
            if (r5 == 0) goto L66
            r45.dp5 r7 = r6.f257209f
            r8 = 12
            com.tencent.mm.protobuf.f r7 = r7.getCustom(r8)
            r45.ep5 r7 = (r45.ep5) r7
            if (r7 == 0) goto L42
            int r7 = r7.getInteger(r1)
            r8 = 1
            if (r7 != r8) goto L42
            goto L43
        L42:
            r8 = r1
        L43:
            if (r8 == 0) goto L49
            r10.g(r2, r5, r1)
            goto L6d
        L49:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r8 = 40
            r7.append(r8)
            r7.append(r5)
            r5 = 41
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r10.g(r2, r5, r1)
            goto L6d
        L66:
            java.lang.String r5 = java.lang.String.valueOf(r3)
            r10.g(r2, r5, r1)
        L6d:
            java.lang.String r5 = r6.f257210g
            boolean r3 = kotlin.jvm.internal.o.b(r5, r3)
            if (r3 == 0) goto L79
            com.tencent.mm.ui.widget.dialog.k0 r3 = r9.f295397g
            r3.f211851a2 = r2
        L79:
            r2 = r4
            goto L8
        L7b:
            kz5.c0.p()
            r10 = 0
            throw r10
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ix3.e3.onCreateMMMenu(db5.g4):void");
    }
}
