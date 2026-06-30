package id2;

/* loaded from: classes.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f290602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f290604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f290605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(int i17, int i18, yz5.l lVar, com.tencent.mm.modelbase.m1 m1Var, id2.p5 p5Var) {
        super(0);
        this.f290601d = i17;
        this.f290602e = i18;
        this.f290603f = lVar;
        this.f290604g = m1Var;
        this.f290605h = p5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.f290601d
            yz5.l r1 = r8.f290603f
            if (r0 != 0) goto L94
            int r0 = r8.f290602e
            if (r0 != 0) goto L94
            if (r1 == 0) goto L11
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0)
        L11:
            com.tencent.mm.modelbase.m1 r0 = r8.f290604g
            boolean r1 = r0 instanceof ek2.m3
            r2 = 0
            if (r1 == 0) goto L1b
            ek2.m3 r0 = (ek2.m3) r0
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L2b
            com.tencent.mm.modelbase.o r0 = r0.f253505g
            com.tencent.mm.modelbase.n r0 = r0.f70711b
            com.tencent.mm.protobuf.f r0 = r0.f70700a
            boolean r1 = r0 instanceof r45.hu1
            if (r1 == 0) goto L2b
            r45.hu1 r0 = (r45.hu1) r0
            goto L2c
        L2b:
            r0 = r2
        L2c:
            boolean r1 = r0 instanceof r45.hu1
            if (r1 == 0) goto L31
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "resp = "
            r1.<init>(r3)
            org.json.JSONObject r3 = pm0.b0.g(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "FinderLiveSelfLotteryHistoryResultUIC"
            com.tencent.mars.xlog.Log.i(r3, r1)
            id2.p5 r1 = r8.f290605h
            r1.f290748i = r0
            java.util.ArrayList r3 = r1.f290746g
            int r4 = r3.size()
            r5 = 1
            java.util.LinkedList r6 = r0.getList(r5)
            if (r6 == 0) goto L61
            int r6 = r6.size()
            goto L62
        L61:
            r6 = 0
        L62:
            if (r6 <= 0) goto L9b
            java.util.LinkedList r0 = r0.getList(r5)
            if (r0 == 0) goto L86
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r0.next()
            r45.xc5 r5 = (r45.xc5) r5
            so2.a3 r7 = new so2.a3
            kotlin.jvm.internal.o.d(r5)
            r7.<init>(r5)
            r3.add(r7)
            goto L6e
        L86:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r1.f290745f
            if (r0 == 0) goto L8e
            r0.notifyItemRangeInserted(r4, r6)
            goto L9b
        L8e:
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.o(r0)
            throw r2
        L94:
            if (r1 == 0) goto L9b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
        L9b:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.h5.invoke():java.lang.Object");
    }
}
