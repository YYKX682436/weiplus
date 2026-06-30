package df2;

/* loaded from: classes3.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd2.b f230946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yg2.b f230947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f230948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(df2.zb zbVar, yd2.b bVar, yg2.b bVar2, java.util.List list) {
        super(1);
        this.f230945d = zbVar;
        this.f230946e = bVar;
        this.f230947f = bVar2;
        this.f230948g = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r4 == true) goto L24;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            java.util.List r12 = (java.util.List) r12
            java.lang.String r0 = "results"
            kotlin.jvm.internal.o.g(r12, r0)
            df2.zb r0 = r11.f230945d
            yd2.j r1 = r0.f231940n
            r1.getClass()
            yd2.b r2 = r11.f230946e
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r2, r3)
            yg2.b r4 = r11.f230947f
            java.lang.String r3 = "scope"
            kotlin.jvm.internal.o.g(r4, r3)
            boolean r3 = r12.isEmpty()
            r10 = 0
            if (r3 == 0) goto L24
            goto L4d
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "reportToolResults: reporting "
            r3.<init>(r5)
            int r5 = r12.size()
            r3.append(r5)
            java.lang.String r5 = " results"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Finder.Live.AiAssistant.ToolManager"
            com.tencent.mars.xlog.Log.i(r5, r3)
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310570c
            r6 = 0
            yd2.i r7 = new yd2.i
            r7.<init>(r12, r1, r10)
            r8 = 2
            r9 = 0
            kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
        L4d:
            java.util.List r1 = r11.f230948g
            java.util.Iterator r1 = r1.iterator()
        L53:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lba
            java.lang.Object r3 = r1.next()
            yd2.n r3 = (yd2.n) r3
            java.lang.String r4 = r3.f461079b
            java.lang.String r5 = "lottery::create"
            boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
            if (r4 == 0) goto L53
            java.util.Iterator r4 = r12.iterator()
        L6d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L88
            java.lang.Object r5 = r4.next()
            r6 = r5
            r45.mf1 r6 = (r45.mf1) r6
            r7 = 3
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = r3.f461078a
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)
            if (r6 == 0) goto L6d
            goto L89
        L88:
            r5 = r10
        L89:
            r45.mf1 r5 = (r45.mf1) r5
            r3 = 0
            if (r5 == 0) goto L97
            r4 = 4
            boolean r4 = r5.getBoolean(r4)
            r5 = 1
            if (r4 != r5) goto L97
            goto L98
        L97:
            r5 = r3
        L98:
            if (r5 == 0) goto L53
            r45.ff1 r4 = r0.f231944r
            if (r4 == 0) goto La4
            java.lang.String r3 = r4.getString(r3)
            if (r3 != 0) goto La6
        La4:
            java.lang.String r3 = ""
        La6:
            df2.zb r4 = r11.f230945d
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            r6 = 0
            df2.na r7 = new df2.na
            java.lang.String r8 = r2.f461031c
            r7.<init>(r8, r3, r4, r10)
            r8 = 2
            r9 = 0
            com.tencent.mm.plugin.finder.live.util.y.o(r4, r5, r6, r7, r8, r9)
            goto L53
        Lba:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.oa.invoke(java.lang.Object):java.lang.Object");
    }
}
